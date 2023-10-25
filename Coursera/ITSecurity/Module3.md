# Module 3

## Authentication

### Best Practices for Authentication

- Three A's of security
  - Authentication
  - Authorization
  - Accounting
- Identification, the idea of describing an entity uniquely
- "authn" (for authentication)
- "authz" (for authorization)
- there's often a tradeoff between security and usability
- Incorporating good password policies into an organization is key to ensuring that employees are securing their accounts with strong passwords
- Good password policy would check:
  - Length requirements
  - character complexity
  - dictionary words
- Don't share passwords duhh

### multi-factor Authentication

- Mulitfactor authentication, a system where users are authenticated by presenting multiple pieces of information or objects
  - something you know
  - something you have
  - something you are
- counter based token, use a secret seed value along with this secret counter value that's incremented every time a one time password is generated on the device, more secure than time based tokens

### Multifactor Authentication Options

- Biometric authentication, the process of using unique physiological characteristics of an individual to identify them

### Certificates, Part Two

- In order to issue client certificates, and organization must setup and maintain CA infrastructure to issue and sign certificates

### Kerberos

- Kerberos, a network authentication protocol that uses 'tickets' to allow entities to prove their identity over potentially insecure channels to provide mutual authentication
- The authentication tickets lets uses authenticate to services without requiring username and password authentication for every service individually
  ![kerberos Session](<securityScreenshots/Screenshot 2023-10-23 at 7.05.46 AM.png>)

### Single sign-on

- single sign-on (SSO), an authentication concept that allows users to authenticate once to ge granted access to a lot of different services and applications

## Authorization

- Authorization, pertains to describing what the user account has access to, or doesn't have access too

### Access Control

- OAuth, an open standard that allows users to grant third-party websites and applications access to their information without sharing account credentials
- is commonly used to grant access to 3rd party applications and APIs by large identity providers
- OAuth permissions can be used in phishing-style attacks to gain access to accounts, without requiring credentials to be compromised
- ![OAuth at Work ](<securityScreenshots/Screenshot 2023-10-23 at 7.16.50 AM.png>)

### Access Control List

- access control list (ACL), a way of defining permissions or authorizations for objects
- ACLs are heavily used in network security to routers switches and firewalls

### Tracking usage and access

- Accounting, keeping records of what resources and services your users accessed, or what they did when they were using your systems

- TACACS+ is a devices access AAA system that manages who has access to your network devices and what they do with them

## Network Hardening

### Network Hardening Best Practices

- network hardening, the process of securing a network by reducing its potential vulnerabilities through configuration changes and taking specific steps
- Implicit Deny, a network security concept where anything not explicitly permitted or allowed should be denied
- This can be done through ACL implementations
- Analyzing Logs, The practice of collecting logs from different network and sometimes client devices on your network, then performing an automated analysis on them
- Logs analysis systems, are configured using user-defined rules to match interesting or atypical log entries
- Normalizing lag data, is an important step, since logs from different devices and systems may not be formatted in a common way
- Correlation analysis, the process of taking log data from different systems and matching events across the systems
- Post fail analysis, since it's investigating how a compromise happened after the breach is detected

### Network Hardware Hardening

- If an attacker can manage to deploy a rouge DHCP server on your network, the could handout DHCP leases with whatever information they want
- DHCP snooping also makes you designate wither a trusted DHCP server IP, if it's operating as a DHCP helper, and a forwarding DHCP requests to the server, or you can enable DHCP snooping trust on the uplinked port, where legitimate DHCP responses would not come from
- ARP Response, gratuitous ARP response, since it's effectively answering a query that no one made
- Dynamic Arp Inspection (DAI) another enterprise option to prevent DHCP snooping
- EAP-TLS, an authentication type supported by EAP that uses TLS to provide mutual authentication of both the client and the authenticating server

### Supplemental Reading on IEEE 802.1X

IEEE 802.1X

When clients are trying to communicate on a local network, the devices must have a standard method of communication and authentication. The Institute of Electrical and Electronics Engineers (IEEE) created a standard called IEEE 802.1X. This standard specifies a common architecture, functional elements, and protocols that support authentication between the clients of ports attached to the same Local Area Network (LAN). This reading will cover what 802.1X is, basic components of authentication and how it works, and different kinds of authentication available for use under the standard.

IEEE 802.1X Protocol

IEEE 802 networks are deployed in locations that provide access to critical data, support mission critical applications, or charge for service. Port-based network access control regulates access to the network, guarding against attacks by unauthorized parties, network disruption, and data loss.

Authentication

The three main components in the authentication process are:

- Supplicant is the client making the request to access the LAN or wireless access point.

- Authenticator takes the packet from the supplicator and sends it to the authentication server until the session is authenticated. Any other information sent before authentication occurs is dropped.

- Authentication server provides a database of information required for authentication, and informs the authenticator to deny or permit access to the supplicant.

Authentication occurs when a client first connects to a network. The client sends a packet of information and the authenticator sends the packet to the authentication server. In some instances, the authenticator and authentication server may be integrated into a single point. The authentication server then verifies the identity or key against the information in its database. If the credentials are valid, the authentication succeeds. Then the server begins processing the connection request. If the credentials are not valid, the authentication fails. The authentication server sends an Access Reject message and the connection request is denied.

Authentication methods

When the request is sent to the authentication server there are a couple of methods for authentication. IEEE defines two different link-level authentication methods:

Shared key system is a shared key or passphrase that is manually set on both the mobile device and the AP/router.

Open system is when the authentication server has a list of authorized clients to check against when a client requests access. This list is usually in the form of MAC addresses but it varies by network

Shared Key authentication methods

There are several shared key authentication methods that are commonly used:

Wired Equivalent Privacy (WEP) is not recommended for a secure WLAN. The main security risk is hackers capturing the encrypted form of an authentication response frame, using widely available software applications, and using the information to crack WEP encryption.

Wi-Fi Protected Access (WPA) complies with the wireless security standard and strongly increases the level of data protection and access control (authentication) for a wireless network. WPA enforces IEEE 802.1X authentication and key-exchange and only works with dynamic encryption keys.

Wi-Fi Protected Access 2 (WPA2) is a security enhancement to WPA. Users must ensure the mobile device and AP/router are configured using the same WPA version and pre-shared key (PSK).

Association allows the access point or router to record each mobile device so that data is properly delivered. This occurs after authentication is complete.

These authentication methods are standardized under the IEEE 802.1X protocol.

Key takeaways

IEEE 802.1x is a protocol developed to let clients connect to port based networks using modern authentication methods.

There are three nodes in the authentication process: supplicant, authenticator, and authentication server.

The authentication server uses either a shared key system or open access system to control who is able to connect to the network.

Based on the criteria of the authentication server the supplicator will grant the authentication request and begin the connection process or it will be sent an Access Reject message and terminate the connection.

### Network Software Hardening

- includes:
  - firewalls
  - proxies
  - VPNs
- VPNs are commonly used to provide secure remote access, and link two networks securely
- ![Site to Site VPN](<securityScreenshots/Screenshot 2023-10-23 at 8.09.41 PM.png>)

<http://www.haproxy.org/#docs> http/TCP load balancer

<https://httpd.apache.org/docs/2.4/howto/reverse_proxy.html> Apache Reverse Proxy Guide

## Wireless Sucrity

### WEP Encryption and Why you Shouldn't Use it

- What do you think the best security option is for securing a WiFi network ?
- The first security for wireless networks was WEP, wired Equivalent Privacy, part of the original 802.11 standard
- WEP proved to be very bad at providing confidentiality or security for wireless networks, discounted in 204
- No one should be using WEP anymore
  ![WEP impl](<securityScreenshots/Screenshot 2023-10-23 at 8.21.47 PM.png>)

- WEP originally supported:

  - Open system authentication, open system mode did not require credentials passed in.
  - shared key authentication
    ![WEP Authentication](<securityScreenshots/Screenshot 2023-10-23 at 8.25.32 PM.png>)

- never send plaintext and cipher text together because eyedroppers would be able to decipher the message
- Open source tools demonstrate this in action like, Aircrack-ng, or AriSnort
- It is important to understanding WEP for the reason that you may see this in action in the real world and prioritize moving away from WEP

<https://link.springer.com/chapter/10.1007/3-540-45537-X_1> Weaknesses in the Key Scheduling Algorithm of RC4

### Let's get Rid of WEP!

- a replacement for WEP was WAP (wifi protected access)
- WPA, designed as a short-term replacement that would be able compatible with older WEP-enabled hardware with a simple firmware update
- TKIP implemented that was better than WEP, it implemented 3 new features:

  1. A more secure key derivation method was used to more securely incorporate the IV into the per packet encryption key
  2. A sequence counter was implemented to prevent replay attacks by rejecting out of order packets
  3. A 62-bit-MIC or Message Integrity CHeck was introduce to prevent forging, tampering, or corruption of packets
     ![TKIP Impl](<securityScreenshots/Screenshot 2023-10-23 at 8.35.57 PM.png>)

- Under WPA, the pre-shared key is the wifi password you share with people whey they come over and want to use your wireless network
- This password is used to derive the secret key and be able to send encrypted communication across the network
- WPS supports: 
  - PIN entry authentication 
  - NFC or USB 
  - Push-button authentication 

### WPA2 

- CCMP, Counter Mode CBC-MAC Protocol 
- ![4 Way Authentication Handshake ](<securityScreenshots/Screenshot 2023-10-24 at 4.34.23 AM.png>)
<https://www.kb.cert.org/vuls/id/723755> WPS PIN brute force vulnerability

### Wireless Hardening 

- The most ideal way of protecting wireless networks using 802.1X with EAP-TLS 
- If 802.1X is too complicated for a company, the next best alternative would be WPA2 with AES/CCMP mode 
- A long and complex passphrase that wouldn't be found in a dictionary would increase the amount of time and resources and attacker would need to break the passphrase 
- If your company values security over convenience, you should make sure that WPS isin't enabled on your APs

## Network Monitoring 

### Sniffing the Network 

- Packet Sniffing (packet capture), the process of intercepting network packets in their entirety for analysis 
- Promiscuous mode, a type of computer networking operational mode in which all network data packets can be access and viewed by all network adapters operating in this mode, admin or root privileges would be needed to put a router in this mode 
- Enterprise switches will have Port Mirroring, allows the switch to take all packets from a specified port, port range, or entire VLAN and mirror the packets to a specified switch port 
- Wireless networks can be put in Monitor Mode, allows us to scan across channels to see all wireless traffic being sent by APs and clients 

### Wireshark and tcpdump 

- Tcpdump, a super popular, lightweight, command-line based utility that you can use to capture and analyze packets 
- wireshark can decode encrypted payloads 
<https://danielmiessler.com/p/entering-promiscuous-mode-os-x/> Entering Promiscuous Mode on OSX
<https://lifeofageekadmin.com/how-to-manually-change-your-nic-to-promiscuous-mode-on-windows-72008-r2/> How to Manually change your NIC to Promiscuous Mode on windows 2008 R2

### Intrusion Detection/Prevention Systems 

- Intrusion detection and prevention systems (IDS/IPS) IDS or IPS systems operate by monitoring network traffic and analyzing it 
- will monitor network traffic and either inform or take action to prevent that 
- Network intrusion detection system (NIDS), the detection system would be deployed somewhere on a network where it can monitor traffic for a network segment or subnet 
- Signatures, unique characteristics of known malicious traffic, they might be specific sequences of packets or packets with certain values encoded in the specific header 
- 