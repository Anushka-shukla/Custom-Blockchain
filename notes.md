Logically, a [blockchain](https://en.wikipedia.org/wiki/Blockchain#:~:text=Public%20blockchains,-A%20public%20blockchain&text=Usually%2C%20such%20networks%20offer%20economic,blockchain%20and%20the%20Ethereum%20blockchain.) can be seen as consisting of several layers:

- infrastructure (hardware)
- networking (node discovery, information propagation and verification)
- consensus (proof of work, proof of stake)
- data (blocks, transactions)
- application (smart contracts/dApps, if applicable)

- Every blockchain consists of a cluster of nodes functioning on a peer-to-peer (P2P) network system. Every node in a network has a copy of the shared ledger which gets updated timely. Each node can verify transactions, initiate or receive transactions and create blocks.
- There are primarily two types of blockchains; Private and Public blockchain. However, there are several variations too, like Consortium and Hybrid blockchains.
##### Public Blockchain
- A public blockchain is a non-restrictive, permission-less distributed ledger system. Anyone who has <i>access to the internet can sign in on a blockchain platform to become an authorized node and be a part of the blockchain network. A node or user which is a part of the public blockchain is authorized to access current and past records, verify transactions or do proof-of-work for an incoming block, and do mining. The most basic use of public blockchains is for mining and exchanging cryptocurrencies.</i> Thus, the most common public blockchains are <b>Bitcoin and Litecoin blockchains.</b> <b>Example:</b> Bitcoin, Ethereum, Litecoin
##### Advantages of Public Blockchain
- <b>Trustable</b> – Unlike in private blockchain, two nodes or participants do not need to worry about the authenticity of the other. In other words, they don’t need to personally know or trust the other nodes as the process of proof-of-work makes sure there can be no fraud in transactions. So, one can trust public blockchains blindly without feeling the needing to trust individual nodes.
- <b>Secure</b> – There can be as many participants or nodes in a public network which makes it a secure network. The larger the network, greater the distribution of records and harder it is for hackers to hack the entire network. In addition to this, every node will do verification of transactions and proof-of-work which makes every transaction and block legitimate. Due to these practices and thoughtful cryptogenic encrypting methods, a public blockchain is much safer than the private one.
- <b>Open and Transparent</b> – Public blockchain is open and the data is transparent to all the participant nodes. A copy of the blockchain records or digital ledger is available at every authorized node. This makes the entire blockchain system completely open and transparent. 
##### Disadvantages of Private Blockchain
- <b>Lower TPS</b> – The rate of transactions per second in a public blockchain is very low. This is because it is a huge network with a lot of nodes and for every node to verify a transaction and do proof-of-work is time-consuming. This is why public blockchains like Bitcoin can process only 7 transactions per second or Ethereum network has a rate of 15 TPS.
- <b>Scalability Issues</b> – Like we just saw in the point above, that public blockchain have a slow rate of processing and completing transactions. This causes issues in scalability as well. Because the more we try to increase the size of the network, the slower it will get. However, solutions like Bitcoin’s Lightning Network helps in overcoming this problem. It maintains a rate of the transaction as we increase the size of the network.
- <b>High Energy Consumption</b> – The process of proof-of-work is highly energy consuming as it needs specialized systems (hardware components) to run a special algorithm. It is a matter of concern from both an environmental and economical standpoint. 
##### Private Blockchain
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

- Hyperledger, Ethereum, and Corda are some of the popular blockchain platforms at the moment.
##### Hyperledger Fabric (Fabric)
- [Hyperledger](https://hyperledger-fabric.readthedocs.io/en/release-2.2/blockchain.html#:~:text=Hyperledger%20Fabric%20is%20one%20of,it%20is%20private%20and%20permissioned.) is an open source community focused on developing a suite of stable frameworks, tools and libraries for enterprise-grade blockchain deployments. It serves as a neutral home for various distributed ledger frameworks including Hyperledger Fabric, Sawtooth, Indy, as well as tools like Hyperledger Caliper and libraries like Hyperledger Ursa.
##### Ethereum
- [Ethereum](https://ethereum.org/en/) is a decentralized, open-source blockchain with smart contract functionality. Ether is the native cryptocurrency of the platform. After Bitcoin, it is the second-largest cryptocurrency by market capitalization. 
##### R3 Corda(Corda)
- Corda is a permissioned blockchain platform that powers DLT applications that enable businesses to transact directly and in strict privacy with one another. Corda Enterprise-powered solutions deliver: Multi-party transparency. 
- Ethereum and Hyperledger are having [modular architechture](https://www.businessworldit.com/blockchain-cryptocurrency/which-platform-offers-a-modular-blockchain-in-architecture/)
- [Further reading](https://philippsandner.medium.com/comparison-of-ethereum-hyperledger-fabric-and-corda-21c1bb9442f6)

- There are 3 ways of storing information: Centarlised, decentralised, and distributed systems
##### Centralised
- Centralized systems are systems that use client/server architecture where one or more client nodes are directly connected to a central server. This is the most commonly used type of system in many organisations where client sends a request to a company server and receives the response.
##### Decentralised
-In decentralized systems, every node makes its own decision. The final behavior of the system is the aggregate of the decisions of the individual nodes. Note that there is no single entity that receives and responds to the request.
##### Distributed
- A distributed system allows resource sharing, including software by systems connected to the network. Examples of distributed systems / applications of distributed computing : Intranets, Internet, WWW, email. Telecommunication networks: Telephone networks and Cellular networks.
- [Furthere readings](https://www.geeksforgeeks.org/comparison-centralized-decentralized-and-distributed-systems/)
- [Furthere readings](https://medium.com/delta-exchange/centralized-vs-decentralized-vs-distributed-41d92d463868)
- [Blockchain V/S DLT(Distributed ledger technology)](https://serokell.io/blog/blockchain-vs-dlt)






