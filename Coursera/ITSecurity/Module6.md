# Module 6

## Risk in the Workplace

### Security Goals

- If your company handles credit card, payments, then you have to follows the PCI DSS, or Payment Card Industry Data Security Standard
- PCI DSS Objectives
  1. build and maintain a secure network and systems
  2. Protect cardholder data
  3. Maintain a vulnerability program
  4. Implement strong access control measures
  5. Regular monitor and test networks
  6. Maintain an information security policy

### Measuring and assessing risk

- Security is all about determining risks or exposure; understanding the likelihood of attacks; and designing defenses around these risks to minimize the impact of an attack
- Security risk assessment starts with threat modeling
- High-value data usually includes account information, like usernames and passwords
- Typically, any kind of user data is considered high value, especially if payment processing is involved
- Vulnerability Scanner, a computer program designed to assess computers, computer systems, networks or applications for weaknesses
  ![Vulnerability Process](<securityScreenshots/Screenshot 2023-10-26 at 12.21.21 PM.png>)

- Penetration testing, the practice of attempting to break into a system or network to verify the systems in place

### Privacy Policy

- Privacy policies, oversee the access and use of sensitive data
- it's good practice to apply the principle of least privilege here, by not allowing access to this type of data by default
- Any access that doesn't have a corresponding request should be flagged as a high priority potential breach that needs to be investigated as soon as possible
- data handling policies should cover the details of how different data is classified
- Once different data classes are defined , you should create guidelines around how to handle these different types of data

## Users

### User Habits

- you can build the world's best security systems, but they wont protect you if the users are going to be practicing unsafe security
- you should never upload confidential information onto a third party service that has not been evaluated by your company
- a much greater risk in the workplace that users should be educated on is credential theft from phising emails
- if someone entered their password into a phishing site, or even suspects they did, it's important to change their password as soon as possible

### Third-Party Security

- if they have subpar security, you're undermining your security defenses by potentially opening a new avenue of attack
  <https://vsaq-demo.withgoogle.com/> google vendor security questionnaire

### Security Training

- helping others keep security in mind will help decrease the security burdens you'll have as an IT support specialist

## Incident Handling

### Incident Reporting and Analysis

- The very first step of handling an incident is to detect it in the first place
- The next step is to analyze it and determine the effects and scope of damage
- Once the scope of the incident is determined the next step is containment
- If an account was compromised, change the password immediately
- if the owner is unable to change the password right away, then lock the account
- severity includes factors like what and how many systems were compromised and how the breach affects the business functions
- The impact of an incident is also an important issue to consider
- data exfiltration, the unauthorized transfer of data from a computer
- Recoverability, how complicated the time-consuming the recovery effort will be

Incident Response

Incident Response
When you’ve had a data breach, you may need forensic analysis to analyze the attack. This analysis usually involves extensive evidence gathering. This reading covers some considerations for protecting the integrity of your forensic evidence and avoiding complications or issues related to how you handle evidence.

Regulated data

It’s important to consider the type of data involved in an incident. Many types of data are subject to government regulations that require you to take extra care when handling it. Here are some examples you’re likely to encounter as an IT support specialist.

1. Protected Health Information: This information is regulated by the Health Insurance Portability and Accountability Act (HIPAA). It is personally identifiable health information that relates to:

Past, present, or future physical or mental health or condition of an individual

Administration of health care to the individual by a covered provider (for example, a hospital or doctor)

Past, present, or future payment for the provision of health care to the individual

2. Credit Card or Payment Card Industry (PCI) Information: This is information related to credit, debit, or other payment cards. PCI data is governed by the Payment Card Industry Data Security Standard (PCI DSS), a global information security standard designed to prevent fraud through increased control of credit card data.

3. Personally Identifiable Information (PII): PII is a category of sensitive information associated with a person. Examples include addresses, Social Security Numbers, or similar personal ID numbers.

4. Federal Information Security Management Act (FISMA) compliance: FISMA requires federal agencies and those providing services on their behalf to develop, document, and implement specific IT security programs and to store data on U.S. soil. For example, organizations like NASA, the National Institutes of Health, the Department of Veteran Affairs—and any contractors processing or storing data for them—need to comply with FISMA.

5. Export Administration Regulations (EAR) compliance: EAR is a set of U.S. government regulations administered by the U.S. Department of Commerce’s Bureau of Industry and Security (BIS). These regulations govern the export and re-export of commercial and dual-use goods, software, and technology. Dual-use goods are items that can be used both for civilian and military applications. These goods are heavily regulated because they can be classified for civilian use and then transformed for military purposes.

Digital rights management (DRM)
Digital Rights Management (DRM) technologies can help ensure data regulations compliance. DRM technology comes in the form of either software or hardware solutions. Both options allow content creators to prevent deliberate piracy and unauthorized usage. DRM often involves using codes that prohibit content copying or limit the number of devices that can access a product. Content creators can also use DRM applications to restrict what users can do with their material. They can encrypt digital media so only someone with the decryption key can access it. This gives content creators and copyright holders a way to:

Restrict users from editing, saving, sharing, printing, or taking screenshots of content or products

Set expiration dates on media to prevent access beyond that date or limit the number of times users can access the media

Limit access to specific devices, Internet Protocol (IP) addresses, or locations, such as limiting content to people in a specific country

Organizations can use these DRM capabilities to protect sensitive data. DRM enables organizations to track who has viewed files, control access, and manage how people use the files. It also prevents files from being altered, duplicated, saved, or printed. DRM can help organizations comply with data protection regulations.

End User Licensing Agreement (EULA)
End User Licensing Agreements (EULAs) are similar to DRM in specifying certain rights and restrictions that apply to the software. You often encounter EULA statements when installing a software package, accessing a website, sharing a file, or downloading content. A EULA is usually considered a legally binding agreement between the owner of a product (e.g., a software publisher) and the product's end-user. The EULA specifies the rights and restrictions that apply to the software, and it’s usually presented to users during installation or setup of the software. You can’t complete an installation (or access, share, or download data) until you agree to the terms written in the EULA statement.

Unlike DRM restrictions, EULAs are only valid if you agree to it (i.e., you check a box or click the ‘I Agree’ button). DRM restrictions don’t require your agreement—or rely on you to keep that agreement. DRMs are built into the product they protect, making it easier for content creators to ensure users do not violate restrictions.

Chain of custody
“Chain of custody” refers to a process that tracks evidence movement through its collection, safeguarding, and analysis lifecycle. Maintaining the chain of custody makes it difficult for someone to argue that the evidence was tampered with or mishandled. Your chain of custody documentation should answer the following questions. Documentation for these questions must be maintained and filed in a secure location for current and future reference.

Who collected the evidence? Evidence can include the afflicted or used devices, media, and associated peripherals.

How was the evidence collected, and where was it located?

Who seized and possessed the evidence?

How was the evidence stored and protected in storage? The procedures involved in storing and protecting evidence are called evidence-custodian procedures.

Who took the evidence out of storage and why? Ongoing documentation of the names of individuals who check out evidence and why must be kept.

When a data breach occurs, forensic analysis usually involves taking an image of the disk. This makes a virtual copy of the hard drive. The copy lets an investigator analyze the disk’s contents without modifying or altering the original files. An alteration compromises the integrity of the evidence. This kind of compromised integrity is what you want to avoid when performing forensic investigations.

Key takeaways:
Incident handling requires careful attention and documentation during an incident investigation's analysis and response phases.

Be familiar with what types of regulated data may be on your systems and ensure proper procedures are in place to ensure your organization’s compliance.

DRM technologies can be beneficial for safeguarding business-critical documents or sensitive information and helping organizations comply with data protection regulations.

When incident analysis involves the collection of forensic evidence, you must thoroughly document the chain of custody.


### Incident Response and Recovery 

- Update firewall rules and ACLs if an exposure was discovered in the course of the investigation 

#### Final Project Submission 

Final Project - Sample Submission
Authentication
Authentication will be handled centrally by an LDAP server and will incorporate One-Time Password generators as a 2nd factor for authentication.

External Website
The customer-facing website will be served via HTTPS, since it will be serving an e-commerce site permitting visitors to browse and purchase products, as well as create and log into accounts. This website would be publically accessible.

Internal Website
The internal employee website will also be served over HTTPS, as it will require authentication for employees to access. It will also only be accessible from the internal company network and only with an authenticated account.

Remote Access
Since engineers require remote access to internal websites, as well as remote command line access to workstations, a network-level VPN solution will be needed, like OpenVPN. To make internal website access easier, a reverse proxy is recommended, in addition to VPN. Both of these would rely on the LDAP server that was previously mentioned for authentication and authorization.

Firewall
A network-based firewall appliance would be required. It would include rules to permit traffic for various services, starting with an implicit deny rule, then selectively opening ports. Rules will also be needed to allow public access to the external website, and to permit traffic to the reverse proxy server and the VPN server.

Wireless
For wireless security, 802.1X with EAP-TLS should be used. This would require the use of client certificates, which can also be used to authenticate other services, like VPN, reverse proxy, and internal website authentication. 802.1X is more secure and more easily managed as the company grows, making it a better choice than WPA2.

VLANs
Incorporating VLANs into the network structure is recommended as a form of network segmentation; it will make controlling access to various services easier to manage. VLANs can be created for broad roles or functions for devices and services. An engineering VLAN can be used to place all engineering workstations and engineering services on. An Infrastructure VLAN can be used for all infrastructure devices, like wireless APs, network devices, and critical servers like authentication. A Sales VLAN can be used for non-engineering machines, and a Guest VLAN would be useful for other devices that don't fit the other VLAN assignments.

Laptop Security
As the company handles payment information and user data, privacy is a big concern. Laptops should have full disk encryption (FDE) as a requirement, to protect against unauthorized data access if a device is lost or stolen. Antivirus software is also strongly advised to avoid infections from common malware. To protect against more uncommon attacks and unknown threats, binary whitelisting software is recommended, in addition to antivirus software.

Application Policy
To further enhance the security of client machines, an application policy should be in place to restrict the installation of third-party software to only applications that are related to work functions. Specifically, risky and legally questionable application categories should be explicitly banned. This would include things like pirated software, license key generators, and cracked software.

In addition to policies that restrict some forms of software, a policy should also be included to require the timely installation of software patches. “Timely” in this case will be defined as 30 days from the wide availability of the patch.

User Data Privacy Policy
As the company takes user privacy very seriously, some strong policies around accessing user data are a critical requirement. User data must only be accessed for specific work purposes, related to a particular task or project. Requests must be made for specific pieces of data, rather than overly broad, exploratory requests. Requests must be reviewed and approved before access is granted. Only after review and approval will an individual be granted access to the specific user data requested. Access requests to user data should also have an end date.

In addition to accessing user data, policies regarding the handling and storage of user data are also important to have defined. These will help prevent user data from being lost and falling into the wrong hands. User data should not be permitted on portable storage devices, like USB keys or external hard drives. If an exception is necessary, an encrypted portable hard drive should be used to transport user data. User data at rest should always be contained on encrypted media to protect it from unauthorized access.

Security Policy
To ensure that strong and secure passwords are used, the password policy below should be enforced:

Password must have a minimum length of 8 characters

Password must include a minimum of one special character or punctuation

Password must be changed once every 12 months

In addition to these password requirements, a mandatory security training must be completed by every employee once every year. This should cover common security-related scenarios, like how to avoid falling victim to phishing attacks, good practices for keeping your laptop safe, and new threats that have emerged since the last time the course was taken.

Intrusion Detection or Prevention Systems
A Network Intrusion Detection System is recommended to watch network activity for signs of an attack or malware infection. This would allow for good monitoring capabilities without inconveniencing users of the network. A Network Intrusion Prevention System (NIPS) is recommended for the network where the servers containing user data are located; it contains much more valuable data, which is more likely to be targeted in an attack. In addition to Network Intrusion Prevention, Host-based Intrusion Detection (HIDS) software is also recommended to be installed on these servers to enhance monitoring of these important systems.