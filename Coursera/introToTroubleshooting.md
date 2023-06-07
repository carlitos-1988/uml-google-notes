# Introduction to Troubleshooting and the Future of Networking

## Introduction

- Error-Detection: The ability for a protocol or program to determine that something went wrong
- Error-Recovery: The ability for a protocol or program to attempt to fix it
- Even with error checking and redundancies errors do occur in the following forms:
  - Errors still pop up
  - Misconfigurations occur
  - Hardware breaks down
  - System incompatibilities come to light

## Verifying Connectivity

### Ping: Internet Control Message Protocol

- ICMP - Internet Control Message Protocol : is used to detect and identify connectivity issues
- ICMP is mainly used by a router or remote host as to why a connection was not successful
  ![ICMP Packet](ScreenShots/Screenshot%202023-06-06%20at%205.41.53%20PM.png)
  1. Type of message being delivered 8 Bits
  2. Code Field the actual message 8 bits
  3. checksum 16 bit
  4. rest of header 32 bits
  5. Data Payload - The payload for an ICMP packet exists entirely so that the recipient of the message knows which of their transmissions caused the error being reported
  6. Not intended for human consumption
  7. Ping used to interpret this communication - Ping lets you send a special type of ICMP message called an Echo Request
  8. If the destination is up and running and able to communicate on the network, it'll send back an ICMP Echo Reply message type
  9. typically used by typing Ping and the destination IP or MAC Address
  10. Ping behaves differently on each OS

### TraceRoute

- With Ping you can see if you can reach a computer from another computer
- Traceroute: A utility that lets you discover the path between two nodes, and gives you information about each hop along the way
- ![TraceRoute In Work](ScreenShots/Screenshot%202023-06-06%20at%205.52.46%20PM.png)
  - With traceRoute the TTL is originally set to one and the router sends the message back to the source letting it know it failed.
  - The process gets repeated as many times needed for the TTL field to reach the final destination
    ![TraceRoute Example ](ScreenShots/Screenshot%202023-06-06%20at%205.55.29%20PM.png)
    - each of the numbers represents a hop taken by the packet request
    - the final hop may show the host ID of the server if it is able to find the end of the desired outcome
- MTR - used on linux or Mac OS similar to traceroute
- PathPing - Used on windows

### Testing Port Connectivity

- To check connections at the transport Layer use:
  - netcat - Linux/MacOS --> `<nc> <host> <portNumber>` ![Example of NC with -z Flag](ScreenShots/Screenshot%202023-06-06%20at%206.02.32%20PM.png)
  - test-netConnection -Windows ![Test-NetConnection example](ScreenShots/Screenshot%202023-06-06%20at%206.03.16%20PM.png)

## Digging into DNS

### Name Resolution Tools

- nslooup : used by typing `nslookup <hostname>` output will display the server that provided the requests
- Typing `nslookup` will start it in interactive mode
  - then type end points you want to get more information on
  - using server and the address of it will try to resolve that server to the address tying to be reached
  - `set type=MX` will allows you to return different record types for that host
  - `set debug` this will set the records to be returned to give as much information possible

### Public DNS Servers

- An ISP almost always give you access to a recursive name server as part of the service it provides
- Public DNS Servers: name Servers specifically set up so that anyone can use them, for free
- Most public DNS servers are available globally through anycast
- ![Hijacking Example](ScreenShots/Screenshot%202023-06-06%20at%206.48.25%20PM.png)
- Always make sure the name server is run by a reputable company and try to use the name server provided by your ISP outside of troubleshooting scenarios

### DNS Registration and Expiration

- Remember that DNS is a global system managed in a tiered hierarchy with ICANN at the top level. Domain names need to be globally unique for a global system like this to work.
- Registrar: An organization responsible for assigning individual names to other organizations or individuals
- ![Domain Name Transfers](ScreenShots/Screenshot%202023-06-06%20at%206.53.04%20PM.png)
- Registrations only exists for a fixed number of time. Remember to renew if not someone else can come and grab it

### Host Files

- The original way that numbered network addresses were correlated with words was through hosts files
- Host File: A flat file that contains, one each line, a network address followed by the host name it can be referred to as
- example --> 1.2.3.4 = 'web server' so when someone calls for a web server the server will know to return 1.2.3.4 pretty much a translating file
- Loop back address: an IP address that always points to itself, A way of sending network traffic to yourself
- 127.0.0.1 is the default loopback address on the IPV4 network
- Almost every host file in existence will, in the very least, contain a line that reads 127.0.0.1 localhost, most likely followed by ::1 localhost where ::1 is the loopback address for IPV6
- Host files are a popular way for computer viruses to disrupt and redirect user's traffic
- Not a great idea to use host files today but they are still necessary

## The Cloud

- Cloud Computing: A technological approach where computing resources are provisioned in a shareable way so that lots of users get what they need when they need it
- Virtualization: A single physical machine, called a host, could run many individual instances, called guests
- Hypervisor: A piece of software that runs and manages virtual machines, while also offering these guests a virtual operating platform that's indistinguishable from actual hardware
- One huge benefit of the cloud is that if a server needs to be provisioned to need more ram or more memory an organization will not have to wait to procure the physical servers, On the other hand cloud providers may automatically provision your service to utilize the best available hardware without much work
- Public Cloud: A large cluster of machines run by another company
- Private Cloud: Used by a single large corporation and generally physically hosted on its own premises
- Hybrid Cloud: A term used to describe situations where companies might run things like their most sensitive proprietary technologies on a private cloud, while entrusting their less-sensitive servers to a public cloud
- Again Cloud Computing is a new model in computing where large clusters of machines let us use the total resources available in a better way

### Everything as a Service

- X as a Service where X = many things
- IaaS Infrastructure as a Service: You should not have to worry about building your own network or your own servers, you pay someone else to provide you with that service
- PaaS Platform as a Service: A subset of cloud computing where a platform is provided for customers to run their services, basically getting an execution engine for running own applications
- SaaS Software as a Service: A way of licensing the use of software to others while keeping that software centrally hosted and managed, e.g. Gmail for business or Outlook 365

### Cloud Storage

- Used to keep data secure, accessible, and available
- By using a cloud storage solution, it's up to the provider to keep underlying physical hardware running
- Cloud storage providers also operate across different regions and back up across those regions to keep data safe
- Cloud storage solutions also grow with the organization

## IPV6

### Addressing and Sonnetting

- random fact: IPV5 was an experimental protocol that introduced the concept of connections, no wide adoption of this
- IPV4 32bits <----> IPV6 is 128bits
- IPV6 are written as 8 groups of 16bits each and then each of the groups is made up of 4 hexadecimal numbers
- ![IPV6 IP](ScreenShots/Screenshot%202023-06-07%20at%201.47.29%20AM.png)
  - `2001:0db8` of this address is a reserved address space for documentation and education
- FF00:: reserved for multicast
- FE80:: Link-local unicast addresses - Allow for local network segment communications and are configured based upon a hosts MAC address
- ![IPV6](ScreenShots/Screenshot%202023-06-07%20at%201.53.19%20AM.png)
  - with IPV6 the segmentation is more straight forward as seen in the picture, this is because of the huge number of available addresses now

### IPV6 Headers

- Version Field: A 4 bit field that defines what version of IP is in use
- Traffic Class Field: An 8bit field that defines the type of traffic contained within the IP datagram, and allows for different classes of traffic to receive different priorities
- Flow Label Field: A 20bit field that is used in conjunction with the traffic class field for routers to make decisions about the quality of service level for a specific datagram
- Payload Length Field: A 16bit field that defines how long the data payload section of the datagram is
- Next Header Field: A unique concept to IPv6, and needs a little extra explanation
  - Defines what kind of header is immediately after this header, since IPV6 is too long this is needed
- Hop Limit Field: An 8bit field that's identical in purpose to the TTL field in an IPv4 header
- Source Address 128bits
- Destination Address 128bits
- Data Payload Field
- ![IPv6 Headers](ScreenShots/Screenshot%202023-06-07%20at%202.06.06%20AM.png)

### IPV6 and IPV4 Harmony

- ![Mapped Address Spaces](ScreenShots/Screenshot%202023-06-07%20at%202.53.45%20AM.png)
- Currently IPV6 traffic travels through the internet through IPV6 Tunnels
  - IPV6 Tunnels: Servers take incoming IPv6 traffic and encapsulate it within traditional IPv4 datagram
  - ![IPV6 Tunnel](ScreenShots/Screenshot%202023-06-07%20at%202.56.24%20AM.png)
- IPv6 Tunnel Broker: Companies that provide IPv6 tunneling endpoints for you, so you dont have to introduce additional equipment to your network
-

IPv6 and IPv4 harmony
At the network layer of the TCP/IP Five-Layer Network Model, nodes connect through the internet protocol (IP) and the IP addresses that come along with it. The most common version of IP is version four (IPv4), but version six (IPv6) is rapidly seeing more widespread adoption.

This reading covers key differences between IPv6 and IPv4 and the methods that allow them to work together.

When IPv4 was first developed, a 32-bit number was chosen to represent the address for a node on a network. This means there can be around 4.2 billion individual IPv4 addresses. But this just isn’t enough addresses for the number of Internet-connected devices we have in the world today. IPv6 was developed to provide plenty of addresses for all of our Internet connected devices. While IPv4 represents addresses with a 32-bit number, IPv6 represents addresses with 128 bits. This 128-bit update allows for a practically unlimited number of IPv6 addresses, 340 trillion trillion trillion addresses to be exact!

IPv4 and IPv6 require a different structure for each version’s datagrams. This means the IPv4 and IPv6 networks speak different languages. For IPv6 data to travel over an IPv4 network, the IPv6 datagram has to be translated into something IPv4 can understand. Since it's not possible for the entire Internet and all connected networks to switch to IPv6 all at once, IPv6 tunneling protocols are used to allow IPv6 traffic to travel over the remaining IPv4 network.

Tunneling
Tunneling protocols allow users to carry IPv6 traffic across an IPv4 network. Tunnels are created using IPv6 servers on either end of a network connection. A tunnel server at one end takes incoming IPv6 traffic and encapsulates it within a traditional IPv4 datagram. Encapsulation is the process of transporting a data packet inside the payload of another packet.

A server on an IPv6 network encapsulates an IPv6 datagram within an IPv4 datagram and delivers it across an IPv4 network

IPv6 data that’s encapsulated within an IPv4 datagram can then be delivered across the IPv4 network and received by another IPv6 tunnel server. The receiving server de-encapsulates the datagram and passes the IPv6 traffic further along the IPv6 network.

Three types of tunnels
Since IPv6 tunneling is still an evolving technology, there are several competing protocols used to establish IPv6 tunnels. Here are three commonly used tunnel protocols:

6in4/manual protocol encapsulates IPv6 packets immediately inside an IPv4 packet, without using additional headers to configure the setup of the tunnel endpoints. Setup is configured manually instead. This makes performance predictable and easy to debug. Unfortunately, this protocol often will not function if the host uses network address translation (NAT) technology to map its IPv4 address. This makes the 6in4/manual protocol difficult to deploy.

Tunnel Setup Protocol (TSP) specifies rules for negotiating the setup parameters between tunnel endpoints. This allows for a variety of tunnel encapsulation methods and wider deployment than is possible with the 6in4/manual protocol.

Anything in Anything (AYIYA) protocol defines a method for encapsulating any protocol in any other protocol. AYIYA was developed for tunnel brokers, a service which provides a network tunnel. This protocol specifies the encapsulation, identification, checksum, security, and management operations that can be used once the tunnel is established. A key advantage of AYIYA is that it can provide a stable tunnel through an IPv4 NAT. It allows users behind a NAT or a dynamic address to maintain connectivity even when roaming between networks.

Each protocol has its pros and cons, depending on the nature of the communicating endpoints of the IPv6 connection.

Key takeaways
As IPv6 becomes more widely adopted, IPv6 traffic needs a way to travel over the IPv4 network.

Tunneling protocols allow users to carry IPv6 traffic across an IPv4 network.

Since IPv6 tunneling is still an evolving technology, there are several competing protocols used to establish IPv6 tunnels.

Each protocol has its pros and cons, depending on the nature of the communicating endpoints of the IPv6 connection.
