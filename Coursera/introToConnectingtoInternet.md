# Introduction to Connecting to the internet

## Week 5

### POTS and Dial-up

- A dial up connection uses POTS (Plain Old Telephone Service) for data transfer, and gets its name because the connection established by actually dialing a phone number.
- ![Modem Usage](../images/Screenshot%202023-05-31%20at%2010.42.01%20AM.png)
- Baud rate: A measurement of how many bits can be passed across a phone line in a second

### Broadband Connections

What is Broadband

- Broadband: any connectivity technology that isin't dial up internet
- They are long lasting connections that do not need to be established with each use
- T-Carrier Technologies: originally invented by AT&T in order to transmit multiple phone calls over a single link
- Without the advancements of broadband the internet as we know it today would not exist

#### T-Carrier Technologies

- Originally T1 was developed to connect telecom from one company to another
- T1 lines are capable of sending data at 1.544 megabits per second
- a T3 line is 28 T1s all multiplexed

#### Digital Subscriber Lines

- In short DSL for use of faster data transfer rates than traditional wires present at the time
- DSL allowed phone calls and internet connections to happen at the same time since different frequencies where being used
- ADSL: Asymmetric digital subscriber line (slow upload fast download)
- SDSL: Symmetric digital subscriber line (fast upload and download)
- HDSL: High bit-rate digital subscriber lines (speeds above 1.544 megabits per second)

#### Cable Broadband

- Cable broadband is typically known as a shared broadband technology
- Cable modem: The device that sits at the edge of a consumer's network and connects it to the cable modem termination system, or CMTS

- Optical Network Terminator: Converts data protocols the fiber network can understand to those that more traditional, twisted-pair copper networks can understand

Wide area networks (WAN): Acts like a single network but spans across multiple physical locations

Frequency Band: A certain section of the radio spectrum that's been agreed upon to be used for certain communications
In North America< FM radio transmissions operate between 88 and 108 Mgz

- 802.11 = Physical and data link layers
- ![Data Frame](../images/Screenshot%202023-06-03%20at%2012.49.14%20PM.png)

1. Frame control field: Is 16 bits long and contains a number of subfields that are used to describe how the frame itself should be processed
2. Duration field: It specifies how long the total frame is, sot the receiver knows how long it should expect to have to listen to this transmission
3. Wireless Access Point: A device that bridges the wireless and wired portions of a network
4. ![4 Address Fields](../images/Screenshot%202023-06-03%20at%2012.49.14%20PM.png)
5. Receiver Address: The MAC address of the access point that should receive the frame
6. Transmitter Address: The MAC address of whatever jas just transmitted the frame
7. Sequence Control Field: Is 16 bits long and mainly contains a sequence number used to keep track of the ordering of frames
8. Data Payload: Has all of the data of the protocols further up the stack
9. Frame Check Sequence Field: Contains a checksum used for a cyclical redundancy check, just like how ethernet does it

### Wi-Fi 6

Wi-Fi 6 technology improves functionality and connectivity.

Channel sharing for better efficiency and shortens the time it takes to send data once a user gives the send command.

Target Wake Time (TWT) improves the network speed and increases battery life by allowing battery-powered devices to sleep when not in use.

Multi-user MIMO (Multiple Input, Multiple Output) wireless technology allows more data to be transferred simultaneously. This ability increases capacity and efficiency in high bandwidth applications like voice calls or video streaming.

160 MHz channel utilization gives more space for transmitting data and increases bandwidth capability.

1024 Quadrature amplitude modulation combines two signals into a single channel, so more data is encoded.

Orthogonal Frequency Division Multiple Access (OFDMA) allows for bandwidth splitting, which is assigned dynamically by the access point to separate devices.

Transmit beamforming is a technique that sends signals that allow for more efficient higher data rates by targeting each connected device.

Key takeaways

Wi-Fi technology will continue to change as the needs of companies and users change. Wi-Fi 6 improves the quality of networks with faster speeds and energy-saving technology.

Wi-Fi 6 uses technologies like channel sharing, Target Wake Time, Multi-user MIMO, channel utilization, amplitude modulation, OFDMA, and transmit beamforming to increase the quality of a Wi-Fi network.

Wi-Fi 6E is an additional certification of Wi-Fi 6 that has even faster speeds and stronger performance.

### IoT Data Transfer Protocols

2 Common data protocol models to illustrate how low-power devices share data

- Request/Response Model: Often used in distributed systems where the communication flow between servers and clients consists of requests and responses for data. Examples include HTTP and CoAP(decribed in the "IoT data protocols as the application layer" section below)
- Publish/Subscribe Model: A framework for message exchanges between publishers(hosts) and subscribers (clients) that are routed through a broker. Subscribers can sign up to a channel to receive notices through the broker when the publisher releases new messages. Examples: MQTT and AMQP (described in the "IoT data protocols at the application layer" section below)

Most IoT devices can use atleast one of the following data transfer protocols

- `HTTP/HTTPS`: are the most widely used information transfer protocols used on the web. hen a website address is entered into a browser, HTTP/HTTPS sends a request to the site’s web server, which then returns an HTTP/HTTPS formatted response to the browser. The protocols use ports 80 or 8080 and data security is provided on the HTTPS version of the protocol. HTTP is supported by Google Cloud IoT Core for device-to-cloud communication.
- `Machine-to-Machine (M2M Communication Protocols): A set of direct communication methods for low-power devices, machines, and systems. There are three primary architectural and protocol groups in M2M electronic communications:

  - `Representational State Transfer (REST)`: An architectural style for communication amongst web accessible systems
  - `Service Oriented Architectures` : An architecture for data exchanges in industrial automation systems
  - `Message Oriented Protocols` : A protocol for asynchronous data transfers for distributed systems

  `Message Queue Telemetry Transport (MQTT)`: An IoT data-centric interaction protocol for M2M that uses a simple publish-subscribe model. MQTT supports Quality of Service (QoS), uses TCP for sending information, and utilizes Secure Sockets Layer (SSL) and Transport Layer Security (TLS) for security. MQTT using binary format and 2-byte header sizes for efficient messaging. MQTT is supported by Google Cloud IoT Core for device to cloud communication.

`Constrained Application Protocol (CoAP)`: A web transfer protocol for IoT constrained nodes and networks designed for M2M applications. CoAP is used for IoT applications like building automation and smart energy management. CoAP is very similar to HTTP: both are based on the REST model and both place resources on a server that is accessible to clients via a URL.

`Advanced Message Queuing Protocol (AMQP)`: An open standard for messaging amongst applications in different organizations and/or platforms. Its purpose is to remove vendor lock-in for app communication. In addition to interoperability, AMQP also offers reliability and security.

`Extensible Messaging and Presence Protocol (XMPP)`: A decentralized, open standard for chat, messaging, video and voice calls, collaboration tools, and more. Built upon Japper, XMPP offers a proven communication technology that is extensible, flexible, and diverse.

`Data Distribution Service (DDS)`: An API standard and middleware protocol from the Object Management Group. Middleware exists in the OSI applications layer, between software and the operating system. DDS uses the publish-subscribe communications model. DDS is also data-centric, provides low-latency data connectivity, and helps the devices in an IoT ecosystem share data more efficiently. DDS is reliable, scalable, and provides control of QoS parameters, including bandwidth and resource limits.

### Wireless Network Configurations

- Ad-hoc networks: in an ad-hoc network, there isin't really any supporting network infrastructure. Every device on the network communicated with any other device. All nodes help pass along messages
- Wireless LANS or WLANS![Mixed Network](../images/Screenshot%202023-06-03%20at%205.25.26%20PM.png)
- Mesh networks

### Wireless Channels

Channels: Individual: smaller sections of the overall frequency band used by a wireless network
Collision domain: Any one network segment where one computer can interrupt another

- since switches addressed the issue with collision domains with wired networks the issue with wireless networks still exists and the used of channels helps with the collision domains.
- The reason why understanding channel hopping is important is because when troubleshooting 802.11 one will be able to troubleshoot connectivity issues or slowdowns in the network

### Wireless security

- Because wireless data could be captured from the air the need to secure this is created security features that could be used for wireless security
- Wired Equivalent Privacy (WEP): An encryption technology that provides a ver low level of privacy, protects data but not that wll 40 bits for encryption key
- With modern computers 40 bits s not a large number to have for encryption
- Wifi Protected Access (WPA): by default has a 128 bit key making it more secure than WAP
- WPA 2 is the updated version of WAP that used 256 bit key
- MAC Filtering: You configure your access points to only allow for connections from a specific set of MAC addresses belonging to devices you trust, this does not protect the data over the air but it does protect from devices to accessing the network that are not authorized to do so

### Protocols & Encryption

WPA3 is built upon the WPA2 protocol and is intended to replace WPA2. The WPA3 protocol introduces new features and methods to repair the security weaknesses of WPA2.

Benefits include:

- Simplified wireless security
- Stronger Authentication
- Powerful Encryption
- Stable business continuity
- Enchanced security methods
- Replacement for legacy protocols
- Protected Management Frames (PMF) requirement for enterprise networks

WPA3 Enterprise Improvements
Galois/Counter Mode Protocol (GCMP-256): The Advanced Encryption Standard (AES) with GCMP-256-bit encryption replaces the WPA2 128-bit AES-Counter Mode Protocol (CCMP) Cipher Block Chaining Message Authentication Code (CBC-MAC). GCMP for data integrity. The GCMP-256-bit encryption strength takes significantly more computing power for cybercriminals to crack than 128-bit encryption. The average person would not have access to that level of computing power. GCMP-256-bit encryption provides a stronger security protocol and makes it harder for cybercriminals to perform Meddler-in-the-Middle attacks.

Opportunistic Wireless Encryption (OWE): OWE improves upon the WPA2 wireless encryption standard of 802.1x Open Authentication and Extensible Authentication Protocol (EAP). In WPA2, EAP required additional support to help it encrypt and authenticate login credentials. In the WPA3 protocol, OWE replaces EAP with a solution that encrypts and authenticates all wireless traffic. It also replaces Wi-Fi passwords by assigning a unique key to each device that has permission to access the network. This technology repairs a weakness Wi-Fi users experience in open networks, which are often found in restaurants, coffee shops, hotels, airports, malls, and more.

Wi-Fi Device Provisioning Protocol (DPP): DPP improves upon the WPA2 Wi-Fi Protected Setup (WPS) encryption technology between wireless devices and routers. WPA3’s DPP uses QR codes or NFC tags to grant passwordless Wi-Fi access to wireless devices.

384-bit Hashed Message Authentication Mode (HMAC) with Secure Hash Algorithm (SHA): HMAC creates hash code from a secret key. This hash code is sent with each message passed between a Wi-Fi access point and a user’s device. The hash code from the origin of the message is compared to the hash code from the receiver of the message to determine if the hash codes match. A discrepancy between the two hashes would indicate that the message was compromised or corrupted during transmission.

Elliptic Curve Diffie-Hellman Exchange (ECDHE) and Elliptic Curve Digital Signature Algorithm (ECDSA): In WPA3, key management and authentication use the ECDHE protocol and ECDSA encryption for faster performance. The protocol is supported by most browsers. This key management technology replaces the WPA2 4-way handshake.

Key takeaways
As the tech industry develops more powerful computers, cybercriminals will use them to crack older encryption standards. The need to create more complex encryption algorithms will always be present in order to stay ahead of the evolving tools used by cybercriminals.

For WPA3-Personal, some of the new features include:

Natural password selection

Increased ease of use

Forward secrecy

Simultaneous Authentication of Equals (SAE)

For WPA3-Enterprise, some of the new features include:

Galois/Counter Mode Protocol (GCMP-256)

Opportunistic Wireless Encryption (OWE)

Wi-Fi Device Provisioning Protocol (DPP)

384-bit Hashed Message Authentication Mode (HMAC) with Secure Hash Algorithm (SHA)

Elliptic Curve Diffie-Hellman Exchange (ECDHE) and Elliptic Curve Digital Signature Algorithm (ECDSA)
