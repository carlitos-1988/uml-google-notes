# Module 5

## System Hardening

### Intro to Defense in Depth

- Defense in depth, the concept of having multiple, overlapping systems of defense to project IT systems
- Ultimately by providing multiple layers of security one may be able to introduce many layers to be able to attack with significant impact because attackers would be caught up with navigating the current security environment

### Disabling Unnecessary Components

- Attack vectors, the method or mechanism by which an attacker or malware gains access to a network or system

  - email attachments
  - network protocols
  - services
  - network interfaces
  - user input

- Attacks surfaces, the sum of all different attack vectors in a given system

  - combination of all ways an attacker can attack a system

- Keep attack surfaces as small as possible
- The less complex something is, the less likely there will be undetected flaws
- Another way to keep things simple is to reduce your software deployments, find ways to reduce the amount of software is taking care of services
- try not to diversify too much
- Telnet access for a managed switch has no business being enabled in a real-world environment
- any vendor specific api if not being used should also be disabled

### Host-Based Firewall

- Host-based-firewalls, protect individual hosts from being compromised when they're used in untrusted, potentially malicious environments, also protect from compromised peers inside the network
- a host-based firewall plays a big part in reducing what's accessible to an outside attacker
- If the users of the system have administrator rights, they they have the ability to change firewall rules and configurations

### Logging and Auditing

- Need to have logs and visibility of all managed services
  ![Log Correlation Analysis](<securityScreenshots/Screenshot 2023-10-24 at 7.35.42 AM.png>)

- Security information and event management systems(SIEMS), a centralized log server, it has extra log features too
- Normalization, the process of taking log data in different formats and converting it into a standardized format that's consistent with a defined structure

<https://github.com/rsyslog/rsyslog> rsyslog
<https://www.splunk.com/> splunk

### Antimalware Protection

- Antivirus software will monitor and analyze things, like new files being created or being modified on the system, in order to watch for any behavior that matches a known malware signature
- why use antivirus software even tho it can be a source of a security concern: It will still protect against the most common attacks out there on the internet
- Antivirus software is just one piece of our anti-malware defenses, only protects for known bad things and not necessarily the bad things
- Binary whitelisting software, operates off a whitelist, it's a list of known good and trusted software and only things that are on the list are permitted to run, everything on the list can run

<https://isc.sans.edu/survivaltime.html> time for systems to be compromised

### Disk Encryption

- Full-disk encryption (FDE), works by automatically converting data on a hard drive into a form that cannot be understood by anyone who doesn't have the key to 'undo' the conversation
- Systems with full hard drive encryption are resilient to data theft and unauthorized tampering
- Secureboot, uses public key cryptography to secure these encrypted elements of the boot process
- secure boot uses a platform key, the public key corresponding the private key used to sign the boot files
- This platform key is written to firmware and is used at bott-time to verify the signature of the boot files
- When you implement a full disk encryption solution at scale, it's super important to think about how to handle cases where passwords are forgotten
- Key escrow, allows the encryption key to be securely stored for later retrieval by an authorized party
- File-based encryption, where only some files or folders are encryted and not the entire disk
- Home directory or file-based encryption only guarantees confidentiality and integrity of files protected by encryption

## Application Hardening

### Software Patch Management

- As an IT support specialist, it's critical that you make sure that you install software updates and security patches in a timely way, in order to defend your company's systems and networks

Browser Hardening

In this reading, you will learn how to harden browsers for enhanced internet security. The methods presented include evaluating sources for trustworthiness, SSL certificates, password managers, and browser security best practices. Techniques for browser hardening are important components in enterprise-level IT security policies. These techniques can also be used to improve internet security for organizations of any size and for individual users.

Identifying trusted versus untrusted sources

Some cybercriminals monitor SEO search terms for popular software downloads. Then they create fake websites to pose as hosts for these popular downloads. They might even use advertising and stolen logos of trusted companies to make the sites appear to be legitimate businesses. However, the downloadable files available on the cybercriminals’ websites are usually malicious software. Unaware of the deception, users download and install the malware. In some cases, the users don’t even need to download a file. Savvy cybercriminals can design web pages that have the ability to infect users’ devices simply upon visiting the sites.

To guard against threats like this, there are checks you can perform to evaluate websites:

Use antivirus and anti-malware software and browser extensions. Run antivirus and anti-malware scans regularly and scan downloaded files. Ensure antivirus and anti-malware browser extensions are enabled when surfing the web.

Check for SSL certificates. See the “Secure connections and sites” section below.

Ensure the URL displayed in the address bar shows the correct domain name. For example, Google websites use the Google.com domain name.

Search for negative reviews of the website from trusted sources. Be wary of websites that have few to no reviews. They may not have been active long enough to build a bad reputation. Cybercriminals will create new websites when they get too many negative reviews on their older sites.

Don’t automatically trust website links provided by people or organizations you trust. They may not be aware that they are passing along links to malicious websites and files.

Use hashing algorithms for downloaded files. Compare the developer-provided hash value of the original file to the hash value of the downloaded copy to ensure the two values match.

Secure connections and sites
Secure Socket Layer (SSL) certificates are issued by trusted certificate authorities (CA), such as DigiCert. An SSL certificate indicates that any data submitted through a website will be encrypted. A website with a valid SSL certificate has been inspected and verified by the CA. You can find SSL certificates by performing the following steps:

Check the URL in the address bar. The URL should begin with the https:// protocol. If you see http:// without the “s”, then the website is not secure.

Click on the closed padlock icon in the address bar to the left of the URL. An open lock indicates that the website is not secure.

A pop-up menu should open. Websites with SSL certificates will have a menu option labeled “Connection is secure.” Click on this menu item.

A new pop-up menu will appear with a link to check the certificate information. The layout and wording of this pop-up will vary depending on which browser you are using. When you review the certificate, look for the following items:4

The name of the issuer - Make sure it is a trusted certificate authority.

The domain it was issued to - This name should match the website domain name.

The expiration date - The certificate should not have passed its expiration date.

Note that cybercriminals can obtain SSL certificates too. So, this is not a guarantee that the site is safe. CAs also vary in how thorough they are in their inspections.

Password managers
Password managers are software programs that encrypt and retain passwords in secure cloud storage or locally on users’ personal computing devices. There are a wide variety of activities users perform online that require unique and complex passwords, such as banking, managing health records, filing taxes, and more. It can be difficult for users to keep track of so many different logins and passwords. Fortunately, password managers can help.

Advantages of using a password manager:

It provides only one password for a user to remember;

Can generate and store secure passwords that are difficult for cybercriminal tools to crack;

Is more secure than keeping passwords written down on paper or in an unencrypted file on a computer; and

Work across multiple devices and operating systems.

Disadvantages of using a password manager:

It can expose all of the user’s account credentials if a cybercriminal obtains the master password to the password manager;

Can be very difficult for a user to regain access to the password manager account if the master password is lost or forgotten;

Requires the user to learn a new method for logging in to their various accounts in order to retrieve passwords from the password manager software; and

Often requires a fee or subscription for password management services.

A few of the top brands for password manager applications include Bitwarden, Last Pass, and 1Password. Please see the Resource section at the end of this reading for more information.

Browser settings
Browser settings can be configured for additional safety measures. Some additional options for hardening browsers include:

Use pop-up blockers:
Disable Web Browser Pop-up Blockers

Clear browsing data and cache:
Clear your web browser's cache, cookies, and history

Use private-browsing mode:
How to Turn on Incognito Mode in Your Browser

Sign-in/browser data synchronization:

Turn sync on and off in Chrome

Disable Firefox Sync

Change and customize sync settings in Microsoft Edge

Use ad blockers:
How to block ads

Key takeaways
You learned about multiple steps you can take to harden a browser and protect your online security:

Identify if sources can be trusted or not:

Use antivirus and anti-malware software and browser extensions.

Check for SSL certificates.

Ensure the URL displayed in the address bar shows the correct domain name.

Search for negative reviews of the website from trusted sources.

Don’t automatically trust website links provided by people or organizations you trust.

Use a password manager

Configure your browser settings:

Use pop-up blockers.

Clear browsing data and cache.

Use private-browsing mode.

Sign-in/browser data synchronization.

Use ad blockers.

### Application Policies

- application policies:
- Not only do they defined boundaries of what applications are permitted or not, but they also help educate folks on how to use software more securely
- A common recommendation, or even a requirement, is to only support or require the latest version of a piece of software
- It;s generally a good idea to disallow risky classes of software by policy
- Things like file sharing software and piracy-related software tend to be closely associated with malware infections
- Understanding what your users need to do their jobs will help shape your approach to software policies and guidelines
- Helping your users accomplish tasks by recommending or supporting specific software makes for a more secure environment
- Extensions that require full access to websites visited can be risky, since the extension developer has the power to modify pages visited 
- 
