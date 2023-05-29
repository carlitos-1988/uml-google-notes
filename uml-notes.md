# Using this project to note all things learned from UML and plant UML

## `https://plantuml.com/`

main source of truth for all models on this project.

### Ran into issues 7 May 2023

not able to get plant UML to work locally going to be using Start UML for modeling from now on notes will still live on this document..

## Usecase Description

- [ ] Goal: Use case's place within the system and why it is important
- [ ] Preconditions: What is required before use case execution
- [ ] Successful End Condition: System condition after successful execution
- [ ] Failed End Condition: System condition after failed execution
- [ ] Primary Actors: Actors that may trigger a usecase
- [ ] Secondary Actors: Actors that may participate but are not main players
- [ ] Trigger: Event that causes that use case to execute
- [ ] Main Flow: Important steps in the main execution flow
- [ ] Extensions: Alternative steps in the main use case execution
  - [ ] subbullet 1
  - [ ] subbukket 2

## Usecase Example Game

- [ ] 1. Player starts the game
- [ ] 2. Player Smashes to traffic car
  - [ ] 2a. Player smashes in to police car
- [ ] 3. Play crash audio
- [ ] 4. Show sparks
  - [ ] 4a. Screen will flash all white
- [ ] 5. Apply damage to car and reduce health
  - [ ] 5a. Players health goes to zero
- [ ] 6. Compute damage caused to car
- [ ] 7. Accumulate damge as cache

### Use case Relationships

Include - Resuse steps from another use case, mandatory
-- dependency goes from including use case to the included use case.
Generalization - One use case is type of another use case with some change
-- dependency goes from the child use case to the parent use case
Extend Relationship - Used to specify optional behavior. Independent of the main use case but owned by it.
-- dependency goes from extending use case to the Base use case.

### Use Case Guidelines

- Start with a goal
- Write usecase narratives
- Use simple language
- Dont include UI elements
- Keep technology specifics out
- Evey use case should give one guarantee about the behavior of the system
- Actor are black boxes, meaing you cannot interract with the actor
- Primary actors go on left side and seccondary actors will go on the right
- Place included use cases to the right of the invoking use case
- Plcae inhereting use case below parent use case

## Activity Diagram

### Overview

- Use case represents the system behavior
- Activity diagram is used to specify how that behavior is accomplished
- Shows high level actions or steps that are chained together
- Help model a business process

#### Activity Diagraam Guidelines

- Used when a decission has to be made
- Diamond shape, condition A and condition B
- Merge brings together multiple flows
- Allows multiple inputs and allows for a single output
- Some actions can be done in paralell - this can be shown using Fork
- For splits the incoming flow into multiple current flows
- Join synchronizes multiple flows
- Partitions/Swimlanes used when multiple participants are involved
- partitios swimlanes are useful for identifying who is responsible for what actions
- Each swimlane will have the name for the participant

## Object Oriented Design

- Uses Object oriented decomposition
- Takes input from object oriented analysis
  - Conceptual Model
  - behavior from use cases, activity diagram, etc
  - user interface
- High level abstractions from analysis are mapped in to classes
- Associations are formed betweeen objects and classes

## Object Oriented Decomposition

- Locate classes in the problem domain
  - Look for nouns in use cases e.g ATM, Bank, Account , etc
- Find Operations
  - appear as verbs in use cases : withdraw, check balance, etc
- Determine the responsible classes for the operations
- Requires a few iterations to locate responsible classes
- Identify and model associations

### Modelling Logical Structure

- Use cases describe the behavior of the system
- Activity diagram shows how to accomplish that behavior
- UML provides class diagram that shows the relationship between classes
  - Form part of the models logical view

### Class Diagram

- Describes the structure of a system
- Represents a static view
- Structure is described at the level of classes along with their relationships
- The information is descibed without any particular implementation or object data
- heps document different aspects of a system
- ised to construct executable code for applicaitons

### Class

- A class is a type or blueprint of an entity
- its intance is call as object
- an onject of a class will represent a specific type

### Classes in UML

- Shown as rectangle split into three sections
  - top contains the name
  - middle contains attributes
  - bottom contains operations (methods)
  - Generalizations are used for when one main class will help outline the behavior of many classes.
  - The generalization arrow will point from the subclass to the main generalized class

## Object Oriented Programming

- The system is organied as a set of clases and objects
- classes and objects are asspciated in differnt ways
- The implementation is done in an object oriented programming language
- OO languages are build upon the elements of the object model

### Elements of the Object Model

- OO languages build upon these elements to support object oriented programming:

  - Abstraction
  - Encapsulation
  - Hierarchy
  - Polymorphisim

- Some languages may not support all these elements e.g. Javascript, VBA

### Abstraction

- Denotes essential characteristics of am object
  - Distinguish it from other objects
  - relative to the perspective of the viewer
- It is a simplified view or specification that emphasizes some details while suppressing/ignoring others
- Unncessary details are left out
  - they may not be relevant to the problem domain
- A class/struct/interface is an abstraction
- The abstraction is performed based on the domain
- Performing correct abstractio for a given domain is necessary
- Domain expertise is important for performing correct abstraction
- Focus on entity abstraction
  - represents a useful model of domain enitity
  - closely matches with the vocabulary of the problem domain
- e.g Bank Account,, Transaction, etc

### Object responsability

- The abstraction provides the services or uses services of some other object
  - this forms the behaviour of the abstraction
  - provides an outside view
- This view defines a contract that others depend on
- this behaviour form the responsibility of the abstraction
  - provided as operations, methods or member functions
  - collectively called protocol
  - protocol forms the static and dynamic view of the abstraction
  - includes static & dynamic properties of abstraction

### Advantages

- Resolves complexity
- Makes it simpkler to model a solution for a problem
  - unnecessary details are left out
- Focuses on the details relevant to the problem domain
- Represents real life object in software as domain entities

## Encapsulation

- Hides the implementation details of an object
- Focuses on the implementation that gives rise to the behaviour
- Achieved through information hiding
  - structure and implementation of the methods is hidden
- Client only knows about the contract
- Shielded from implementation details at lower level of abstraction
- Abstraction works only when encapsulated
- Every class will have two parts
  - An interface and implementation
- Interface captures the outside view and provides the behaviour
- Clients make assumptions based on the outside view
- Implementation is encapsulated, so clients cannot make any assumptions on those details
- In turn the abstraction is required to be accountable for it behaviour

### Advantages of Encapsulation

- Clients do not or should not need to seee the implementation details
- change in internal implementation does not affect the clients
- encapsulation decouples clients from implementation details
- enforces state changes to object only through behaviour
- helps in building scalable and flexible systems
-

## 18May2023

### Object Oriented Analysis Design and Programming

- You can add attributes and methods to the objects
- each attribute and object can have either a return type or type of variable attached by adding : then the type needed

### Hierarchy

- Abstraction helps represent domain objects to resolve complexity
- Encapsulation further hides the implementation details
- The complexity can be reduced further by creating hierarchy of abstractions
  - hierarchy represents relationships between abstractions
- Helps represent the problem domain and its objects
- The important hierarchies in a complex system are
  - inheritance
  - composition

### Inheritance

- Also known as "is a" relation of generalization
- Represents a relationship where one class is a kind of another
- A class (base or super class) will share its structure and haviour with another class( child class or subclass)
- The base class contains important behaviour which must be exhibited by other classes
- Any class can inherit the behaviour from the base class
  - may provide a specialized implementation of the behaviour
- Inheritance implies generalization/specialization hierarchy
- in Java extends keyword is used to inherit from another object

### Containment

- This is a relationship between objects
- Signifies 'has a' relationship
- One object may contain another object to reuse its behaviour
- Multiple forms of containment exists
  - Composition
  - Aggregation
  - Association
  - Dependency

### Composition

- This is a string relationship & signifies a physical containment
- One object is "part of" another object
- The outer object is responsible for its lifetime
- E.g Button is part of Window
- When the window is closed, the button is also destroyed
- ![UML Composition Example](images/Screenshot%202023-05-18%20at%206.01.32%20PM.png)
  - In uml composition is shown by a filled diamond
  - This picture shows how a button is composed (part of) a window
  - For the game a Fire Hydrant is part of a fountain that is shown when the fire hydrant is smashed

### Aggregation

- denotes a logical containment of an object
- weaker than composition
  - e.g training has students
- Training does not physically contain the students
- The students are shared with other trainings
- A training does not control the lifetime of its students; they exists independently
- In UML aggregation is shown by using a hollow diamond
- The diamond is closer to the object that acts as the container

### Association

- This also implies reuse of objects
- Represents a semantic connection between the classes
- A class will contain a reference of another object and use it for some time
- Often accompanied with phrases such as uses, controls, etc
- E.g Analyst analyses requirements
- in UML association is shown by a line pointing from the user to the object being used
- Optionally a verb descriptor can be used to identify the sort of association

### Dependency

- Weakest form of relationship
- This relationship is formed when an object works with another object briefly
- e.g a Player rolls a dice
- Relationship is shown using a dashed line
- In the game example the FireHydrant damages (using dashed arrow) the PlayerCar each object is independent of one another and one uses the other only for a brief moment

### All Relationship Types

- Dependency
  - Dashed arrow
  - When objects of one class work briefly with objects of another class
  - weakest relationship type
- Association
  - Simple Line
  - When objects of one class work within objects of another class for some prolonged amount of time
- Aggregations
  - Empty Diamond Arrow
  - When one class owns but share a reference of another class
  - weaker relationship than composition
- Composition
  - Filled Diamond Arrow
  - When one class own and contains objects of another class
- Inheritance
  - Empty Arrow
  - When one class is a type of another class
  - Strongest relationship amongst all relationship types

### Polymorphism

- Means different forms
- These forms represent different implementations of the same behavior in different objects
- They are united via inheritance
- The behavior is invoked on the base/super object, but the action is performed on its child object
- The child class overrides the implementation of the base
- OO languages support polymorphism in many ways
- Compile time polymorphism or parametric polymorphism
  - methods are resolved at compile time (overloading, templates )
- Dynamic polymorphism
  - methods are resolved at runtime (virtual mechanism)
- in java the use of @Override will denote where a method inherited from the parent object has been overridden thus allowing for polymorphism

### Advantages for Polymorphism

- promotes reuse
- More classes can be added without requiring change to existing code
- Certain implementations may not even require a recompilation of the binary
- Works in tandem with containment and inheritance

### Abstract Class

- Some methods in the base class may not have an implementation
- These methods exists to provide only the behaviour that the subclasses must implement
- Such methods are abstract and the class also becomes an abstract class
- An abstract class cannot be instantiated
- It can have non-abstract methods, fields, and static members
- The subclass will become abstract if it does not override abstract methods from base
- With UML the abstract methods and attributes will be spelled out in italics
- To denote an abstract class the keyword 'abstract' will be placed before the class keyword
- Once the first non abstract class extends the abstract class it will have to implement those abstract methods inherited. The @Override annotation will denote what methods are overridden

### Interface

- Collection of operations that do not have any implementation
- Similar to abstract class that has all methods as abstract
  - Cannot be instantiated
  - All methods are implicitly public
- Interfaces are used as connections between applications or libraries or components
- In UML the Interface name will being with "I" and the classes that implement the interfaces will have an arrow pointing from them to the interface via a dashed arrow
- Newer versions of UML show interfaces with a lollypop stick where the circle calls out the interface and the class implementing the interface will get the stick end of the lollypop
- Once an interface is implemented it is final and constant, unlike abstract where implementation can be overridden in subclasses
- Implements is the keyword when implementing the Interface

### Abstract Class VS Interface

#### Abstract Class VS

- Can contain fields or methods
- May provide default implementation of some behavior
- Subclasses extend the behavior of the base
- Subclasses cannot inherit from multiple abstract classes
- Can have different access modifiers
- Use to represent common behaviour and implementation when different subclasses are related

##### interface VS

- Contains only behaviour
- Cannot contain any implementation
- Subclasses implemented the behaviour of the interface
- Subclasses can implement multiple interfaces
- All methods are public
- Use to represent common behaviour that "must" be implemented by disparate (different) classes

### Overview of Design

- Although UML diagrams help understand the Classes needed for the program to be developed during implementation of the software more classes may be needed
- For the program the main object will be the Game object where cars, side objects, player, and Player extend from

## Communication Diagrams

### Interaction Diagrams 2 Types

- Interaction diagrams model the interactions between objects in some behaviour
- Help visualize the interaction behavior of the system in context of objects
- Also describe the message flow in the system
- Typically, used to look atr behaviour of the system within a single use case
- This interaction can be modelled with two diagrams
  - Collaboration/communication
  - sequence

### Communication diagram 1/2

- Communication diagram shows how objects associate with each other
- The focus is on link, rather than the order
- Communication diagram gives a big picture view of the interactions between different objects of the system
- Also known as interaction/collaboration diagram
- Easy to draw during discussion

#### Basic Elements

- Contains three elements
  - Participants
  - Communication link
  - Messages that can be passed along the link

#### Participants

- Represented by a rectangle
- Name of the participant and its class are placed in the rectangle as `<name>`:`<class>`
- Both name and class may be specified
- However, either of them can be left out if the participant is anonymous

#### Communication Link

- Shown as a single line
- Connects two participants
- Allows messages to be passed between different participants
- Without the link, participants cannot interface with each other

#### Messages

- Depicted as filled arrow from messages sender to the message receiver
- signature is made up of name and list parameters
- We need to show the order in which the messages are invoked
  - shown as a number before each message

#### Nested Messages

- a message that is invoked because of another message is called a nested message
- the number scheme fo such nested message uses the base message number followed by new number e.g. 1.1 Message()

#### Concurrent Messages

- These are represented using number and letter notation e.g 2.a.MessageX(), 2.B.MessageY()etc
- The other notation is to use an open arrowhead

#### Conditional Messages

- Some messages have to be sent based on a condition
- The conditions for such messages are represented as guards
- A guard is made up of a boolean statement, usually represented through pseudoscope
- e.g. 1.[x > y] : MessageA()

#### Looping Messages

- A looping message is shown with an asterisk before a looping constraint
- This constraint is represented just like a guard statement
- May contain a condition with boolean statement or counter variable
- e.g: 1.\*[i = 0..9]: MessageA() --->
  - Where:
  - `*` represents a looping message
  - `i` represents a counter variable
  - `0-9` values for i
- 2.\*[i < 9 ]:MessageB()
  - `*` looping message
  - `i<9` condition for the loop
- 2.a.||[i = 1..5]:MessageX
  - `||` meaning Message X will be invoked concurrently 5 times

#### Messages to Self

- An object may call a method on itself
  - e.g method may call a private internal method
- Represented through the link from participant to itself with a message

#### Create Message

- This message creates an instance of a class
- It can be represented in multiple ways
  - Message name is Create with argument as the name of the class (signifies call to constructor)
  - Use the stereotype << create >> on the message with any name

#### Destroy Message

- This message destroys an instance of a class
- Use the stereotype << destroy >> on the message
- Can be used to show explicit destruction of an object e.g in C++ we use the delete operator

##### Last Notes for Communication Diagrams

- ![Communication Diagram EX](images/Screenshot%202023-05-26%20at%203.00.50%20PM.png)
- Communication Diagrams are not all that common and some attributes may not be supported by the application.
- One positive aspect of this is that there are no location placement requirements and understanding this may help when brainstorming how communication flow should occur
- Sequence diagrams are more common for use of flow of communication

### Sequence Diagram

- Used to show interactions between objects in a sequential order
- Often generated as an outcome of refinement of use cases
- Useful to stakeholders to understand the system's behaviour
- May be used for designing new systems or depicting interactions in existing systems
- Helps understand how the control/events flow between the objects

#### Participant

- A participant is some part in the system that interacts with other participants
- It is always placed at the top of the diagram
  - participants are arranged horizontally
- Each participant has a corresponding lifeline that runs down the page (the line is dashed)
- The name of the participant is put in the box in the format `object:class`

#### Time

- Ordering is important in a sequence diagram
- The ordering is represented through time as lifelines
- the lifelines run down from the top
- Note that the lifeline does not represent duration

#### Message

- An interaction allows the participants to communicate with each other
- Communication happens through messages
- Specified as an arrow towards the participant accepting the message
- A message can flow from any direction
  - participant to other participant and back
  - participant to self
- A message may optionally show th message signature

#### Activation/Execution Bar

- Participants are shown as boxes with name inside (instance of a class)
- Arrows represent messages
- Activation bar indicates execution and it's optional
- Note that it only represents time, but not duration

#### ![Message Types](images/Screenshot%202023-05-26%20at%203.12.46%20PM.png)

#### Create and Destroy Message

- Create message creates instance of a class
- Shown as stereotype << create >> over the message arrow
- Destroy message destroys the instance
- It is shown as stereotype << destroy >>
  - can be used to show explicit destruction of objects e.g. in C++, we use delete to destroy a heap-based object

### Sequence Diagram Part II

- Sequence diagrams also depict loops, conditional execution, alternative execution, etc
  - Can quickly grow and become unmanageable
- These interactions can be shown through fragments
- A fragment is a box that encloses the portion of the interaction
  - can contain any number of interactions
  - can contain other fragments

Fragment Types:

- `ref`: used to represent an interaction that is defined elsewhere in the model
  - useful when the sequence diagram has too many interactions
- `loop`: loops through interactions within the fragment any number of times (condition is shown as a guard statement)
- `break`: used to break out of a loop fragment (similar to break statement)
- `opt`: the interaction in this fragment is executed only if the guard condition is true

Sequence Vs communication Diagram

- Sequence Diagram:
  - Shows the sequence of ordering of messages
  - Large set of detailed notations
  - Consumes horizontal space
  - Difficult to use during brain storming
  - Message order is depicted clearly
- Communication Diagram
  - Focus on the links and the organization of objects
  - Fewer notation options
  - Requires less space
  - Easy and flexible to draw during brain storming
  - Difficult to see sequence of messages

### Sequence Diagram Part III

- ![Interaction Diagram](images/Screenshot%202023-05-28%20at%209.14.02%20PM.png)
  - Accidentally deleted the frame holding the interaction diagram 
  - the diagram starts with the endpoint of 'new game' 
  - next the game manager will 'make(Player) and make(scene)
  - Once the two have been generated the Loop fragment is generated once health > 0 the generate NPCs message is sent over 
  - Create side object and create traffic vehicle is created 
  - Next the Alt fragment shows that once value = 0 onCollision(player) is sent to the side object where the side object will send a message to itself to show behavior
  - The next step will be do applyDamage(damage,cash) back to the playerCar:Player object
  - More to come on the next model