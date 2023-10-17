# Week 4

## Introduction to Directory Services

### Module Introduction

- Last of the services covered in this class will be directory services

### What is a directory Server

- Directory Server, contains a lookup service that provides mapping between network resources and their network address
- it's used to organize and manage organizational entities
- Replication, the stored directory data can be copied and distributed servers, but still appear as one, unified datastore for querying and administrating
- meaning can copy across many servers but still appear as one server in the organization
- replication also reduces latency by being able to send the services easily
- Directory Services, useful for organizing data and making it searchable for an organization

![Organizational Unit Example ](<screenshotsSysAdmin/Screenshot 2023-10-16 at 4.37.54 AM.png>)

### Implementing Directory Services

- The most popular protocol for implementing directory services is the Lightweight Directory Access Protocol (LDAP )
- microsoft's implementation is called Active Directory (AD), some customization is available when using it with microsoft products
- Open LDAP, supports many different operating systems
- Microsoft Office Active Directory Users and Computers(ADCU) works well with AD server from microsoft
- All major OSs support login features from a directory server

## Centralized Management

### What is centralized management

- Centralized management, a central service that provides instructions to all of the different parts of my IT infrastructure
- in most organizations access to computers and resources access is granted based on your role rather than your username
- If you or another person change roles in the company, then all you have to do is change the groups that you are a part of, not the rights that you have to directly access resources
- This is called role-based access control or RBAC
- controlling access is one part of this you can also centralize configuration management
- This can be done with the use of logon scripts

<https://en.wikipedia.org/wiki/Role-based_access_control> Role based access control
<https://www.chef.io/products/chef-infra> Chef
<https://www.puppet.com/> puppet
<https://learn.microsoft.com/en-us/mem/configmgr/core/understand/introduction> Configuration Management Introduction

### What is LDAP

- Lightweight Directory Access Protocol (LDAP), used to access information in directory services like over a network
- two popular services that use this protocol are:
  - Active Directory
  - Open LDAP
- There are many actions one can take with this service:
  - Add a new entry to the server
  - delete an entry on the server
  - modify an entry on the server
  - much much more
- LDAP notation is a new notation language for understanding how LDAP modifies info on the server
  <https://en.wikipedia.org/wiki/LDAP_Data_Interchange_Format> LDAP Data Interchange Format

### What is LDAP Authentication

- Bind Operation, authenticates clients to the directory server

![Bind Operation in Action](<screenshotsSysAdmin/Screenshot 2023-10-16 at 5.44.07 AM.png>)

- 3 Common ways to authenticate with LDAP:
  - Anonymous, you are not actually authenticating at all, the service may be configured to be open to anyone
  - Simple
  - SASL (Simple Authentication & Security Layer ), This method can employ the use of security protocols such as TLS,
  - Kerberos, A network authentication protocol that's used to authenticate user identity, secure the transfer of user credentials, and more

<https://learn.microsoft.com/en-us/previous-versions/windows/it-pro/windows-server-2003/cc780469(v=ws.10)?redirectedfrom=MSDN> What is Kerberos Authentication?

## Active Directory

### What is Active Directory ?

- Active Directory (AD), the native directory service for Microsoft Windows
- AD is able to work with other OS while still being able to manage the Windows environments
- Group Policy Objects, are ways to manage the configuration of Windows machines
- Active Directory Administrative Center (ADAC), a tool that we'll use for lots of the every day tasks
- everything in active directory can be thought of an object and objects can have objects embedded inside of them
- Organizational Unit (OU), a folder or directory for organizing objects within a centralized management system
- You can think of an OU like a folder or directory for organizing objects within a centralized management system
- A forest contains one or more domains
- Accounts can share resources between domains in the same forest
- Domain controllers provide several services on the network they host a replica of the AD database and group policy objects
- DCs also provide DNS services to provide name resolution and service discovery to clients.
- They provide central authentication through a network security protocol called Kerberos
- Domain controllers decide when computers and users can log onto the domain
- changes to the AD database can only be done one at a time by once DC
  <https://learn.microsoft.com/en-us/previous-versions/windows/it-pro/windows-2000-server/cc977985(v=technet.10)> Active Directory

### Managing Active Directory

- There are sysAdmins who spend all of their time just managing AD
- Using ADAC user the appropriate localhost -->users --> Domain Admins
- The administrator is the only account in there that will exists when setting up a new directory just like root
- enterprise admins have permissions to make changes to the domain that affect other domains in multi domain forest
- Enterprise accounts are rare and should only be used when the directory forest is being upgrated to a new version
- Domain users, can give access to stuff at this level
- can also give additional access based on the computer that is registered on the domain
- domain controllers contain all controllers in the domain

### Managing Active Directory Users and Groups

- a common sysAdmin task is managing the lifecycle of user accounts
- User accounts that have too much access or are no longer needed create risk for the organization
- managing the accounts is important and a needed action
- in ADAC --> users, right click user --> dialogue
  to create user comes up --> fill in the needed parts.
- Security Account Manager, a database in windows that stores usernames and passwords
- when creating an account it is important to be check that the user changes their password when they sign up for the first time
- when creating many users is needed powershell would be the best suitable option as most commands end up being powershell commands
- to see the commands being run by ADAC go to the console and you will be able to see the commands
- groups can be created in a similar way

### User Accounts and Groups

- There are two categories of group in active directory:
  - Security Group (most common), can contain user accounts , computer accounts or other security groups
    - security groups can be used to grant or deny access to IT resources
  - Distribution groups (less common), only designed to group accounts and contacts for email communication, cant use distribution groups for assigning permission to resources
- Group Scope, has to do with the way that group definitions are replicated across domains
- Domain Local, this is used to assign permission to a resource
- Global, this is used to group accounts into a role
- Universal, this is used to group global roles in a forest
  <https://learn.microsoft.com/en-us/previous-versions/windows/it-pro/windows-server-2003/cc755692(v=ws.10)?redirectedfrom=MSDN> Group Scope

<https://learn.microsoft.com/en-us/previous-versions/windows/it-pro/windows-server-2003/cc780957(v=ws.10)?redirectedfrom=MSDN> Security Principals

### Managing Active Directory User Passwords

- password retrievals are another common tasks for IT specialist
- The password is not stored instead it stores a one way hash password so that it can't be easily read
- if there's more than one person who can authenticate using the same username and password, the auditing becomes difficult or even impossible
- if a person loses their password:
  - check if the password reset is authorized
  - find the account right click and then create password
  - make sure password change is selected
  - send the new password over based on local policies
    <https://learn.microsoft.com/en-us/previous-versions/windows/it-pro/windows-2000-server/cc962100(v=technet.10)?redirectedfrom=MSDN> Features of EFS

### Joining an Active Directory Domain

- Joining a computer to AD will mean two things:
  - AD knows the computer and has provisioned a computer account for it
  - The computer knows about the domain and authenticates with it
  - To join a computer to AD
    - go to computer
    - tab over to system properties
    - change settings
    - click on change
    - a computer can either be part of a domain or a workgroup
    - select domain
    - enter domain name for the AD cite
    - enter appropriate username and password
    - click ok
    - reboot computer
  - The same can be done using powershell: - `Add-Computer -DomainName 'example.com' -Server dc1` - enter credentials for Domain controller
    <https://learn.microsoft.com/en-us/windows-server/identity/ad-ds/active-directory-functional-levels> Forest and Domain Functional Levels

### Group Policy: Group Policy Object (GPO)

- Group Policy Object (GPO), a set of policies and preferences that can be applied to a group of objects in the directory
- GPOs contain settings for computers and user accounts by using the GPO configuring computers to a standard setting making it easier to manage them
- You can also configure the event log to tell the computer what events should be logged and where the logs should be sent
- When you link a GPO, all of the computers or users under that domain, site or OU will have that policy applied
- A group policy object can contain computer configuration, user configuration, or both
- Policies, settings that are reapplied every few minutes, and aren't meant to be changed when by the local administrators
- By default, policies in the GPO will be reapplied on the machine every 90 minutes
- Group Policy Preferences, settings that, in many cases, are meant to be a template for settings
- users can change the settings for what is in the group policy
- Windows registry, a hierarchial database of settings that Windows, and many Windows applications used for storing configuration data

### Group Policy Creation and Editing

- The tool used to create and editing group policies is the Group Policy Management Console (GPMC)
- the group policy Object will hold all of the policies in the domain
- the WMI will define targeting roles for your GPO
- before making changes to a GPO make sure you have started a backup

### Group Policy Inheritance and Precedence 

- when a computer is processing the Group Policy Object that apply to it, all these policies will be applied in precedence rules
- There are link order numbers in the GPO if there are contradictions the GPOs there are precedence rules

## Open LDAP

## Graded Assessments
