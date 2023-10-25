# Module 2

## Encryption

### Cryptography

- Cryptography, hiding messages from potential enemies
- Encryption, the act of taking a message, called plaintext and applying an operation to it,, called a chipher, so that you receive a garbled, unreadable message as the output, called a ciphertext
- The opposite is called decryption
- Encryption algorithm, the underlying logic of process that's used to convert the plaintext into cipher text
- security through obscurity, means if no one knows what algorithm people are using or the general security practice then we would be safe from attackers, do not rely on this type of security only
- Kerckoffs's Principle, this principle states that:
  - a Cryptosystem, a collection of algorithms for key generation and encryption and decryption operations that comprise a cryptographic service should remain secure - even if everything about the system is know, except the key
  - The system should remain secure even if your adversary knows exactly what kind of encryption systems you're employing, as long as your keys remain secure
- Cryptography, overarching discipline that covers the practive of coding and hiding messages from third parties, the study of this practice is called cryptology
- The opposite of this, looking for hidden messages or trying to decipher coded message is referred to as cryptanalysis
- Frequency Analysis, the practice of studying the frequency with which letters appear in a ciphertext
- Steganography, the practice of hiding information from observers, but not encoding it, sort of writing in invisible ink

### Supplemental Reading for The Future of Cryptanalysis

The Future of Cryptanalysis

Data security is one of the top issues for companies. Being familiar with how data is protected and the attacks that can occur within a company to get sensitive information is a crucial aspect of an IT professionals role. This reading covers the definitions of cryptography and cryptanalysis as well as the five types of attacks and their outcomes.

Cryptography
Cryptography is a method of protecting information and communications using codes so that only the intended person can read and process them. Cryptography has mainly stemmed from the manual encoding of messages and information using a formula to convert any given letter or number to a new value. Encryption is the process that encodes the data making it harder to decode. The goal of encrypting data is to keep internal information secure.

Cryptanalysis
Cryptanalysis uses technology to improve the process of encrypting data and innovates new ways to defend companies from attacks that can access and decode their data.

Impact of technology

Many modern encryption algorithms are based on large prime number factorization. This factorization is difficult to do by hand since there are millions of options for these algorithms. Once the information has been encrypted using the algorithm, it is called ciphertext. Technology has evolved to create harder algorithms but also makes it easier to crack algorithms. Modern quantum computers can crack encryption keys significantly faster using factorization and brute-force attacks. An encryption key is typically a random string of bits generated specifically to scramble and unscramble data. The encryption key is then used to convert the ciphertext to plaintext, which is not encoded.

Types of cryptanalysis attack
There are several types of attacks that hackers or security professionals employ to get data from a network using cryptanalysis. The attacks all use a different way into the network to gain encoded information and translate it from the encoded form into information that can be easily read.

The following are the most common cryptanalytic attacks:

Known-Plaintext Analysis (KPA) requires access to some or all of the plaintext of the encrypted information. The plaintext is not computationally tagged, specially formatted, or written in code. The analyst's goal is to examine the known plaintext to determine the key used to encrypt the message. Then they use the key to decrypt the encoded information.

Chosen-Plaintext Analysis (CPA) requires that the attacker knows the encryption algorithm or has access to the device used to do the encryption. The analyst can encrypt one block of chosen plaintext with the targeted algorithm to get information about the key. Once the analyst obtains the key, they can decrypt and use sensitive information.

Ciphertext-Only Analysis (COA) requires access to one or more encrypted messages. No information is needed about the plaintext data, the algorithm, or data about the cryptographic key. Intelligence agencies face this challenge when intercepting encrypted communications with no key.

Adaptive Chosen-Plaintext Attack (ACPA) is similar to a chosen-plaintext attack. Unlike a CPA, it can use smaller lines of plaintext to receive its encrypted ciphertext and then crack the encryption code using the ciphertext.

Meddler-in-the-Middle (MITM) uses cryptanalysts to insert a meddler between two communication devices or applications to exchange their keys for secure communication. The meddler replies as the user and then performs a key exchange with each party. The users or systems think they communicate with each other, not the meddler. These attacks allow the meddler to obtain login credentials and other sensitive information.

Results from a cryptanalysis attack

There are various results of a cryptanalysis attack. Some attacks result in a total break in the encryption and some result in more information that can help the attacker cause other damage or get closer to the goal of a total break.

Common results from a cryptanalysis attack include:

Instance deduction where the attacker discovers additional plain or cipher text. While the key isn’t found to break the code, the additional plaintext or ciphertext can be used to cause problems or continue attacks.

Information deduction where the attacker obtains some information about plain or cipher text not previously known. The additional information can lead to more information about the encryption key.

Distinguishing algorithm where the attacker can distinguish the encryption algorithm from a random alteration. This information reveals clues about the encryption algorithm and can lead to more significant breaks.

Global deduction where the attacker finds an algorithm that is functionally equivalent to the one used in the key. This algorithm is then used to decrypt all information and messages.

Total break where the attacker can gain the entire key. With the entire key, the attacker can decrypt all messages and information

Key takeaways

Many companies use encryption to protect the sensitive information on their network

Technology has advanced cryptanalysis, using more complex algorithms to encrypt data. Modern quantum computers also make it easier to use cryptanalysis to break a company’s encryption.

The different types of attacks that focus on plaintext and ciphertext are Known-Plaintext Analysis, Chosen-Plaintext Analysis, Ciphertext-Only Analysis, and Adaptive Chosen-Plaintext Attack. The meddler in the middle attack is another cryptanalysis attack that gets the key from intercepting a key exchange.

There are various results of a cryptanalysis attack including Instance deduction, Information deduction, Distinguishing algorithm, Global deduction, and Total break.

<https://www.comparitech.com/blog/information-security/cryptanalysis/> Cryptanalysis explained

### Symmetric Cryptography

- These types of encryption algorithms are called symmetric because they use the same key to encrypt and decrypt messages
- Substitution cipher, an encryption mechanism that replaces parts of your plaintext with ciphertext
- ROT13 where letters of the alphabet are rotated 13 places, it really is just a caesar cipher
- Stream cipher, takes a stream of input and encrypts the stream one character or one digit at a time, outputting one encrypted character or digit at a time
- Block Cipher, the cipher takes data in, places it into a bucket or block of data that's a fixed size, then encodes that entire block as one unit
- stream ciphers are faster and less complex to implement but they can be less secure than block ciphers, need to generate and Initialization Vector to be able to not be able to recreate the cipher

### Symmetric Encryption Algorithms

- Data Encryption Standard (DES) designed in 1970s by IBM, with some input from the US National Security Agency
- FIPS, federal information processing standard
- DES is a symmetric block cipher that uses 64-bit key sizes and operates on blocks 64-bits in size
- Through the key size technically 64-bits in length, 8-bits are used only for parity checking, a simple form of error checking
- This means that real world key length for DES is only 56-bits
- key length is super important in cryptography since it essentially defines the maximum potential strength of the system
- longer key length protect against brute force attacks against the keys
- Advanced encryption standard (AES), also a symmetric block cipher, similar to DES in which it replaced
- AES uses 128-bit blocks, twice the size of DES blocks, and supports key length fo 128-bit 192-bit, or 256-bit
- Because of the large key size, brute-force attacks on AES are only theoretical right now, because the computing power required(or time required using modern technology) exceeds anything feasible today
- An important thing to keep in mind when considering various encryption algorithms is speed and ease of implementation
- RC4(Rivest Cipher 4), a symmetric stream cipher that gained widespread adoption because of its simplicity and speed, no longer used because of the inherit weakness and replaced from use
- Seed value, a secret value that is used to initialize a process that is generated by software using one or more values

<http://www.rc4nomore.com/>

## Public Key or Asymmetric Encryption

### Asymmetric Cryptography

- Asymmetric or public key ciphers
- Asymmetric encryption systems use different keys to encrypt and decrypt
- The strength of asymmetric keys comes from the computational difficulty of figuring out the corresponding private key given the public key
- Using Asymmetric keys gives us:
  - Confidentiality
  - Authenticity
  - Non-repudiation

### Asymmetric Cryptography part 2

- asymmetric encryption works well in unsecure environments but they are also more computationally expensive and complex
- MAC (in security) a bit of information that allows authentication of a received messages, ensuring that the message came from the alleged sender and not a third party acting as another person 
- HMAC, keyed-has message authentication code 
- CMACs, cipher-based message authentication codes 
- CBC-MAC, cipher block chaining message authentication codes 

### Asymmetric Encryption Algorithms

- Elliptic curve cryptography (ECC), a public-key encryption system that uses the algebraic structure of elliptic curves over finitte fields to generate secure keys 
- Both Diffie-Hellmen and DSA have elliptic curve variansts referred to as ECDH and ECDSA respectively 

## Hashing 

### Hashing 1

- Hashing(or a hash function) A type of function or operation that takes in an arbitrary data input and maps it to an output of fixed size called a has or digest 
- You feed in any amount of data into a hash function and resulting output will always be the same size, but the output should be unique to the input, such that two different inputs should never yield the same output 
- Hashing can also be used to identify duplicate data sets in databases or archives to speed up searching of tables or to remove duplicate data to save space 
- Cryptographic hashing is distinctly different from encryption because cryptographic hash functions should be one directional 
- The ideal cryptographic hash function should be deterministic, meaning that the same input value should always return the same hash value 
- Hash collisions, two different inputs mapping to the same output 

### Hashing Algorithms 

- SHA1 is part of the Secure Hash Algorithm suite of functions, designed by the NSA, published in 1995
- SHA2 is not the standard for military purposes 
- A MIC is essentially a hash digest of the message in question 

### Hashing Algorithms (Continued )

- Never store passwords or any sensitive data in plain text, store the hash of the password instead of the password itself
- having a hash of the password is not useful on it's own 
- A successful brute force attack, against even the most secure system imaginable, is a function of attacker time and resources 
- A rainbow table is just a pre computed table of all possible password values, and their corresponding hashes 
- reduces the need for processing power because you trade that in with a lookup 
- Password Salt, additional randomized data that's added into the hashing function to generate a hash that's unique to the password and salt combination 
- 

## Cryptography Applications 

### Public Key Infrastructure 

- PKI is a system that defines the creation, storage and distribution of digital certificates 
- A digital certificate is a file that proves that an entity owns a certain public key 
- A certificate will hold: 
  - Information on public key 
  - Registered owner 
  - digital signature from another party who verified this information 
- The entity that is responsible for storing, issuing, and signing certificates is referred to as CA or Certificate authority 
- There's also an RA, or Registration Authority that's responsible for verifying the identities of any entities requesting certificates to be signed and stored with the CA
- A central repository is needed to securely store and index keys, and a certificate management system of some sort make managing access to stored certificates and issuance of certificates easier 
- As the name implies, these are certificates that are bound to clients and are used to authenticate the client to the server, allowing access control to an SSL/TLS service 
- There are also code signing certificates, are used for signing executable programs, this allows users of these applications to verify the signatures and ensure that the application was not tampered with 
- The chain of trust with PKI begings with: 
  - Root Certificate Authority issuing a self signed certificate 
  - this root certificate authority can now use the self signed certificate and the associated private key to begin signing other public keys and start issuing certificates 
  - Intermediate CAs who have been given a certificate and their flag set to true can sign certificates on behalf of the original certificate authority 
  - A certificate that has no authority as a CA is referred to an end entity or leaf certificate 

### Certificate 

- the X.509 standard is what defines the format of digital certificates 
- it also defines a certificate revocation list or CRL, meant to distribute a list of certificates that are no longer valid 
- the current version of the standard is version 3
- Version, what version of the X.509 standard the certificate adheres to 
- Serial number, a unique identifier for the certificate assigned by the CA which allows the CA to manage and identify individual certificates 
- Certificate signature algorithm, this field indicates what public key algorithm is used for the public key and what hashing algorithm is used to sign the certificate 
- Issuer Name, this field contains information about the authority that signed the certificate 
- Validity, this contains two subfields - "not before" and "not after" - which define the dates when the certificate is valid for 
- Subject, this field contains identifying information about the entity the certificate was issues to 
- Subject public key info, these two subfields define the algorithm of the public key, along with the public key itself 
- Certificate signature algorithm, same as the subject public key info field; the two fields must match 
- Certificate signature value, the digital signature data itself 
- Web of trust where individuals instead of public keys sign other individuals public keys 
- once you have verified the person is who they say they are you will sign their certificate and vouch for that person yourself 

<https://www.ietf.org/rfc/rfc5280.txt>X.509 standard 

### Cryptography in Action 

-  HTTPS is the secure version of HTTP, the Hyper Text Transport Protocol 
-  HTTP is also know as HTTP over SSL or TLS, this is because it is encapsulating HTTP traffic using SSL or TLS 
-  TLS grans three things: 
    1. A secure communication line, which means data being transnitted is protected from potential eavesdroppers 
    2. The ability to authenticate both parties communicating through typically only the server is authenticated by the client 
    3. The integrity of communications, meaning there are checks to ensure that messages aren't lost or altered in transit 
- TLS Handshake 
- The session key is the shared symmetric encryption key used in TLS sessions to encrypt data being sent back and forth 
- Forward Secrecy, this is a property of a cryptographic system so that can even in the event that the private key is compromised, the session keys are still sage 
- Secure Shell(SSH), a secure network protocol that uses encryption to allow access to a network service over unsecured networks 
- ssh uses public key cryptography to authenticate the remote machine that the client is connecting to and has provisions to allow provisioning of the machine 
- Pretty good privacy, an encryption application that allows authentication of data, along with privacy from third parties, relying upon asymmetric encryption to achieve this 
- PGP is commonly used for email encryption, full disk encryption 
<https://www.philzimmermann.com/EN/essays/WhyIWrotePGP.html> Philip Zimmermann, why i wrote PGP

### Securing Network Traffic 

- Virtual Private Network (VPN), a mechanism that allows you to remotely connect a host or network to an internal private network, passing the data over a public channel like the internet 
- IPsec a VPN protocol that as designed in conjunction with IPV6
![IPSec flow](<securityScreenshots/Screenshot 2023-10-21 at 2.32.59 PM.png>)
- IP sec supports two modes of operation 
- When transport mode is used, only the payload of the IP packet is encrypted, leaving the IP headers untouched 
- In tunnel mode, the entire IP packet, header payload and all, encrypted and encapsulated inside a new IP packet with new headers 
- The tunnel is provided by l2TP which permits the passing of unmodified packets from one network to another 
- The secure channel on the other hand, is provided by IPsec, which provides confidentiality, integrity, and authentication of data being passed. 
- OpenVPN can operate over either TCP or UDP, typically over port 1194
- OpenVPN supports up to 256 bit encryption through OpenSSL library 