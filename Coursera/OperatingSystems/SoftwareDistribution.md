# Software Distribution week 3

## Software Distribution

### Windows: Software Packages

- Executable File contain instructions for a computer to execute when they run
- Microsoft Install Package(.msi) used to guide a program called the Windows INstaller in the installation, maintenance, and removal of programs on the windows operating system
- If you want granular control of the install process then a custom installer will be the best option
- using the msi file will be an easier installation

Key takeaways
Windows has many different ways to distribute, install, uninstall, and update programs and code on a computer. Depending on the organization, IT might use any of these installation options regularly.

Installation packages contain all the information the Windows Installer needs to install software on a computer.

While it is common to install software using the Windows Installer, it is helpful for you to know how to install software using the command line.

The Windows Software Development Kit (SDK) and Microsoft Visual Studio include a program called MakeAppx.exe. MakeAppx.exe is a tool that creates an app package from files on disk or extracts the files from an app package to disk.

Microsoft Store is a digital distribution storefront for apps, games, and other media.

### Linux Software Packages

- for rehat distributions the extension is `.rpm` for redhat package managemt
- Debian for Ubuntu packaged as a `.deb` file for Debian
- dpkg for installing .deb (debian) packages
- to install `-i` will be needed
- `sudo dpkg -i atom-amd.deb` to install debian package from the internet
- `sudo dpkg -r atom` `-r` is used to remove that package
- `dpkg -l ` to list all of the packages that can be removed with the `dpkg` command
- `dpkg -l | grep atom` to search for atom inside the command line

### Windows: Archives

- Package Archives the core or source software file that are compressed into one file
  Extracting content of an Archive:
  - 7Zip to extract file in an archive file
  - Right click 7-Zip -> extract here
  - can also archive with 7-zip
  - you can extract and compress using powershell
  - `Compress-Archive -Path C:\User\User\Desktop\CoolFiles ~ \Desktop\CoolArchive` this will compress from CoolFiles and send them to Cool archive, this is shwon with the `~` symbol

### Linux: Archives

- To extract a file using `7zip`, use the command `7z` and flag e for extract and then the file you want to extract
- `7z e my_character.tar` this will extract the my_character.tar file from the home directory
- Other tools available to do this is `tar`
- other archive file will require different archive programs to extract and archive files

### Tar Command

<https://www.linfo.org/tar.html>

### Windows: Package Dependencies

- Having dependencies counting don other pieces of software to make an application work since one bit of code depends on another, in order to work
- In windows DLL are the shared code libraries
- MSI file will tell the computer how to put it all together including the DLLs
- libraries and dependencies are now managed by a side by side assemblies C:\widows\win\sxs for managing all of the shared dependencies,
- If an application needs to use a library from a computer that DLL or dependency will be listed in a manifest, this manifest will tell windows to look in the sxs file location
- The sxs system will hold access to multiple versions of the library trying to be located
- Windows package manager will help install and manage dependencies an application will be trying to use for software installation
- `find -package` you can locate software along with it's dependencies from the command line

Installing the SysInternals package for troubleshooting windows computer issues

- Open powershell
- `Find-package sysinternals -IncludeDependencies`
  - This will throw an error because the repository this looks to is not part of the default trusted microsoft location
  - to include `sysinternals` one would have to add `Chocolatey` to be able to download
- `Register-PackageSource -Ma,e chocolatey -ProviderName Chocolatey -Location http:chocolatey/api/v2` to register this new downloadable location
- `Get-PackageSource` to look for package sources
- `Install-Package` to actually install `sysinternals`

### Supplemental reading for Windows Package Dependencies

DLL Files and Windows Package Dependencies
In this reading, you will learn about dynamic link library (DLL) files. This information includes how Windows package dependencies can break and how Microsoft has remedied these DLL dependency problems using the .NET framework and other methods. You will also learn about the side-by-side assemblies and manifest files for Windows applications.

Dynamic link library (DLL)
Windows DLL files are vital to the core functions of the Windows operating system (OS). Some Windows-compatible applications also use DLL files to function. DLLs are made up of programming modules that contain reusable code. Multiple applications can use and reuse the same DLL files. For example, the Comdlg32 DLL file is used by many applications to provide Windows dialog box functions. The reusable feature helps Windows conserve disk space and use RAM more efficiently, which improves the operating speed of the OS and applications. The modular structure also makes updating a DLL file fast and simple, eliminating the need to update the entire library. DLL updates are installed once for use by any number of applications.

A few common DLLs used by Windows include:

.drv files - Device drivers manage the operation of physical devices such as printers.

.ocx files - Active X controls provide controls like the program object for selecting a date from a calendar.

.cpl files - Control panel files manage each of the functions found in the Windows Control Panel.

An application can use DLLs to load parts of the app as modules. This means that if the application offers multiple functions, the app can selectively load only the modules that offer the functionality requested by the user. For example, if a user does not access the Print function within an application, then the printer driver DLL file does not need to be loaded into memory. This system requires less RAM to hold the application in working memory, which improves operating speeds.

DLL dependencies
A Windows package dependency is created when an application uses a DLL file. Although the Windows DLL system supports the sharing of DLL files by multiple applications, the applications’ dependencies can be broken under certain circumstances.

DLL dependencies can be broken when:

Overwriting DLL dependencies - It is possible for an application to overwrite the DLL dependency of another app, causing the other app to fail.

Deleting DLL files - Some applications and malware may delete the DLLs needed by other applications installed on a system.

Applying upgrades or fixes to DLLs - Can cause a problem called “DLL hell” where an application installs a new version of the shared DLL for a computer system. However, other applications that are dependent on the shared DLL have not yet been updated to be compatible with the new version of the DLL. This causes the other applications to fail when the end user tries to launch them.

Rolling-back to previous DLL versions - A user may try to reinstall an older application that stopped working after a shared DLL file was upgraded by a newer app. However, the reinstallation of the app that uses the old DLL version can overwrite the new DLL file. This DLL version roll-back can cause the newer app with the shared DLL dependency to fail the next time it tries to run.

Microsoft has remedied these problems through the use of:

Windows File Protection - The Windows OS controls the updates and deletions of system DLL files. Windows File Protection will allow only applications with valid digital signatures to update and delete DLL files.

Private DLLs - Removes the sharing option from DLLs by creating a private version of the DLL and storing it in the application’s root folder. Changes to the shared version of the DLL will not affect the application’s private copy.

.NET Framework assembly versioning - Resolves the “DLL hell” problem by allowing an application to add an updated version of a DLL file without removing the older version of the DLL file. This prevents the malfunction of applications that have dependencies on the older DLL file. The DLL versions can be found in the "C:\Windows\assembly" path and are placed in the Global Assembly Cache (GAC). The GAC contains the .NET “Strong Name Assembly” of each DLL file version. This “Strong Name Assembly” includes the:

name of the assembly - multiple DLL files can share the assembly name

version number - differentiates the version of DLLs

culture - country or region where the application is deployed, can be “neutral”

public key token - a unique 16-character key assigned to an assembly when it is built

Side-by-side assemblies
DLLs and dependencies can also be located in side-by-side assemblies. A side-by-side assembly is a public or private resource collection that is available to applications during run time. Side-by-side assemblies contain XML files called manifests. The manifests contain data similar to the configuration settings and other data that applications traditionally stored in the Windows registry. Instead of registering this data in the Windows registry, the applications store shared side-by-side assembly manifests in the WinSxS folder of the computer. Private manifests are stored inside the application’s folder or they can be embedded in an application or assembly. The metadata of a manifest may include:

Names - Manages file naming.

Resource collections - Can include one or more DLLs, COM servers, Windows classes, interfaces, and/or type libraries.

Classes - Included if versioning is used.

Dependencies - Applications and assemblies can create dependencies to other side-by-side assemblies.

`As an IT Support professional, this concept should be considered when troubleshooting application issues. If the application’s configuration settings are not found in the Windows registry, they might be located in the manifest from the app’s side-by-side assembly.`

### Linux: Package Dependencies

- to install google chrome use `sudo dpkg -i google-chrome-stable_current_amd64.deb` this will throw an error if dependencies is are not available
- to make this work you would have to install `libappindicator1`
- In linux shared libraries are similar to DLL packages found in windows
- Package Managers come with the works to make package installation and removal easier, including installing package dependencies
- Installing a standalone package will not always install all of the necessary dependencies

### Supplemental Reading for Linux Package Dependencies

Linux Package Dependencies
In this reading, you will review how to install and manage Debian packages in Linux using the dpkg command. This skill may be helpful to IT Support professionals that `work with Linux systems like Debian or Ubuntu`.

The following is a list of terms used in this reading:

Debian: One of many free Linux operating systems (OSes), used as the foundation for other OSes, like Ubuntu.

Linux packages: A compressed software archive file that contains the files needed for a software application. These files can include binary executables, a software libraries, configuration files, package dependencies, command line utilities, and/or application(s) with a graphical user interface (GUI). A Linux package can also be an OS update. Linux OS installations normally come with thousands of packages. Common Linux package types include:

`.deb` - Debian packages

`.rpm` - Redhat packages

`.tgz` - TAR archive file

Linux repository: Storage space on a remote server that hosts thousands of Linux packages. Repositories must be added to a Linux system in order for the system to search and download packages from the repository.

Stand alone package: A package that does not require any dependencies. All files required to install and run the package on a Linux system are contained inside a single package.

Package dependency: A package that other Linux packages depend upon to function properly. Often, packages do not include the dependencies required to install the software they contain. Instead, package manifests list the external dependencies needed by the package.

Package manager: A tool on Linux systems used for installing, managing, and removing Linux packages. Package managers can also read package manifests to determine if any dependencies are needed. The package manager then finds and downloads the dependency packages before installing the packaged software. Several common Linux Package Managers include:

For Debian and Debian-based systems, like Ubuntu:

dpkg - Debian Package Manager

APT - Advanced Package Tool, uses dpkg commands

aptitude - user-friendly package manager

RedHat and RedHat-based systems, like CentOS:

`rpm` - RedHat Package Manager

`yum` - Yellowdog Updater Modified, comes with RedHat

`dnf` - Dandified Yum

The dpkg command
The Linux `dpkg``` command is used to build, install, manage, and remove packages in Debian or Debian-based systems.

Syntax
The following are a few common dpkg command action parameters, with syntax and uses:

To install a package: $ `sudo dpkg - -install packagename`

To update a package saved locally: $ `sudo dpkg - -update-avail packagename`

To remove a package: $ `sudo dpkg - -remove packagename`

To purge a package, which removes the package and all files belonging to the package:

`$ sudo dpkg - -purge packagename`

To get a list of packages installed: $ `sudo dpkg - -list`

To get a list of all files belonging to or associated with a package: $ `sudo dpkg - -listfiles packagename`

To list the contents of a new package: `$ sudo dpkg -contents packagename`

When an action parameter is added to the dpkg command, one of the following two commands are run in the background:

`dpkg-deb`: A back-end tool for manipulating .deb files. The dpkg-deb tool provides information about .deb files, and can pack and unpack their contents.

`dpkg-query`: A back-end tool for querying .deb files for information.

Additional Debian package managers
There are several alternate methods for managing Debian packages. Some have command-line interfaces (CLI) while others have GUIs. The alternative options to dpkg include:

`APT (Advanced Package Tool)` - A powerful package manager designed to be a front-end for the dpkg command. APT installs and updates dependencies required for proper .deb package installation.

`Synaptic Package Manager` – A popular GTK (GNU Image Manipulation Program ToolKit) widget with a GUI. Provides an array of package management features.

`Ubuntu Software Center` – A GTK GUI developed by Ubuntu and integrated into the Ubuntu OS.

`aptitude` – A user-friendly front-end for APT, with a menu-driven console and a CLI.

`KPackage` – A part of KDE (Kool Desktop Environment) used to install and load packages that do not contain binary content. Non-binary content includes graphics and scripted extensions.

## Package Managers

### Windows: Package Manager

- Package managers `apt` advanced package manager for linux
- Package Manager makes sure that the process of software installation, removal, update, and dependency management is as easy and automatic as possible
- `Chocolaty` is a package manager for windows but not written by windows
- `SCCM` and `Puppet` integrate with `Choclety` these make updating and managing packages for computers automatic and simple
- `Install-Package -Name sysinternals` the `y` to verify installation and it will all be installed
- `Get-Package -name sysinternals` this will give you the name,version, sources, and ProviderName of that particular package
- to uninstall `Uninstall-Package -Name sysinternals` to remove a specific package by name

additional info https://www.nuget.org/ Nuget package management
additional info https://community.chocolatey.org/packages Chocolatey Package Manager

### Linuc: Package Manager APT

- APT advance packet tool package manager for linux
- installing GIMP on linux machine

  - `sudo apt intall gimp` command will install gimp and all related dependencies
  - select y/n to continue but make sure what packages are about to be installed
  - `sudo apt remove gimp` to uninstall the package that was just added
  - Repositories are servers that act like a central storage location for packages
  - The repository source file in Ubuntu is at `etc/apt/sources.list`
  - `cat etc/apt/sources.list` this command will list out all of the downloadable locations for packages, if the location you want to download from is not here then you may not be able to download a package from that location
  - `ppa` personal package archives are hosted on launchpad servers it allows open source developers to be able to provide software on to linux machines
  - `ppa` software is not as vetted as other software to practice caution when using ppa's
  - `apt update` updates list of repositories but wont install packages
  - `apt upgrade ` will install the available updates

### Additional Resources

  <https://help.launchpad.net/Packaging/PPA> information for launchpad PPAs

  <https://www.gimp.org/downloads/> GIMP installation instructions

### Windows: Underneath the Hood

- Closed Source Packages, packages where you can't look at the source code to see what the program is doing 
- to learn how to construct and destruct package installation files go to <Orca.exe> this is part of the windows SDK will help you create and update installer files. 

### Windows Setting Panel 

- The Windows settings panels allow users to view and change system settings in Windows. Each setting group has a panel that allows changes to several system features. This guide explains the function of each settings panel. 
- <https://drive.google.com/file/d/1RnJ0Xi40ZQKbMoVrcbqn9wp2xSqy_LXo/view>

### Windows Installers and Process Monitors

- For more information about various ways you can create and edit Windows installer packages, check out the following links
  - <https://learn.microsoft.com/en-us/windows/win32/msi/orca-exe?redirectedfrom=MSDN> Orca
  - <https://learn.microsoft.com/en-us/sysinternals/downloads/procmon> Process Monitor 
  - <https://learn.microsoft.com/en-us/windows/win32/msi/windows-installer-examples?redirectedfrom=MSDN> Windows Installer Examples

### Linux: Underneath the Hood

- ![Listing Application setup_script](<ScreenShots/Screenshot 2023-09-21 at 3.12.35 PM.png>)
- this package is simple in nature but the installer will grab the necessary packages 

## Device Software Management 

### Windows: Devices and Drivers 

- Driver, used to help our hardware devices interact with out operating system 