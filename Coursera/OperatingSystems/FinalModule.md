# Week 6

## Remote Access

### Remote Connections on Windows

- PuTTY a free open source software that you can use to make remote connections through several network protocols, including SSH
- putty can also be ran from the command line with PowerShell
- `putty.exe -ssh cindiy@104.132.324.122` example to open up ssh connection to another computer
- `RDP` is another way to connect to machines together this is provided by windows
- to enable RDP connections go to start menu-> this PC-> remote settings -> on remote Desktop select allow remote connections
- look up Remote Desktop Connection to be able to RDP in to that machine

### Supplemental Reading for Remote Connecttions Windows

SSH
Secure Shell (SSH) is a network protocol that gives users a secure way to access a computer over an unsecured network. SSH enables secure remote access to SSH-enabled network systems or devices and automated processes. It also allows for secure remote access to transfer files, use commands and manage network infrastructure.

OpenSSH
OpenSSH is the open-source version of the Secure Shell (SSH) tools used by administrators of Linux and other non-Windows for cross-platform remote systems management. OpenSSH has been added to Windows (as of autumn 2018) and is included in Windows Server and Windows client.

Common SSH Clients
An SSH client is a program that establishes secure and authenticated SSH connections to SSH servers. The following common SSH clients are Windows compatible:

`PuTTY` is a terminal emulator and the inspiration for all subsequent remote access systems.

Features: This tool offers Telnet, SSH, Rlogin (A remote login tool for use with UNIX-based machines on your network), and raw socket connections plus Secure File Transfer Protocol (SFTP) and Secure Copy Protocol (SCP) for file transfers between two hosts.

Protocols: `SCP, SSH, Telnet, rlogin, and raw socket connection.`

`SecureCRT` is a remote access system available for macOS, Linux, iOS, and Windows.

Features: It offers terminal emulation and file transfer through an SSH tunnel. It enables connections through many protocols and has usability features like tabbed sessions and customizable menus.

Protocols: `SSH1, SSH2, Telnet, and Telnet/SSL`

`SmarTTY` is a free SSH client with a multi-tabbed interface to allow multiple simultaneous connections.

Features: This tool includes SCP capabilities for file transfers. It also includes usability features like auto-completion, file panel, and package management.

Protocols: `SSH and SCP`

`mRemoteNG` is a remote desktop system with a tabbed interface for multiple simultaneous connections.

Features: The system enables connections with Remote Desktop Protocol (RDP), Telnet (two-way text communication via virtual terminal connections), Rlogin, Virtual Network Computing (VNC, a graphics-based desktop sharing system), and SSH.

Protocols: `RDP, VNC, SSH, Telnet, HTTP/HTTPS, rlogin, Raw Socket Connections, Powershell remoting`

MobaXterm is a remote access system built for Unix and Linux, and Windows.

Features: Features include an embedded X server (a graphical interface akin to windows), X11 forwarding (a way to run applications over a remote connection), and easy display exportation to let X11 applications know which screen to run on.

Protocols: SSH, X11, RDP, VNC

Key Takeaways
Secure Shell(SSH) is a way to securely connect two remote machines over an unsecured network.

You can use SSH to remotely control, transfer files from, and manage network resources for SSH-enabled clients.

OpenSSH is an open-source version for cross-platform management.

There are many common Window-compatible SSH clients with various features to fit any need, including PuTTY, SecureCRT, SmarTTY, mRemoteNG, and MobaXterm.

### Remote Connections on linux

- SCP or secure copy is a command you can use in Linux to copy files between computers on a network
- Utilizes SSH to transfer the files between two locations
- to do this `scp /home/cindy/Desktop/myfile.txt juan@155.122.122.215`
- you will be prompted to login to the machine you are trying to pass files to
- `scp ` command is super useful if you need to copy files to and from computers on a network

### Remote Connection: File Transfer on Windows

- The PuTTY package comes with a tool called the PuTTY Secure Copy Client or pscp.exe
- used to copy files similar to the scp command in linux
- `pscp.exe ~\Desktop\miFile.txt cindy@155.155.255.255:` after the colons goes the file location you want to send it to. The password will be needed again to be able to send the files to the machine
- dropping files may be time consuming and tidiuos
- There is another option to be able to share folders with different people.
- rightClick the folder-> select share with -> specific people -> from here add individual users or groups you would like to share with
- to access this shared folder go to this PC-> computer tab -> map network drive -> enter location of the folder using the other computer name
- example of this on PowerShell do the following `net share ShareMe = C:\Users\Cindy\Desktop\ShareMe /grant:everyone full`
  <https://learn.microsoft.com/en-us/previous-versions/windows/it-pro/windows-server-2012-R2-and-2012/hh750728(v=ws.11)?redirectedfrom=MSDN> Net Share information

## Virtualization

### Virtual Machines

- in the example provided the application virtualBox was used to start stop and kill virtual machines
- To install a virtual instance you would need to download and install to a location virtual box can get to
- select new button on virtual box, give the VM a name select type and version of the OS
- next is to allocate how much ram should this VM get
- Continue to dedicate hard drive space for the VM
- click through to create
- Once there you can select start to start the VM
- On startup you can then find the image for the VM to start up with this was downloaded earlier
- To modify resource use right click on the VM and modify settings accordingly

How VMs work
Virtual machine software creates a virtualized environment that behaves like a separate computer system. The VM runs in a window on the operating system of your physical computer. The operating system that runs on your physical computer is called the “host” OS. Any operating systems running inside a VM are called “guests.” In the virtual environment, you can install your guest OS, and it will function like it’s running on a physical machine. Whenever you want to use the guest OS, open your VM software and run the guest OS in a window on your host desktop.

Using a virtual machine lets you experiment with different operating systems without having to uninstall or replace your host OS. For example, you can try a Linux OS as a VM on your Windows computer to see how the two OSs compare, or you can use a VM on your Linux system to run a Mac software package.

Another advantage of VMs is that they are isolated from the rest of your system. Software running inside a VM doesn’t affect the host OS or other VMs on your system. This isolation makes VMs a safe place to test software even when there is a risk of negative effects on a system.

A key advantage of VMs is significant reduction in hardware and electricity costs. You can run many VMs on a single host by dividing available hardware resources among each virtualized environment. Modern computer hardware offers a lot of computing power in a single device. But a typical OS will require only a fraction of the computing resources available in a computer. This means you won’t have to run those systems on several physical computers that are only partially used.

VM software divides hardware resources among virtualized environments by designating a portion of resources as virtual resources. When you create a VM you may be asked to specify the amount of physical hard drive space you want to set apart for your VM to use. The VM software will create a virtual hard drive for your VM of the specified size. VM software may have you also specify the amount of RAM you want to allocate for your VM. After you create the VM, you can usually adjust resource allocations. If you want more drive space or RAM for your VM, you can adjust the settings in the VM software to allocate more of those resources.

VM software
Some common Virtual Machine software used to create VMs:

VirtualBox runs on Windows, Linux, Macintosh, and Solaris hosts. VirtualBox supports various guest operating systems, including Windows, Linux, Solaris, OpenBSD, and macOS. VirtualBox is open-source software available for free on the
VirtualBox download page
.

Hyper-V is Microsoft's virtualization platform. It is available as an integrated feature on the Windows operating system. Hyper-V supports Windows, Linux, and FreeBSD virtual machines. It does not support macOS. See
Microsoft’s Hyper-V for Windows documentation
for information on how to access Hyper-V on recent versions of Windows.

VMware desktop software runs on Windows, Linux, and macOS hosts. VMware Workstation Player is the VMware software that lets users run multiple operating systems on a single physical personal computer. It is freely available for non-commercial use on the
VMware Workstation Download
page.

Red Hat Virtualization (RHV) is a business-oriented platform developed for virtualization in enterprise computing contexts. RHV supports a variety of guest systems. Red Hat charges an annual subscription fee for product access, updates, patches, and technical support. See
Red Hat’s RHV Datasheet
for information on how to implement RHV on existing hardware infrastructures.

Key takeaways
Virtualization lets you create a simulated computer environment for running a complete operating system.

Virtual machine (VM) software creates a virtualized environment that behaves like a separate computer system.

Virtualization lets you experiment with different operating systems without having to uninstall or replace your host OS and provides a safe place to test software.

VM software divides hardware resources among virtualized environments by allocating portions of available resources as virtual resources.

A variety of Virtual Machine software are available for creating VMs.

## Logging

### System Monitoring

- Logs help by telling you the exact time an event happened, who caused the event and more
- The act of creating log events is called logging
- logs are useful for troubleshooting systems that have gone bad

### The Windows Event Viewer

- in windows events that are logged are stored in the event viewer
- from the cli you can type `eventvwr` or by looking for it in the start menu as event viewer
- on the left pane:
  - Custom Views: with a custom view you can create your own view and only look at the data you want to see
    - To create a custom view go to right side of the actions bar and select create custom view
    - select as appropriate
    - Once done the view will now show the created view
  - Windows Logs: will contain logs generally applied to the whole operating system
  - Applications and Services Logs: contains categories of a single application or system components

### Linux Logs

- logs in linux are stored in the `/var/log` directory
- reminder that `/var` directory is a directory for files that change constantly
- `ls /var/log` will list out all of the log files in the directory each file holds different logs the name will give away what type of log it is
- `auth.log` will contain authorization events
- `kern.log` will contain kernel messages
- `dmesg` will contain system startup messages
- `syslog` will log all events on the machine it pretty much is a compilation of all events with the exception of Auth events. This file should be the first place you go to when a user is having issues with their machine
- log rotation settings can be changed so that the log does not delete events that are old
- some time stamps in linux may use the linux epoch time

<https://manpages.ubuntu.com/manpages/lunar/en/man8/logrotate.8.html> additional info for log rotate

### Working with Logs

- `less /var/log/syslog | grep error ` this command will display all of the logs from syslog containing the word error
- trouble shooting through time stamps is also another great resource to use just use the same command as before but minus the grep piped command
- `tail -f /var/log/syslog` to view logging actively

## Operating System Deployment

## Imaging Software

- This lesson will cover how to install OS images for multiple computers

### Operating Systems Deployment Methods

- One way to be able to copy over an OS is with the use of a disk cloning tool
- The disk cloning tool copies everything from one computer to another, this will install files and folders that may be needed
- CloneZilla it can be used to backup and restore a single machine or many machines at the same time
- to copy over all of the files of a drive do
  - unmount the drive `unmount /dev/sdd`
  - `sudo dd if=/dev/sdd of=~/Desktop/my_usb_image.img bs=100M` what this command does is save the contents of the sdd location to the Desktop as an image file
  - once the usb image files are saved the image files can be seen
- Another way to image a machine is to Request the images from the network
- this can be done with simple automation but not covered in this course
- to do this do you will need to consider standardizing hardware so that specs for the OS do not become an issue

### Supp Reading for OS Deployment Methods

OS Deployment Methods
In this reading, you will learn about operating system (OS) deployment methods, including the use of disk cloning. A cloned disk is an identical copy of a hard drive. Cloning is often used when an Enterprise company purchases a large number of identical computers. The IT Support Administrators for the company are responsible for installing and configuring the computers to meet the needs of the company and its network. Disk cloning is used to save time on this type of deployment. IT Administrators will select one of the new computers to install and configure needed items, such as the OS, utilities, tools, network settings, software, drivers, firmware, and more. Then they make a clone of this first hard drive. The cloned disk is used to copy the entire disk image over to the remaining new computers so that the IT Admins do not need to repeat the same installation and configuration steps on each new computer. They may keep a copy of the original disk from this deployment to reimage the systems if a clean OS install is required (e.g., following a virus or malware infection, OS corruption, etc.).

Cloned disks have uses beyond deploying OSs. They can be used to test new software and configurations in a lab environment before applying the updates to similar production systems. Cloning can also be used for system migrations, data backups, disk archival, or to make a copy of a hard drive for investigative or auditing purposes.

Tools for duplicating disks

Hard disk duplicator
Hard drive duplicators are machines that can make identical copies of hard drives. The original drive is inserted into the duplicator machine along with one or more blank hard drives as targets. Disk duplicators can have anywhere from a single target bay for limited disk cloning (example use: law enforcement investigations) up to 100+ target bays for industrial use (example use: computer manufacturing). If the target drives are not blank, the duplicator machine can wipe the drives. The target drives usually need to share the same characteristics (e.g., interface, form factor, transfer rate) of the original drive. The targets should also have the same or greater storage capacity than the original.

The hard drive duplicator may have an LCD interface built-in to the machine and/or a management software/HTML interface, the latter of which can be accessed over a networked or directly-connected computer or server. The duplicator interface can be used to initiate and manage disk cloning and/or disk wiping (reformatting). Most duplicators copy data sector-by-sector. The time to transfer data from the original to the target drives depends on multiple variables. The machine’s user manual should be consulted to calculate duplication time.

Disk cloning software

Hard drives can also be cloned using software. This method allows the original and target to be different media from one another. For example, a hard drive can be cloned from an IDE drive to an SSD drive, a CD-ROM/DVD, removable USB drive, cloud-based systems, or other storage media, and vice versa. Software cloning supports full disk copies (including the OS, all settings, software, and data) or copies of selected partitions of the drive (useful for data-only or OS-only copies). Disk cloning software is often used by IT Administrators who need to deploy disk images across a network to target workstations or to cloud-based systems. Cloud platforms normally offer a virtual machine (VM) cloning tool as part of their services. VM cloning is the most efficient method for cloning servers and workstations. VM cloning takes a few seconds to deploy new systems.

A few examples of disk cloning software include:

NinjaOne Backup - Cloud-based cloning, backup, and data recovery service designed for managed service providers (MSPs) and remote workplaces.

Acronis Cyber Protect Home Office - Desktop and mobile device cloning software that works with Windows, Apple, and Android systems. Designed for end users. Supports backup, recovery, data migration, and disk replication. Includes an anti-malware service that can overcome ransomware attacks.

Barracuda Intronis Backup - Cloud-based cloning and backup service on a SaaS platform. Designed for MSPs who support small to mid-sized businesses. Can integrate with professional services automation (PSA) and remote monitoring and management (RMM) packages.

ManageEngine OS Deployer - Software for replications, migrations, standardizing system configurations, security, and more. Can create images of Windows, macOS, and Linux operating systems with all drivers, system configurations, and user profiles. These images can be saved to a locally stored library. The library is available to deploy OSs to new, migrated, or recovered systems as needed.

EaseUS Todo Backup - Free Windows-compatible software for differential, incremental, and full backups, as well as disaster recovery. Supports copying from NAS, RAID, and USB drives.

Methods for deploying disk clones
The sections above have described disk clone deployment through copied hard drives, image libraries, network storage, and cloud-based deployments. There are some other options for cloned disk deployments:

Flash drive distribution
OSs can be distributed on flash drives. IT professionals can format flash drives to be bootable prior to copying a cloned disk image to the flash drive. Target systems should be set to boot from removable media in the BIOS. After inserting a flash drive containing the OS into an individual computer, restart the system and follow the prompts to install the OS. Microsoft offers this method as an option for Windows installations. Linux systems can also be booted and installed from flash drives.

The Linux dd command
The Linux/Unix dd command is a built-in utility for converting and copying files. On Linux/Unix-based OSs, most items are treated as files, including block (storage) devices. This characteristic makes it possible for the dd command to clone and wipe disks.

Key takeaways
Hard drives can be duplicated by:

Hard disk duplicator machines

Disk cloning software. Examples:

NinjaOne Backup

Acronis Cyber Protect Home Office

Barracuda Intronis Backup

ManageEngine OS Deployer

EaseUS Todo Backup

Operating systems can be deployed through:

Cloned hard drives

Hard drive image libraries

Network storage

Cloud-based deployments

Flash drive distributions

In Linux, using the dd command

### Mobile Device Resetting and Imaging

- factory reset removes all data and apps from the local machine
- OTA updates (Over the Air) it's where update data is downloaded by the device and updates

### Windows Troubleshooting Tools

Some of the troubleshooting tools provided by Windows include:

Windows Update: One of the most important repair tools for Windows problems. Widespread and known Windows problems will often have a software resolution provided by Microsoft or Original Equipment Manufacturers (OEMs). Windows Update will find, download, and install the required and/or recommended software resolutions, which include operating system patches and updates, security updates and fixes, .NET framework updates, driver and firmware updates, etc. 

Updates from the hardware manufacturer(s): Some OEM updates are not accessible through Windows Update. For these items, it is necessary to go to the OEM’s website for updates, patches, drivers, and firmware for components such as computer hardware, peripherals, and third-party applications.  

Optimize Drives with Disk Defragmenter: When files on a hard drive are saved, deleted, or altered, fragmentation across storage blocks can occur. A file may become spread across the drive in non-contiguous storage blocks. This issue results in performance problems within the system as the hard drive spends additional seek time finding the scattered file fragments and piecing them back together. The Windows Disk Defragmenter can automatically relocate file fragments onto a continuous series of storage blocks in order to remedy these seek time delays. 

Disk Cleanup: Windows utility that simplifies removing temporary files including downloaded program files, thumbnail files, system files, and temporary internet files. Disk Cleanup also offers an option to compress the primary hard drive where the Windows OS resides. 

CHKDSK command: A command-line utility for Windows that scans hard drives to find and flag bad sectors. Flagged bad sectors will be removed from use and no data will be stored on them. The tool will attempt to recover any data found on the bad sector.  

Disk Management tool: A Windows system utility for performing advanced storage management tasks, including initializing a new drive, extending or shrinking a volume, and changing a drive letter.

Event Viewer: Software tool for monitoring events and errors produced by the system, security, hardware, software, and more. The Event Viewer divides logs into four main categories: 

Custom Views

Windows Logs

Applications and Services Logs

Subscriptions

Registry Editor (regedit): The Registry Editor should only be used by advanced system administrators. It is possible to cause serious system and software problems if the wrong edits are made to the Registry. 

System Configuration tool (msconfig): Software tool for changing system settings, including the services and applications that can load on system startup.  

Safe Mode (Windows 10 and 11): There are multiple options for booting into safe mode. A couple of these options include:

System Configuration tool - Can be used to configure a clean boot in Safe Mode to help isolate the source of a system problem.

Startup Settings - Can be accessed through System > Recovery or through the sign-in screen.

System Troubleshoot tool (Windows 11): The Windows Troubleshoot menu can be accessed from Start > Settings > System > Troubleshoot. The following options are available on the Troubleshoot menu:

Recommended troubleshooter preferences - Set preferences for Microsoft’s recommendations for troubleshooting tools.

Recommended troubleshooter history - Easy access to troubleshooting tools used previously.

Other troubleshooters - This menu includes tools for troubleshooting internet connections, audio, printers, Windows Update, Bluetooth, camera, incoming connections, keyboard, network adapter, power, program compatibility, search & indexing, shared folders, video, Windows Store apps, privacy, and misc help. 

Common problems in Windows
The following is a list of common problems encountered in Windows, along with common troubleshooting first steps:
 

Computer is running slowly: There are many issues that could make a computer run slowly. Troubleshooting can involve multiple steps, many of which should be performed on a regular schedule to proactively prevent problems from happening. The first step should almost always be to reboot the computer. This step can fix a large percentage of problems reported by end users. If rebooting does not resolve the problem, check that there is sufficient processing power, disk space, and RAM to support the OS, hardware, software, and intended use of the computer. For example, video editing may require a relatively more powerful computer, a large amount of free hard drive space, and lots of RAM. Check system event logs for errors. Research any error codes found using the Microsoft knowledge base or an internet search to see if there is a known solution to the problem. Run an antivirus and anti-malware scan. Use Windows Update and OEM updates to ensure the system is up to date. Remove temporary and unneeded files and software. Check the software and services that load at startup for potential problem sources. Reboot the computer into Safe Mode to see if the computer performance improves. Unplug peripherals and turn off network connections to eliminate these as sources of the slow down. If the OS is Windows 11, use the System Troubleshoot tools found at Start > Settings > System > Troubleshoot.

Computer is frozen: Power off the computer. Wait 30 seconds to drain residual power and clear any potentially corrupted data held by RAM. Boot up the computer again and check system event logs. If the system does not boot, go to the BIOS settings and boot into Safe Mode to gain access to the event logs. Research any error codes found. If the root cause cannot be determined, run the same checks as listed above for “Computer is running slowly”.

Blue screen errors: If the blue screen provides an error code or QR code, record this information in order to research the root cause of the issue and possible solutions. Power off the computer, wait 30 seconds, then boot the computer again. If the system does not boot, go into the BIOS settings to boot into Safe Mode. Obtain system event logs in the Windows Event Viewer and research any error codes found there. If the root cause cannot be determined through event codes within the logs, then run the same checks as listed above for “Computer is running slowly”.  

Hardware problems: Check the hardware OEM’s website for updates to drivers, firmware, and software management consoles. If this does not resolve the problem, check the system Device Manager to see if the device has been disabled or is not recognized. Additionally, check system event logs and research any error codes found. If the root cause cannot be determined, then run the same checks as listed above for “Computer is running slowly”.  

Software problems: Go to the software manufacturer’s website to check for software patches or updates. If the problem continues after updating the software, check the application event logs and research any error codes found. If the root cause cannot be determined, then run the same checks as listed above for “Computer is running slowly”.  

Application is frozen: End application processes in Task Manager. Restart application. If the problem persists, reboot the computer and try to run the application again. If the issue is still not resolved, then follow the instructions listed above for software problems.

A peripheral is not working: Check to ensure the peripheral is on and is receiving sufficient power, especially if the item is battery powered. Check cables to ensure they are attached securely. If the item is connected through USB, try a different USB port. If the device connects through Bluetooth, check to ensure that Bluetooth is active on both the computer and the peripheral. Reboot the computer to see if the system can reconnect to the device. Inexpensive, high-use peripheral devices experience high failure rates, especially keyboards and mice. Swap the peripheral for a working replacement to see if the problem was the peripheral itself, or perhaps an error in how the computer is detecting the peripheral. If the problem persists with the replacement peripheral, check the system Device Manager to see if the device has been disabled or is not recognized. Check the event logs for any errors. Visit the OEM’s website to look for updates to drivers, firmware, and/or software management consoles, if available. Run a Windows Update as well. 

Audio problems: Check audio volume. Run the Windows audio troubleshooter. Check speaker cables, plugs, jacks, and/or headphones. Check sound settings. Update or repair audio drivers and sound card firmware. Check to ensure the active and default audio devices are the desired audio devices. Turn off audio enhancements. Stop and restart audio services in Task Manager. Restart the computer. Research if specific audio CODECs are needed for audio media. If audio is not working in a browser, ensure the browser has permission to use the system audio and/or microphone. 


Troubleshooting a problem in Windows
As an IT Support professional, you will likely run into problems caused by a full primary hard drive, where the OS is installed. An affected computer may display an error message stating there is insufficient space on the drive to save new files, apply an update, or install new software. In some cases, the computer might not provide an informative error message at all. Instead, the system may experience performance issues, hang, crash, or it might not even load the OS after booting. Note that it is a best practice to routinely perform maintenance and clean-up of computer hard drives to free storage space, improve system performance, and prevent the myriad of issues that can arise when the primary hard drive is full.

Imagine that you are an IT Support Specialist for an organization. An employee reports that their computer is running very slowly and keeps hanging. You know that Windows Update had been scheduled to run overnight to update all of the organization’s systems with multiple patches, updates, and fixes. Although it is possible for these changes to cause system problems, there is only one employee reporting a problem. So, it is more likely that the system did not have adequate storage space to install all of the updates on that employee’s computer system. You suspect that the primary hard drive could be full. Your troubleshooting and repair steps might include:

Check how much free storage space remains. A quick and easy troubleshooting step for system performance issues is to check if the primary hard drive is full. In this scenario, you discover that the employee’s hard drive has less than 5 GB of space left. Microsoft recommends giving Windows 10 at least 20 GB of free space for normal OS processes. You will need to find at least 15 GB of files to delete or move to another storage location. 

Delete temporary and unneeded files. There are a few methods for cleaning out junk files from Windows. Two system maintenance tools for this purpose, found in several versions of Windows, include:

Storage Sense: Use the Windows Storage Sense tool to delete unnecessary files like temporary files, offline cloud files, downloads, and those stored in the Recycle Bin. You can also configure Storage Sense to regularly and automatically clean the hard drive for proactive maintenance. 

Disk Cleanup: A simple alternative tool to Storage Sense. Disk Cleanup performs most of the same operations as Storage Sense, plus it offers a drive compression utility. Note: If you run Disk Cleanup on a drive, but the computer is still reporting “Low Disk Space”, the Temp folder is most likely filling up with Microsoft Store .appx files. In this case, you will need to clear the cache for Microsoft Store.

Reset Windows Update. Since you know the employee’s computer went through a Windows Update overnight and possibly did not complete this process fully, it may be wise to perform a Windows Update reset. The reset tool can check whether a system reboot is required to apply the updates, security settings were changed, update files are missing or corrupted, service registrations are missing or corrupt, and more.This utility can be found in the Windows system Settings menu, under Troubleshoot > Other troubleshooters >  Windows Update.

Move files off of the primary hard drive and onto (one or more of the following): 

Internal or external storage device: Install an additional hard drive or add an external storage device, like a USB drive or SD card, to hold user files.

Network storage: Network storage space is often available in network environments in the form of Network Attached Storage (NAS) appliances or large Enterprise Storage Area Networks (SANs). In these environments, end users should have network drive space mapped to their workstations for file storage, instead of saving files to their local hard drives. 

Cloud storage (OneDrive, File Explorer, Google Drive, etc.): Providing cloud storage space to end users is a lower cost alternative to network storage. However, this option is less secure than onsite NAS or SAN storage.

In Windows System Storage, under Advanced storage settings, set the new drive storage as the destination for “Where new content is saved.”   

Set any cloud storage solutions to be online-only. This will prevent cloud files from downloading an offline or cached version of the files to the hard drive. 

Uninstall apps that are not needed (including Windows Store apps). This is an effective way to free up large amounts of storage space. 

Run antivirus and antimalware software. Some viruses and malware intentionally fill up hard drives with garbage data.

Wipe hard drive and reinstall the OS. If none of the suggestions listed above solve the problem with slow system performance and hanging, consider wiping the hard drive and reinstalling the OS. This is the best method for repairing failed system updates.