# Week 2

## Intro to IT Infrastructure Services

### What are IT Infrastructure Services ?

- Common IT infrastructure services focused on the physical and network infrastructure services

### The Role of IT Infrastructure Services in SysAdmin

### Types of IT Infrastructure Services

- types of physical services:
  - workstation
  - laptop
  - printer
  - scanner
- types of software services:
  - software
- Network services
  - cloud
  - wireless
  - server
  - switch
  - router
- Directory services

  - directory

- IaaS (infrastructure as a service) they manage pre-configured virtual machines. One example of this would be amazon ec2 instances, linode, windows Azure, google compute
- NaaS (Networking as a Service) allows companies to use other networking service providers to use their networks
- companies will have to set up their own network security , manage own routing , WAN, and private intranet.
- SaaS (Software as a Service) getting configured software from a provider such as Microsoft Office 365, Google G Suite.
- Platform as a Service (PaaS) this will allow you to get an entire platform for developing and deploying applications examples of this are Heroku, Windows Azure, Google App Engine.
- Types of directory services
  - Windows Active Directory
  - OpenLDAP

Resources

- Iaas<https://cloud.google.com/learn/what-is-iaas>
- NaaS<https://en.wikipedia.org/wiki/Network_as_a_service>
- SaaS<https://www.businessinsider.com/the-most-popular-cloud-apps-used-at-work-2015-8>
- PaaS <https://www.techradar.com/web-hosting/best-bare-metal-hosting>

## Physical Infrastructure Services

### Server Operating Systems

- In an organization services such as applications are best suited if installed on servers for everyone to use
- Server operating systems, regular operating systems that are optimized for server functionality
- server OS are typically more secure and come pre-configured with some of the necessary applications to begin working

servers 101<https://phoenixnap.com/kb/server-operating-system>

### Virtualization

- There are two ways to run services
  - Dedicated hardware
  - virtualized instance

pros and cons to each service type:

- performance is better on hardware running locally than a virtual instance
- price for one service in a local hardware running instance is that it is more costly than running it in a vm.
- it is cheaper to run multiple services on one machine that it is to run one service on one machine
- Maintenance on locally ran machines is much more expensive and time consuming than running it on virtual machines
- point of failure, with virtual machines the ability to move to another machine is much more easier than running a service on a local machine, this can be mitigated with the use of backup servers

### Remote Access Revisited

- Another important part of managing services is the ability to be able to manage servers/services from anywhere in the world

for smaller organizations

- the most popular remote access tool is `openssh`
- in order to be able to ssh in to another machine you would need to install an open ssh client on that machine
- `surdo apt-apt-get install openssh-client` to download and install ssh client this will be a me here to you there relationship
- on the server to be able to accept ssh connections do `sudo apt-get install openssh-server` this will install the ssh client on the server
- `ssh <nameOfUser@<IpAddressOfServer` example `ssh devan@100.113.96.31`
- Once this happens you should be able to ssh to a new machine and be able to manage that machine like if you where in it creating files, directories, and modifying the system as needed.
- key takeaway is that you can use these tools require some sort initial set up but are great to use when managing services in an organization

### Remote Connections additional

Remote connections
Previously, you learned about the fundamentals of remote access. In this reading, you will learn about various methods and tools for connecting remotely. You will also learn about some of the security risks related to using remote connections.

Remote connections can be used by IT Support professionals to troubleshoot remote systems. Remote systems may include laptops, PCs, workstations, servers, data center machines, and other IT equipment that supports remote access. Additionally, remote connections can be used for file transfers and terminal emulations. IT Support professionals often use remote access software to save time by eliminating the need to travel to the computer system’s location.

Remote access software can also be used for remote and flexible work arrangements, which have been increasing in popularity in recent years. Numerous organizations have developed remote, hybrid, and flexible work opportunities to give employees the option to work from home. Through these arrangements, employers and employees have discovered the benefits of remote work. Employees save time and money by avoiding the commute to work. Employees also report an improvement in their work-life balance. Employers can save on the costs of maintaining physical offices. Employers can opt to expand their hiring pool far beyond their physical locations by hiring talent in other cities, regions, states, or even countries.

Multiple surveys have revealed that up to 95% of employers and employees in the United States would like to keep remote, hybrid, and/or flexible work options permanently. Recently, Microsoft reported that 66% of employers around the world are adapting their workplaces to support hybrid work models (see the Resources section at the bottom of this reading for more information). Given this workplace transformation, organizations are likely to ask IT Support professionals to design, configure, manage, and/or troubleshoot remote connections for business networks.

Remote access software for IT management
Unlike RDP and VPN, there are some types of remote access software that are typically used only by IT management and other computer support professionals. These remote applications help IT Support teams manage and monitor large networks more efficiently.

Secure Shell or Secure Socket Shell (SSH): SSH is a network protocol and suite of tools that can be used to establish a secure connection between a computer and a private network over the internet. SSH is included with Linux/Unix and Mac Server operating systems. SSH provides identity and access management protocols through robust password authentication and public key authentication. SSH also encrypts data transmissions over the internet. Sessions are established by using an SSH client application to connect to an SSH server. For security, SSH keys are used to provide single sign-on (SSO) services and to automate access to servers for running scripts, backups, and configuration tools. SSH is primarily used by IT Support professionals to remotely manage file transfers and terminal emulators on Linux/Unix systems. For example, IT Support staff can use the SSH network protocol tool to establish an encrypted tunnel from their computer to a remote server over a network. The SSH file transfer tool can then be used to transfer a file, like a firmware update package, to the remote server. Finally, the SSH terminal emulator can be used to issue command lines to install the firmware onto the remote server.

Remote Monitoring and Management (RMM): RMM is used by IT Support professionals to remotely monitor and manage information systems. Implementing RMM involves installing an RMM agent on each endpoint within a network, including servers, workstations, and mobile devices. The agents then send periodic status reports about the health of each endpoint to IT Support staff. RMM tools also help IT Support professionals proactively maintain the network by facilitating the remote installation of security patches and updates. If a problem occurs on an endpoint, the RMM agent will create a ticket, classify the problem type and severity, and then forward the ticket to IT Support staff. RMM systems enable IT Support providers to improve efficiency in information systems management. IT Support providers can manage and even automate routine maintenance for multiple endpoints simultaneously through a unified RMM dashboard.

Remote access software
End user remote connections to business networks can be established using remote access software. IT professional can also use this software to manage business networks remotely. There are multiple options available for remote access software, each with their own benefits and disadvantages. The following list provides a few options for various uses, workforce sizes, and network environments:

Remote Desktop Protocol (RDP): RDP is a remote protocol developed by Microsoft. It is compatible with most Windows and Mac operating systems. An RDP solution may work well for flexible or hybrid work environments where employees split their work schedule between being physically in the office and working remotely. With RDP, end users can remotely access the physical computers housed at their offices, in addition to the desktop, software, files, and network access available to those systems. IT Support professionals can also use RDP software to troubleshoot, repair, patch and update end user computers without needing to be in the same room as the PCs.

RDP works by encrypting and transmitting the user’s desktop, data, keystrokes, and mouse movements over the internet. Users may notice delayed responses to their keystrokes and mouse activity during the transmission process. RDP creates a dedicated network channel and uses network port 3389 to transmit this information using the TCP/IP protocol standard. Unfortunately, using a single dedicated port creates a security weakness that cybercriminals can target for on-path attacks. Further, RDP does not enforce strong sign-in credentials, which leaves RDP systems vulnerable to stolen credential and brute force attacks.

Virtual Private Network (VPN): VPNs are often described as private tunnels through the public internet. Organizations can use VPNs to create encrypted connections over the internet between remote computers or mobile devices and the organizations’ networks. VPNs can be implemented as software running on networked servers or on network routers with VPN features enabled. When the employees remotely connect to their VPN, they are able to access their organization’s network as though they were physically in the office, eliminating the need to travel to the office in person. VPNs work well for small to medium sized organizations, but may not be adequate for large enterprises. Additionally, VPNs might not be the right solution for organizations that need to provide restricted levels of network access to groups like contractors or vendors.

Third party tools
Integrated video conferencing, screen sharing, and desktop management apps: Video conferencing apps like Google Meet, Zoom, Microsoft Teams, Skype, etc. are growing in popularity as remote work tools. Video conferencing allows two or more people to meet “face-to-face” in a virtual environment. Some video conferencing apps also offer screen sharing tools, remote desktop control, polling tools, text messaging, meeting transcripts, webinar management options, the ability to record meetings, and more. The growing popularity of these tools for remote work has also invited an increase in related security attacks. Fortunately, the major providers of video conferencing software continuously update and patch their applications in response to these attacks.

File sharing and transfer platforms: Cloud storage platforms, like Google Drive, Microsoft OneDrive, and Dropbox, have largely replaced file transfer protocol (FTP) tools. File sharing through a cloud platform provides the benefits of asynchronous file transfers, file transfer and data encryption, customizable security and authentication settings, and the ability to file share with multiple users simultaneously. File owners can share individual files, folders, or entire drives. However, cloud storage might not be an appropriate option for organizations affected by certain privacy laws, regulations, or other security concerns. These organizations can still use FTP applications based on SSH or HTTPS protocols for secure file transfers over the internet.

<https://en.wikipedia.org/wiki/OpenSSH> OpenSSH
<https://learn.microsoft.com/en-us/windows-server/remote/remote-desktop-services/clients/remote-desktop-clients> remote desktop clients
<https://en.wikipedia.org/wiki/PuTTY> Putty

## Network Services

### FTP, SFTP, and TFTP

- network services
- file transfer service:
  - FTP legacy way to transfer files from one computer to another, does not handle data encryption
  - FTP service works much like SSH service, clients who want to use an FTP server they have to install a client and FTP server
  - FTP is primarily used to serve up web content
  - while using a website host provider there might be an FTP connection already available for use. this is because the server can copy files to and from the website.
  - SFTP is another option that allows encryption which makes it more secure, data is sent through ssh and it is encrypted
  - TFTP no authentication and no encryption, files stored here should be generic and should not have to be secured, popular use of TFTP is to host installation files
    ![FTP SFTP TFTP Differences](<screenshotsSysAdmin/Screenshot 2023-10-05 at 9.33.51 PM.png>)

<https://en.wikipedia.org/wiki/Preboot_Execution_Environment> Pre-boot Execution Environment

### NTP

- Network time protocol (NTP), it's used to keep clocks synchronized on machines connected to a network
- NTP would allow for machines to be able sych the clocks across an organization
- Public NTP servers, there are organizations that allow for the use of NTP servers and you don't have to set up the server itself

### Network Support Services Revisited

- Intranet an internal network inside a company accessible if your on a company's network
- Intranets provide a great way for organizations to be able to share information locally sort of like company website that only employees can use
- Proxy Server, acts as an intermediary between a company's network and the internet
- They relay network traffic and relay that to the company network, they can be configured to monitor and track network access and allow for blocking of websites

### DNS

- Domain Name System(DNS) maps human-understandable names to IP addresses
- if not set up correctly no one would be able to set up resources based on the name passed in

### DNS for Web Servers

- to setup a web server you will need to do the following steps

  - buy a domain name e.g settingupDnsisfunc.example.com
  - weigh all options for committing to an infrastructure service either cloud hosting or local hosting
  - for local hosting:
    - grab the DNS settings, typically come from a domain registrar
    - give IP address of where content is stored
    - if a domain registrar is not chosen to host web files you would then need to set up an authoritative DNS Server for the web-server
      ![Architecture](<screenshotsSysAdmin/Screenshot 2023-10-08 at 3.01.46 PM.png>)

### DNS for Internal Networks

- Reminder that we host files in networking allow us to map IP addresses to host names manually. in linux host file is called etc/hosts

### DHCP

- DCHP dynamic host configuration protocol
- the two options to granting access to computers can either be done by granting a static IP address or DHCP
- with a static address maintenance of that IP address needs to be done in order to keep track of what IP address a machine is given and if it needs to be modified in any way
- for DHCP the DHCPOFFER within a DCHP server will give temporary IP addresses to machines that want to be able to connect to the internet, if you need more IP addresses you would only have to deal with the DHCP server and not the individual machines
- Once DCHP is able to lease out IP addresses the DNS server will update it's IP address mapping the two work together to be able to understand what is being leased out and what is acceptable to use the resources to be directed to resources

## Troubleshooting Network Services

### Unable to Resolve a Hostname or Domain Name

- check network connection is actually working
  - `ping www.google.com `
- DNS, to verify the right address is being returned use NS lookup
  - `nslookup www.google.com`
  - verify that the lookup goes to an actual named server
  - copy the ip address result to a webpage and see if it goes to the right place
- Check the current host file for configuration
  - `sudo vim /etc/hosts`
  - in this file you will see where the IP address for a webpage links to

## Managing System Services

### What do Services Look Like in Action

- DCHP, NTP, DNS run as background processes in other words daemons, this means that the program doesn't neeed to interact with a user through the graphical interface or the command line interface to provide the necessary service
- Services are usually configured to start when the machine boots, so that if there's a power outage or a similar event that causes the machine to reboot, you wont need a system administrator to manually start the service

### Managing Services in Linux

- NTP allows networked machines to synchronize their clocks
- `service ntp status` will show you if the service is running and the condition it is in.
- The daemon managing the time will not interfere to correct time if the time slippage is over 120 milliseconds because it assumes something else is wrong with the system. Anything under 120 milliseconds the NTP server will correct the time slowly
- `sudo service ntp stop` `sudo service ntp start` by starting and stopping the service on start the time might be able to be corrected to the most current time
- `sudo ntp restart` to restart the service instead of stopping and starting the service

### Managing Services in Windows

- Windows update service, responsible for checking what updates are available not only for the OS but also the applications that are running on a machine
- `Get-Service wuauserv` in powershell will launch the windows update service
- `Get-Service wuauserv | Format-List *` this will list how the service is formatted to run and additional information
- For this the wuauserv was only an application this can be used for any service running on a computer
- To stop a service and checking on it
  - Open powershell as administrator
  - `Stop-Service wuause ` will stop the service
  - `Get-Service wuause` this will tell you the status of the service and for this will show as stopped
  - `Start-Service wuauserv` will begin the service again
  - `Get-Service wuauserv` will show that the status of the service is now back to running
  - `Get-Service ` will list all of the services running on the local machine
- All this can also be done using the services management console
  - all services will be shown and also show what is running and also stopped

### Configuring Services in Linux

- for this example the vsftp server will be played with
- `sudo apt install vsftp`
- once vsftp is installed the service for it begins automatically, this is the case for most applications on linux
- `service vsftp status ` this will list the service itself, where it is loaded, if it is active, the main PID (process ID), and CGroup
- LFTP an ftp client program that allows us to connect to an ftp server
- `lsftp localhost` to start with vstp
- `ls ` to list contents of the current directory, just like if it was your local machine, but not providing username and password this command would not work
- `/etc/vsft.conf` going to this location so that you can edit the configuration file so that it does something different in this case allow for anonymous connections
- `sudo vim /etc/vsftp.conf` open vonfig file in Vim, change anonymous enable from no to yes, save it with `wq`
- Once the change to the configuration file is made you will need to restart that service because the service uses the config at startup and keeps it in memory
- `Reload`, The service re-reads the configuration without having to stop and start
- This way ongoing connections will not have to restart but new connections will be able to use the configuration from the new file changes
- `sudo service vsftp reload` to be able to reload the service
- now the vsftp service will be able to run with the changes to the configuration file

### Configuring Services in Windows

- So far in the last linux module we have:
  - Start a service
  - Stop a service
  - Restart a service
  - Modify configuration files of a service
  - Reload a service
- for Windows the internet Information Services will be used, it is used to serve up web pages
- in control panel go to turn features on and off
- This will open the server manager click next 3x, look for Web Server (IIS) -> add features next x4, select install
- a new IIS service show on the left pane of the Service Manager
- Right click on the new IIS service and select Internet Information Services Manager
- expand on the server, click on sites, this will list the website handled by this server, one default site will appear.
- go to where you have your host files and copy them over to `C:\inetpub` after this paste the files here, Once pasted go back to IIS Manager go to sites on the left pane right click, select add website, fill in the blanks and select the host files from the inetpud directory
- Once you have added the site you can go to localhost and whatever port you added for that site 

### reminder Commands 

`sudo` <command>: executes a command with administrator rights
`ls` <directory>: lists the files in a directory
`mv` <old_name> <new_name>: moves or renames a file from the old name to the new name
`tail` <file>: shows the last lines of a file
`cat` <file>: prints the whole contents of a file
`grep` <pattern> <file>: filters the text of a file according to the pattern
`less` <file>: lets you browse a file

Additionally, you can combine these commands using the | sign. For example:
`sudo cat /var/log/syslog | grep error | tail`
 
## Configuring Network Services 

### Configuring DNS with Dnsmasq

- In large enterprise deployments there are different programs running different services covered in this module, smaller organizations will likely use one server for most of the services covered in this module 
- DNSMASQ, a program that provides DNS, DHCP, TFTP and PXE services in a simple package 
- `sudo apt install dnsmasq` once installed it runs and it is enabled with minimum configurations 
- `dig` allows you to query dns servers and answers 
- `dig www.example.com @localhost` the part after the @ sign will let you know what DNS server you would like to use, it will give you also give you the IP address of the DNS server 
- `sudo service dnsmask stop`
- `sudo dnsmaq -d -q` by passing d and q it will run the command in debug mode and log the queries 
- in another console run `dig www.example.com @localhost` this will output tot the other terminal 

### Configuring DHCP with DnsMasq

- DNSMasq can be used for other networking services
- A DNS server can be setup on a machine that has a static IP address configured to the network interface to serve the DHCP queries 
- In real life the DHCP server and the DHCP client usually run on two different machines 
- `ip address show eth srv`  will show that the interface has the static IP address the /24 the /24 will show that the available addresses are from .0 to .255
- this will also have an IPV6 address configured but will not be used 
- `ip address show eth_cli` this will show that it does not have an IPV4 address configured which can later be adjusted 
- `cat dhcp.config` will show the items in the configuration file 
- in the file the interface=eth srv will tell the DHCP to listen on the eth interface 
- the bind-interface tells us not to listen on any other interfaces for any kind of queries 
- domain=example will tell you the domain name 
- 2 dhcp=option will let others know what to configure as a DHCP gateway 
- dhcp-range = will tell you the range of IP addresses the DHCP server can hand out 
- there will be a time at the end for this example that tells you how many hours can a DHCP lease an IP address for 
- `sudo dnsmasq -d -q -c dhcp.config` to let the dhcp server to use the configuration file 
- On a second terminal `sudo dhcpclient -i eth_cli -v` this will list all of the information that is going to the client mainly to focus on what Ip address was sent to it and the lease renewal time 
- `ip address show etch_cl` will show the actual IP address assigned to the machine  

<https://docs.google.com/document/d/1IlMrKgWltH37bYCJGCWJIZZwT7Y05fsuxsHL7tq_CJ4/edit?resourcekey=0-hHy8_8D70uuhcIBOtVs2ew> dnsmasq Reference guide for installing and configuring DNS and DHCP for the local network 

### Lab Notes 

When experimenting with changes in a service, it's a good idea to enable debug logging so that we can understand what's going on and why.

dnsmasq is running as a daemon in the background. We can query the status using the service command learned in the previous lesson:

`sudo service dnsmasq status`