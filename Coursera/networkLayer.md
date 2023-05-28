# Coursera Notes for Google IT certificate

## 5 Layers of the Network Layer

| Layer Name  |    Protocol    | Protocol Data Unit | Addressing  |
| :---------: | :------------: | :----------------: | :---------: |
|  Physical   |      n/a       |        Bits        |     n/a     |
|  Data Link  | Ethernet, Wifi |       Frames       | MAC Address |
|   Network   |       IP       |  Packet Datagram   | IP Address  |
|  Transport  |    TCP/ UDP    |      Segment       |  Port #'s   |
| Application |  HTTP, SMPTP   |      Messages      |     n/a     |

## Week 2 Network Layer

- in a LAN nodes can communicate with Mac address, but this is nnot scalable it is good for small networtks
  -IP addresses are 32 bit long numbers made up of 4 octets
- dotted decimal notation
- IP addresses belong to networks, not to the devices attached to those networks
- when DHCP assigns an IP address the IP address assigned is known as a Dynamic IP address, the opposite of this would be a static IP address which is assigned manually
- in most cases static IP addresses are reserved for servers and network devices while dynamic IP addresses are reserved for clients

### IP Datagram

- A highly structured series of fields that are stricly defined
- ![IP Datagram](../images/Screenshot%202023-05-16%20at%209.50.51%20AM.png)
- The most common version of IP is version 4 or IPV4
- Diagram Header
  - 0-4 Bits
    - Version - most common IPV4 but IPV6 is coming up
  - 4-8 Header Length
  - 8-16 Service Type
    - 8 bits can be used to specify details about quality of service or QoS, technologies
  - 16-31\* Total Length
    - indicates the total lebgth of the IP datagram it's attached to
  - Identification 16 bits
    - Used to group messages together
    - This is used when the message cannot fit inside the Total length of the message and the message needs to be broken up
    - the message will contain the remaining pieces of the total length inside the identification so that they can be identidied as being one part of the whole
  - Flag Field and Fragmentation Offset
    - flag field used to indicate if a datagram is allowed to be fragmented, or to indicate that the datagram has already been fragmented
    - Fragmentation is the process of taking a single I datagram and splitting it up into several smaller datagrams
    - The fragmentation field also keeps info on the order of the datagram to be put back together
  - TTL field (Time to Live)
    - An 8 bit field that indicates how many router hops a datagram can traverse before it's thrown away
  - Protocol Field \* bit
    - TCP & UPP protocol to be used
  - Header Checksum field
    - checksum to check for the integrity of the data
  - Source IP Address 32 bits
  - Destination IP Address 32 bits
  - IP Options field
    - An optional field and is used to set special characteristics for datagrams primarily used for testing purposes
  - Padding
    - A series of zeros to make sure the header fits correctly just incase data

### IPV4 Address Classes

- IP addresses can be split into two sections:
  - network ID
  - host ID
- Address class system - a way of defining how the global IP address space is split up
- 3 Types of Classes
  - Class A
    - 1st octet is for network ID last three are for host ID
  - Class B
    - 1-2 octet is for network and 3-4 are for host ID
  - Class C
    - 1-3 octets is for network ID and last octet is for host ID
- each octet can take a value between 0 and 255

### Address Resolution Protocol (ARP)

- A protocol used to discover the hardware address of a node with a cetain IP address
- ARP: table a list of IP addresses and the MAC addresses associated with them
  - Steps to send data to an IP address
    - local machine wants to send data to an IP address but does not know the mac address of that item
    - The locathel machine will then send a broadcast message to let all machines on the netork to identify e.g {FF:FF:FF:FF}
    - All machines on the network will respoond with their IP IP addresses to the switch/router
    - Once the machine with the intended ARP response is found it will return an ARP response that will have all of the needed data to send that machine a message
    - Once this information is received the sending computer will have the information needed for destination hardware in the datgram package and it will be sent over through the ethernet frame
    - The local IP address will be saved in the ARP table for future use but it is not permanently saved

### Subnetting

- The process of taking a large network and splitting it up into many individual and smaller subnetworks , or subnets
- Incorrect subnetting setups are a common problem you might run into as an IT support specialist, so it is important to have a understanding of how this works
- gateway routers are the entry and exit items that allow traffic inside and out of the network
- subnetting is to split the larger network into smaller pieces so that a router is responsible for a limited amount of items intead of the whole

### Subnet Mask

- reminder IP address is a 32 bit number
- ![image for where to subnet](../images/Screenshot%202023-05-17%20at%203.56.16%20PM.png)
- subnet IDs are calculated using a subnet mask
  - 32 bit number that are normally written out as four octets in decimal
- The size of the subnet is entirely defined by it's subnet mask
- ![Subnet Mask ](../images/Screenshot%202023-05-17%20at%204.02.39%20PM.png)
  - In this subnet mask 255.255.255.0 the 255 numbers belong to the network while the 0 in this will be available for the host id of the subnet mask
  - a single 8 bit number can represent a 256 different numbers or more specifically the numbers 0-255
  - with the 255 host ids available in the subnet mask 0 is normally not used and 255 is typically reserved for the broadcast id of that subnet network only 1-254 are available to the hosts.
- ![Subnet mask with no full bit boundry ](../images/Screenshot%202023-05-17%20at%204.07.59%20PM.png)
  - The 5 zeros represent the host IDs avalable in this case 32 addresses able to fit in this
  - This is another way to write down subnet masks
  - ![Shorthand subnet example](../images/Screenshot%202023-05-17%20at%204.11.09%20PM.png)
    - the /27 indicates 27 ones and the remaining 5 are to be zeroes in all /32 is the full number if it was not available

### Basic Binary Math

- Base 2 meaning it is either on or off this helps computers compute something, we then create representations based on those two calculations
- ![Binaly Counting](../images/Screenshot%202023-05-17%20at%204.15.59%20PM.png)
  - with binary each column is added as needed since we are not able to add the typical base 10 column we use to count past 10. In this case since it is base 2 every column increases by that exponential factor example: 1,2,4,8,16,32 essentially base to to the to a number ex 2^1 = 1, 2^ 2= 4 2^3=8 2^4= 16... and so on
  - ![Base Multiplication](../images/Screenshot%202023-05-17%20at%204.21.40%20PM.png)
  - Another example of what numbers are able to be stored inside a bit given

### CIDR

- To demarcate something means to set something off
- Demarcation point, to describe where one network or system ends and another one begins
- the slash presenter earlier to represent the networ is what is called CIDR notation
- ![CIDR Notation and Availability](../images/Screenshot%202023-05-17%20at%204.34.05%20PM.png)
  - In this example a /24 network will have 8 host bits (32-24 = 8)
  - This 8 host bits to the 8th power will allow 256 -2 = 254 avalable host IDs but since it is base two it is actually 254+254 = 508 available hosts
  - if you make CIDR = to a /23 network then 9 hosts bits are availabel (32-23 = 9). This base 2 to the 9th power would be eqaul to 512 available hosts minus the 0 unusable and the broadcast ID at the end.

## Routing

- Basics of routing and how routing tables work.These are going to be helpful for trouble shooting noetwork issues
- A router is a device that forwards traffic depending on the destination address of that traffic, a router is a device that is connected to atleast two interfaces
- Basic Routing Steps:
  1. Router recieves a data packet on one of its interfaces
  2. The router examines the destination IP of the packet
  3. The router looks up the destination in the routing table
  4. The router forwards the traffic to the destination, it will forward to the next closest item in the network based on its internal routing table
  5. These steps wil be repeated as many times as needed untill the data packet gets to where it is supposed to go
- Reminder IP addresses belong to networks not to individual nodes on the network
- ![Data Transport to Router](../images/Screenshot%202023-05-17%20at%205.21.58%20PM.png)
  - Image below shows how the application, transport, network layer each add their own information for transport but the router strips away this information and only cares about the IP datagram section of the info. -![Repackaging the Message](../images/Screenshot%202023-05-17%20at%205.32.11%20PM.png)
  - once the router is able to find the destination for the packet it rebuilds the data package with the old information and builds it with its known destination information
  - Once built it will decrease the TTL field by one
  - Once the datagram packet is rebuilt the router will generate a new checksum in order to check for integrity of the data
  - Once this is done it will encapsulate all of this data inside an ethernet frame with source and destination information
  - the source destination will change to add its own mac address as the source address inside this new datagram packet
- ![3 Network example](../images/Screenshot%202023-05-17%20at%205.40.13%20PM.png)
  - For this example computer A is now trying to send a message over to a computer to network C
  - The first destination will be the Router connecting A and B
  - Once received the same process previously descrved will occur: reducing TTL field, rebuild the data packet, and generate a new checksum.
  - The router will then understand that the packet is not intended for it's network and then send that over to Router B and the process will repeat and send it over to its local comuter if it finds its own routing table.

### Routing tables

- ![Basic Routing Table](../images/Screenshot%202023-05-19%20at%201.58.26%20AM.png)
- Each Routing table will have four sections inside of it
  - Destination network
    - This column would contain a row for each network that the router knows about
    - This column my hold an IP, subnet mask, or a CIDR network
    - A catch all destination network may be in the table in the event it does not know what to do with an IP address that does not know where to route that IP address to
  - Next Hop
    - This is the IP address of the next router that should receive data intended for the destination networking question
  - Total Hops
    - The total amount of hops needed for the packet to get to it's destination
    - The total amount of hops can change due to many factos: new nodes, routers are down, a new faster path is introduced
  - Interface
    - The router needs to know how to forward traffic on its interfaces based on the destination that it receives

### Interior Gateway Protocols

- Routing protocols: These are special protocols the routers use to speak to each other in order to share what information they might have
- Routing protocols fall into two main categories:
  - Interior gateway protocols
    - Used by routers to share information within a single autonomous system
    - Interior gateway protocols are further split into two categories:
      - Link state routing protocols
        - In this protocol each router broadcasts the state of each link on it's interfaces
        - Because of the broadcasting each router may know the state of each other router
        - Link state routing will require more memory and processing power since the state is constanly being evaluated by the router to be able to send data to the best suitable router
        - Link state protocols are much more common and manufacturers may no longer support distance vector protocols
      - Distance-vector protocols
        - Older standard
        - Router uses it's routing table and sends this list to every single router it is attached to
        - This sharing of routing tables will help the router find a shorter distance to it's intended destination
  - Exterior gateway protocols
- Autonomous System: A collection of networks that all fall under the control of a single network operator
- Exterior gateway protocols
  - Are used for the exchange of information between independent autonomous systems

### Exterior Gateways, Autonomous Systems and the IANA

- Are used to to communicate data between routers representing the edges of an autonomous system
- Are used when two organizations need to share information with one another, this is the opposite with interior gateway protocols
- ![Edge and Core Router Implementation](../images/Screenshot%202023-05-19%20at%202.34.36%20AM.png)
- Internet Assigned Numbers Authority: A non-profit organization that helps manage things like IP address allocation
- Along with managing IP address allocation, the IANA is also responsible for ASN, or Autonomous System Number allocation (ASN)
- ASN are numbers assigned to individual autonomous systems 32 bit numbers
- ASNs are not looked at commonly by humans
- Valuable Links: https://en.wikipedia.org/wiki/Open_Shortest_Path_First https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm

### Non-Routable Addresses Space

- 1996 RFC 1918 (Request for Comments)
  - Outlined Non-routable address space: They are ranges of IPs set aside for use by anyone that cannot be routed to
  - This address space will allow computers to communicate within a network and a gateway router will not try to communicate with this non-routable address space
  - The main idea is that these computers will not need the internet but will need to communicate via IP with each other
  - 3 address spaces that will not be routed to;
    - 10.0.0.0/8
    - 172.16.0.0/12
    - 192.168.0.0/16
  - These IP addresses will work with internal networks, appropriate for use in an autonomous system

## Transport and Application Layer

- Thia section will help describe how applications communicate with one another instead of node to node as previously mentioned
- Transport layer : allows traffic to be directed to specific network application
- Application layer : allows these applications to communicate in a way they understand

### Transport Layer

- The transport layer has the ability to multiplex and demultiples
  - Multiplexing in the transport layer means that nodes on a network have the ability to direct traffic toward many different receiving services
- ![Multiplexing](../images/Screenshot%202023-05-22%20at%207.47.37%20PM.png)
- This is done through the use of Ports: a 16 bit number that's used to direct traddic to specidic services running on a networked computer
- Ports are denoted with a colon after the IP address, when it is written this way it is known as a soccet address
- ![Single IP address handling multiple port calss](../images/Screenshot%202023-05-22%20at%207.51.44%20PM.png)
- This is possible because of multiplexing and demultiplexing

### Dissection of a TCP Segment

- TCP Segment: Made up of a TCP header and a data section
- ![TCP Segment](../images/Screenshot%202023-05-22%20at%207.57.14%20PM.png)
- Destination port: the port of the service the traffic intended for
- A high numbered port chosen from a special section of ports kown as ephemeral ports
- Sequence nuber : A 32 bit number that's used to keep track of where in a sequence of TCP segments this one is expected to be
- ![Transport Layer](../images/Screenshot%202023-05-22%20at%208.02.23%20PM.png)
- Because of the limit of the size of an ethernet frame at the transport layer a packet will be broken down into many frames
- The Sequence number will keep track of the sequence number of many there will be
- The acknowledgement number would be what will be expected next. Example if sequence number is =1 then the acknowledgment number will be = 2 meaning that it is expecting the next packet in the broken down sequence.
- Data offset field : a 4 bit number that communicates how long the TCP header for this segment is- this is so that the receiving node understands where the actual data payload begins
- TCP window: specifies the range of sequence number that might be sent before an aknowledgement is required - TCP is a protocol is relient on acknowledgements so the TCP connection needs to ensure the packets are actually being received
- The checksum in the header will verify the data has not been corrupted along the way
- Urgent pointer field: used in conjunction with one of the TCP control flags to point out particular segments that might be more important than others, not really used in modern networking
- Options field: it is sometimes used for more complicated flow control protocols
- Padding: sequence of zeroes to ensure the datapyload field begins at the expected location

### TCP Control Flags and the Three-way Handshake

1. URG(Urgent): A value of one here indicates that the segment is considered urgent and that the urgent pointer field has more data about this; a value of 1 indicates that the segment is urgent
2. ACK (acknowledged): A value of one in this field means that the acknowledgement number field should be examined
3. PSH(push): The transmitting device wants the receiving device to push currently-buffered data to the application on the receiving end as soon as possible
4. RST (reset): One of the sides in a TCP connection hasn't been able to properly recover from a series of missing or malformed segments
5. SYN (synchronize) I'ts used when first establishing a TCP connection and makes sure the receiving end knows to examine the sequence number field
6. FIN (finish) : when this flag is set to one, it means the transmitting computer doesn't have any more data to send and the connection can be closed

- ![Three-way Handshake](../images/Screenshot%202023-05-22%20at%208.30.29%20PM.png)
- A Handshake is a way for two devices to ensure that they're speaking the same protocol and will be able to understand each other ![Four Way Handshake](../images/Screenshot%202023-05-22%20at%208.33.16%20PM.png)
- this is the sequence of events that will close the connection

### TCP Socket States

- A Socket is the instantiation of an end-point in a potential TCP connection
- Instantiation: The actual implementation of something defined elswhere
- TCP sockets exists in many states
  - Listen: A TCP socket is ready and listening for incoming connections (Server Side)
  - SYN_SENT: A synchronization request has been sent, but the connection hasn't been established yet (Client Side)
  - SYN-RECEIVED: A socket previously in a LISTEN state has received a synchronization request and sent a SYN/ACK back, has not received the final ACK from the client yet (Server Side)
  - Established: The TCP connection is in working order and both sides are free to send each other data (Server and Client)
  - FIN_WAIT: A FIN has been sent, but the corresponding ACK from the other end hasn't been received yet
  - CLOSE_WAIT: The connection has been closed at the TCP layer, but that the application that opened the socket hasn't released its hold on the socket yet
  - CLOSED: The connection has been fully terminated and that no further communication is possible
- There other sockets that exists but theese are the most common, they may have different names in different operating systems
- When troubleshooting TCP connection issues make sure you lookup the definitions for that operating system

### Connection-oriented and Connectionless Protocols

- Connection-oriented protocol: Establishes a connection, and uses this to ensure that all data has been properly transmitted
  - Connection oriented protocols ensure they understand when there is an issue with the line by implementing aknowledgments back and forth. When an acknowledgement is missing one will know that there is an issue
  - IP and ethernet do not use ACK messages to verify the validility of the messages they use checksums
  - In the event the checksum does not match that information is discarted but it is not requested to be sent over again
  - The responsability of resending the discarted data packet will fall under the Transport layer
  - ![Packet Travel Route](../images/Screenshot%202023-05-24%20at%204.08.27%20AM.png)
- UDP (User Datagram Protocol) does not support ACK messages and only relies on sending the packet to its destination
- UPD connections would only send over the message to the port, this would make the connection less stable but will open up resources by not having to send ACK messages back and forth for every single packet

### 3 Categories of Ports

- System Ports: are defined as ports 1 -1023. System ports are reserved for common application like FTP (port 21) and Telnet oer TLS/SSL (Port 992). Many still are not assigned. Modern operating systems do not use system ports for outbound traffic
- User Ports: are identified as ports 1024-49151. Vendors register user ports for their specific server applications. the IANA has officially registered some but not all of them
- Ephemeral Ports (Dynamic or Private Ports) are identified as ports 49152 - 65535.Ephemeral ports are used as temporary ports for private transfers. Only clients use ephemeral ports

#### TCP Used for Data Integrity

- TCP sending ACK between the service and client to show that sent data was received. then it uses checksum verification to confirm that the received data matches what was sent
- Port Security: Ensure you have firewalls in place to protect the network and only open sockets when needed
- A socket is a port that a TCP segment has activated to listen for data requests
- Ports allow services to send data to your computer but can also send malware into a client program. It is important to secure ports on a network

### Firewalls

- A device that blocks traffic that meets certain criteria
- Firewalls can be used at any level of the transport layers, commonly they are used in the transport layer
- Firewalls will block connections to certain ports while allowing connections to others
- ![Small company Firewall](../images/Screenshot%202023-05-24%20at%204.31.52%20AM.png)
- In many cases the router can be set up to be the firewall for the organization
- Major and large operating systems also have firewall capabilities built in to them

## The Application Layer

- There are many protocols in this layer but many are standardized throughout application types
- Although the layer given here is on the 5 layer model there exists other types of network models where different sections are mixed together
- ![OSI Model 7 Layers](../images/Screenshot%202023-05-24%20at%204.52.51%20AM.png)
- Session Layer: Responsible for facilitating the communication between actual applications and the transport layer. Takes application layer data and hands it off to the presentation layer.
- Presentation Layer: Responsible for making sure that the unencapsulated application layer data is able to be understood by the application in question

### All of the Layers Working in Unison

- ![Original Network Configuration](../images/Screenshot%202023-05-24%20at%205.18.21%20PM.png)
- Scenario:
  - Computer opens a web browser and enters 172.16.1.100:80 trying to access computer 2 (green)
  - The browser then understand that it must get some web content from that IP address but first will need to establish a TCP connection
  - Once the network recieves the request it will check to see if the requested address is on the same network. In this case 172.16.100:80 is not on the same network as 10.1.1.0/24
  - Once it understands that it is not on the same network it will go ahead and try the gateway of 10.1.1.1 in order to find another network
  - In the event the local computer does not know what 10.1.1.1 is on it's ARP table the machine will send an ARP discovery request (FF:FF:FF:FF:FF:FF) the request will go to every single node inside the network
  - Once the router received the ARP request it will reply back with it's MAC address
  - Once the mac address is found the outbound packet will start to be constructed
  - understanding the needed information to get to the gateway the local machine will then open up an ephemeral port to begin the connection, the browser will then connect to the ephemeral port
  - The networking stack will then begin to build a TCP Segment ![TCP Datagram](../images/Screenshot%202023-05-24%20at%205.53.02%20PM.png)
    - Important notes from this initial TCP Datagram are:
      - Source Port : 5000
      - Destination Port: 80
      - Sequence number: a counter to keep track of every byte sent outward by a host
      - Control Flag: e.g. SYN, URG, ACK, PSH, FIN, and RST
      - Checksum: error detection number
  - The TCP Datagram is then passed to the IP datagram ![IP Datagram](../images/Screenshot%202023-05-24%20at%206.01.37%20PM.png)
    - Notes:
      - The IP layer then builds an IP header
      - In the header the source IP address, Destination IP address, TTL (standard default 64)
      - Once all fields are set the TCP segment is inserted as the data payload for the IP datagram a checksum is then calculated for the whole thing
  - Once the IP and TCP datagram are encapsulated an Ethernet Datagram packet are generated ![Ethernet Datagram](../images/Screenshot%202023-05-24%20at%206.10.53%20PM.png)
    - Notes:
      - The desitination MAC address and source Mac address are placed
      - The ethernet frame is put as the new header of the payload while having the IP and TCP as it's data payload.Another checksum is calculated at this level
      - This will allow the payload to travel to a known destination through ethernet
      - At this level movement occurs as modulations of electrical current running across a CAT 6 cable
      - Once the Ethernet datagram packet is generated it is sent over to the network switch and the packet is inspected to know that the destination MAC address is the Router and sends that packet only to the ethernet cable connecting it to the router
      - Once Router A receives the packet it performs the folowing ![Router Actions](../images/Screenshot%202023-05-24%20at%206.28.34%20PM.png) :
        - Receives frame
        - Recognizes address
        - Calculates checksum
        - Compares checksum
        - Match detected
      - One the router verifies all of the data in the datagram it strips away the local host ethernet frame to leave only the IP TCP packets previously generated
      - Once it is stripped away it will perform a checksum verification to ensure nothing changed with the IP and TCP packets
      - In the IP datagram it will look up the distination IP address in the IP datagram and look up this address in it's own routing table
      - Once it finds the destination to be sent out it would then decrease the TTL by one in the IP datagram, claculate a new checksum and generates a new IP datagram
      - Knowing that the shortest hop to get to netwokr C is through network B it will generate a new Etherner Datagram with the source adress being the MAC adress of Router A as the source address and destination Router B as the destination address
      - The original data payload now has the information in the ethernet packet for the Router information but the IP and TCP payload remains the same.
      - This payload is later sent out to network B where a node will forward the payload to Router B. Router B performs the same checks as Router A, removes the ethernet frame
      - Once the packet is formed containing ethernet, IP, and TCP it inspects the IP datagram to get the destination IP address and sees that it belongs to it's network, once this is verified the TTL is decreased by 1 calculates a new checksum and creates a new datagram
      - With the new checksum the Ethernet datagram is rebuilt to include the destination Mac address and sets the source Mac address to router B (changed from Router A)
      - Once this new payload is sent over the network a switch device will forward it to the intended node where the node will verify it is the intended computer and strip away the un-needed ethernet datagram 
      - The remaining IP datagram is checked the node verifies that the destination IP address is it's own 
      - Once verified the IP datagram is stripped and only the TCP datagram is left 
      - On the TCP datagram the checksum is checked 
      - Next the destination port is understood and the local node ensures that the port being requested is in the open state. 
      - The local node takes account for the sequence number and stores that to be put back in the acknowledgement number of the entire datagram packet (reminder that a sequence number is the order in which the packet needs to be put together in order to be able to piece together the entire message)
      - `All of this was to only send a SYN flag and communication will have to occur back and forth but the steps will remain the same`
- 
