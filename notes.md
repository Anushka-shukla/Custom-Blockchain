##### Each block in blockchain consists of:
1. A hash pointer to the previous block
2. Timestamp
3. List of transactions
#### Logically, a [blockchain](https://en.wikipedia.org/wiki/Blockchain#:~:text=Public%20blockchains,-A%20public%20blockchain&text=Usually%2C%20such%20networks%20offer%20economic,blockchain%20and%20the%20Ethereum%20blockchain.) can be seen as consisting of several layers:

- <ins>infrastructure (hardware)</ins>
- <ins>networking (node discovery, information propagation and verification)</ins>
- <ins>consensus (proof of work, proof of stake)</ins>
- <ins>data (blocks, transactions)</ins>
- <ins>application (smart contracts/dApps, if applicable)</ins>

- Every blockchain consists of a cluster of nodes functioning on a peer-to-peer (P2P) network system. Every node in a network has a copy of the shared ledger which gets updated timely. Each node can verify transactions, initiate or receive transactions and create blocks.
- There are primarily two types of blockchains; Private and Public blockchain. However, there are several variations too, like Consortium and Hybrid blockchains.
##### Public Blockchain
- A public blockchain is a non-restrictive, permission-less distributed ledger system. Anyone who has <i>access to the internet can sign in on a blockchain platform to become an authorized node and be a part of the blockchain network. A node or user which is a part of the public blockchain is authorized to access current and past records, verify transactions or do proof-of-work for an incoming block, and do mining. The most basic use of public blockchains is for mining and exchanging cryptocurrencies.</i> Thus, the most common public blockchains are <b>Bitcoin and Litecoin blockchains.</b> <b>Example:</b> Bitcoin, Ethereum, Litecoin
##### Advantages of Public Blockchain
- <b>Trustable</b> – Unlike in private blockchain, two nodes or participants do not need to worry about the authenticity of the other. In other words, they don’t need to personally know or trust the other nodes as the process of proof-of-work makes sure there can be no fraud in transactions. So, one can trust public blockchains blindly without feeling the needing to trust individual nodes.
- <b>Secure</b> – There can be as many participants or nodes in a public network which makes it a secure network. The larger the network, greater the distribution of records and harder it is for hackers to hack the entire network. In addition to this, every node will do verification of transactions and proof-of-work which makes every transaction and block legitimate. Due to these practices and thoughtful cryptogenic encrypting methods, a public blockchain is much safer than the private one.
- <b>Open and Transparent</b> – Public blockchain is open and the data is transparent to all the participant nodes. A copy of the blockchain records or digital ledger is available at every authorized node. This makes the entire blockchain system completely open and transparent. 
##### Disadvantages of Public Blockchain
- <b>Lower TPS</b> – The rate of transactions per second in a public blockchain is very low. This is because it is a huge network with a lot of nodes and for every node to verify a transaction and do proof-of-work is time-consuming. This is why public blockchains like Bitcoin can process only 7 transactions per second or Ethereum network has a rate of 15 TPS.
- <b>Scalability Issues</b> – Like we just saw in the point above, that public blockchain have a slow rate of processing and completing transactions. This causes issues in scalability as well. Because the more we try to increase the size of the network, the slower it will get. However, solutions like Bitcoin’s Lightning Network helps in overcoming this problem. It maintains a rate of the transaction as we increase the size of the network.
- <b>High Energy Consumption</b> – The process of proof-of-work is highly energy consuming as it needs specialized systems (hardware components) to run a special algorithm. It is a matter of concern from both an environmental and economical standpoint. 
##### Private(or permissioned) Blockchain
- A private blockchain is a restrictive or permission blockchain operative only in a closed network. Private blockchains are usually used within an organization or enterprises where only selected members are participants of a blockchain network. The level of security, authorizations, permissions, accessibility is in the hands of the controlling organization. Thus, private blockchains are similar in use as a public blockchain but have a small and restrictive network. Private blockchain networks are <i>deployed for voting, supply chain management, digital identity, asset ownership, etc.</i> <b>Examples</b> of private blockchains are; Multichain and Hyperledger projects (Fabric, Sawtooth), Corda, etc.
##### Advantages of Private Blockchain
- <b>Speed</b> – Private blockchains’ transactions occur at greater speed as compared to public blockchains. That means the transactions per second (TPS) rate is higher in the case of private blockchains.
- <b>Scalability</b> – Private blockchains are pretty scalable. That is, you can choose the size of your private blockchain as per your needs. For instance, if there is an organization that needs a blockchain of only 20 nodes, they can easily deploy one. 
##### Disadvantages of Private Blockchain
- <b>Needs Trust-building</b> – As far as a public blockchain is concerned, it is like an open book or as we call it, an open ledger. This ensures the security and legitimacy of every user. Whereas, in a private network, there are limited participants in a restricted network. 
- <b>Lower Security</b> – As a private blockchain network has lesser number of nodes or participants, it runs a higher risk of a security breach. If anyone of the nodes gains access to the central management system, it can gain access to all the nodes in the network. This makes it easier for a node to hack the entire private blockchain and misuse the information.
- <b>Centralization</b> – Private blockchains are restricted that is they need a central Identity and Access Management (IAM) system for functioning properly. This system has all the monitoring and administrative rights. 
##### Consortium Blockchain
- A consortium blockchain is a semi-decentralized type where more than one organization manages a blockchain network. This is contrary to what we saw in a private blockchain, which is managed by only a single organization. More than one organization can act as a node in this type of blockchain and exchange information or do mining. Consortium blockchains are typically used by <i>banks, government organizations, etc.</i> <b>Examples</b> of consortium blockchain are; Energy Web Foundation, R3, etc.
##### Hybrid Blockchain
- A hybrid blockchain is a combination of the private and public blockchain. It uses the features of both types of blockchains that is one can have a private permission-based system as well as a public permission-less system. With such a hybrid network, users can control who gets access to which data stored in the blockchain. The hybrid system of blockchain is flexible so that users can easily join a private blockchain with multiple public blockchains. A transaction in a private network of a hybrid blockchain is usually verified within that network. But users can also release it in the public blockchain to get verified. The public blockchains increase the hashing and involve more nodes for verification. This enhances the security and transparency of the blockchain network. <b>Example</b> of a hybrid blockchain is Dragonchain.

#### Hyperledger, Ethereum, and Corda are some of the popular blockchain platforms at the moment.
##### Hyperledger Fabric (Fabric)
- [Hyperledger](https://hyperledger-fabric.readthedocs.io/en/release-2.2/blockchain.html#:~:text=Hyperledger%20Fabric%20is%20one%20of,it%20is%20private%20and%20permissioned.) is an open source community focused on developing a suite of stable frameworks, tools and libraries for enterprise-grade blockchain deployments. It serves as a neutral home for various distributed ledger frameworks including Hyperledger Fabric, Sawtooth, Indy, as well as tools like Hyperledger Caliper and libraries like Hyperledger Ursa.
##### Ethereum
- [Ethereum](https://ethereum.org/en/) is a decentralized, open-source blockchain with smart contract functionality. Ether is the native cryptocurrency of the platform. After Bitcoin, it is the second-largest cryptocurrency by market capitalization. 
##### R3 Corda(Corda)
- Corda is a permissioned blockchain platform that powers DLT applications that enable businesses to transact directly and in strict privacy with one another. Corda Enterprise-powered solutions deliver: Multi-party transparency. 
- Ethereum and Hyperledger are having [modular architechture](https://www.businessworldit.com/blockchain-cryptocurrency/which-platform-offers-a-modular-blockchain-in-architecture/)
- [Further reading](https://philippsandner.medium.com/comparison-of-ethereum-hyperledger-fabric-and-corda-21c1bb9442f6)

#### There are three common types of a ledger(contantly growing file) that can be considered by users in the blockchain:
##### Centralised
- Centralized systems are systems that use client/server architecture where one or more client nodes are directly connected to a central server. This is the most commonly used type of system in many organisations where client sends a request to a company server and receives the response.
##### Decentralised
- Decentralized means that there is no single point where the decision is made. Every node makes a decision for it’s own behaviour and the resulting system behaviour is the aggregate response.
##### Distributed
- Distributed means that the processing is shared across multiple nodes, but the decisions may still be centralized and use complete system knowledge.
- [Further readings](https://www.geeksforgeeks.org/comparison-centralized-decentralized-and-distributed-systems/)
- [Further readings](https://medium.com/delta-exchange/centralized-vs-decentralized-vs-distributed-41d92d463868)
- [Blockchain V/S DLT(Distributed ledger technology)](https://serokell.io/blog/blockchain-vs-dlt)

- [Ethereum classic](https://www.investopedia.com/terms/e/ethereum-classic.asp#:~:text=Key%20Takeaways-,Ethereum%20Classic%20is%20an%20open%2Dsource%2C%20decentralized%2C%20blockchain%2D,platform%20that%20runs%20smart%20contracts.&text=Ethereum%20Classic%20emerged%20as%20a,newer%20version%20created%20was%20Ethereum.)
- [Further reading](https://en.wikipedia.org/wiki/Ethereum_Classic)

- [The Impressive Hardware Used in Cryptocurrency Mining](https://medium.com/supplyframe-hardware/the-impressive-hardware-used-in-cryptocurrency-mining-31771edb857c)
##### What hardware is needed for Bitcoin mining?
You need either a GPU (graphics processing unit) or an application-specific integrated circuit (ASIC) in order to set up a mining rig.

##### How does a transaction get into the blockchain?
[Read](https://www.euromoney.com/learning/blockchain-explained/how-transactions-get-into-the-blockchain)

##### How Does Bitcoin Mining Work?
[Read](https://www.investopedia.com/tech/how-does-bitcoin-mining-work/)

##### [Nonce](https://www.investopedia.com/terms/n/nonce.asp)
- "number only used once," refers to the first number a blockchain miner needs to discover before solving for a block in the blockchain.
Once the mathematical computations are solved by the miner, they are gifted cryptocurrency for their time and skill.
Nonce is difficult to find and is considered a way to weed out the less talented crypto miners.

##### [POW](https://www.coindesk.com/what-is-proof-of-work)
- Proof-of-work is a necessary part of adding new blocks to the Bitcoin blockchain.

##### [POS](https://www.investopedia.com/terms/p/proof-stake-pos.asp#:~:text=Proof%20of%20Stake%20(POS)%20was,new%20blocks%20to%20the%20chain.)
- With Proof of Stake (POS), cryptocurrency miners can mine or validate block transactions based on the amount of coins a miner holds.
Proof of Stake (POS) was created as an alternative to Proof of Work (POW), which is the original consensus algorithm in Blockchain technology, used to confirm transactions and add new blocks to the chain.

##### [POA](https://www.investopedia.com/terms/p/proof-activity-cryptocurrency.asp#:~:text=Proof%2Dof%2Dactivity%20(PoA)%20is%20a%20blockchain%20consensus,miners%20arrive%20at%20a%20consensus.)
- Proof-of-activity (PoA) is a blockchain consensus algorithm that is a combination of two other blockchain consensus algorithms: proof-of-work (PoW) and proof-of-stake (PoS).
The PoA system is an attempt to combine the best aspects of both the PoW and the PoS systems; the mining process begins like a PoW system, but after a new block has been successfully mined, the system switches to resemble a PoS system.
Decred (DCR) is the most well-known cryptocurrency that uses the PoA consensus mechanism.

##### ZKP
- [Zero Knowledge Proofs](https://101blockchains.com/zero-knowledge-proof-blockchain/#:~:text=The%20three%20fundamental%20aspects%20characterizing,the%20design%20of%20a%20ZKP.)
- In cryptography, a zero-knowledge proof or zero-knowledge protocol is a method by which one party (the prover) can prove to another party (the verifier) that they know a value x , without conveying any information apart from the fact that they know the value x .

- [Merkle tree](https://www.javatpoint.com/blockchain-merkle-tree#:~:text=Merkle%20tree%20is%20a%20fundamental,the%20transactions%20in%20a%20block.&text=Both%20Bitcoin%20and%20Ethereum%20use,also%20known%20as%20Hash%20Tree.) is a data structure that is used for verifying a block. It is in the form of a binary tree containing cryptographic hashes of each block.

##### DAO
DAO stands for Decentralized Autonomous Organization

##### DAG
- A DAG works in depth. This means that every node consists of multiple layers of transactions. When a transaction is registered in a node, it first has to verify two other transactions before his transaction will be verified. Those two transactions are chosen according to an algorithm.
- [Directed Acyclic Graph](https://medium.com/@kotsbtechcdac/dag-will-overcome-blockchain-problems-dag-vs-blockchain-9ca302651122)

##### Consortium
- Federated blockchain or consortium blockchain is a blockchain technology where instead of only a single organization, multiple organizations govern the platform. It's not a public platform rather a permissioned platform.
##### [Consensus](https://www.geeksforgeeks.org/consensus-algorithms-in-blockchain/#:~:text=Essentially%2C%20the%20consensus%20protocol%20makes,the%20nodes%20in%20the%20Blockchain.&text=Thus%2C%20a%20consensus%20algorithm%20aims,win%20for%20the%20entire%20network.)
- The consensus protocol makes sure that every new block that is added to the Blockchain is the one and only version of the truth that is agreed upon by all the nodes in the Blockchain.

##### [Fork](https://www.cmcmarkets.com/en/learn-cryptocurrencies/what-is-a-blockchain-fork)
- Blockchain forks are essentially a split in the blockchain network.

##### IPFS
IPFS is a file sharing system that can be leveraged to more efficiently store and share large files. It relies on cryptographic hashes that can easily be stored on a blockchain. Nonetheless, IPFS does not permit users to share files with selected parties.

##### NFT
A non-fungible token is a unit of data stored on a digital ledger, called a blockchain, that certifies a digital asset to be unique and therefore not interchangeable. NFTs can be used to represent items such as photos, videos, audio, and other types of digital files.

##### 51% Attack
 a 51% attack refers to a vulnerability where an individual or group of people controls the majority of the mining power (hash rate). This allows attackers to prevent new transactions from being confirmed. Further, they can double-spend the coins. In a 51% attack, smaller cryptocurrencies are being attacked.

##### There are many types of consensus algorithms or techniques available. The most popular consensus algorithm is:

- Proof-of-Work(PoW)
- Proof-of-Stake(PoS)
- Delegated Proof-of-Stake(DPoS)
- Proof-of-Authority(PoA)
- Proof-of-Elapsed Time(PoET)
- Byzantine Fault Tolerance

##### Extensively used cryptographic algorithms.

- SHA - 256
- RSA (Rivest-Shamir-Adleman)
- Triple DES
- Ethash
- Blowfish

#### Types of cryptographic algorithms:
- <b>Symmetric-key cryptography:</b> AKA Secret-key Cryptograpy. A single common key is used for both encryption and decryption processes. Although a single key creates a problem of trnsaferring keys between sender and the reciever securely.
- <b>Asymmetric key cryptography:</b> AKA public key Cryptography. This encryption method uses two keys an encrytion key, named public key and a decryption key, named private key. The key pair generated by this algo consists of these private key and unique public key.  
- <b>Hash functions:</b> This method does not make use of keys while it uses cipher(an algorithm for performing encryption or decryption—a series of well-defined steps that can be followed as a procedure) to generate hash value from plaintext of fixed length. It is almost impossible to recover plain-text from ciphertext.



##### Some more references
[Interview Questions](https://www.javatpoint.com/blockchain-interview-questions)
[Some More](https://www.simplilearn.com/tutorials/blockchain-tutorial/blockchain-interview-questions)
