# Introduction to Network Services

At the end of the day Network Services provide a way to answer requests for the data from clients.

If something on the network is not working as expected the first place to look at will be on here

## Name Resolution

### Why do we need DNS?

- `DNS`: is a global and highly distributed network service that resolves strings of letters into IP addresses for you
- We need this because humans do not understand binary as well as they do letters, while computers only understand binary
- `Domain Name`: The term we use for something that can be resolved by DNS

### The Many Steps of Name Resolution

- `Name Resolution`: Porcess of using DNS to turn a domain name into an IP address is known as name resolution
- DNS servers are one of the first things that need to be configured on a node on a network
  - Modern Network Configuration Items:
    - IP address
    - Subnet Mask
    - Gateway for a host
    - DNS Server
  - The MacAddress is not configurable this is a hard coded item
- 5 Primary Types of DNS Servers:
  - Caching name Servers
  - Recursive Name Servers
  - Root Name Servers
  - TLD Name Servers
  - Authoritative Name Servers
- `Cashing and Recursive name Servers`: Purpose is to store known domain name lookups for certain amount of time. These are usually provided by an ISP
- `Recursive name Servers` cashing servers are also recursive name servers, they perform full DNS resolution requests
- ![Caching/Recursive Server](../images/Screenshot%202023-05-26%20at%203.52.34%20PM.png)
  - Not shown is that 'you' previously made the same request and the caching function simply returned what was cached based on your network
  - The first time the recursive function of the server went out and found the actual IP address on its own and brought it back to you
  - This make the server more efficient
- All domain names in a global DNS system have a TTL: a value, in seconds, that can be configured by the owner of a domain name for how long ta name server is allowed to cache an entry before it should discard it and perform a full resolution again; this value can be configured by the owner of the domain name
- Recursive resolution:
  - ![Step 1](../images/Screenshot%202023-05-26%20at%203.59.18%20PM.png)
    - `Anycast`: A technique that's used to route traffic to different destinations depending on factors like location, congestion, or link health
    - This allowed for physical root servers to be more than 13 since anycast allowed for traffic to flow based on those new factors instead of only geographical location
    - `Top-Level Domain`: Represents the top of the hierarchial DNS name resolution system, this is the response is sent back to the caching/recursive name server
    - the .com section of a web address is the TLD
  - ![Step 2](../images/Screenshot%202023-05-26%20at%204.05.06%20PM.png)
    - The TLD is then sent over to the TLD name server
    - TLD servers respond with a redirect of the what authoritative name server to look up
  - ![Step 3](../images/Screenshot%202023-05-26%20at%204.08.19%20PM.png)
    - Once the authoritative server is identified the caching/recursive server reaches out to the auth server and it then replies with the appropriate IP
- At times the local machines/phones will have their own DNS cache in order to prevent this lengthy lookup from happening every single time

### DNS and UDP

- Reasons why use UPD for DNS instead of TCP
  - UPD is connection-less, no set up of teardown of a connection less traffic transmitted overall. DNS can also generate allot of traffic if you where to use a TCP connection then whole process could ge labor intensive
  - ![DNS using TCP connection](../images/Screenshot%202023-05-27%20at%201.51.10%20PM.png)
  - As shown 44 packets at minimum would have to be sent out just to get the DNS of one website, not allot but it adds up allot
  - ![DNS using UPD Connection](../images/Screenshot%202023-05-27%20at%201.54.00%20PM.png)
  - As shown this a total of 8 packets (missing caching/recursive server response to user), this makes it much more efficient than using UPD and would scale better
  - Data would be asked for again in UDP by sending a message again if the message is not received since the DNS resolver does not have that data
  - TCP DNS lookups are real and do occur, one would know that this is the case when the name server responds with packet is too large for UDP then TCP would be used (not sure if this would have to be configured do )

## Name Resolution in Practice

### Resource Record Types

- Resource Records:
  - A Record: Used to point a certain domain dame at a certain IPv4 IP address
    - Round Robin: a concept that involves iterating over a list of items one by one in an orderly fashion, meaning that if a DNS authoritative server has a list of 4 IP addresses for a website in the order 1,2,3,4 it will return that order to the first person then then next person requesting the same site would get 2,3,4,1 then the next person would get 3,4,1,2 and so on
  - Quad A Record: Very similar to an A record, except that it returns an IPV6 address instead of an IPv$ address
  - CNAME Record: Used to redirect traffic from one domain name to another
    - One example of this is being able to translate microsoft.com to <www.microsoft.com>, although each server can host either there would have to be 2 different entries that would need to be taken care of if there where a change to the original url
    - Again by setting up a CNAME that points microsoft.com to <www.microsoft.com>, you'd only have to change the A records for <www.microsoft.com>
  - Mail Exchange (MX): This resource record is used in order to deliver email to the correct server, this allows for mail traffic to be routed to mail servers and web servers to web servers
  - SRV Records (Service Records): Used to define the location of various specific services
  - Text Record (TXT): Originally intended to be used only for associating some descriptive text with a domain name for human consumption, essentially leaving notes or messages for the sites
    - The text record is now used for other data for computers to process, i.e. configuration preferences

### Anatomy of a Domain Name

- Any given domain name has 3 primary parts and each serves it's own purpose
- TLD: top level domain- the `.com` section of a domain `.edu` `.co` are other examples of TLDs
  - TLDs are managed by ICANN The Internet Corporation for Assigned Names and Numbers, system organization to INANA
  - Domain: is the actual name of the site i.e. `google` `microsoft` and so on
    - Domains: Used to demarcate where control moves from a TLD name server to an authoritative name server
  - Host Name: this is the `www.` portion of the url
- Fully Qualified domain Name (FQDN): when you combine all of these parts together, you have what's known as this
- DNS can technically support up to 127 levels of domain in total for a single fully qualified domain name

### DNS Zones

- Root and TLD name servers are actually just authoritative name servers too.
- DNS Zones: Allow for easier control over multiple levels of a domain
- ![DNS Zones](../images/Screenshot%202023-05-27%20at%203.12.37%20PM.png)

  - In this example a large company with presence all over the world is able to split up its DNS by adding location to the internal site. If kept as a single zone the company would have to maintain 600~ A records for the company. But since it is split up the organization would only have to maintain 200~ A records for each individual zone creating a total of 4 A records one for the main site and three for the remaining zones
  - Zone Files: simple configuration files that declare all resource records for a particular zone, will contain a SOA (Start of Authority) - resource record declaration
  - Start of authority (SOA): Declares the zone and the name of the name of server that is authoritative for it
  - NS Records: Indicate other name servers that might also be responsible for this zone
  - Zones may be able to be configured to have many layers of being able to point and understand where the authoritative server may be located at
  - Reverse lookup zone files: These let DNS resolvers ask for an IP and get the FDQN associated with it returned
  - PTR : Resolves an IP to a name

## Dynamic Host Configuration Protocol

### Overview of DHCP

- Every single IP-based network needs to have at least four things specifically configured:
  - IP address,
  - Subnet mask for local network
  - Primary gateway
  - name server
- The subnet mask, primary gateway, and the name server tend to remain the same on all of the nodes on the same network
- The IP address will have to be unique for each node on the network
- Dynamic Host Configuration Protocol (DHCP) : An application layer protocol that automates the configuration process of hosts on a network
- ![DHCP Configuration](../images/Screenshot%202023-05-28%20at%203.20.11%20PM.png)
  - When a computer connects to a new network all it would have to do is to send a message to the DHCP server to get all of the network configurations in one simple step
- ![DHCP Connections](../images/Screenshot%202023-05-28%20at%203.47.21%20PM.png)
  - The DHCP server is one that will have a static IP address so that all nodes on the network understand d where to send information to
  - The rest of the nodes may have a dynamic IP that the DCP server cycles through
- Dynamic Allocation: A range of IP addresses is set aside for client devices and one of these UPs is issued to these devices whey they request one
- Automatic Allocation: A range of IP addresses is set aside for assignment purposes, difference between this and dynamic allocation is that the IP address assigned to a node will be stored and assign the same IP if possible
- Fixed Allocation : Requires a manually specified list of MAC address and their corresponding IPs, when the DHCP receives a request the DHCP will look up the MAC address on it's own table and then respond with the IP with the corresponding MAC address, this is helpful when understanding what nodes on a network you would like to connect to the internet. If a node that you would not like to communicate over the network is present in it's own table the DHCP may not assign a MAC address to that node
- Network Time Protocol (NTP): Used to keep all computers on a network synchronized in time. DHCP servers may be able to help with this

### DHCP In Action

- DHCP is an application layer protocol, meaning that it will utilize(to operate):
  - Transport
  - Network
  - Data Link
  - Physical
- DHCP Discovery: The process by which a client configured to use DHCP attempts to get network configuration information:
  1. DHCP Discover Message - sent from UDP port 68 but DHCP server will listen on port 67
  2. DHCP Offer Message: The DHCP will respond with an offered IP address as a broadcast to the network. Destination port of 68 source port 67, The Mac address for the node will also be sent out so that the nodes understand who the IP address is intended for. Depending on the configuration of the network multiple DHCP servers may respond to the discovery message and the client is then able to only listen to a particular client (this is not that common but it does happen)
  3. DHCP Request: This message tells the DHCP server that it would like to use the IP address that was offered in the DHCP offer message
  4. DHCP Acknowledgement: The DHCP server then broadcasts the acknowledgement indicating that the IP address has been assigned to a particular MAC address
- Once all of these steps occur the local host computer will have the necessary information to set up it's own networking layer configuration
- All of the steps mentioned above is considered a `DHCP Lease` and will have a set time to expire. Once the lease expires all of the previous steps will have to be done again, The client can also release the lease if it where to disconnect from the network this would allow the DHCP server to get back an IP address to be used across it's other nodes

## Network Address Translation

### Basics of NAT

- This is more so of a technique more than a defined standard, this means that many network hardware vendors implement NAT in their own way but the principles remain the same
- Fundamentally what it does it takes one IP address and changes it to another
- Network Address Translation (NAT): A technology that allows a gateway, usually a router or firewall, to rewrite the source IP of an outgoing IP datagram while retaining the original IP in order to rewrite it into the response
- ![NAT Example Start](../images/Screenshot%202023-05-28%20at%205.13.27%20PM.png)
  - Here Computer 1 on Network A is trying to reach the web server from network B. The Router in between
  - This is a common example but in this case the router is able to perform NAT actions
  - ![Nat 2](../images/Screenshot%202023-05-28%20at%205.17.18%20PM.png)
  - The Nat in this instance will rewrite the source IP from computer 1 and add it's own IP thus hiding the source IP from the destination IP
  - IP Masquerading: The ability to have one to many IP addresses allows for the outside world to only view the singular IP while the Router is the only IP exposed and all IPs inside the network are not able to be seen outside of the network. This is a helpful cyber security practice for any organization

### NAT and the Transport Layer

- Port Preservation: A technique where the source port chosen by a client is the same port used by the router, reminder that the OS will likely pick ephemeral ports when generating connections at random.
- When the router at the transport TCP layer is chosen it will forwards that port to be used for the return message from the requested network, there may be collisions and if this where to happen then the OS will pick another ephemeral port for it to use (this is rare but it does happen)
- Port Forwarding: A technique where specific destination ports can be configured to always be delivered to specific nodes
- ![Port Forwarding](../images/Screenshot%202023-05-28%20at%205.28.59%20PM.png)
  - In this example the web server at 10.1.1.5 will not share it's internal IP address to the outside world. The outside will only see the router at 192.168.1.1 This would allow for the use of IP masquerading
  - ![Port Forwarding 2](../images/Screenshot%202023-05-28%20at%205.31.30%20PM.png)
    - Same situation as before but this time the router is able to pull from 2 different resources to get the requested IP and port. In this case trying to access the MX server instead of the web server

## VPNs and Proxies

### Virtual Private Networks

- Virtual Private Networks (VPN) - A technology that allows for the extension of a private or local network to hosts that might not work on that same local network
- There are many types of VPNs and they accomplish many different things
- Most common usage for VPNs is to access the network of a business when an employee is not in the office
- They are a tunneling protocol
- ![VPN Tunnel](../images/Screenshot%202023-05-28%20at%206.14.27%20PM.png)
  - Most VPNs work by using the payload section of the transport layer to carry an encrypted payload that contains another second set of packets that contain the: the Network, Transport, and the Application layer packets intended to traverse the remote network
  - Basically it adds encryption to the packet where once it is received by the VPN server it is stripped down and the payload is unencrypted leaving the VPN server with the top three layers of a new packet. TYhis gets encapsulated with the proper data link layer information and send out across the network. This process is completed in the inverse in the opposite direction
  - Two Factor Authentication: A technique where more than just a username and password are required to authenticate
  - Usually tokens are generated by a small hardware device or by software an employee may have access to
  - VPNs are more so a concept than a standardized network model, implementation details can be different depending on who is implementing the VPN,
  - Key Takeaway: is that VPNs use encrypted tunnels to act as a medium to emulate a network or node to be physically connected to the network

### Proxy Services

- Proxy Service: A server that acts on behalf of a client in order to access another service
- Proxies sit between clients and other servers providing :
  - Anonymity
  - Security
  - Content filtering
  - Increased Performance
- A gateway router also fits the definition of a proxy service
- proxies can exists in many different levels of a network and they also have different names depending on the usage
- One example of this would be the use of a Web Proxy:
  - ![Web Proxy](../images/Screenshot%202023-05-28%20at%206.29.05%20PM.png)
    - In the past Web Proxies would get and cache web information so that the client would get cached data, this allowed for faster load times and un needed network traffic (this is older)
    - A more common use for web proxies is to deny or allow data from a client to a web server ![Web Client](../images/Screenshot%202023-05-28%20at%206.31.27%20PM.png) in this if a client where to try to use twitter during working hours the web proxy would deny the request
- Reverse Proxy: A service that might appear to be a single server to external clients, but actually represents many servers living behind it
- example of a large organization that may receive many requests for information ![Reverse Proxy](../images/Screenshot%202023-05-28%20at%206.56.04%20PM.png) Here the proxy utilizes the many application servers to be able to handle an overload of requests for example utilizing the round robin technique or load balancing
- Key Takeaway : proxies are any server that act as intermediary between a client and another server
