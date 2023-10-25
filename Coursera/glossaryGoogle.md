# Storage Location for Terms Used

## New terms and their definitions: Course 2 Week 2

Address class system: A system which defines how the global IP address space is split up

Address Resolution Protocol (ARP): A protocol used to discover the hardware address of a node with a certain IP address

ARP table: A list of IP addresses and the MAC addresses associated with them

ASN: Autonomous System Number is a number assigned to an individual autonomous system

Demarcate: To set the boundaries of something

Demarcation point: Where one network or system ends and another one begins

Destination network: The column in a routing table that contains a row for each network that the router knows about

DHCP: A technology that assigns an IP address automatically to a new device. It is an application layer protocol that automates the configuration process of hosts on a network

Dotted decimal notation: A format of using dots to separate numbers in a string, such as in an IP address

Dynamic IP address: An IP address assigned automatically to a new device through a technology known as Dynamic Host Configuration Protocol

Exterior gateway: Protocols that are used for the exchange of information between independent autonomous systems

Flag field: It is used to indicate if a datagram is allowed to be fragmented, or to indicate that the datagram has already been fragmented

Fragmentation: The process of taking a single IP datagram and splitting it up into several smaller datagrams

Fragmentation offset field: It contains values used by the receiving end to take all the parts of a fragmented packet and put them back together in the correct order

Header checksum field: A checksum of the contents of the entire IP datagram header

Header length field: A four bit field that declares how long the entire header is. It is almost always 20 bytes in length when dealing with IPv4

IANA: The Internet Assigned Numbers Authority, is a non-profit organization that helps manage things like IP address allocation

Identification field: It is a 16-bit number that's used to group messages together

Interface: For a router, the port where a router connects to a network. A router gives and receives data through its interfaces. These are also used as part of the routing table

Interior gateway: Interior gateway protocols are used by routers to share information within a single autonomous system

IP datagram: A highly structured series of fields that are strictly defined

IP options field: An optional field and is used to set special characteristics for datagrams primarily used for testing purposes

Network Address Translation (NAT): A mitigation tool that lets organizations use one public IP address and many private IP addresses within the network

Next hop: The IP address of the next router that should receive data intended for the destination networking question or this could just state the network is directly connected and that there aren't any additional hops needed. Defined as part of the routing table

Non-routable address space: They are ranges of IPs set aside for use by anyone that cannot be routed to

Padding field: A series of zeros used to ensure the header is the correct total size

Protocol field: A protocol field is an 8-bit field that contains data about what transport layer protocol is being used

Routing protocols: Special protocols the routers use to speak to each other in order to share what information they might have

Service type field: A eight bit field that can be used to specify details about quality of service or QoS technologies

Static IP address: An IP address that must be manually configured on a node

Subnet mask: 32-bit numbers that are normally written as four octets of decimal numbers

Subnetting: The process of taking a large network and splitting it up into many individual smaller sub networks or subnets

Time-To-Live field (TTL): An 8-bit field that indicates how many router hops a datagram can traverse before it's thrown away

Total hops: The total number of devices data passes through to get from its source to its destination. Routers try to choose the shortest path, so fewest hops possible. The routing table is used to keep track of this

Total length field: A 16-bit field that indicates the total length of the IP datagram it's attached to

Terms and their definitions from previous weeks
B

Bit: The smallest representation of data that a computer can understand

Border Gateway Protocol (BGP): A protocol by which routers share data with each other

Broadcast: A type of Ethernet transmission, sent to every single device on a LAN

Broadcast address: A special destination used by an Ethernet broadcast composed by all Fs

C

Cable categories: Groups of cables that are made with the same material. Most network cables used today can be split into two categories, copper and fiber

Cables: Insulated wires that connect different devices to each other allowing data to be transmitted over them

Carrier-Sense Multiple Access with Collision Detection (CSMA/CD): CSMA/CD is used to determine when the communications channels are clear and when the device is free to transmit data

Client: A device that receives data from a server

Collision domain: A network segment where only one device can communicate at a time

Computer networking: The full scope of how computers communicate with each other

Copper cable categories : These categories have different physical characteristics like the number of twists in the pair of copper wires. These are defined as names like category (or cat) 5, 5e, or 6, and how quickly data can be sent across them and how resistant they are to outside interference are all related to the way the twisted pairs inside are arranged

Crosstalk: Crosstalk is when an electrical pulse on one wire is accidentally detected on another wire

Cyclical Redundancy Check (CRC): A mathematical transformation that uses polynomial division to create a number that represents a larger set of data. It is an important concept for data integrity and is used all over computing, not just network transmissions

D

Data packet: An all-encompassing term that represents any single set of binary data being sent across a network link

Datalink layer: The layer in which the first protocols are introduced. This layer is responsible for defining a common way of interpreting signals, so network devices can communicate

Destination MAC address: The hardware address of the intended recipient that immediately follows the start frame delimiter

Duplex communication: A form of communication where information can flow in both directions across a cable

E

Ethernet: The protocol most widely used to send data across individual links

Ethernet frame: A highly structured collection of information presented in a specific order

EtherType field: It follows the Source MAC Address in a dataframe. It's 16 bits long and used to describe the protocol of the contents of the frame

F

Fiber cable: Fiber optic cables contain individual optical fibers which are tiny tubes made of glass about the width of a human hair. Unlike copper, which uses electrical voltages, fiber cables use pulses of light to represent the ones and zeros of the underlying data

Five layer model: A model used to explain how network devices communicate. This model has five layers that stack on top of each other: Physical, Data Link, Network, Transport, and Application

Frame check sequence: It is a 4-byte or 32-bit number that represents a checksum value for the entire frame

Full duplex: The capacity of devices on either side of a networking link to communicate with each other at the exact same time

H

Half-duplex: It means that, while communication is possible in each direction, only one device can be communicating at a time

Hexadecimal: A way to represent numbers using a numerical base of 16

Hub: It is a physical layer device that broadcasts data to everything computer connected to it

I

Internet Protocol (IP): The most common protocol used in the network layer

Internet Service Provider (ISP): A company that provides a consumer an internet connection

Internetwork: A collection of networks connected together through routers - the most famous of these being the Internet

L

Line coding: Modulation used for computer networks

Local Area Network (LAN): A single network in which multiple devices are connected

M

MAC(Media Access Control) address: A globally unique identifier attached to an individual network interface. It's a 48-bit number normally represented by six groupings of two hexadecimal numbers

Modulation: A way of varying the voltage of a constant electrical charge moving across a standard copper network cable

Multicast frame: If the least significant bit in the first octet of a destination address is set to one, it means you're dealing with a multicast frame. A multicast frame is similarly set to all devices on the local network signal, and it will be accepted or discarded by each device depending on criteria aside from their own hardware MAC address

N

Network layer: It's the layer that allows different networks to communicate with each other through devices known as routers. It is responsible for getting data delivered across a collection of networks

Network port: The physical connector to be able to connect a device to the network. This may be attached directly to a device on a computer network, or could also be located on a wall or on a patch panel

Network switch: It is a level 2 or data link device that can connect to many devices so they can communicate. It can inspect the contents of the Ethernet protocol data being sent around the network, determine which system the data is intended for and then only send that data to that one system

Node: Any device connected to a network. On most networks, each node will typically act as a server or a client

O

Octet: Any number that can be represented by 8 bits

Organizationally Unique Identifier (OUI): The first three octets of a MAC address

OSI model: A model used to define how network devices communicate. This model has seven layers that stack on top of each other: Physical, Data Link, Network, Transport, Session, Presentation, and Application

P

Patch panel: A device containing many physical network ports

Payload: The actual data being transported, which is everything that isn't a header

Physical layer: It represents the physical devices that interconnect computers

Preamble: The first part of an Ethernet frame, it is 8 bytes or 64 bits long and can itself be split into two sections

Protocol: A defined set of standards that computers must follow in order to communicate properly is called a protocol

R

Router: A device that knows how to forward data between independent networks

S

Server: A device that provides data to another device that is requesting that data, also known as a client

Simplex communication: A form of data communication that only goes in one direction across a cable

Source MAC address: The hardware address of the device that sent the ethernet frame or data packet. In the data packet it follows the destination MAC address

Start Frame Delimiter (SFD): The last byte in the preamble, that signals to a receiving device that the preamble is over and that the actual frame contents will now follow

T

Transmission Control Protocol (TCP): The data transfer protocol most commonly used in the fourth layer. This protocol requires an established connection between the client and server

Transport layer: The network layer that sorts out which client and server programs are supposed to get the data

Twisted pair cable: The most common type of cabling used for connecting computing devices. It features pairs of copper wires that are twisted together

U

Unicast transmission: A unicast transmission is always meant for just one receiving address

User Datagram Protocol (UDP): A transfer protocol that does not rely on connections. This protocol does not support the concept of an acknowledgement. With UDP, you just set a destination port and send the data packet

V

Virtual LAN (VLAN): It is a technique that lets you have multiple logical LANs operating on the same physical equipment

VLAN header: A piece of data that indicates what the frame itself is. In a data packet it is followed by the EtherType

### Module 3 Glossary 

ACK flag: One of the TCP control flags. ACK is short for acknowledge. A value of one in this field means that the acknowledgment number field should be examined

Acknowledgement number: The number of the next expected segment in a TCP sequence

Application layer: The layer that allows network applications to communicate in a way they understand

Application layer payload: The entire contents of whatever data applications want to send to each other

CLOSE: A connection state that indicates that the connection has been fully terminated, and that no further communication is possible

CLOSE_WAIT: A connection state that indicates that the connection has been closed at the TCP layer, but that the application that opened the socket hasn't released its hold on the socket yet

Connection-oriented protocol: A data-transmission protocol that establishes a connection at the transport layer, and uses this to ensure that all data has been properly transmitted

Connectionless protocol: A data-transmission protocol that allows data to be exchanged without an established connection at the transport layer. The most common of these is known as UDP, or User Datagram Protocol

Data offset field: The number of the next expected segment in a TCP packet/datagram

Demultiplexing: Taking traffic that's all aimed at the same node and delivering it to the proper receiving service

Destination port: The port of the service the TCP packet is intended for

ESTABLISHED: Status indicating that the TCP connection is in working order, and both sides are free to send each other data

FIN: One of the TCP control flags. FIN is short for finish. When this flag is set to one, it means the transmitting computer doesn't have any more data to send and the connection can be closed  

FIN_WAIT: A TCP socket state indicating that a FIN has been sent, but the corresponding ACK from the other end hasn't been received yet

Firewall: It is a device that blocks or allows traffic based on established rules 

FTP: An older method used for transferring files from one computer to another, but you still see it in use today

Handshake: A way for two devices to ensure that they're speaking the same protocol and will be able to understand each other

Instantiation: The actual implementation of something defined elsewhere

Listen: It means that a TCP socket is ready and listening for incoming connections

Multiplexing: It means that nodes on the network have the ability to direct traffic toward many different receiving services

Options field: It is sometimes used for more complicated flow control protocols

Port: It is a 16-bit number that's used to direct traffic to specific services running on a networked computer

Presentation layer: It is responsible for making sure that the unencapsulated application layer data is actually able to be understood by the application in question

PSH flag: One of the TCP control flags. PSH is short for push. This flag means that the transmitting device wants the receiving device to push currently- buffered data to the application on the receiving end as soon as possible

RST flag: One of the TCP control flags. RST is short for reset. This flag means that one of the sides in a TCP connection hasn't been able to properly recover from a series of missing or malformed segments

Sequence number: A 32-bit number that's used to keep track of where in a sequence of TCP segments this one is expected to be

Server or Service: A program running on a computer waiting to be asked for data

Session layer: The network layer responsible for facilitating the communication between actual applications and the transport layer

Socket: The instantiation of an endpoint in a potential TCP connection

Source port: A high numbered port chosen from a special section of ports known as ephemeral ports

SYN flag: One of the TCP flags. SYN stands for synchronize. This flag is used when first establishing a TCP connection and make sure the receiving end knows to examine the sequence number field

SYN_RECEIVED: A TCP socket state that means that a socket previously in a listener state, has received a synchronization request and sent a SYN_ACK back

SYN_SENT: A TCP socket state that means that a synchronization request has been sent, but the connection hasn't been established yet

TCP checksum: A mechanism that makes sure that no data is lost or corrupted during a transfer 

TCP segment: A payload section of an IP datagram made up of a TCP header and a data section

TCP window: The range of sequence numbers that might be sent before an acknowledgement is required

URG flag: One of the TCP control flags. URG is short for urgent. A value of one here indicates that the segment is considered urgent and that the urgent pointer field has more data about this

Urgent pointer field: A field used in conjunction with one of the TCP control flags to point out particular segments that might be more important than others



Terms and their definitions from previous weeks
A

Address class system: A system which defines how the global IP address space is split up

Address Resolution Protocol (ARP): A protocol used to discover the hardware address of a node with a certain IP address

ARP table: A list of IP addresses and the MAC addresses associated with them

ASN: Autonomous System Number is a number assigned to an individual autonomous system

B

Bit: The smallest representation of data that a computer can understand

Border Gateway Protocol (BGP): A protocol by which routers share data with each other

Broadcast address: A special destination used by an Ethernet broadcast composed by all Fs

Broadcast: A type of Ethernet transmission, sent to every single device on a LAN

C

Cable categories: Groups of cables that are made with the same material. Most network cables used today can be split into two categories, copper and fiber

Cables: Insulated wires that connect different devices to each other allowing data to be transmitted over them

Carrier-Sense Multiple Access with Collision Detection (CSMA/CD): CSMA/CD is used to determine when the communications channels are clear and when the device is free to transmit data

Client: A device that receives data from a server

Collision domain: A network segment where only one device can communicate at a time

Computer networking: The full scope of how computers communicate with each other

Copper cable categories: These categories have different physical characteristics like the number of twists in the pair of copper wires. These are defined as names like category (or cat) 5, 5e, or 6, and how quickly data can be sent across them and how resistant they are to outside interference are all related to the way the twisted pairs inside are arranged

Crosstalk: Crosstalk is when an electrical pulse on one wire is accidentally detected on another wire

Cyclical Redundancy Check (CRC): A mathematical transformation that uses polynomial division to create a number that represents a larger set of data. It is an important concept for data integrity and is used all over computing, not just network transmissions

D

Data packet: An all-encompassing term that represents any single set of binary data being sent across a network link

Datalink layer: The layer in which the first protocols are introduced. This layer is responsible for defining a common way of interpreting signals, so network devices can communicate

Demarcate: To set the boundaries of something

Demarcation point: Where one network or system ends and another one begins

Destination MAC address: The hardware address of the intended recipient that immediately follows the start frame delimiter

Destination network: The column in a routing table that contains a row for each network that the router knows about

DHCP: A technology that assigns an IP address automatically to a new device. It is an application layer protocol that automates the configuration process of hosts on a network

Dotted decimal notation: A format of using dots to separate numbers in a string, such as in an IP address

Duplex communication: A form of communication where information can flow in both directions across a cable

Dynamic IP address: An IP address assigned automatically to a new device through a technology known as Dynamic Host Configuration Protocol

E

Ethernet frame: A highly structured collection of information presented in a specific order

Ethernet: The protocol most widely used to send data across individual links

EtherType field: It follows the Source MAC Address in a dataframe. It's 16 bits long and used to describe the protocol of the contents of the frame

Exterior gateway: Protocols that are used for the exchange of information between independent autonomous systems

F

Fiber cable: Fiber optic cables contain individual optical fibers which are tiny tubes made of glass about the width of a human hair. Unlike copper, which uses electrical voltages, fiber cables use pulses of light to represent the ones and zeros of the underlying data

Five layer model: A model used to explain how network devices communicate. This model has five layers that stack on top of each other: Physical, Data Link, Network, Transport, and Application

Flag field: It is used to indicate if a datagram is allowed to be fragmented, or to indicate that the datagram has already been fragmented

Fragmentation offset field: It contains values used by the receiving end to take all the parts of a fragmented packet and put them back together in the correct order

Fragmentation: The process of taking a single IP datagram and splitting it up into several smaller datagrams

Frame check sequence: It is a 4-byte or 32-bit number that represents a checksum value for the entire frame

Full duplex: The capacity of devices on either side of a networking link to communicate with each other at the exact same time

H

Half-duplex: It means that, while communication is possible in each direction, only one device can be communicating at a time

Header checksum field: A checksum of the contents of the entire IP datagram header

Header length field: A four bit field that declares how long the entire header is. It is almost always 20 bytes in length when dealing with IPv4

Hexadecimal: A way to represent numbers using a numerical base of 16

Hub: It is a physical layer device that broadcasts data to everything computer connected to it

I

IANA: The Internet Assigned Numbers Authority, is a non-profit organization that helps manage things like IP address allocation

Identification field: It is a 16-bit number that's used to group messages together

Interface: For a router, the port where a router connects to a network. A router gives and receives data through its interfaces. These are also used as part of the routing table

Interior gateway: Interior gateway protocols are used by routers to share information within a single autonomous system

Internet Protocol (IP): The most common protocol used in the network layer

Internet Service Provider (ISP): A company that provides a consumer an internet connection

Internetwork: A collection of networks connected together through routers - the most famous of these being the Internet

IP datagram: A highly structured series of fields that are strictly defined

IP options field: An optional field and is used to set special characteristics for datagrams primarily used for testing purposes

L

Line coding: Modulation used for computer networks

Local Area Network (LAN): A single network in which multiple devices are connected

M

MAC(Media Access Control) address: A globally unique identifier attached to an individual network interface. It's a 48-bit number normally represented by six groupings of two hexadecimal numbers

Modulation: A way of varying the voltage of a constant electrical charge moving across a standard copper network cable

Multicast frame: If the least significant bit in the first octet of a destination address is set to one, it means you're dealing with a multicast frame. A multicast frame is similarly set to all devices on the local network signal, and it will be accepted or discarded by each device depending on criteria aside from their own hardware MAC address

N

Network Address Translation (NAT): A mitigation tool that lets organizations use one public IP address and many private IP addresses within the network

Network layer: It's the layer that allows different networks to communicate with each other through devices known as routers. It is responsible for getting data delivered across a collection of networks

Network port: The physical connector to be able to connect a device to the network. This may be attached directly to a device on a computer network, or could also be located on a wall or on a patch panel

Network switch: It is a level 2 or data link device that can connect to many devices so they can communicate. It can inspect the contents of the Ethernet protocol data being sent around the network, determine which system the data is intended for and then only send that data to that one system

Next hop: The IP address of the next router that should receive data intended for the destination networking question or this could just state the network is directly connected and that there aren't any additional hops needed. Defined as part of the routing table

Node: Any device connected to a network. On most networks, each node will typically act as a server or a client

Non-routable address space: They are ranges of IPs set aside for use by anyone that cannot be routed to

O

Octet: Any number that can be represented by 8 bits

Organizationally Unique Identifier (OUI): The first three octets of a MAC address

OSI model: A model used to define how network devices communicate. This model has seven layers that stack on top of each other: Physical, Data Link, Network, Transport, Session, Presentation, and Application

P

Padding field: A series of zeros used to ensure the header is the correct total size

Patch panel: A device containing many physical network ports

Payload: The actual data being transported, which is everything that isn't a header

Physical layer: It represents the physical devices that interconnect computers

Preamble: The first part of an Ethernet frame, it is 8 bytes or 64 bits long and can itself be split into two sections

Protocol field: A protocol field is an 8-bit field that contains data about what transport layer protocol is being used

Protocol: A defined set of standards that computers must follow in order to communicate properly is called a protocol

R

Router: A device that knows how to forward data between independent networks

Routing protocols: Special protocols the routers use to speak to each other in order to share what information they might have

S

Server: A device that provides data to another device that is requesting that data, also known as a client

Service type field: A eight bit field that can be used to specify details about quality of service or QoS technologies

Simplex communication: A form of data communication that only goes in one direction across a cable

Source MAC address: The hardware address of the device that sent the ethernet frame or data packet. In the data packet it follows the destination MAC address

Start Frame Delimiter (SFD): The last byte in the preamble, that signals to a receiving device that the preamble is over and that the actual frame contents will now follow

Static IP address: An IP address that must be manually configured on a node

Subnet mask: 32-bit numbers that are normally written as four octets of decimal numbers

Subnetting: The process of taking a large network and splitting it up into many individual smaller sub networks or subnets

T

Time-To-Live field (TTL): An 8-bit field that indicates how many router hops a datagram can traverse before it's thrown away

Total hops: The total number of devices data passes through to get from its source to its destination. Routers try to choose the shortest path, so fewest hops possible. The routing table is used to keep track of this

Total length field: A 16-bit field that indicates the total length of the IP datagram it's attached to

Transmission Control Protocol (TCP): The data transfer protocol most commonly used in the fourth layer. This protocol requires an established connection between the client and server

Transport layer: The network layer that sorts out which client and server programs are supposed to get the data

Twisted pair cable: The most common type of cabling used for connecting computing devices. It features pairs of copper wires that are twisted together

U

Unicast transmission: A unicast transmission is always meant for just one receiving address

User Datagram Protocol (UDP): A transfer protocol that does not rely on connections. This protocol does not support the concept of an acknowledgement. With UDP, you just set a destination port and send the data packet

V

Virtual LAN (VLAN): It is a technique that lets you have multiple logical LANs operating on the same physical equipment

VLAN header: A piece of data that indicates what the frame itself is. In a data packet it is followed by the EtherType

Module 4 Glossary
New terms and their definitions: Course 2 Week 4
A record: The most common resource record, used to point a certain domain name at a certain IPv4 IP address

Anycast: A technique that's used to route traffic to different destinations depending on factors like location, congestion, or link health

Automatic allocation: A range of IP addresses is set aside for assignment purposes

Caching and recursive name servers: They are generally provided by an ISP or your local network, and their purpose is to store domain name lookups for a certain amount of time

CNAME: A resource record used to map one domain to another

DHCP discovery: The process by which a client configured to use DHCP attempts to get network configuration information

Domain Name System (DNS): A global and highly distributed network service that resolves strings of letters, such as a website name, into an IP address

DNS zones: A portion of space in the Domain Name System (DNS) that is controlled by an authoritative name server

Domain: Used to demarcate where control moves from a top-level domain name server to an authoritative name server

Domain name: A website name; the part of the URL following www.

Dynamic allocation: A range of IP addresses is set aside for client devices and one of these IPs is issued to these devices when they request one

Fixed allocation: Requires a manually specified list of MAC address and the corresponding IPs

Fully qualified domain name: When you combine all the parts of a domain together

IP masquerading: The NAT obscures the sender's IP address from the receiver

MX record: It stands for mail exchange and this resource record is used in order to deliver email to the correct server

Name resolution: This process of using DNS to turn a domain name into an IP address

Network Address Translation (NAT): A mitigation tool that lets organizations use one public IP address and many private IP addresses within the network

NS record: It indicates other name servers that may also be responsible for a particular zone

NTP servers: Used to keep all computers on a network synchronized in time

Pointer resource record: It resolves an IP to a name

Port forwarding: A technique where specific destination ports can be configured to always be delivered to specific nodes

Port preservation: A technique where the source port chosen by a client, is the same port used by the router

Proxy service: A server that acts on behalf of a client in order to access another service

Quad A (AAAA) record: It is very similar to an A record except that it returns in IPv6 address instead of an IPv4 address

Recursive name servers: Servers that perform full DNS resolution requests

Reverse lookup zone files: They let DNS resolvers ask for an IP, and get the FQDN associated with it returned

Reverse proxy: A service that might appear to be a single server to external clients, but actually represents many servers living behind it

Round robin: It is a concept that involves iterating over a list of items one by one in an orderly fashion

SRV record: A service record used to define the location of various specific services

Start of authority: A declaration of the zone and the name of the name server that is authoritative for it

Top Level Domain (TLD): The top level of the DNS or the last part of a domain name. For example, the “com” in www.weather.com

Time-To-Live field (TTL): An 8-bit field that indicates how many router hops a datagram can traverse before it's thrown away

Two-factor authentication: A technique where more than just a username and password are required to authenticate. Usually, a short-lived numerical token is generated by the user through a specialized piece of hardware or software

TXT record: It stands for text and was originally intended to be used only for associating some descriptive text with a domain name for human consumption

Types of DNS servers: There are five primary types of DNS servers; caching name servers, recursive name servers, root name servers, TLD name servers, and authoritative name servers

Virtual Private Network (VPN): A technology that allows for the extension of a private or local network, to a host that might not work on that same local network

Zone Files: Simple configuration files that declare all resource records for a particular zone


Terms and their definitions from previous weeks
A

ACK flag: One of the TCP control flags. ACK is short for acknowledge. A value of one in this field means that the acknowledgment number field should be examined

Acknowledgement number: The number of the next expected segment in a TCP sequence

Address class system: A system which defines how the global IP address space is split up

Address Resolution Protocol (ARP): A protocol used to discover the hardware address of a node with a certain IP address

Application layer payload: The entire contents of whatever data applications want to send to each other

Application layer: The layer that allows network applications to communicate in a way they understand

ARP table: A list of IP addresses and the MAC addresses associated with them

ASN: Autonomous System Number is a number assigned to an individual autonomous system

B

Bit: The smallest representation of data that a computer can understand

Border Gateway Protocol (BGP): A protocol by which routers share data with each other

Broadcast address: A special destination used by an Ethernet broadcast composed by all Fs

Broadcast: A type of Ethernet transmission, sent to every single device on a LAN

C

Cable categories: Groups of cables that are made with the same material. Most network cables used today can be split into two categories, copper and fiber

Cables: Insulated wires that connect different devices to each other allowing data to be transmitted over them

Carrier-Sense Multiple Access with Collision Detection (CSMA/CD): CSMA/CD is used to determine when the communications channels are clear and when the device is free to transmit data

Client: A device that receives data from a server

CLOSE_WAIT: A connection state that indicates that the connection has been closed at the TCP layer, but that the application that opened the socket hasn't released its hold on the socket yet

CLOSE: A connection state that indicates that the connection has been fully terminated, and that no further communication is possible

Collision domain: A network segment where only one device can communicate at a time

Computer networking: The full scope of how computers communicate with each other

Connection-oriented protocol: A data-transmission protocol that establishes a connection at the transport layer, and uses this to ensure that all data has been properly transmitted

Connectionless protocol: A data-transmission protocol that allows data to be exchanged without an established connection at the transport layer. The most common of these is known as UDP, or User Datagram Protocol

Copper cable categories: These categories have different physical characteristics like the number of twists in the pair of copper wires. These are defined as names like category (or cat) 5, 5e, or 6, and how quickly data can be sent across them and how resistant they are to outside interference are all related to the way the twisted pairs inside are arranged

Crosstalk: Crosstalk is when an electrical pulse on one wire is accidentally detected on another wire

Cyclical Redundancy Check (CRC): A mathematical transformation that uses polynomial division to create a number that represents a larger set of data. It is an important concept for data integrity and is used all over computing, not just network transmissions

D

Data offset field: The number of the next expected segment in a TCP packet/datagram

Data packet: An all-encompassing term that represents any single set of binary data being sent across a network link

Datalink layer: The layer in which the first protocols are introduced. This layer is responsible for defining a common way of interpreting signals, so network devices can communicate

Demarcate: To set the boundaries of something

Demarcation point: Where one network or system ends and another one begins

Demultiplexing: Taking traffic that's all aimed at the same node and delivering it to the proper receiving service

Destination MAC address: The hardware address of the intended recipient that immediately follows the start frame delimiter

Destination network: The column in a routing table that contains a row for each network that the router knows about

Destination port: The port of the service the TCP packet is intended for

DHCP: A technology that assigns an IP address automatically to a new device. It is an application layer protocol that automates the configuration process of hosts on a network

Dotted decimal notation: A format of using dots to separate numbers in a string, such as in an IP address

Duplex communication: A form of communication where information can flow in both directions across a cable

Dynamic IP address: An IP address assigned automatically to a new device through a technology known as Dynamic Host Configuration Protocol

E

ESTABLISHED: Status indicating that the TCP connection is in working order, and both sides are free to send each other data

Ethernet frame: A highly structured collection of information presented in a specific order

Ethernet: The protocol most widely used to send data across individual links

EtherType field: It follows the Source MAC Address in a dataframe. It's 16 bits long and used to describe the protocol of the contents of the frame

Exterior gateway: Protocols that are used for the exchange of information between independent autonomous systems

F

Fiber cable: Fiber optic cables contain individual optical fibers which are tiny tubes made of glass about the width of a human hair. Unlike copper, which uses electrical voltages, fiber cables use pulses of light to represent the ones and zeros of the underlying data

FIN_WAIT: A TCP socket state indicating that a FIN has been sent, but the corresponding ACK from the other end hasn't been received yet

FIN: One of the TCP control flags. FIN is short for finish. When this flag is set to one, it means the transmitting computer doesn't have any more data to send and the connection can be closed

Firewall: It is a device that blocks or allows traffic based on established rules

Five layer model: A model used to explain how network devices communicate. This model has five layers that stack on top of each other: Physical, Data Link, Network, Transport, and Application

Flag field: It is used to indicate if a datagram is allowed to be fragmented, or to indicate that the datagram has already been fragmented

Fragmentation offset field: It contains values used by the receiving end to take all the parts of a fragmented packet and put them back together in the correct order

Fragmentation: The process of taking a single IP datagram and splitting it up into several smaller datagrams

Frame check sequence: It is a 4-byte or 32-bit number that represents a checksum value for the entire frame

FTP: An older method used for transferring files from one computer to another, but you still see it in use today

Full duplex: The capacity of devices on either side of a networking link to communicate with each other at the exact same time

H

Half-duplex: It means that, while communication is possible in each direction, only one device can be communicating at a time

Handshake: A way for two devices to ensure that they're speaking the same protocol and will be able to understand each other

Header checksum field: A checksum of the contents of the entire IP datagram header

Header length field: A four bit field that declares how long the entire header is. It is almost always 20 bytes in length when dealing with IPv4

Hexadecimal: A way to represent numbers using a numerical base of 16

Hub: It is a physical layer device that broadcasts data to everything computer connected to it

I

IANA: The Internet Assigned Numbers Authority, is a non-profit organization that helps manage things like IP address allocation

Identification field: It is a 16-bit number that's used to group messages together

Instantiation: The actual implementation of something defined elsewhere

Interface: For a router, the port where a router connects to a network. A router gives and receives data through its interfaces. These are also used as part of the routing table

Interior gateway: Interior gateway protocols are used by routers to share information within a single autonomous system

Internet Protocol (IP): The most common protocol used in the network layer

Internet Service Provider (ISP): A company that provides a consumer an internet connection

Internetwork: A collection of networks connected together through routers - the most famous of these being the Internet

IP datagram: A highly structured series of fields that are strictly defined

IP options field: An optional field and is used to set special characteristics for datagrams primarily used for testing purposes

L

Line coding: Modulation used for computer networks

Listen: It means that a TCP socket is ready and listening for incoming connections

Local Area Network (LAN): A single network in which multiple devices are connected

M

MAC(Media Access Control) address: A globally unique identifier attached to an individual network interface. It's a 48-bit number normally represented by six groupings of two hexadecimal numbers

Modulation: A way of varying the voltage of a constant electrical charge moving across a standard copper network cable

Multicast frame: If the least significant bit in the first octet of a destination address is set to one, it means you're dealing with a multicast frame. A multicast frame is similarly set to all devices on the local network signal, and it will be accepted or discarded by each device depending on criteria aside from their own hardware MAC address

Multiplexing: It means that nodes on the network have the ability to direct traffic toward many different receiving services

N

Network Address Translation (NAT): A mitigation tool that lets organizations use one public IP address and many private IP addresses within the network

Network layer: It's the layer that allows different networks to communicate with each other through devices known as routers. It is responsible for getting data delivered across a collection of networks

Network port: The physical connector to be able to connect a device to the network. This may be attached directly to a device on a computer network, or could also be located on a wall or on a patch panel

Network switch: It is a level 2 or data link device that can connect to many devices so they can communicate. It can inspect the contents of the Ethernet protocol data being sent around the network, determine which system the data is intended for and then only send that data to that one system

Next hop: The IP address of the next router that should receive data intended for the destination networking question or this could just state the network is directly connected and that there aren't any additional hops needed. Defined as part of the routing table

Node: Any device connected to a network. On most networks, each node will typically act as a server or a client

Non-routable address space: They are ranges of IPs set aside for use by anyone that cannot be routed to

O

Octet: Any number that can be represented by 8 bits

Options field: It is sometimes used for more complicated flow control protocols

Organizationally Unique Identifier (OUI): The first three octets of a MAC address

OSI model: A model used to define how network devices communicate. This model has seven layers that stack on top of each other: Physical, Data Link, Network, Transport, Session, Presentation, and Application

P

Padding field: A series of zeros used to ensure the header is the correct total size

Patch panel: A device containing many physical network ports

Payload: The actual data being transported, which is everything that isn't a header

Physical layer: It represents the physical devices that interconnect computers

Port: It is a 16-bit number that's used to direct traffic to specific services running on a networked computer

Preamble: The first part of an Ethernet frame, it is 8 bytes or 64 bits long and can itself be split into two sections

Presentation layer: It is responsible for making sure that the unencapsulated application layer data is actually able to be understood by the application in question

Protocol field: A protocol field is an 8-bit field that contains data about what transport layer protocol is being used

Protocol: A defined set of standards that computers must follow in order to communicate properly is called a protocol

PSH flag: One of the TCP control flags. PSH is short for push. This flag means that the transmitting device wants the receiving device to push currently- buffered data to the application on the receiving end as soon as possible

R

Router: A device that knows how to forward data between independent networks

Routing protocols: Special protocols the routers use to speak to each other in order to share what information they might have

RST flag: One of the TCP control flags. RST is short for reset. This flag means that one of the sides in a TCP connection hasn't been able to properly recover from a series of missing or malformed segments

Module 5 Glossary
New terms and their definitions: Course 2 Week 5
Ad-Hoc network: A network configuration without supporting network infrastructure. Every device involved with the ad-hoc network communicates with every other device within range, and all nodes help pass along messages

Asymmetric Digital Subscriber Line (ADSL): A device that establishes data connections across phone lines and different speeds for uploading and downloading data

Baud rate: A measurement of how many bits could be passed across a phone line in a second

Bluetooth: The most common short range wireless network

Broadband: Any connectivity technology that isn't dial-up Internet

Cable modem: A device that sits at the edge of a consumer's network and

connects it to the cable modem termination system

Cable modem termination system: Connects lots of different cable connections

to an ISP's core network

Channels: Individual, smaller sections of the overall frequency band used by a wireless network

Collision domain: A network segment where only one device can communicate at a time

Data payload section: Has all of the data of the protocols further up the stack of a frame

Dial-up: Uses POTS for data transfer, and gets its name because the connection is established by actually dialing a phone number

DSL: Digital subscriber line was able to send much more data across the wire than traditional dial-up technologies by operating at a frequency range that didn't interfere with normal phone calls

DSLAM: Digital Subscriber Line Access Multiplexers are devices that connect multiple DSL connections to a high-speed digital communications channel

Duration field: Specifies how long the total frame is

Frame check sequence: It is a 4-byte or 32-bit number that represents a checksum value for the entire frame

Frame control field: 16 bits long, it contains a number of sub-fields that are used to

describe how the frame itself should be processed

Frequency band: A certain section of the radio spectrum that's been agreed upon to be used for certain communications

FTTB: Fiber to the building, fiber to the business or even fiber to the basement, since this is generally where cables to buildings physically enter. FTTB is a setup where fiber technologies are used for data delivery to an individual building

FTTH: Fiber to the home. This is used in instances where fiber is actually run to each individual residents in a neighborhood or apartment building

FTTN: Fiber to the neighborhood. This means that fiber technologies are used to deliver data to a single physical cabinet that serves a certain amount of the population

FTTP: Fiber to the premises. FTTH and FTTB may both also be referred to as FTTP

FTTX: Stands for fiber to the X, where the X can be one of many things

HDSL: High Bit-rate Digital Subscriber Lines. These are DSL technologies that provision speeds above 1.544 megabits per second

MAC filtering: Access points are configured to only allow for connections from a specific set of MAC addresses belonging to devices you trust

Mesh networks: Like ad-hoc networks, lots of devices communicate with each other device, forming a mesh if you were to draw lines for all the links between all the nodes

Metered connection: An internet connection where all data transfer usage is tracked. Cell phone plans that have a limit on data usage per month or that charge based on usage are examples of metered connections

Non-metered connection: A connection where your data usage is not tracked or limited, instead you are charged a flat fee for unlimited and unrestricted usage. A Wi-Fi connection is an example of a non-metered connection 

Optical Network Terminator: Converts data from protocols the fiber network can

understand to those that are more traditional twisted pair copper networks can understand

Pairing: When a wireless peripheral connects to a mobile device, and the two devices exchange information, sometimes including a PIN or password, so that they can remember each other

Point-To-Point VPN: Establishes a VPN tunnel between two sites but VPN tunneling logic is handled by network devices at either side, so that users don't all have to establish their own connections

Receiving address: The MAC address of the access point that should receive the frame

Symmetric Digital Subscriber Line (SDSL): A device that establishes data connections across phone lines and has upload and download speeds that are the same

Sequence control field: A field that is 16 bits long and mainly contains a sequence number used to keep track of ordering the frames

Short-range wireless network: It is what mobile devices uses to connect to their peripherals

T-Carrier technologies: Technologies Invented to transmit multiple phone calls over a single link. Eventually, they also became common transmission systems to transfer data much faster than any dial-up connection could handle

Transmitter address: The MAC address of whatever has just transmitted the frame

Wi-Fi Protected Access (WPA): A security program that uses a 128-bit key to protect wireless computer networks, which makes it more difficult to crack than WEP

Wide area network: Acts like a single network but spans across multiple physical locations. WAN technologies usually require that you contract a link across the Internet with your ISP

Wired Equivalence Privacy (WEP): An encryption technology that provides a very low level of privacy. WEP should really only be seen as being as safe as sending unencrypted data over a wired connection

Wireless access point: A device that bridges the wireless and wired portions of a network

Wireless LANS (WLANS): One or more access points act as a bridge between a wireless and a wired network

Wireless networking: Networks you connect to through radios and antennas



Terms and their definitions from previous weeks
A

A record: The most common resource record, used to point a certain domain name at a certain IPv4 IP address

ACK flag: One of the TCP control flags. ACK is short for acknowledge. A value of one in this field means that the acknowledgment number field should be examined

Acknowledgement number: The number of the next expected segment in a TCP sequence

Address class system: A system which defines how the global IP address space is split up

Address Resolution Protocol (ARP): A protocol used to discover the hardware address of a node with a certain IP address

Anycast: A technique that's used to route traffic to different destinations depending on factors like location, congestion, or link health

Application layer payload: The entire contents of whatever data applications want to send to each other

Application layer: The layer that allows network applications to communicate in a way they understand

ARP table: A list of IP addresses and the MAC addresses associated with them

ASN: Autonomous System Number is a number assigned to an individual autonomous system

Automatic allocation: A range of IP addresses is set aside for assignment purposes

B

Bit: The smallest representation of data that a computer can understand

Border Gateway Protocol (BGP): A protocol by which routers share data with each other

Broadcast address: A special destination used by an Ethernet broadcast composed by all Fs

Broadcast: A type of Ethernet transmission, sent to every single device on a LAN

C

Cable categories: Groups of cables that are made with the same material. Most network cables used today can be split into two categories, copper and fiber

Cables: Insulated wires that connect different devices to each other allowing data to be transmitted over them

Caching and recursive name servers: They are generally provided by an ISP or your local network, and their purpose is to store domain name lookups for a certain amount of time

Carrier-Sense Multiple Access with Collision Detection (CSMA/CD): CSMA/CD is used to determine when the communications channels are clear and when the device is free to transmit data

Client: A device that receives data from a server

CLOSE_WAIT: A connection state that indicates that the connection has been closed at the TCP layer, but that the application that opened the socket hasn't released its hold on the socket yet

CLOSE: A connection state that indicates that the connection has been fully terminated, and that no further communication is possible

CNAME: A resource record used to map one domain to another

Collision domain: A network segment where only one device can communicate at a time

Computer networking: The full scope of how computers communicate with each other

Connection-oriented protocol: A data-transmission protocol that establishes a connection at the transport layer, and uses this to ensure that all data has been properly transmitted

Connectionless protocol: A data-transmission protocol that allows data to be exchanged without an established connection at the transport layer. The most common of these is known as UDP, or User Datagram Protocol

Copper cable categories: These categories have different physical characteristics like the number of twists in the pair of copper wires. These are defined as names like category (or cat) 5, 5e, or 6, and how quickly data can be sent across them and how resistant they are to outside interference are all related to the way the twisted pairs inside are arranged

Crosstalk: Crosstalk is when an electrical pulse on one wire is accidentally detected on another wire

Cyclical Redundancy Check (CRC): A mathematical transformation that uses polynomial division to create a number that represents a larger set of data. It is an important concept for data integrity and is used all over computing, not just network transmissions

D

Data offset field: The number of the next expected segment in a TCP packet/datagram

Data packet: An all-encompassing term that represents any single set of binary data being sent across a network link

Datalink layer: The layer in which the first protocols are introduced. This layer is responsible for defining a common way of interpreting signals, so network devices can communicate

Demarcate: To set the boundaries of something

Demarcation point: Where one network or system ends and another one begins

Demultiplexing: Taking traffic that's all aimed at the same node and delivering it to the proper receiving service

Destination MAC address: The hardware address of the intended recipient that immediately follows the start frame delimiter

Destination network: The column in a routing table that contains a row for each network that the router knows about

Destination port: The port of the service the TCP packet is intended for

DHCP discovery: The process by which a client configured to use DHCP attempts to get network configuration information

DHCP: A technology that assigns an IP address automatically to a new device. It is an application layer protocol that automates the configuration process of hosts on a network

DNS zones: A portion of space in the Domain Name System (DNS) that is controlled by an authoritative name server

Domain Name System (DNS): A global and highly distributed network service that resolves strings of letters, such as a website name, into an IP address

Domain name: A website name; the part of the URL following www.

Domain: Used to demarcate where control moves from a top-level domain name server to an authoritative name server

Dotted decimal notation: A format of using dots to separate numbers in a string, such as in an IP address

Duplex communication: A form of communication where information can flow in both directions across a cable

Dynamic allocation: A range of IP addresses is set aside for client devices and one of these IPs is issued to these devices when they request one

Dynamic IP address: An IP address assigned automatically to a new device through a technology known as Dynamic Host Configuration Protocol

E

ESTABLISHED: Status indicating that the TCP connection is in working order, and both sides are free to send each other data

Ethernet frame: A highly structured collection of information presented in a specific order

Ethernet: The protocol most widely used to send data across individual links

EtherType field: It follows the Source MAC Address in a dataframe. It's 16 bits long and used to describe the protocol of the contents of the frame

Exterior gateway: Protocols that are used for the exchange of information between independent autonomous systems

F

Fiber cable: Fiber optic cables contain individual optical fibers which are tiny tubes made of glass about the width of a human hair. Unlike copper, which uses electrical voltages, fiber cables use pulses of light to represent the ones and zeros of the underlying data

FIN_WAIT: A TCP socket state indicating that a FIN has been sent, but the corresponding ACK from the other end hasn't been received yet

FIN: One of the TCP control flags. FIN is short for finish. When this flag is set to one, it means the transmitting computer doesn't have any more data to send and the connection can be closed

Firewall: It is a device that blocks or allows traffic based on established rules

Five layer model: A model used to explain how network devices communicate. This model has five layers that stack on top of each other: Physical, Data Link, Network, Transport, and Application

Fixed allocation: Requires a manually specified list of MAC address and the corresponding IPs

Flag field: It is used to indicate if a datagram is allowed to be fragmented, or to indicate that the datagram has already been fragmented

Fragmentation offset field: It contains values used by the receiving end to take all the parts of a fragmented packet and put them back together in the correct order

Fragmentation: The process of taking a single IP datagram and splitting it up into several smaller datagrams

Frame check sequence: It is a 4-byte or 32-bit number that represents a checksum value for the entire frame

FTP: An older method used for transferring files from one computer to another, but you still see it in use today

Full duplex: The capacity of devices on either side of a networking link to communicate with each other at the exact same time

Fully qualified domain name: When you combine all the parts of a domain together

H

Half-duplex: It means that, while communication is possible in each direction, only one device can be communicating at a time

Handshake: A way for two devices to ensure that they're speaking the same protocol and will be able to understand each other

Header checksum field: A checksum of the contents of the entire IP datagram header

Header length field: A four bit field that declares how long the entire header is. It is almost always 20 bytes in length when dealing with IPv4

Hexadecimal: A way to represent numbers using a numerical base of 16

Hub: It is a physical layer device that broadcasts data to everything computer connected to it

I

IANA: The Internet Assigned Numbers Authority, is a non-profit organization that helps manage things like IP address allocation

Identification field: It is a 16-bit number that's used to group messages together

Instantiation: The actual implementation of something defined elsewhere

Interface: For a router, the port where a router connects to a network. A router gives and receives data through its interfaces. These are also used as part of the routing table

Interior gateway: Interior gateway protocols are used by routers to share information within a single autonomous system

Internet Protocol (IP): The most common protocol used in the network layer

Internet Service Provider (ISP): A company that provides a consumer an internet connection

Internetwork: A collection of networks connected together through routers - the most famous of these being the Internet

IP datagram: A highly structured series of fields that are strictly defined

IP masquerading: The NAT obscures the sender's IP address from the receiver

IP options field: An optional field and is used to set special characteristics for datagrams primarily used for testing purposes

L

Line coding: Modulation used for computer networks

Listen: It means that a TCP socket is ready and listening for incoming connections

Local Area Network (LAN): A single network in which multiple devices are connected

M

MAC(Media Access Control) address: A globally unique identifier attached to an individual network interface. It's a 48-bit number normally represented by six groupings of two hexadecimal numbers

Modulation: A way of varying the voltage of a constant electrical charge moving across a standard copper network cable

Multicast frame: If the least significant bit in the first octet of a destination address is set to one, it means you're dealing with a multicast frame. A multicast frame is similarly set to all devices on the local network signal, and it will be accepted or discarded by each device depending on criteria aside from their own hardware MAC address

Multiplexing: It means that nodes on the network have the ability to direct traffic toward many different receiving services

MX record: It stands for mail exchange and this resource record is used in order to deliver email to the correct server

N

Name resolution: This process of using DNS to turn a domain name into an IP address

Network Address Translation (NAT): A mitigation tool that lets organizations use one public IP address and many private IP addresses within the network

Network layer: It's the layer that allows different networks to communicate with each other through devices known as routers. It is responsible for getting data delivered across a collection of networks

Network port: The physical connector to be able to connect a device to the network. This may be attached directly to a device on a computer network, or could also be located on a wall or on a patch panel

Network switch: It is a level 2 or data link device that can connect to many devices so they can communicate. It can inspect the contents of the Ethernet protocol data being sent around the network, determine which system the data is intended for and then only send that data to that one system

Next hop: The IP address of the next router that should receive data intended for the destination networking question or this could just state the network is directly connected and that there aren't any additional hops needed. Defined as part of the routing table

Node: Any device connected to a network. On most networks, each node will typically act as a server or a client

Non-routable address space: They are ranges of IPs set aside for use by anyone that cannot be routed to

NS record: It indicates other name servers that may also be responsible for a particular zone

NTP servers: Used to keep all computers on a network synchronized in time

O

Octet: Any number that can be represented by 8 bits

Options field: It is sometimes used for more complicated flow control protocols

Organizationally Unique Identifier (OUI): The first three octets of a MAC address

OSI model: A model used to define how network devices communicate. This model has seven layers that stack on top of each other: Physical, Data Link, Network, Transport, Session, Presentation, and Application

P

Padding field: A series of zeros used to ensure the header is the correct total size

Patch panel: A device containing many physical network ports

Payload: The actual data being transported, which is everything that isn't a header

Physical layer: It represents the physical devices that interconnect computers

Pointer resource record: It resolves an IP to a name

Port forwarding: A technique where specific destination ports can be configured to always be delivered to specific nodes

Port preservation: A technique where the source port chosen by a client, is the same port used by the router

Port: It is a 16-bit number that's used to direct traffic to specific services running on a networked computer

Preamble: The first part of an Ethernet frame, it is 8 bytes or 64 bits long and can itself be split into two sections

Presentation layer: It is responsible for making sure that the unencapsulated application layer data is actually able to be understood by the application in question

Protocol field: A protocol field is an 8-bit field that contains data about what transport layer protocol is being used

Protocol: A defined set of standards that computers must follow in order to communicate properly is called a protocol

Proxy service: A server that acts on behalf of a client in order to access another service

PSH flag: One of the TCP control flags. PSH is short for push. This flag means that the transmitting device wants the receiving device to push currently- buffered data to the application on the receiving end as soon as possible

Q

Quad A (AAAA) record: It is very similar to an A record except that it returns in IPv6 address instead of an IPv4 address

R

Recursive name servers: Servers that perform full DNS resolution requests

Reverse lookup zone files: They let DNS resolvers ask for an IP, and get the FQDN associated with it returned

Reverse proxy: A service that might appear to be a single server to external clients, but actually represents many servers living behind it

Round robin: It is a concept that involves iterating over a list of items one by one in an orderly fashion

Router: A device that knows how to forward data between independent networks

Routing protocols: Special protocols the routers use to speak to each other in order to share what information they might have

RST flag: One of the TCP control flags. RST is short for reset. This flag means that one of the sides in a TCP connection hasn't been able to properly recover from a series of missing or malformed segments

S

Sequence number: A 32-bit number that's used to keep track of where in a sequence of TCP segments this one is expected to be

Server or Service: A program running on a computer waiting to be asked for data

Server: A device that provides data to another device that is requesting that data, also known as a client

Service type field: A eight bit field that can be used to specify details about quality of service or QoS technologies

Session layer: The network layer responsible for facilitating the communication between actual applications and the transport layer

Simplex communication: A form of data communication that only goes in one direction across a cable

Socket: The instantiation of an endpoint in a potential TCP connection

Source MAC address: The hardware address of the device that sent the ethernet frame or data packet. In the data packet it follows the destination MAC address

Source port: A high numbered port chosen from a special section of ports known as ephemeral ports

SRV record: A service record used to define the location of various specific services

Start Frame Delimiter (SFD): The last byte in the preamble, that signals to a receiving device that the preamble is over and that the actual frame contents will now follow

Start of authority: A declaration of the zone and the name of the name server that is authoritative for it

Static IP address: An IP address that must be manually configured on a node

Subnet mask: 32-bit numbers that are normally written as four octets of decimal numbers

Subnetting: The process of taking a large network and splitting it up into many individual smaller sub networks or subnets

SYN flag: One of the TCP flags. SYN stands for synchronize. This flag is used when first establishing a TCP connection and make sure the receiving end knows to examine the sequence number field

SYN_RECEIVED: A TCP socket state that means that a socket previously in a listener state, has received a synchronization request and sent a SYN_ACK back

SYN_SENT: A TCP socket state that means that a synchronization request has been sent, but the connection hasn't been established yet

T

TCP checksum: A mechanism that makes sure that no data is lost or corrupted during a transfer

TCP segment: A payload section of an IP datagram made up of a TCP header and a data section

TCP window: The range of sequence numbers that might be sent before an acknowledgement is required

Time-To-Live field (TTL): An 8-bit field that indicates how many router hops a datagram can traverse before it's thrown away

Time-To-Live field (TTL): An 8-bit field that indicates how many router hops a datagram can traverse before it's thrown away

Top Level Domain (TLD): The top level of the DNS or the last part of a domain name. For example, the “com” in www.weather.com

Total hops: The total number of devices data passes through to get from its source to its destination. Routers try to choose the shortest path, so fewest hops possible. The routing table is used to keep track of this

Total length field: A 16-bit field that indicates the total length of the IP datagram it's attached to

Transmission Control Protocol (TCP): The data transfer protocol most commonly used in the fourth layer. This protocol requires an established connection between the client and server

Transport layer: The network layer that sorts out which client and server programs are supposed to get the data

Twisted pair cable: The most common type of cabling used for connecting computing devices. It features pairs of copper wires that are twisted together

Two-factor authentication: A technique where more than just a username and password are required to authenticate. Usually, a short-lived numerical token is generated by the user through a specialized piece of hardware or software

TXT record: It stands for text and was originally intended to be used only for associating some descriptive text with a domain name for human consumption

Types of DNS servers: There are five primary types of DNS servers; caching name servers, recursive name servers, root name servers, TLD name servers, and authoritative name servers

U

Unicast transmission: A unicast transmission is always meant for just one receiving address

URG flag: One of the TCP control flags. URG is short for urgent. A value of one here indicates that the segment is considered urgent and that the urgent pointer field has more data about this

Urgent pointer field: A field used in conjunction with one of the TCP control flags to point out particular segments that might be more important than others

User Datagram Protocol (UDP): A transfer protocol that does not rely on connections. This protocol does not support the concept of an acknowledgement. With UDP, you just set a destination port and send the data packet

V

Virtual LAN (VLAN): It is a technique that lets you have multiple logical LANs operating on the same physical equipment

Virtual Private Network (VPN): A technology that allows for the extension of a private or local network, to a host that might not work on that same local network

VLAN header: A piece of data that indicates what the frame itself is. In a data packet it is followed by the EtherType

Zone Files: Simple configuration files that declare all resource records for a particular zone




Sequence number: A 32-bit number that's used to keep track of where in a sequence of TCP segments this one is expected to be

Server or Service: A program running on a computer waiting to be asked for data

Server: A device that provides data to another device that is requesting that data, also known as a client

Service type field: A eight bit field that can be used to specify details about quality of service or QoS technologies

Session layer: The network layer responsible for facilitating the communication between actual applications and the transport layer

Simplex communication: A form of data communication that only goes in one direction across a cable

Socket: The instantiation of an endpoint in a potential TCP connection

Source MAC address: The hardware address of the device that sent the ethernet frame or data packet. In the data packet it follows the destination MAC address

Source port: A high numbered port chosen from a special section of ports known as ephemeral ports

Start Frame Delimiter (SFD): The last byte in the preamble, that signals to a receiving device that the preamble is over and that the actual frame contents will now follow

Static IP address: An IP address that must be manually configured on a node

Subnet mask: 32-bit numbers that are normally written as four octets of decimal numbers

Subnetting: The process of taking a large network and splitting it up into many individual smaller sub networks or subnets

SYN flag: One of the TCP flags. SYN stands for synchronize. This flag is used when first establishing a TCP connection and make sure the receiving end knows to examine the sequence number field

SYN_RECEIVED: A TCP socket state that means that a socket previously in a listener state, has received a synchronization request and sent a SYN_ACK back

SYN_SENT: A TCP socket state that means that a synchronization request has been sent, but the connection hasn't been established yet

T

TCP checksum: A mechanism that makes sure that no data is lost or corrupted during a transfer

TCP segment: A payload section of an IP datagram made up of a TCP header and a data section

TCP window: The range of sequence numbers that might be sent before an acknowledgement is required

Time-To-Live field (TTL): An 8-bit field that indicates how many router hops a datagram can traverse before it's thrown away

Total hops: The total number of devices data passes through to get from its source to its destination. Routers try to choose the shortest path, so fewest hops possible. The routing table is used to keep track of this

Total length field: A 16-bit field that indicates the total length of the IP datagram it's attached to

Transmission Control Protocol (TCP): The data transfer protocol most commonly used in the fourth layer. This protocol requires an established connection between the client and server

Transport layer: The network layer that sorts out which client and server programs are supposed to get the data

Twisted pair cable: The most common type of cabling used for connecting computing devices. It features pairs of copper wires that are twisted together

U

Unicast transmission: A unicast transmission is always meant for just one receiving address

URG flag: One of the TCP control flags. URG is short for urgent. A value of one here indicates that the segment is considered urgent and that the urgent pointer field has more data about this

Urgent pointer field: A field used in conjunction with one of the TCP control flags to point out particular segments that might be more important than others

User Datagram Protocol (UDP): A transfer protocol that does not rely on connections. This protocol does not support the concept of an acknowledgement. With UDP, you just set a destination port and send the data packet

V

Virtual LAN (VLAN): It is a technique that lets you have multiple logical LANs operating on the same physical equipment

VLAN header: A piece of data that indicates what the frame itself is. In a data packet it is followed by the EtherType

Module 6 Glossary
New terms and their definitions: Course 3 Module 6
Centralized logging: Parsing logs in one central location 

Disk to disk cloning: A type of cloning that happens when you connect an external hard drive to the machine you want to clone

Event Viewer: A place where all events that have been logged are stored

Factory reset: Resetting a device to the settings it came with from the factory 

Logging: The act of creating log events 

Log rotation: A way for the OS to clean out log files to make room for new ones

Logs: Files that record system events on our computer

OTA update: A type of update that is installed by the mobile device itself

Re-flash: A way to preserve end-user data on a device that you plan on resetting

Remote connection: The ability to connect an authorized person to a computer or network remotely; allows us to manage multiple machines from anywhere in the world

Secure copy: A command you can use in Linux to copy files between computers on a network

Shared folders: A way to share files between computers on the same network on Windows

SSH (Secure shell): A protocol implemented by other programs to securely access one computer from another

SSH authentication key: A secure authentication method for accessing a computer from other devices

Unix epoch: It is the number of seconds since midnight on January first, 1970. It's a 'Zero Hour' for Unix based computers to anchor their concept of time

Variable: Files that constantly change

Virtual instance: A single virtual machine

VPN (Virtual private network): A secure method of connecting a device to a private network over the internet



Terms and their definitions from previous modules
A

Absolute path: It is one that starts from the main directory

ACI: Access Control Lists

Administrator: A user that has complete control over a machine

Alias: A nickname for common commands

Appending flags: A way to add the data of the file without erasing existing data

App Store apps: A Package Manager that acts as a repository

App store repository: A app store service that also acts as a repository

App stores: A central managed marketplace for app developers to publish and sell mobile apps

APPX: An APPX is another way to package contents of a file to act like a unit of distribution

Archive: An archive is comprised of one or more files that are compressed into a single file" for verb agreement

B

Background processes/Daemon processes: Processes that run or take place in the background

Bash: The language used to interact with the shell

Biometric data: A way of protecting your accounts and information using biometric data such as facial recognition and fingerprint

Block devices: A system that acts like USB drives and hard drive by transmitting data

C

Cache: The assigned stored location for recently or frequently accessed data; on a mobile app it is where anything that was changed or created with that app is stored 

Character devices: A way to transmit data character by character like a keyboard and mouse

Chocolatey: A third party package manager for Windows

CLI: Command line interpreter

Client/Server runtime subsystem: System that handles running Windows GUI and Command line

Closed source packages: A source code that does not allow public access

Command line: A text interface program for a computer that inputs text commands and translates them to the operating system

Command line mode: When you are able to run commands while still in your current shell

Computer management: A tool that lets you manage a local or remote computer

D

DACL: Directory Control Lists

Data: Actual content of a file

Data buffer: A region of RAM that’s used to temporarily store data while it’s being moved around

Defragmentation: A process of taking all the files stored on a given disk and reorganizing them into neighboring locations

Debian(.deb): A Debian package is packaged as a .deb file

Device manager: A console management system for your device

Disk Management utility: Native tool for Windows that helps with managing disk space

Driver: Used to help our hardware devices interact with our Operating System

Dynamic-link libraries: Programs that want to use functionality that the code provides can tap into it if they need to (shared libraries) 

E

Enterprise app management: A management system that allows an organization to distribute custom mobile apps

Environment: Whatever settings or variables a child process inherits from the parent’s process

Escape characters: A concept that means that the next character after the back tick should be treated literally

Executable file: A file containing instructions for a computer to execute when they’re run

.exe: A file extension found in Windows for an executable file

F

File permissions: A process for setting permissions for who has access to certain files

File record number: The index of the files entry in the MFT

File system: Used to keep track of files and file storage on a disk

Full control: A user or group with full control that can do anything they want to files

G

Groups: A collection of users

GUI: A graphical user interface

H

Hard link: When created in NTFS, an entry is added to the MFT that points to the linked file record number, not the name of the file. This means the file name of the target can change and the hard link will still point to it

Hardware ID: A special string of characters assigned to hardware

Having dependencies: A process of counting on other pieces of software to make an application work since one bit of code depends on another in order to work

Hidden files: A set of files that are not visible either to avoid alteration or simply because you don’t want someone to see them

Hot key: A keyboard shortcut that does a particular task

I

Inherit only: A permission group that means that a DACL will be inherited, but not applied to a container

Inode: A file structure for metadata and files

Installing from source: A process of installing from a source

Interactive mode: When the parted tool launches you into a separate program

I/O Streams: An input stream handles data flowing into and out of a program

K

Kernel module: It extends the kernel's functionality so developers don't have to actually touch the Linux kernel

L

Library: A way to package a bunch of useful code that someone else wrote

List folder contents: A command that will execute and list folder contents and is an alias for Read and Execute

M

Manifest: A library used if an application needs to use a shared library

Master boot record (MBR): a traditional partition table within a storage disk that lets you have volume sizes of 2 terabytes or less and is mostly used in the Windows OS

Master file table (MFT): A way NTFS stores and represents the files you’re working with on your operating system

Memory manager: A Windows OS program that helps manage virtual memory 

Metadata: Tells us everything we need to know about a file, including who created it, when it was last modified, who has access to it, and what type of file it is.

Microsoft Install Package(.msi) and MSI files: Microsoft Install Package is a file extension used to guide a program called Windows Installer in the installation, maintenance, and removal of programs of the windows operating systems. MSI files are a combination of of databases that contain installation instructions in different tables along with all the files

Mobile applications: Software that is distributed on mobile OS devices 

Mobile device management: A system used to apply and enforce rules about how the device has to be configured and used

Modify: An umbrella permission that includes read and execute and write

Mounting: Making a file or hard disk accessible to the computer

Multilingual user interface: Interface that offers and support different languages

P

Packaged archives: The core or source software files that are compressed into one file

Packaged managers: An application that makes package installation and removal easier

Parameter: A value that is associated with a command 

Parent directory & child directories: A parent directory is a directory that houses all subsequent child directories

Partition table: How the disk is partitioned on an OS

Paths: A main directory that branches off and holds other directories and files

Personal package archives: A software repository for uploading source packages to be built and published 

Portable Executable (PE) format: Windows unique version of .exe

Primary account: The initial account you made during setup

Processes: Help the computer run programs 

Process Explorer: A utility Microsoft created to let IT support specialists and system administrators look at running processes

Process ID: Unique identifier for processes on your computer

Process monitoring: A way of monitoring what processes are happening during installation

Programs: The applications that we can run

Prompt: A prompt shows you which directory you’re currently in

R

Read and execute permission: Permissions that grant you access to read the file that exists and execute it if its runnable

Read permission: Permissions that grant you access to read the file that exists

Regular expression: A pattern matching language that describes words, phrases, or more complicated patterns; regular expressions are used to help you do advanced pattern based selection

Relative path: It is a path from your current directory

Repository: A server that acts like a central storage location for packages

Resource monitoring: The most common way to quickly take a peek at how system resources are doing

Root directory: A parent directory for all other directories in a file system

Root user: It is the first user that gets automatically created when we install a Linux OS and has all the privileges on the OS. Also called the super user. There's technically only one superuser or root account, but anyone that's granted access to use their powers can be called a superuser too

S

SACL’s: System Access Control List

SD devices: Mass storage devices like hard drives

Security patch: A piece of software that is meant to fix up a security hole

Session manager subsystem: Process that is in charge of setting some stuff up to work for the OS

Shell: A shell is a command line interpreter for Linux

Shortcut: An entry in the MFT that has a reference to some destination, so that when you open it up, you get taken to that destination

Side-by-side assemblies: A system that manages most shared libraries and resources on Windows and supports access to multiple versions of the same shared library automatically

Side-loading: A process of installing mobile apps directly without using an app store

Signal: A way to tell a process that something has just happened

Simple permissions: Special or specific permissions

Single sign on (SSO): An account that grants you access to multiple accounts without require constant entry of a password or username

Softlinks: A shortcut in Linux, that allows us to link to another file using a file name

Standard error (stderr): A data stream that redirect the output of error messages in a different output stream. It works both in Linux and Windows

Standard In (stdin): A data stream in which the input that you provide through the keyboard goes to the standard in stream of the process that you're interacting with. It works both in Linux and Windows

Standard out (stdout): A data stream that when a process creates output, it adds data to the standard out stream, which flows out of the process. It works both in Linux and Windows

Standard user: A user who is given access to the machine but has restricted access to do thing like install software or change certain setting

Stdin, stdout, stderr: Three data streams created when you launch a Linux command

Subdirectories: A directory below or at a deeper level in the directory hierarchy

Suspended apps: A command that will tell the OS to suspend background mobile apps

Swap space: The allocated space where the virtual memory is stored on the hard drive when the amount of physical memory space is used up or full

Symbolic links: Work similarly to shortcuts, but at the file system level. The key difference is that the operating system treats them like substitutes for the file they're linked to in almost every meaningful way

Sysinternals package: A set of tools released by Microsoft that can help you troubleshoot

System properties: A control panel applet that allows you to edit the size and number and location of paging files

T

Tab completion: A way to auto-complete a command or file names and directories

Task Manager: A Windows utility that allows you to gain information about what tasks you have running in the background 

Termination signal: A kill command that will stop whatever process you tell it to

Trim: A command to delete unused data blocks so the space can be used for the computer’s storage needs

U

UEFI: A new standard for BIOS

UUID: Universally Unique ID

V

Virtual memory: A combination of hard drive space and RAM that acts like memory which our processes can use

Volume: A format for a filesystem on a partition

W

Wildcard: A character that is used to help select files based on a certain pattern

Windows domain: A network of computers and users that are added to a central database

Windows Search service: A service that indexes files on your computer by looking through them on a schedule

Windows store: A Windows store is an application repository or warehouse where you can download and instal universal Windows platform apps

Windows update client service: System that runs in the background on your computer to download and install updates and patches for your operating system

Write permission: A permission that allows you to make changes to a file

Module 3 Glossary
New terms and their definitions: Course 4 Module 3
Autoscaling: A system that allows the service to increase or reduce capacity as needed, while the service owner only pays for the cost of the machines that are in use at any given time

Databases: Databases allow us to store query, filter, and manage large amounts of data

File storage service: Allows to centrally store files and manage access between files and groups

HTTPS: Hypertext Transfer Protocol Secure is a secure version of HTTP that ensures the communication your web browser has with the website is secured through encryption.

HTTP status code: The codes or numbers that indicate some sort of error or info messages that occurred when trying to access a web resource

Hybrid cloud: Used to describe situations where companies might run things like their most sensitive proprietary technologies on a private cloud or on premise while entrusting their less sensitive servers to a public cloud

Load balancer: Ensures that each VM receives a balanced number of queries

Network file system: A protocol that enables files to be shared over a network

Platform services: A platform for developers to completely build and deploy software applications, without having to deal with OS maintenance, server hardware, networking or other services that are needed to use the platform tools

Private cloud: When a company owns the services and the rest of the cloud infrastructure, whether on-site or in a remote data center

Public cloud: The cloud services provided by a third party

Regions: A geographical location containing a number of data centers

Software services: The services that employees use that allow them to do their daily job functions, such as word processors, Internet browsers, email clients, chat clients, and more

Web server: A web server stores and serves content to clients through the Internet.



Terms and their definitions from previous modules
C

Cloud computing: The concept and technological approach of accessing data, using applications, storing files, etc. from anywhere in the world as long as you have an internet connection

D

Data center: A facility that stores hundreds, if not thousands of servers

Deployment: Hardware is set up so that the employee can do their job

Domain Name System (DNS): A global and highly distributed network service that resolves strings of letters, such as a website name, into an IP address

I

IT Infrastructure: The software, the hardware, network, and services required for an organization to operate in an enterprise IT environment

Intranet: An internal network inside a company, accessible if you are on a company’s network

K

KVM Switch: Keyboard, video, & mouse switch that looks like a hub that you can connect multiple computers to and control using one keyboard, mouse, and monitor

M

Maintenance: Where software is updated and hardware issues are fixed if, and when, they occur

N

NTP: Network Time Protocol, keeping clocks synchronized on machines connected to a network

P

Procurement: Hardware is purchased or reused for an employee

Production: The parts of the infrastructure where certain services are executed and serve to its users production

Proxy server: An intermediary between a company's network and the Internet, receiving network traffic and relaying that information to the company network

R

Reproduction case: Recreating an error to test a solution to make sure the problem is gone after a fix has been applied

Retirement: Hardware becomes unusable or no longer needed, and it needs to be properly removed from the fleet

Rollback: Reverting to the previous state before you made changes

S

Secondary or stand-by machine: A machine that is the same as a production machine, but won't receive any traffic from actual users until enabled

Server: Software or a machine that provides services to other software or machines

Server operating systems: Regularly operating systems that are optimized for server functionality

System Administration: The field in IT that is responsible for maintaining reliable computer systems, in a Multi-user environment

T

Test environment: A virtual machine running the same configuration as a production environment, but isn't actually serving any users of the service




Module 4 Glossary
New terms and their definitions: Course 4 Module 4
AAA (authentication, authorization, accounting): The services that the directory services provide to all the computers within a company or organization

Active directory (AD): The Microsoft alternative to directory services that offers customization and added features for the Windows platform 

Active directory users and computers (ADUC): The client tools that are used for accessing and administering a directory server

Advanced group policy management (AGPM): A set of add-on tools from Microsoft that gives some added provision control abilities in GPMC

Bind operation: The operation which authenticates clients to the directory server

Central management: A central service that provides instructions to all of the different parts of my IT infrastructure

Change management process: The process to notify others in the organization about the changes that you are about to make

Computer configuration: Contained within a Group Policy Object (GPO)

Configuration management: The creation of rules about how things should work in your organization, such as printers, configure software, or mounting network file systems

Default domain control policy: One of the two GPOs that are created when a new Active Directory domain has been made

Delegation: The administrative tasks that you need to perform a lot as a part of your day to day job but you don't need to have broad access to make changes in AD

Directory Access Protocol (DAP): A protocol that is included in the X.500 directory standard from 1988 

Directory Information Shadowing Protocol (DISP): A protocol that is included in the X.500 directory standard from 1988

Directory Operational Bindings Management Protocol (DOBMP): A protocol that is included in the X.500 directory standard from 1988

Directory server: The server that contains a lookup service that provides mapping between network resources and their network addresses

Directory services: A lookup service contained in a network server that provides mapping between network resources and their network addresses

Directory System Protocol (DSP): A protocol that is included in the X.500 directory standard from 1988

Distribution group: A group that is only designed to group accounts and contacts for email communication

DNS records: A DNS request for the SRV records matching the domain that it's been bound to

Domain admin: The administrators of the Active Directory domain

Domain computers: All the computers joined to the domain except domain controllers

Domain controllers (DC): The service that hosts copies of the Active Directory database

Domain local: The tool used used to assign permission to a resource

Domain users: A group that contains every user account in the domain

Enterprise admin: The administrators of the Active Directory domain that has permission to make changes to the domain that affect other domains in a multi-domain forest

Enterprise mobility management (EMM): A system that can create and distribute policies and MDMs

Fast logon optimization: The group policy engine that applies policy settings to a local machine may sacrifice the immediate application of some types of policies in order to make logon faster

Flexible single-master operations (FSMO): The single domain controller that has been tasked with making changes to the AD database that can only be made by one DC at a time

Forest: The hierarchy above a domain that contains multiple domains, allowing accounts to share resources between domains that are in the same forest

Functional levels: The different versions of Active Directory, a functional level that describes the features that it supports

Global: The tool that is used to group accounts into a role

Group policy management console (GPMC): The tools used for creating and viewing a group policy object

Group policy objects (GPO): The ways to manage the configuration of Windows machines, referring to the objects that represent things in your network that you want to be able to reference or manage

Group policy settings reference: A spreadsheet that details the GPO policies and preferences that are available and where to find them

Group scope: The way that group definitions are replicated across domains

Import: Moving a backup of the test example policy to the production example policy

Kerberos: A network authentication protocol that uses tickets to allow entities to prove their identity over potentially insecure channels to provide mutual authentication

LDAP data interchange format: The tool that allows you to authenticate, add, remove users, groups, computers and so on in a directory service

LDAP Entry: A collection of information that's used to describe something

LDIF files: A text file that lists attributes and values that describe something

Lightweight Directory Access Protocol (LDAP): An open industry-standard protocol for accessing and maintaining directory services; the most popular open-source alternative to the DAP

Linked: A GPO that all of the computers or users under a domain, site, or OU will have a policy applied

MDM policy: The profiles that contains settings for the device

MDM profile: The policies that contains settings for the device

One-way cryptographic hash: The method used by AD to store passwords 

OpenLDAP (lightweight directory access protocol): An open source and free directory service

Organizational units (OU): A hierarchical model of objects and containers that can contain objects or more organizational units

Parent group: Groups that are principal groups and contain other groups

PHPLDAPadmin: A tool to manage OpenLDAP

Policies: Settings that are reapplied every few minutes, and aren’t meant to be changed even by the local administrators

Precedence: When computers are processing the Group Policy Objects that apply to them, all of these policies will be applied in a specific order based on a set of precedents rules

Read-write replicas: Domain controllers in the Active Directory network that each have a complete copy of the AD database and are able to make changes to it

Remote wipe: A factory reset that you can trigger from your central MDM rather than having to do it in person on the device

Replication: the store directory data is copied and distributed across a number of physically distributed servers but still appears as one unified data store for querying and administering

Replication failure: A reason that a GPO might fail to apply as expected

Reset: When an SysAdmin restores or resets the password of a user

Restart: A command that will let the machine reboot to complete a domain join

Resultant set of policy (RSOP): The policy that forms when all of the group policies have been grouped together for a specific machine and apply precedence rules to them

Role-based access control (RBAC): The process of changing a persons group that they are a part of when they have changed roles within a company to limit or change their access to resources

RSOP report: The process of troubleshooting group policy and comparing what you expect to be applied to a computer and the resultant set of policy report

Security account manager (SAM): A database in windows that stores user names and password

Security filtering: A tool to make group policies apply more selectively

Security group: One of the two categories that groups in Active Directories can be part of, they can contain user accounts, computer accounts or other security groups

Security principal: Any entity that can be authenticated by the system, such as a user account, a computer account, or a thread or process that runs in the security context of a user or computer account

Service discovery: One of the services that the domain controller provides to the clients

Simple authentication and security layer (SASL): The authentication method that can employ the help of security protocols like TLS, it requires the client and the directory server to authenticate using some method

SRV records: A service record used to define the location of various specific services

Systems administrator (sysadmin): A person who works only in system administration, configuring servers, monitoring the network, provisioning, or setting up new users in computers and taking responsibility of systems

Universal: The tool that is used to group global roles in a forest

User configuration: Contained within a Group Policy Object (GPO)

User Groups: The management of resources on a computer and on a network through organizing user accounts into various groups

Windows management instrumentation (WMI): The container that is used to define powerful targeting rules for your GPO

Windows registry: A hierarchical database of settings that Windows, and Windows applications, use for storing configuration data

WMI filter: A tool to make group policies apply more selectively on the configuration of the computer

Work group computer: A Windows computer that isn't joined to a domain

X.500 directory: The agreed upon directory standard that wa approved in 1988 that includes, DAP, DSP, DISP, DOP, DAP, and LDAP



Terms and their definitions from previous modules
A

Autoscaling: A system that allows the service to increase or reduce capacity as needed, while the service owner only pays for the cost of the machines that are in use at any given time

C

Cloud computing: The concept and technological approach of accessing data, using applications, storing files, etc. from anywhere in the world as long as you have an internet connection

D

Databases: Databases allow us to store query, filter, and manage large amounts of data

Data center: A facility that stores hundreds, if not thousands of servers

Deployment: Hardware is set up so that the employee can do their job

Domain Name System (DNS): A global and highly distributed network service that resolves strings of letters, such as a website name, into an IP address

F

File storage service: Allows to centrally store files and manage access between files and groups

H

HTTPS: Hypertext Transfer Protocol Secure is a secure version of HTTP that ensures the communication your web browser has with the website is secured through encryption.

HTTP status code: The codes or numbers that indicate some sort of error or info messages that occurred when trying to access a web resource

Hybrid cloud: Used to describe situations where companies might run things like their most sensitive proprietary technologies on a private cloud or on premise while entrusting their less sensitive servers to a public cloud

I

IT Infrastructure: The software, the hardware, network, and services required for an organization to operate in an enterprise IT environment

Intranet: An internal network inside a company, accessible if you are on a company’s network

K

KVM Switch: Keyboard, video, & mouse switch that looks like a hub that you can connect multiple computers to and control using one keyboard, mouse, and monitor

L

Load balancer: Ensures that each VM receives a balanced number of queries

M

Maintenance: Where software is updated and hardware issues are fixed if, and when, they occur

N

NTP: Network Time Protocol, keeping clocks synchronized on machines connected to a network

Network file system: A protocol that enables files to be shared over a network

P

Platform services: A platform for developers to completely build and deploy software applications, without having to deal with OS maintenance, server hardware, networking or other services that are needed to use the platform tools

Private cloud: When a company owns the services and the rest of the cloud infrastructure, whether on-site or in a remote data center

Procurement: Hardware is purchased or reused for an employee

Production: The parts of the infrastructure where certain services are executed and serve to its users production

Proxy server: An intermediary between a company's network and the Internet, receiving network traffic and relaying that information to the company network

Public cloud: The cloud services provided by a third party

R

Regions: A geographical location containing a number of data centers

Reproduction case: Recreating an error to test a solution to make sure the problem is gone after a fix has been applied

Retirement: Hardware becomes unusable or no longer needed, and it needs to be properly removed from the fleet

Rollback: Reverting to the previous state before you made changes

S

Secondary or stand-by machine: A machine that is the same as a production machine, but won't receive any traffic from actual users until enabled

Server: Software or a machine that provides services to other software or machines

Server operating systems: Regularly operating systems that are optimized for server functionality

Software services: The services that employees use that allow them to do their daily job functions, such as word processors, Internet browsers, email clients, chat clients, and more

System Administration: The field in IT that is responsible for maintaining reliable computer systems, in a Multi-user environment

T

Test environment: A virtual machine running the same configuration as a production environment, but isn't actually serving any users of the service

W

Web server: A web server stores and serves content to clients through the Internet

