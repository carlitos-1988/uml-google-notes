# Module 1

## Introduction to IT Security

- to be successful in cyber security put your mindset in the head of a hacker stuff and things

### The CIA Triad

- one acronym to keep in mind is the CIA, Confidentiality, Integrity, Availability
- three key principals
- CIA triad, a guiding model for designing information security policies
- Confidentiality, keeping things hidden
  - Password protection
  - limit access to your data
- Integrity, keeping data accurate and untampered with
  - the data that we receive or send should remain the same throughout its entire journey
- Availability, the information we have is readily accessible to those people that should have it
  - being prepared if data is lost

### Essential Security Terms

- Risk, the possibility of suffering a loss in the event an attack on the system
- vulnerability, a flaw in a system that could be exploited to compromise the system
- 0-day vulnerability(zero day), a vulnerability that is not known to the software developer or vendor, but is known to an attacker
- Exploit, software that is used to take advantage of a security bug or vulnerability
- Threat, the possibility of danger that could exploit a vulnerability
- Hacker, a hacker in the security world is someone who attempts to break into or exploit a system
- black hat hackers bad hackers and white hat hackers who let owners of the systems to fix the systems
- Attack, an actual attempt at causing harm to a system

### Malicious Software

- Malware, a type of malicious software that can be used to obtain your sensitive information, or delete or modify files, include
  - viruses
  - malware
  - spyware
  - tojans
  - root kits
  - backdoors
  - botnets
- viruses, best known type of malware
- in a computer virus, the virus attaches itself to some sort of executable code like a program
- Worms, are similar to viruses except that instead of having to attach themselves onto something to spread, worms can live on their own and spread through channels like the network
- Adware, software that displays advertisements and collects data
- Trojan, malware that disguises itself as one thing but does something else
- Spyware, a type of malware that's meant to spy on you
- Keylogger, a common type of spyware that's used to record every keystroke you make
- Ransomware, a type of attack that holds your data or system hostage until you pay some sort of ransom

### Antimalware Protection, Malware Removal

Antimalware Protection, Malware Removal

Malware can disrupt, damage, or even destroy a computer. IT teams are often responsible for evaluating and repairing computers that are not running well. If a computer is performing poorly or acting strangely, it might be infected with malware. IT professionals need to know how to isolate, remove, and repair infected devices. This reading covers the steps to take to detect and remove malware.

Gather and verify

If you suspect that the computer is infected, you should gather information from the user. It is helpful to note when the symptoms started and if the user has downloaded any unusual files. If the computer has one or more of the following symptoms it may be infected with malware:

Running slower than normal

Restarts on its own multiple times

Uses all or a higher than normal amount of memory

After you’ve gathered information, verify that the issues are still occurring by monitoring the computer for a period of time. One way to monitor and verify is to review the activity on the computer’s resource manager where you can see open processes running on a system.

When looking at the resource manager, you might see a program with a name you do not recognize, a program that is using a lot of memory, or both. If you see a suspicious program, you should investigate this application by asking the user if it is familiar to them.

Quarantine malware

Some malware communicates with bad actors or sends out sensitive information. Other malware is designed to take part in a distributed botnet. A botnet is a number of Internet-connected devices, each of which runs one or more bots. Because of malware’s potential ability to communicate with other bad actors, you should quarantine the infected device.

To quarantine, or separate, the infected device from the rest of the network, you should disconnect from the internet by turning off WiFi and unplugging the ethernet cable. Once the computer is disconnected, the malware can no longer spread to other computers on the network.

You should also disable any automatic system backup. Some malware can reinfect a computer by using automatic backup, because you can restore the system with files infected by the malware.

Remove malware

Once you have confirmed and isolated the malware on a device, you should attempt to remove the malware from the device. First, run an offline malware scan. This scan helps find and remove the malware while the computer is still disconnected from the local network and internet.

All anti-virus/anti-malware programs rely on threat definition files to identify a virus or malware. These files are often updated automatically, but in the case of an infected computer they may be incomplete or unable to update. In this case, you may need to briefly connect to the internet to confirm that your malware program is fully updated.

The scan should successfully identify, quarantine, and remove the malware on the computer. Once the process is complete, monitor the computer again to confirm that there are no further issues.

To help ensure that a malware infection doesn’t happen again threat definitions should be set to update automatically, and to automatically scan for and quarantine suspected malware.

After the malware has been removed from the computer, you should turn back on the automatic backup tool and manually create a safe restore point. If the computer needs attention in the future, this new restore point is confirmed safe and clean.

Malware education

One of the most important things an IT professional can do to protect a company and its employees is to educate users about malware. The goal of education is to stop malware from ever gaining access to company systems. Here are a few ways users and IT professionals can protect their computer and the company from malware:

Keep the computer and software updated

Use a non-administrator account whenever possible

Think twice before clicking links or downloading anything

Be careful about opening email attachments or images

Don't trust pop-up windows that ask to download software

Limit your file-sharing

Use antivirus software

When all employees are on the lookout for suspicious files, it’s much easier to prevent malware and viruses from taking hold.

As malware gets more sophisticated, the chance of malware eventually infecting the computers you manage becomes more likely. These steps will help you when and if that time comes.

Key takeaways

Malware can be devastating for a company’s computer network. As an IT support professional, you should be familiar with how to detect, isolate, and remove malware from the computers you manage.

An infected device should be isolated from the local network and internet as soon as possible.

Antivirus and Anti-Malware software is a key tool for detecting and removing malware.

Keeping threat protection software updated makes malware removal faster and easier.

Education is the first and best line of defense against malware.

### Malware Continued

- There's malware out there that can steal your processing abilities to perform tasks
- compromised machines that are controlled by malware are bots
- Botnet, designed to utilize the power of the internet-connected machines to perform some distributed function
- One example of this would be to mine bitcoin
- backdoor, a way to get into a system if other methods get in the system aren't allowed, installed when your system has been hacked
- Rootkit, a collection of software or tools that an admin would use, can hide itself from the system since it is part of the system
- Logic Bomb, a type of malware that's intentionally installed, after a certain event or time happens the bomb will trigger

<https://www.independent.co.uk/news/business/news/disgruntled-worker-tried-to-cripple-ubs-in-protest-over-32-000-bonus-481515.html> logic bomb to UBS bank incident

## Network Attacks

### Network Attacks 1

- A DNS Cahce Poisoning attack works by tricking a DNS server into accepting a fake DNS record that will point you to a compromised DNS server
- it then feeds you fake DNS addresses whe you try to access legitimate websites
- meddler in the middle is an attack that places the attacker in the middle of two hosts that think they're communicating directly with each other
- a common man in the middle attack is a session hijacking or cookie hijacking
- Rouge AP, an access point that is installed on the network without the network administrator's knowledge
- evil twin attack where someone creates a replica of your own network and makes you login to that network

<https://threatpost.com/major-dns-cache-poisoning-attack-hits-brazilian-isps-110711/75859/> Article for DNS Cache Poisoning Attack in Brazil

### Denial-of-Service(DoS)

- Denial-of-Service(DoS) Attack, an attack that tries to prevent access to a service for legitimate users by overwhelming the network or server
- Ping of death, works by sending a malformed ping to a computer the ping would be larger in size than what the internet protocol was made to handle so it results in a buffer overflow, this can cause a system to crash and possibly the execution of malicious code
- Syn flood, the server will be bombarded with SYN-ACK packets but the attacker is not sending ACK messages this would mean that the connection will stay open and taking up resources, other users would not be able to connect as to this server
- Distributed denial-of-service attack (DDoS), DoS attack using multiple systems

<https://www.esecurityplanet.com/networks/how-to-stop-ddos-attacks-tips-for-fighting-ddos-attacks/> How to Stop DDoS Attacks

<https://www.indusface.com/blog/best-practices-to-prevent-ddos-attacks/> Top 15 DDoS Protection Best Practices

## Other Attacks

### Client-Side Attacks

- a common security problem in software development that runs rampant on the web is the possibility for an attacker to inject malicious code, these are injection attacks
- Cross-site Scripting (XSS) attacks, A type of injection attack where the attacker can insert malicious code and target the user of the service
- XSS attacks are a common method to achieve a session hijacking
- a SQL attack attacks an entire websites SQL server. This will allow attackers to delete or change entries in a SQL database

### Password Attacks

- passwords are the most secure thing we have to prevent unauthorized account access, but passwords are not as long as they should be
- Password Attack, Utilize software like passwords-crackers that try and guess your password
- Password attack, utilize software like password-crackers that try and guess your password, they work extremely well
- Brute Force Attack, will just guess many many password attacks
- A CAPTCHA will prevent people from trying a brute force attack on your website

### Deceptive Attacks

- Social Engineering, an attack method that relies heavily on interactions with humans instead of computers
- humans will always be the weakest links when protecting networks servers, or anything within an organization
- spear fishing targets groups, fishing is for everyone no particular person or group of people
- Spoofing, A source masquerading around as something else
- Tailgating, gaining access into a restricted area or building by following a real employee in

Deceptive Attacks

Previously, you learned about the dangers of socially engineered deceptive attacks. In this reading, you will review this topic and learn about a few more types of socially engineered deceptive attacks. Social engineering attacks are unique as compared to other types of attacks. Social engineering requires cybercriminals to use psychology to trick victims into providing information to the cybercriminal. In other types of cyber attacks, the cybercriminals use computers and other digital tools to hack computers and networks without engaging and deceiving individual victims.

Cybercriminals may use deceptive attacks to disguise their identities, intents, and motives. Through social engineering techniques, these cybercriminals attempt to trick victims into revealing private information, such as a credit card number or login credentials. The cybercriminal might disguise their identity by pretending to be from a reputable organization or to be an individual that the victim might trust, like a friend or work colleague. Socially engineered deceptive attacks can happen through websites, email, text messaging, phone calls, in-person interactions, and more. Cybercriminals often find deception through social engineering to be an easy means for hacking a computer system, simply because many technology users are not aware that this type of threat exists. Others may be aware of the potential for a deceptive cybercriminal attack, but are not sure how to recognize the deception and, further, to prevent themselves from being deceived

Social engineering attacks have increased in recent years. These attacks have changed how organizations approach their cybersecurity policies. It is important for organizations to train their employees on how to recognize a deceptive attack. A single employee that is tricked into entering their company login and password into a fake login window could create an opportunity for a catastrophic criminal attack against an organization’s network.

Deceptive attacks over the internet

There are many types of social engineering attacks. Some of the more common attacks include:

Phishing: A cybercriminal may use email and text messaging to “fish” or phish for victims that will take the cybercriminal’s bait. One basic type of phishing bait may include a convincing story to trick the victim into replying to the email with personal or sensitive information. Another common phishing scam includes using “clickbait” links. These phishing messages entice victims to click on a link by using bait such as popular pet videos, gossip, news scandals, opportunities to win money or prizes, lewd images or videos, etc. If the recipient clicks on the link, they become victim to the next phase of the malicious attack, which could be some type of forced download of malware, ransomware, viruses, keyloggers, trackers, and more.

Spoofing: Cybercriminals use this technique to alter the header on phishing emails in order to appear to originate from a legitimate business or reputable person. For example, a spoofed email might use a fake header that appears to be from a bank. The body of the email might ask the victim to click a given link to log into their bank account to fix a “problem”. The link leads to the cybercriminal’s fake website that looks identical to the bank website and exists only to collect the bank login credentials from victims. The fake website might even give the victim an error message and forward them to the real bank to try to login again. This technique keeps the victim from immediately recognizing they have been scammed because the second login attempt on the real website is usually successful.

Spear phishing: A cybercriminal might use details about a victim’s life to win the victim’s trust. For example, the criminal might first purchase data from a social media platform that provides personal information about the platform’s users. The cybercriminal then uses this data to target or “spear” specific individuals. The cybercriminal could select a name from a user’s friends list and create a spoofed email that appears to be from that friend. The spoofed email may say something as simple as, “look at this photo I found of you online!” The email may also include an attachment or a clickbait link that leads to the next stage of the attack.

Whaling: When a cybercriminal wants to spear phish a big target or “whale,” they will spend more time and effort deceiving the victim. A whale target is typically someone in a position of power, such as a wealthy and/or famous person, an executive of a company, or a high-level government employee. The whale is targeted because of the likelihood that they have the ability to pay high ransomware fees, trade valuable information or confidential data, or may be vulnerable to blackmail.

Vishing: Cybercriminals use Voice over IP (VoIP) to make phone calls or leave voice messages pretending to be from reputable companies in order to trick victims into revealing personal information, such as banking details and credit card numbers. Although telephone scams have been running for decades, vishing with VoIP makes it easier for cybercriminals to hide their true identity. VoIP calls are significantly more difficult to trace than landline calls.

Targeted and in-person deceptive attacks 

Shoulder surfing: This malicious attack might have a specific victim or organization as their target. Shoulder surfing happens when a person looks over a victim’s shoulder to watch them enter login credentials, credit card numbers, or other sensitive information. For example, a temporary contractor for an organization may look over the shoulder of an employee to watch the employee enter their login info. The temporary employee’s goal might be to steal credentials in order to illegally obtain confidential company data or plant ransomware. 

Tailgating: This in-person attack is a form of social engineering in which an unauthorized party gains physical access to a restricted area by simply following a person or group of persons who have authorized access. For example, a criminal wanting to gain physical access to an organization’s computer network might dress in business clothing and follow a group of coworkers coming back from lunch. One member of the group may use their key card to open the door, then hold the door open for the rest of the group, as well as the criminal who is dressed and behaving as though they belong in the building. The criminal may even have a fake ID card to show anyone who questions them.   

Impersonation: This attack might happen over email, text messaging, or a phone call. The attacker impersonates someone who should have access to an organization’s computer network. For example, the attacker might call the IT Support team to request help with a password reset. Alternatively, the attacker might pretend to be a member of an organization’s IT Support team. They may call an employee to ask them to change some settings on their computer to fix a fake problem. These changes are intended to open a door for the cybercriminal to gain access to the organization’s network. 

Dumpster Diving: This in-person attack involves the attacker literally digging through the trash of an individual or organization to hunt for confidential information, like financial or customer information. Shredding all confidential documents is an easy way to prevent this type of attack. 

Evil twin: This type of attack involves the cybercriminal installing Wi-Fi routers that appear to belong to an organization's network. These Wi-Fi access points may not require a password and might appear to offer a stronger signal than the real Wi-Fi router. When victims connect to the fake Wi-Fi access point, the cybercriminal gains access to the victim’s wireless transmissions, which can include login credentials and other sensitive information.  

As an IT Support professional, it is important to train the people and organizations you support on how to identify and protect from socially engineered attacks. These training sessions should be offered to all new employees, contractors, and anyone else who may have access to the organization’s network. Additionally, the training sessions should be repeated on a frequent schedule as new, more sophisticated cybercrime techniques emerge. One best practice method for keeping network users always on alert for attacks, is for IT Support staff to periodically stage harmless attacks that target network users. This method is used to test how effective the training classes have been and how long the users are able to recall how to protect themselves against an attack. Instead of stealing the user’s private information, the harmless attack makes users aware that they fell for a scam, and provides reminders on how to protect themselves against real cybercriminal attacks in the future.