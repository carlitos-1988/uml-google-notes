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
  - Start of authority (SOA):  Declares the zone and the name of the name of server that is authoritative for it 
  - NS Records: Indicate other name servers that might also be responsible for this zone 
  - Zones may be able to be configured to have many layers of being able to point and understand where the authoritative server may be located at 
  - Reverse lookup zone files: These let DNS resolvers ask for an IP and get the FDQN associated with it returned 
  - PTR : Resolves an IP to a name 
  
  ## Dynamic Host Configuration Portocol 

  ### Overview of DHCP 
