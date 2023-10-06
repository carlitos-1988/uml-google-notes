# Filesystem Types

## Week 4

### File Systems Review

- Filesystem used to keep track of files and file storage on a disk
- without a file system the OS will not know how to keep track of files
  File system usage for Windows and linux
  ![Recommended File Systems](<ScreenShots/Screenshot 2023-09-24 at 2.25.20 PM.png>)

- `NTFS` formatted drives can be used by both linux and windows
- a `ext4` drive will only work with linux
- `FAT32` supports writing and reading to all file systems (OS,MAC, linux)
  - limitations for up to 4gigs
    <https://recoverit.wondershare.com/file-system/fat32-file-system.html> Fat32 info and how it works

### Dis Partitioning and File Systems

- Partition the piece of a disk that you can manage
- give you the illusion that you are separating the one disk into multiple disks
- When you format a filesystem on a partition it becomes a volume
- Partition table, Tells the OS how the disk is partitioned
  Two types of partition tables:
  - `Master Boot Records (MBR)`
  - `GUID Partition Table (GPT)`
- MBR is primarily used in the Windows OS, only lets you have partitions of 2TBs or less
  - Only 4 primary partitions are allowed
    - to break this down more you need to create Extended partitions
      - Inside the Extended partition you can make a logical partition
- GPT is becoming the new standard for disk partitioning
  - 2TB or greater volume size
  - One type of partition
  - Unlimited partitions

### Windows: Disk Partitioning and Formatting a Filesystem

- `Disk Management Utility` go to ComputerManagement -> right click thisPC -> Manage -> disk management
- if a usb driver is installed it will show up here also
- command line tool manipulation
  - in command line type:
    - `Diskpart`
    - `list disk`
    - `slect disk 1`
    - `clean` wipes disk 1 assuming this is the external USB drive
    - `create partition primary`
    - `select partition 1`
    - `active`
    - `format FS=NTFS label=my-thumb-drive quick` formats thumb drive using NTFS

### Supplemental Reading for Disk Partitioning and Formatting in Windows

<https://drive.google.com/file/d/1qDFyYB5uYLranPk9pZBz0heq0B5hmroH/view> DiskPart Commands

Disk Partitioning and Formatting in Windows
Disk partitioning enables more efficient management of hard disk space by breaking or “slicing” up the disk storage space into partitions. This breaking allows for each partition to be managed separately by reducing inefficient use of space. DiskPart is a disk partitioning utility on the Windows operating system which uses the command line to perform operations. This reading covers the component parts that make up a drive, common DiskPart commands, and how cluster size affects your usable drive space in the Windows OS.

DiskPart
The DiskPart command terminal helps you manage storage on your computer's drives. DiskPart utility can be used to manage partitions of hard disks including creating, deleting, merging, or expanding partitions and volumes. It can also be used to assign a file formatting system to a partition or volume.

There are three main divisions of storage that you will find on a drive: cluster, volume, and partition.

`Cluster` (allocation unit size) is the minimum amount of space a file can take up in a volume or drive.

`Volume` is a single accessible storage area with a single file system; this can be across a single disk or multiple.

`Partition` is a logical division of a hard disk that can create unique spaces on a single drive. Generally used for allowing multiple operating systems.

To use DiskPart you will need to use specific commands to select and manage the parts of your drive you need to access. For a list of common DiskPart terminal commands visit
this helpful guide.

The commands let you work with partitions and volumes but the base storage unit called cluster size is set when initiating the volume or partition.

Cluster Size
Cluster size is the smallest division of storage possible in a drive. Cluster size is important because a file will take up the entire size of the cluster regardless of how much space it actually requires in the cluster.

![Cluster Size Image](<ScreenShots/Screenshot 2023-09-24 at 2.50.22 PM.png>)

Example of cluster storage space lost
For example, if the cluster size is 4kb (the default size for many formats and sizes) and the file you're trying to store is 4.1kb, that file will take up 2 clusters. This means that the drive has effectively lost 3.9 kb of space for use on a single file.

When partitioning a disk, you should specify the cluster size based on your file sizes. If no cluster size is specified when you format a partition, a default is selected based on the size of the partition. Using defaults can result in loss of usable storage space.

It is important to remember when using DiskPart that the actions you take are permanent so be careful not to erase data accidentally.

Key Takeaways
DiskPart is a tool that lets you manage your storage from a command line interface and is useful for a multitude of actions including creating, deleting, merging, and repairing drives.

The three main divisions of storage that you will find on a drive are cluster, volume, and partition.

To use DiskPart you will need to use specific commands to select and manage the parts of your drive you need to access.

Cluster size is the smallest division of storage possible in a drive. Cluster size is important because a file will take up the entire size of the cluster regardless of how much space it actually requires in the cluster.

### Windows: Mounting and Unmounting a Filesystem

- Mounting, making something accessible to the computer, like a filesystem or a hard disk
- This happens automatically in windows, make sure you safely eject when no longer needed

### Linux: Disk Partitioning and Formatting a Filesystem

- partik is a partitioning tool that can be used in linux
  Two modes of use:
  - Interactive
  - Command Line
- `sudo parted-l` will list the computers that are connected to the computer
- ![output of command](<ScreenShots/Screenshot 2023-09-24 at 2.55.36 PM.png>)
- `sudo parted /dev/sdb` this will start the sdb formatting tool
- `print` to print out the results for the drive
- `mlabel gpt` to make a new label
- `print` partition table not states gpt
- `mkpart primary ext4 1Mib 5GiB` then `print`
  - this will partition the dev/sub item
- to format the partition quit parted
  - `sudo mkfs -t ext4 /dev/sdb1`
  - `sudo parted -l` will list the partitions on the disk drive
- be careful when using parting

### Linux: Mounting and Unmounting a FileSystem

- `sudo mount /dev/sdb1 /my_usb` this will mount the usb to the sdb1 partitioned USB
- `cd /my_usb` to the file system can be accessed
- `umount` to unmount something

- `/etc/fstab` this file will have a list of all mountable devices

![Mount and Add Devices](<ScreenShots/Screenshot 2023-09-24 at 3.22.56 PM.png>)

- `cat /etc/fstab` to view storage devices
- `sudo blkid` to view storage device UUIDs

### Supp Reading Mounting and Unmounting a Filesystem in Linux

Mounting and Unmounting a File System
In this reading, you will learn how to mount and unmount file systems in Linux using the fstab table. IT Support professionals who work with Linux systems should know how to mount and unmount file systems both manually and automatically. This skill is often used when configuring Linux servers and other Linux systems to connect to network file systems.

File system table (fstab)
File System Table (fstab) is a Linux configuration table. It helps to simplify mounting and unmounting file systems in Linux. Mounting means to connect a physical storage device (hard drives, CD/DVD drives, network shares) to a location, also called a mount point, in a file system table. In the past, IT Support specialists for Linux systems had to manually mount hard drives and file systems using the mount command. The fstab configuration file made this administrative task more efficient by offering the option to automate the mounting of partitions or file systems during the boot process. Additionally, fstab allows for customized rules for mounting individual file systems.

The fstab configuration table consists of six columns containing the following parameters:

"Column 1 - Device":
The universally unique identifier (UUID) or the name of the device to be mounted (sda1, sda2, … sda#).

"Column 2 - Mount point":
Names the directory location for mounting the device.

"Column 3 - File system type":
Linux file systems, such as ext2, ext3, ext4, JFS, JFS2, VFAT, NTFS, ReiserFS, UDF, swap, and more.

"Column 4 - Options":
List of mounting options in use, delimited by commas. See the next section titled “Fstab options” below for more information.

Column 5 "- Backup operation or dump:"
This is an outdated method for making device or partition backups and command dumps. It should not be used. In the past, this column contained a binary code that signified:

0 = turns off backups

1 = turns on backups

Column 6 - "File system check (fsck) order or Pass":
The order in which the mounted device should be checked by the fsck utility:

0 = fsck should not run a check on the file system.

1 = mounted device is the root file system and should be checked by the fsck command first.

2 = mounted device is a disk partition, which should be checked by fsck command after the root file

![fstab Table Example](<ScreenShots/Screenshot 2023-09-24 at 3.28.22 PM.png>)

Fstab options
In Column 4 of the fstab table, the available options include:

`sync or async` - Sets reading and writing to the file system to occur synchronously or asynchronously.

`auto` - Automatically mounts the file system when booting.

`noauto` - Prevents the file system from mounting automatically when booting.

`dev` or nodev - Allows or prohibits the use of the device driver to mount the device.

`exec` or noexec - Allows or prevents file system binaries from executing.

`ro `- Mount file system as read-only.

`rw` - Mount file system for read-write operations.

`user` - Allows any user to mount the file system, but restricts which user can unmount the file system.

`users` - Any user can mount the file system plus any user can unmount file system.

`nouser` - The root user is the only role that can mount the file system (default setting).

`defaults` - Use default settings, which include rw, suid, dev, exec, auto, nouser, async.

For more options, consult the man page for the file system in use.
Editing the fstab table
As an IT Support professional, you may need to expand the hard drive space on a server. Imagine that you have installed a new hard drive and the Linux server does not seem to recognize the drive. In the background, Linux has detected the new hardware, but it does not know how to display information about the drive. So, you will need to add an entry in the fstab table so that Linux will know how to mount it and display its entry within the file system. The following steps will guide you through this process:

Format the drive using the fdisk command. Select a Linux compatible file system, like ext4. If needed, you can also create a partition on the drive with the fdisk command.

Find which block devices the Linux system has assigned to the new drive. The block device is a storage device (hard drive, DVD drive, etc.) that is registered as a file in the /dev directory. The device file provides an interface between the system and the attached device for read-write processes. Use the lsblk command to find the list of block devices that are connected to the system.

![Example output for the lsblk command](<ScreenShots/Screenshot 2023-09-24 at 3.30.39 PM.png>)
![Command Output pt1](<ScreenShots/Screenshot 2023-09-24 at 3.32.02 PM.png>)
![Command Output pt2](<ScreenShots/Screenshot 2023-09-24 at 3.32.39 PM.png>)

### Windows: Swap

- Virtual memory, how our OS provides the physical memory available in our computer (like RAM) to the applications that run on the computer
- virtual memory gives the ability to use more memory than is currently installed
  - does this by allocating 'pages' to the hard drive
  - when ram is no longer utilizing a set of memory it will save the session on to the hard drive in the form of pages
  - when the ram requires that piece of data it will look to the hard drive and collect that page so that it can continue where it left off
- Memory Manager is used in windows
  - in windows pages are stored in the root partition of a volume called pagefile.sys
  - Windows uses this automatically
  - Go to `systemproperties -> systemandsecurity -> system -> advanced system settings -> advanced tab -> performance settings-> advanced -> virtual memory` this will display the paging file size this can be changed to fit needs

### Linux Swap

- Swap space, in linux, the dedicated are of the hard drive used for virtual memory
- for this example a USB will be used but it is proffered to use local storage devices
- ![Partition USB Drive](<ScreenShots/Screenshot 2023-09-24 at 3.45.35 PM.png>)

  - `sudo parted /dev/sdb` to get to the usb location
  - `mkpart primary linux-swap 5Gib 100%` to make swap space on the USB
  - `sudo mkswap /dev/sdb2` to make swap file directory
  - `sudo swapon dev/sdb2` to turn on swapping on this a swappable item

  <https://access.redhat.com/documentation/en-us/red_hat_enterprise_linux/7/html/storage_administration_guide/ch-swapspace> RHEL Swap Space

### Windows: Files

- NTFS uses master file table to keep files and metadata organized
- ![NTFS Storage](<ScreenShots/Screenshot 2023-09-24 at 3.52.48 PM.png>)
- when a file gets deleted the file is marked as free in the NFT so that it can be used again
- shortcuts are also stored with with the NFT
- Symbolic Links, this will point to the entry of another file, key difference treats them as a substitute
- ![mklink example usage](<ScreenShots/Screenshot 2023-09-24 at 3.57.48 PM.png>)
- ![Hard Link example](<ScreenShots/Screenshot 2023-09-24 at 3.59.24 PM.png>)
  - `mklink /H` this will create a hard link to where if the original file changes the contents of the hardlink will also change

### Windows redings of File storage

- <https://learn.microsoft.com/en-us/windows/win32/fileio/master-file-table?redirectedfrom=MSDN> MFT Windows
- <https://learn.microsoft.com/en-us/windows/win32/fileio/creating-symbolic-links?redirectedfrom=MSDN> Creating Symbolic Links
- <https://learn.microsoft.com/en-us/windows/win32/fileio/hard-links-and-junctions?redirectedfrom=MSDN> Hard links and junctions

### Linux Files

- Metadata and diles are orgized into a structure called an Inode
- Inodes are similar to the Windows NTFSM FT records
- we store Inodes in Inodes table and they help us manage the files in the file system
- Inoe itself doesn't actually store file data or the file name, but it does store everything else about a file
- softlinks also simlinks work the same way shortcuts work in linux
- Hardlinks point to an Inode that is in the Inode table
  ![Hard and Soft Link example](<ScreenShots/Screenshot 2023-09-25 at 12.02.33 PM.png>)
- in this example you can see that the count for copies went up using both the `ln -s originalFileName newFileName`

### Windows: Disk Usage

- using Computer Management Console and selecting disk management you can see all of the storage locations
- to see the partitions you can right click on the storage location properties to check dis usage
- The idea behind disk defragmentation is to take all the files stored on a given disk, and reorganize them into neighboring locations
- having files ordered like this will be easier or rotating hard drives not so beneficial for solid state disks
- `trim` would be more beneficial for solid state disks
- Open Disk Defragmentor and use the GUI

<https://support.microsoft.com/en-us/topic/how-to-start-disk-cleanup-by-using-the-command-line-0e56ef90-00bb-45d1-f452-c40ffea40968>

- `Disk Usage to view in the command line`

### Linux: Disk Usage

- `du - h` to view the disk usage of a directory, usually use this command to see how much disk space is being used by files in a directory
- `df -h` will tell you the free space available in the disk, the -h flag makes the result human readable

<https://www.howtogeek.com/115229/htg-explains-why-linux-doesnt-need-defragmenting/> defragmentation with linux

### Windows: Filesystem Repair

- when reading and writing to a drive the computer puts it in to a buffer/cache first
- Data Buffer, a region of RAM that's used to temporarily store data while it's being moved around
- ![NTFS Log](<ScreenShots/Screenshot 2023-09-25 at 12.18.03 PM.png>)
- the NTFS keeps a log of file changes, this log can help in the event something crashes with OS or software 
- `fsutil repair query C:` will spit out the current status of the self healing status of a drive 
- to run check disk manually `chkdsk /f D:` this will list bad sectors and show corrupted files NTFS will be performing the actual healing 

### Linux Filesystem Repair 

- `fsck` to fix a mounted partition but it is not always guaranteed and could erase that partition 


### Supp Reading Linux File system repair 
Linux File System Repair 
In this reading, you will learn how to use the file system consistency check or fsck command to repair data corruption in file systems on Linux machines. As an IT Support specialist, you will most likely encounter instances of data corruption in onsite systems. It is critical for you to know how to recover corrupted data, file systems, and hard drives. 

A computer file system is software that provides structure for storing the operating system (OS) and all other software installed on system hard drives. A hard drive must be formatted with a file system before the operating system can be installed. Since Linux is an open source OS, innovators have created nearly 100 file systems that support Linux OS installations. Several common file systems that are used for Linux systems include ext, ext2, ext3, ext4, JFS, XFS, ZFS, F2FS, and more. 

Like all software, software-based computer file systems can experience corruption. File system corruption can impede the computer’s ability to locate files stored on the hard drive, including important OS files. File locations are stored as i-nodes (index nodes) in Linux. Every file in a Linux system has its own i-node identifier. The i-node stores metadata about the storage block and fragment location(s) where each file is stored. The i-node metadata also holds information about the file type, size of the files, file permissions, links to the file, and more.

Symptoms of data corruption
Symptoms of data corruption can include: 

- System suddenly shuts down

- Software program will not launch or it crashes when opening a corrupted file. May also give an error message saying: 

  - “File format not recognized” or 

  - “(file name) is not recognized” 

- Corrupted files and folders may no longer appear in the file system. 

- The operating system (OS) may report bad sectors when failing to execute commands.

- Damaged platter-based hard drives can make clicking sounds or unusual vibrations.


Causes of data corruption
Data corruption on system hard drives and file systems can be caused by: 

Software errors - 

Software errors can be any software event that interferes with normal hard disk read/write operations.

Viruses and malware can be designed to intentionally cause corruption to data. 

Antivirus software can damage files if the software experiences problems while scanning or repairing the files.

Hardware malfunctions - 

Larger files are more likely to experience corruption than smaller files. Large files occupy more disk space, making them statistically more likely to cross a bad sector on the hard drive. 

Hard drives that contain platters are at risk of experiencing malfunctioning read/write heads. Damaged heads can corrupt multiple files and directories in a single read/write transaction. Hard drives with moving mechanical parts are more likely to experience failures from moving parts that wear out over time. 

Electrical damage - Can happen when a power failure occurs while the system is writing data to a hard drive.


Data corruption repair
The most critical first step, after data corruption has been identified or suspected, is to shut down the affected hard drive(s). The reason for this step is to stop the cause of the corruption from writing to the hard drives. The longer the corruption activity continues, the more difficult recovering the data becomes. 

Precautions should be taken before powering up a corrupted hard drive to run repair tools. It is important to minimize any read/write operations on the disk other than those produced by data recovery tools. One method to prevent further damage could be to have a corrupted Linux system boot from an external device or network (PXE boot). An alternative method might be to attach the corrupted hard drive as an external hard drive to a healthy system running Linux. A hard drive adapter or drive docking station can be used to convert an internal drive into an external device. 

Before connecting a corrupted drive to a healthy system, the automount service must be disabled. The fsck command will not repair corruption on a mounted file system. In fact, mounting a corrupted file system can cause the healthy Linux system to crash. Although the corrupted file system should not be mounted, the device file for the corrupted hard drive in the /dev directory must be readable for the fsck command to access the drive. 

