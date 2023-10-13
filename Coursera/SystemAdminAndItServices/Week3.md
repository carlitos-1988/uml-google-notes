# Week 3

## Software Services

### Module Introduction

- Software Services, services that employees use that allow them to do their daily job functions
- Platform Services, provide a platform for developers to code, build and manage software applications

### Communication Services

- software services include a wide range of functions:
  - Communication services
  - Security Services
  - User Productivity Services
- XMPP open source communication protocol used for many applications today
- IRC internet channel relay - operates in a client server model was widely used in the 1990s to start group chats and any chats available online back then. Not as widely used today
- IRC is still available and free,
- Slack are used for communication inside an organization more so used to be able to send messages inside an org
- XMPP (extensible messaging application and social networking services )one of the most common communication protocols also used in IoT applications
- instant communication is good for team collaboration and team communication

<https://jabber.at/clients/?os=any> free IM communication tool
<https://zapier.com/blog/best-team-chat-app/> Paid chat applications for business

### Email Protocols

- email used for a wide range of communication
- In an enterprise setting the sysAdmin can be responsible for setting up this service for an organization
- to do this you need a domain name for the organization to be able to use.
- Two ways to set up email service for a company:

  - run own managed server, setup email service on a server, then create a DNS record for that server,
  - Remember that the A record is used for hostname, but for email servers, we use MX for the mail exchange record
  - email service setup is one of the most complicated services to set up for a sysadmin, you have to get the email to actually work and protect the email addresses from spam, filter out viruses
  - Another alternative is to use an email service provider, the service provider will allow you to create mailboxes and get the other stuff mentioned by paying a monthly fee

- Common email protocols:

  - POP3 - will download emails from a server to your local device it then deletes the email from the email server, meaning that you can only view the email from one device. Reasons to use, keeping email under a certain quota, privacy is another benefit meaning, security would be another reason why this would be important to you.
  - IMAP - Internet Message Protocol will allow you to download the mail from the mail server to many devices, it keeps the messages on the email server
  - SMTP - Simple Mail Transfer Protocol, the other protocols help with receiving email

- Email service is critical to keeping the business running

<https://www.digitalocean.com/community/tutorials/how-to-configure-a-mail-server-using-postfix-dovecot-mysql-and-spamassassin> setting up your own mail server, not recommended tho

<https://blog.servermania.com/what-protocols-send-receive-email-with-the-mail-server> Email protocols

### Additional Readings Spam Management/Mitigation

Spam Management and Mitigation
In this reading, you will learn about common spam mitigation strategies. Spam is defined as any unsolicited message or call that is sent to a large number of recipients. Spam is a prevalent security concern for organizations. Cybercriminals use spam to steal important information from victims. Excessive spam can slow down mail servers and even cause the servers to crash. IT Support professionals must know how to mitigate and manage spam problems.

Types of spam
There are several different types of spam. Some spam is mass marketing from legitimate businesses. Legitimate spam is simply a nuisance, especially when it is unsolicited. Other spam can be malicious and criminal.

Phishing emails attempt to trick recipients into providing personal information, credit card numbers, login credentials, etc. One famous phishing racket is the Nigerian royalty scam that asks victims to help a member of a royal family to move a large amount of money out of Nigeria. The story includes an excuse for why the royal person cannot do this for themselves and needs the victim’s assistance. The cybercriminal requests the victim’s bank account information for the purpose of wire-transferring the fictional royal money to the victim’s account. However, the cybercriminal drains all of the money from the victim’s bank account instead.

Phishing emails can also include clickbait links, which offer the victims something enticing, such as celebrity gossip, tabloid scandals, lottery winnings, etc. Cybercriminals even use spam to lure in victims by appealing to people’s vices. Once the recipient clicks on the emailed clickbait link, they become victim to a number of malicious attacks. The attacks can include exposure to malware, ransomware, viruses, keyloggers, trackers, information phishing, and more.

Text spam is another method used by cybercriminals to send phishing scams. Text message spam is normally less elaborate than email spam. The texts often contain a brief clickbait message followed by a link.

Email spoofing is a type of phishing where emails appear to be from reputable companies, like banks, well-known brand names, government agencies, charities, etc. The “From” address of spoofed emails is forged to look like it came from the reputable company. Additionally, spoofed emails often use stolen company logos, verbiage, and formatting to appear authentic. A couple of common email spoofing scams include:

Fake job opportunities - Cybercriminals send emails with fake job opportunities and ask victims to provide all of the personal information that is normally requested in a job application and background check. This data may include the victim’s social security number, government-issued ID info (e.g., driver’s license or passport), current and former addresses, current and former employers, etc. The goal of the cybercriminal is to obtain all of the information needed to steal the victim’s identity.

Fake credit card charges - Cybercriminals send emails that appear to be purchase receipts or alerts stating a business will be charging a large amount of money to the victim’s credit cards for items the victim never purchased. The goal is to get the victim to reply or call a fake customer service line listed in the email to dispute the charges. The cybercriminal, posing as a customer service representative, asks the victim for their personal and credit card information to look up the bogus charge and pretend to cancel the fake order. Then the cybercriminal will either use the stolen credit cards or sell the victim’s credit card information on the black market.

Tech support scams are used to trick people into creating a security weakness for cybercriminals to hijack their computers. The cybercriminals introduce themselves as technical support for Microsoft, Dell, or other well-known computer companies. They claim that the victim’s computer has been sending the company alerts about some type of fictional computer problem. The cybercriminal will direct the victims to change system settings or even set up remote sessions for the cybercriminals to change the settings themselves. The changed system settings open a door for the cybercriminals to hijack the computers to steal information, install ransomware or malware, or even to use the victims’ computers as a vehicle to commit other crimes.

Call spam or robocalls mimic telemarketing-type calls to collect personal information, bank or credit card numbers, and other criminally useful data from victims. Robocalls are also used to test databases of phone numbers to determine which are legitimate numbers. The phone numbers that are answered by a live human are sold to telemarketers as customer leads or on the black market to cybercriminals, who use the numbers as lists of potential victims.

One of the largest spam call scams was based out of India where 700+ employees in a call center in India were arrested or detained for impersonating the United States Internal Revenue Service (IRS). This criminal organization targeted Americans with phone calls claiming that the victim owed back taxes to the IRS and must pay hundreds or even thousands of dollars immediately to avoid arrest. The criminal organization stole up to $150,000 USD per day using this extortion scam.

Spam mitigation and management solutions:
Fortunately, many cloud platforms offer services and tools to help minimize these types of attacks. The following security measures are offered by platforms like Google Workspace. Google Workspace Administration Help guides are listed with each item below. These guides provide more information, as well as the instructions for implementing these security measures in Google Workspace.

DomainKeys Identified Mail (DKIM): Helps to protect victims against phishing, email spoofing, and other email spam by preventing sender address forgery. DKIM attaches a header that contains a cryptographic private key to each email sent. This key is used to verify the identity of the sender and to detect if the email message was manipulated while in transit across the internet. Receiving email servers will usually designate emails without legitimate DKIM keys as spam. For more information and instructions to implement DKIM in Google Workspace, please see the article:
Help prevent spoofing and spam with DKIM

Sender Policy Framework (SPF): Used to control which domains, email servers, and IP addresses can send emails for an organization. SPF is examined by the receiving email servers to verify that the domains, email servers, and IP addresses from incoming emails are from approved senders. For more information and instructions to implement SPF in Google Workspace, please see the article:
Help prevent spoofing and spam with SPF

Domain-based Message Authentication, Reporting, and Conformance (DMARC): Defines how the receiver should treat email messages depending on the results of DKIM and SPF checking. For more information and instructions to implement DMARC in Google Workspace, please see the article:
Help prevent spoofing and spam with DMARC

<https://www.fcc.gov/consumers/guides/stop-unwanted-robocalls-and-texts>stop robocalls and texts

<https://support.microsoft.com/en-us/office/10-tips-on-how-to-help-reduce-spam-55f756e8-688b-41c3-a086-8f68ccc592f6>10 tips on how to help reduce spam

<https://us.norton.com/blog/online-scams/how-to-stop-spam-texts> how to stop spam texts: A step by step guide

### User Productivity Services: Agreements and Licenses

- When using software in an organization there is an agreement that tells the organization on how to use that license
- Open Source software typically is free to use modify the software as you see fit
- Software as a consumer will state that a piece of software can only be used by that one person
- In enterprise settings you can buy licenses and allocate those licenses to people within the organization
- When considering software licenses it's important to review the terms and agreements
- With cloud software services more considerations are to be made

### Web Server Security Protocols

- super important to all organizations
- lots of security protocols put in place for all sorts of things
- Hyper Text Transfer Protocol Secure (HTTPS), the secure version of HTTP, which makes sure the communication your web browser has with the website is secure through encryption
- HTTP over SSL and HTTP over TLS is another name for it, this is because there are two protocols to secure HTTP
- The first is transport layer security protocol or TLS, this is the most common way for securing communication over a network
- Second protocol is Secure Socket Protocol is secure communication between a web server and client, it is deprecated so TLS is the more secure option
- to be able to use TLS you would need:
  - Get a certificate of trust from a certificate a certificate authority
  - the authority sends over a certificate request and states that you control that web server and you are who you say you are.

### What are file services?

- file services available in an organization
- File Storage Servers allow a file storage server to be able to distribute files it currently holds to other computers
- Can also use a Cloud storage Server provider as a service that will hold the files in it's own server

<https://www.cloudwards.net/comparison/> Cloud Storage Price Comparison 2023

### Network File Storage

- Remember FAT32 is a file system that is compatible with Windows, Linux, and MacOS.
- It does have it's own limitations on the amount of data you can store on a volume
- Network File System (NFS) a protocol that enable files to be shared over a network, protocol that enables files to be shared over a network, file system is compatible on all major file systems
- The easiest way to setup a NFS server is to install it on linux server software, then modify configuration files for the directories that you want to allow shared access to 
- NFS is a good solution to file sharing within the network 
- Samba or SMB is another good alternative for implementing network file sharing. SMB is a protocol that Samba used Samba itself is a software service suite. 

<https://learn.microsoft.com/en-us/previous-versions/windows/it-pro/windows-server-2012-R2-and-2012/hh831795(v=ws.11)?redirectedfrom=MSDN> Server Message Block Overview 

<https://www.linuxfromscratch.org/blfs/view/cvs/basicnet/nfs-utils.html> NFS Utils-2.5.2

### Mobile Synchronization 

- most google devices and apple products synchronize automatically. 

### Configuring Print Services 

- Printer server can allow multiple computers tied to commercial printers that also feed back data for the status of the printer 
- `cups` is used on linux for connecting printers 


### Print Services 

Print Services
IT professionals are often responsible for adding and updating printer drivers and settings. This may occur when a printer is added to a network, moved to a new location, or there is a software update. Along with updating drivers and settings on printers, IT may also be responsible for adding network printers to employee computers. Correct printer configuration saves time, supplies, and effort. This reading covers printing languages, basic printer configuration settings, printer sharing, printer security, and network scan services.

Printing languages
When choosing a print driver or troubleshooting issues with one, it is important to know which printing language the printer and computer operating system are using. Printing languages describe images on a screen to a printing device, so the printed output matches what is on screen. Printing languages are also called page description languages. Two of the most common printing languages are Printer Control Language and PostScript. 

Printing languages can be either device-dependent or device-independent. Device-dependent means both the printer and computer are responsible for creating parts of the printed data. Device-independent means that the computer is solely responsible for creating the printed data.  It is helpful for IT to know if the printing languages used are device-dependent or independent as it can help them troubleshoot whether printing errors are occurring because of the driver on the computer or the printer’s hardware

Printer Control Language (PCL)
Printer Control Language (PCL) is a printing language created by Hewlett-Packard that is used by many printer brands and computer operating systems. PCL is printing device-dependent because both the printer and computer are responsible for creating parts of the printed data. Because PCL is device-dependent, the output may not be the same on every printing device. 

PostScript (PS)
PostScript was created by Adobe and is a printing language used by many printer brands but most commonly used in Macintosh systems. Unlike PCL, PostScript does not use the printer to create data. PostScript is device-independent, and the output is the same on any printer. If an error arises when PostScript is used, then it is usually an error with the driver on the computer. 

Basic printer configuration settings
Configuration settings tell a printer how to complete a print job including the size, type of paper, number of sides, and use of color. IT professionals help employees change and select the correct settings for their document. The following are basic configuration settings that can be adjusted using printer settings. 

Orientation is the direction in which a document is printed. The main options for most printers are portrait (vertical) and landscape (horizontal).

Print Quality refers to the level of detail that both the paper and the print settings are set to. The higher the DPI (Dots Per Inch), the higher the resolution or quality of the print.

Tray settings tell the printer which tray of paper to use for the print job. Different trays can hold different paper sizes and types. Telling the printer to select paper from the correct tray ensures that the document is printed as it was designed.

Duplex allows for printing on both sides of the paper. Printers can print information on one side (simplex) or both sides of the paper. Many brochures, booklets, and packets are printed on both sides to save paper. 

For more information on how to update printer settings for high-quality printing see the article in the reference section below.  

Sharing a printer on a network
Printers can be shared on a network allowing multiple computers to access one printer across the network instead of having to be wired to the computer directly. IT professionals maintain and set up networks that include shared printers. For more information on sharing printers on your network read the article in the reference section below. 

Network scan services
Network scan services allow a printer with scanning capabilities to create a file of a scanned image and upload or send it to a location on the network or in the cloud, or attach the file to an email and send it. Employees often need IT support for ways to use this type of technology. The following network scan services can be used for fast file uploads or attachments. 

Email scan service allows a document to be scanned directly from the printer to email. 

Server Message Block (SMB) protocol allows a document to be a shared resource once scanned by the printer. 

Cloud services enable a document to be scanned from the printer and uploaded directly to the cloud. 

Printer security
Printer security protects access and tracks the activity of a print device. Printer security aims to ensure that only authorized users can use a printer. Setting up and monitoring proper security permissions falls under the job of an IT professional.  

Some basic measures for limiting access to printers and tracking print activity are:

User authentication commonly requires a user to enter a username and password before completing the print job. 

Badges are usually a physical card a user must scan at the printer to complete the print job. 

Secured prints require a user to enter a user-created code at the printer to complete the print job. 

Audit logs track users that have accessed the printer, including the date and time of use. 

Key takeaways
IT support professionals are often responsible for printer management. It is helpful to know about printing languages, printer configuration, networking, and security. 

Printer Control Language is device-dependent, while Postscript is device-independent.

Some basic printer configuration settings are orientation, print quality, tray settings, and duplex.

Having a printer on a network enables multiple users to share printers. 

Network scan services allow a printer with scanning capabilities to create a file of a scanned image and upload or send it to a location on the network, on the cloud, or email.

Printers have security and tracking features such as user authentication, badges, secured print, and audit logs.

## Platform Services 

### Web Servers Revisited 

- Platform services provide a platform for developers to completely build and deploy software applications, without having to deal with OS maintenance, server hardware, networking or other services that are needed to use the platform tools 
- today most businesses have an internet present the level of involvement depends on the business type 
- Web servers store and serve content to people who are trying to access these files over the internet 
- reminder http is how the internet transfers and format web pages 
- The most widely used HTTP server is the Apache server 
- Apache is free and open source 
- `sudo apt-get install apache2 -y` to get the apache server 
- once installed going to localhost 
- once there you can see that some files are ready to be served up, if you want to serve your own files then you would need to put them in there


### Load balances 

In this reading, you will learn about load balancers and their importance in cloud computing. You will become familiar with load balancing components and the benefits of utilizing load balancers.

IT Support professionals who manage cloud environments and/or physical servers in enterprise networks will likely need to configure, manage, or troubleshoot load balancers. Load balancers monitor and route network traffic flowing to and from a pool of physical or virtual servers. Load balancers can be hardware (e.g., load balancing routers) or software (e.g., Citrix ADC Virtual Platform). Load balancers distribute the traffic evenly, or by customized rules, across multiple servers. This function maximizes server performance and prevents the flow of traffic from overwhelming any one server and its resources. Basic server resources normally include CPUs, RAM, and network bandwidth. Servers can also offer other resources, like applications, file servers, database services, and more.

Load balancers can also detect when a server has failed and can reroute and balance network traffic across the remaining servers. This important business continuity and reliability function is often referred to as high availability. Additionally, load balancers provide IT Support professionals with the ability to add and remove servers to the pool as needed. 

Load balancing terminology
The following short glossary includes some common terminology for several concepts related to load balancers: 

`Client`: A computer or program that sends requests to a server. For example, a client could be a browser that requests a web page from a web server. It could also be a workstation requesting a file from a file server.

`Host/node`: A physical or virtual server that receives network traffic from an Application Delivery Controller (ADC). The server is identified by its IP address. Whether the server is called a “host” or a “node” depends on the terminology used by the vendor of the load balancing solution.

`Member`: A host/node that receives network traffic on a specified TCP port. The host/node is identified by its IP address plus the TCP port of the app that should receive network traffic. 

`Pool/cluster/farm`: A grouping of hosts/nodes or members that offer similar services, such as application or web services.

`Application Delivery Controllers (ADC)`: Physical appliances, virtual appliances, or software that provide load balancing services by managing traffic between clients and host/node or member pools. ADCs can also provide other important services such as security and encryption. 

`Path-based routing`: Routes network traffic based on URL paths.

`Listener`: A software process that checks network traffic for client requests and forwards them to target groups.

`Open Systems Interconnection (OSI) model`: Model that depicts the seven layers of computer data communications: 7-application, 6-presentation, 5-session, 4-transport, 3-network, 2-data, and 1-physical.

`Front end`: In load balancing environments, the front end can include the ADC system and any virtual servers that act as proxies for client communications with the ADC system and the back end servers.

`Back end`: In load balancing environments, the back end normally includes the pool/cluster/farm systems. The back end can also include disk storage systems. 

`Distributed applications`: Software stored on cloud platforms or physical servers that can run on multiple networked computers at the same time. 

`Containerization`: Isolated runtime environments that can deploy and run distributed applications through application virtualization. This method is faster and is more scalable than older load balancing solutions.

`Availability Zones (AZs)`: Regional data centers that host cloud platforms and are configured for high availability.

`Elastic Load Balancer (ELB)`: Enables the use of more than one Availability Zone. 

`SSL/TLS`: Network protocols for encrypted communication.

![Load Balancing Transaction](<screenshotsSysAdmin/Screenshot 2023-10-12 at 10.10.24 AM.png>)

The following steps are an example of one possible load balancing configuration using an ADC solution:

[Blue arrows] The client sends a connection and an information request to the ADC service.

[Blue arrows] The ADC listener detects and accepts the connection. Then the ADC load balancing service analyzes the best host (or member) routing path for the client request. The ADC changes the destination IP to the address (and possibly the TCP port) of the selected host (or member).

[Green arrows] The host or member approves the client connection and routes a response to the client through the ADC.

[Orange arrows] The ADC changes the source IP (and TCP port, if applicable) to a virtual server IP (and port) before forwarding the response to the client. The clients will continue to use the IP address of the virtual server for further communications.

Load balancing types
Application Load Balancer: Operates at the application layer (HTTP and HTTPS) of the OSI model. Application load balancers also scan traffic for HTTP errors and coding bugs, as well as guard applications against distributed denial-of-service (DDoS) attacks. 

Network Load Balancer: Operates at the transport layer (TCP/UDP) of the OSI model. Network load balancers can route millions of client requests per second and handle volatile workloads. Network load balancers also support static IP addressing and containerization, among other services. 

Classic Load Balancer: Can operate at either the application layer (HTTP/HTTPS) or the transport layer (TCP/SSL). Classic load balancers use fixed ports for communication.

Gateway Load Balancers: Operates at the network layer (IP) of the OSI model. Gateway load balancers have listeners on all ports that scan every IP packet in the network traffic and route each request to the target pools, as defined by the listener configuration. A gateway load balancer is the only point of entry and exit for network traffic.

Load balancers in cloud environments
In cloud environments, load balancing across virtual servers is configured through the cloud platform. A few of the load balancing options offered by several top cloud platforms include:

Google Cloud: Google offers an array of options for load balancers, such as application and network level load balancing, software-defined load balancing, multi-region failover, and seamless autoscaling. Google Cloud also offers external, internal, global, and regional load balancing. For security measures, the load balancers are integrated with Google Cloud Armor, which protects against distributed denial-of-service (DDoS) attacks.  

Amazon Web Services (AWS): AWS offers three ELB solutions: an Application Load Balancer, a Gateway Load Balancer, and a Network Load Balancer. AWS ELBs provide security through user authentication, certificate management, and SSL/TLS decryption. 

Microsoft Azure: Operates at the transport layer of the OSI model. Azure load balancer is the only front end point for accepting client requests to route to the back end server pools. The backend pool may consist of Azure Virtual Machines (VMs) or instances running in 
Azure virtual machine scale sets
. Azure offers public load balancers for internet traffic and private/internal load balancers for private virtual networks. Azure’s Standard load balancer uses the zero trust security model. 

Load balancers in physical environments
In physical environments, such as server rooms and data centers, load balancing can be configured across multiple servers with operating systems like VMware. Network traffic loads can also be configured for smaller environments across two servers in a physical active-active cluster. In active-active clusters, both servers actively handle network traffic simultaneously.


### What is a database server?

- Customer information like news articles videos large amounts of text image or audio  files get stored in a database 
- Databases, allow us to store, query, filter, and manage large amounts of data 
- when web products are built the data for that website will likely be stored in a database 
- administrating and managing a database can be complex, losing any customer data can be incredibly complex and people in IT can only be responsible for a database 

<https://www.bls.gov/ooh/computer-and-information-technology/database-administrators.htm> Database Administrator and Architect Jobs

<https://www.digitalocean.com/community/tutorials/sqlite-vs-mysql-vs-postgresql-a-comparison-of-relational-database-management-systems> Database Types 

## Troubleshooting Platform Services

### Is a website down? 

- web servers and servers in general are prone to break at some point like any other machine 
- HTTP status codes are codes or numbers that indicate some sort of error or info massages that occurred when trying to access a web resource 
- to view the actual http response go to chrome developer tools then go to network tab, 
- 500 status codes indicate an issue on the server side 
- tell us more than just error 200 codes indicate successful status coded 

All HTTP response status codes are separated into five classes or categories. The first digit of the status code defines the class of response, while the last two digits do not have any classifying or categorization role. There are five classes defined by the standard:

1xx informational response – the request was received, continuing process
2xx successful – the request was successfully received, understood, and accepted
3xx redirection – further action needs to be taken in order to complete the request
4xx client error – the request contains bad syntax or cannot be fulfilled
5xx server error – the server failed to fulfil an apparently valid request

## Managing Cloud Resources

### Cloud Concepts 

- Software as a Service (SaaS), The software is already pre-configured and the user isin't deeply involved in the cloud configuration
- The cloud provider will manage most everything for you including where the VMS are hosted 
- Infrastructure as a Service (IaaS), You're hosting your own services in the cloud you need to decide how you want the infrastructure to look, depending on what you want to run on it. 
- Tip: start small and get more powerful services as needed 
- Regions: a geographical location containing a number of data centers 
- If one of them fails for some reason, the others are still available and services can be migrated without visibility affecting users 
- Users may experience more latency if the services are further away form their users 
- Public cloud services provided to you by a third party 
- Private cloud when your company owns the services and the rest of your infrastructure- whether on-site or in a remote data center
- Hybrid cloud a mixture of both public and private clouds 
- some workloads are run on your hardware and others are ran on the cloud  

### Typical Cloud Infrastructure Setups 

- Load balancer, Ensures that each VM receives a balanced number of queries 
- Autoscaling, it allows the service to increase or reduce capacity as needed, while the service owner only pays for the cost of the machines that are in use at any given time 
- when a machine is no longer in use that machine and all of its data will be deleted, consider this machine as ephemeral or short lived 
- if the data is needed after the machine is destroyed then need for storage services might be needed 
- Usually VMs running web servers will be connected to database servers in order to maintain data persistence 
- To make sure that the servicer is running smoothly you can setup monitoring and alerting 


### Common Cloud Models 

The cloud is a part of everyday life in the modern internet world. It gives users a place to work, access, and store data from any system plugged into the cloud. Being able to work with the cloud is a vital skill in IT. This reading will cover common cloud services and four types of cloud computing.

Types of cloud services
Companies use cloud services to provide access to internal tools, develop software, store data, and more. The three primary cloud services are Software as a service, Platform as a service, and Infrastructure as a service. The Google Cloud Platform is a prime example of a system that employs all three types of cloud services.

![Types of Cloud Services](<screenshotsSysAdmin/Screenshot 2023-10-13 at 10.34.44 AM.png>)

Software as a Service (SaaS) 
SaaS providers allow users to use their software with an internet browser or application instead of having to download software to a specific device. Users access information from any device through a login. The SaaS vendor stores all user data and files online instead of on the user’s physical equipment. SaaS typically uses a subscription model for its services. Hacking is a concern when using this service since the full-service run in the cloud. 

Platform as a Service (PaaS) 
PaaS offers computer hardware and software in the cloud that allows users to develop and deploy applications or cloud based services. PaaS makes buying, developing, configuring, managing, and installing software and hardware unnecessary. 

Infrastructure as a Service (IaaS)
IaaS provides an IT infrastructure to a company over the internet and on-demand. IaaS provide access to things like virtual machines, containers, networks, and storage. This service reduces the need to purchase expensive hardware. IaaS allows companies to centralize infrastructure for faster disaster recovery.

Additional cloud services 
The following cloud services are more narrow in focus and are designed to solve unique problems

VPN as a Service (VPNaaS)
VPNaaS secure networks through a cloud-based connection between the employee and the organization’s network. Using this approach eliminates the need for a physical VPN endpoint. 

Function as a Service (FaaS)
FaaS is an event-based service that lets developers do the building, running, and managing functions directly in the cloud without needing to maintain a server. Event-based systems use an event, such as a website click, to trigger communication within a system.

Data as a Service (DaaS)
DaaS provides data access as a service to a business. It manages the data companies generate and uses APIs to deliver data from various sources on demand. DaaS allows companies to organize and access the data they need. DaaS monetize by providing access to data. By increasing accessibility to data, DaaS can lower the cost of data-driven decision making, remove personal bias in data collection, and innovation. 

Blockchain as a Service (BaaS)
BaaS is a newer and increasingly mainstream cloud model that uses a non-centralized system. This model uses encrypted, connected blocks of information for higher security than standard cloud services. BaaS is used to store smart contracts and high-security documents. This model authenticates users without needing additional applications. SaaS services may adapt BaaS as a standard feature to address the risk of hacking. 

Four types of cloud computing
Cloud computing is the delivery of computing services like the cloud services mentioned above. There are four main types of cloud computing:

Public clouds: cloud environments created from IT infrastructure owned by a provider such as Google Cloud or Amazon Web Services. Public clouds host the data of multiple companies. Be aware that public clouds do not provide absolute security for the information it stores. 

Private clouds: serve a single business or organization. The cloud runs behind an internal firewall. Private clouds can be deployed and managed by a third-party vendor. 

Multiclouds: involve using more than one cloud service from more than one vendor. These can be private or public. 

Hybrid clouds: blend at least two public or private cloud services and connects them with internal networks, such as local area networks or VPNs.  

Cloud services and cloud computing work together to meet the needs of companies and organizations. 

Key Takeaways
Companies use the cloud for many tasks and services. 

The three primary cloud services are SaaS, PaaS, and IaaS. 

Additional cloud services include VPNaaS, FaaS, DaaS, and BaaS.

Four main types of cloud computing are public clouds, private clouds, multiclouds, and hybrid clouds that deliver cloud services.

### When and how to choose cloud 

- Using cloud infrastructure does not require a large upfront investment, good choice if you do not know how long you need the service, trying something out 

- choosing cloud is also key for when you have intermittent amount of demand throughout the year

- Another reason to use the cloud if the users are all over the world and you are located in one geographical area 
- how to decide on which cloud provider to use:
  - most cloud providers offer free trials, so it's a good idea to test that out to see if they meet your needs, and to check how well your company's infrastructure integrates with the cloud provider's 
  - services change every year, make sure you stay up to date to what has changed so that you can see if they have something you could use


### Managing Cloud Resources Reding 

If you are considering hosting some services in the Cloud, you’ll need to learn what the different terms used to configure the services mean.

When deploying a service to the cloud, you will typically create a number of virtual machines that will be the servers in charge of hosting your service. In the usual case, you would start by creating a single machine that will run the service, creating the configuration associated with the machine, verifying that it works, and then turning this into a template that can be used for the creation of many machines as needed.

In order to do this, you’ll make use of both Autoscaling and Load Balancing.  Autoscaling means being able to automatically create new instances when the load increases and automatically turn them down when the load decreases.  In order for this to be possible, you need to ensure that your instances can be completely configured automatically, and that there’s no data being kept in the instances themselves (data can be stored in a database, or in separate drives).

Load Balancing means distributing the load among many servers.  There’s different approaches to doing load balancing, but the main concept is that there’s a load balancing service that will route traffic to the servers in a way that they each get to serve a portion of users, without the users realizing that they are connecting to different machines.  In other words, the users will access a single address (e.g. 
http://www.example.com
), which can be served by different servers, in different parts of the world, without the users having to care about that.

Once you have your service set up to scale automatically and balance the load, you’ll want to also setup Monitoring and Alerting for it.  Monitoring means checking that the service is healthy, that it’s responding to queries as expected and not generating unusual errors.  Alerting means sending alerts when things don’t happen as expected.

For a simple service, you might go with the monitoring that is already built in by the cloud provider, which will allow you to check that your instance is healthy, but is likely not going to go into much detail as to whether the content is being served correctly.  If your service is more complex, you might want to invest more time into making it possible to monitor additional parameters of your service.

Depending on the specific service you are deploying, there might be more concepts that you need to understand before you can actually do it.  We recommend reading the documentation offered by the cloud provider you have chosen to figure out what you need to do.

Here are some links with more information from some of the biggest cloud providers:
