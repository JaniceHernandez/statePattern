# Vending Machine with State Design Pattern

## Problem Statement
A vending machine needs to manage different states, including **Idle**, **ItemSelected**, **Dispensing**, and **OutOfOrder**. Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like **item inventory** and **balance**.

---

## Requirements

### Idle State
- Allow **item selection**.  
- Disallow **dispensing items** and **inserting coins**.

### ItemSelected State
- Allow **inserting coins** and **dispensing items**.  
- Disallow **item selection**.

### Dispensing State
- Disallow all operations.  
- Automatically transition back to the **Idle** state after dispensing is complete.

### OutOfOrder State
- Disallow **all operations**.

---

## Current System
The current implementation relies on conditional statements within the `VendingMachine` class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

---

## Solution: Implementing State Pattern

### Define VendingMachine States
Create separate classes representing different machine states:  
- `IdleState`  
- `ItemSelectedState`  
- `DispensingState`  
- `OutOfOrderState`  

Each state class will handle its own behavior and transitions.

### Implement State Interface
Define an interface `VendingMachineState` with the following methods:  
- `selectItem()`  
- `insertCoin()`  
- `dispenseItem()`  
- `setOutOfOrder()`

### Implement State Behaviors
Each concrete state implements the `VendingMachineState` interface:
- **IdleState**: allows item selection, disallows other actions.  
- **ItemSelectedState**: allows inserting coins and dispensing items, disallows item selection.  
- **DispensingState**: disallows all operations, automatically transitions to Idle.  
- **OutOfOrderState**: disallows all operations.

### Update VendingMachine Class
- Include **attributes**: `inventory` and `balance`.  
- Remove **state-specific logic**.  
- Introduce a reference to the current `VendingMachineState` object.  
- Delegate actions like `selectItem()`, `insertCoin()`, `dispenseItem()`, and `setOutOfOrder()` to the current state object.

---
## UML Class Diagram
<img width="1972" height="1005" alt="statePattern UML Class Diagram" src="https://github.com/user-attachments/assets/6a43f7f3-b811-4bd6-8f2b-dfd8a3f2587c" />

---
## Components

### Interface: `VendingMachineState`
Defines common methods that all states implement.

### Context Class: `VendingMachine`
- Attributes:  
  - `inventory` (number of items available)  
  - `balance` (amount inserted)  
- Reference to current state: `VendingMachineState state`  
- Delegate methods for actions:  
  - `selectItem()`  
  - `insertCoin()`  
  - `dispenseItem()`  
  - `setOutOfOrder()`

### Concrete States
1. **IdleState**
   - Allows selecting an item.  
   - Disallows inserting coins and dispensing.

2. **ItemSelectedState**
   - Allows inserting coins.  
   - Allows dispensing after inserting coins.  
   - Disallows selecting another item.

3. **DispensingState**
   - Disallows all operations.  
   - Automatically returns to Idle state after dispensing.

4. **OutOfOrderState**
   - Disallows all operations.  

---

This implementation improves **code maintainability** and **flexibility**, as new states can be added without modifying the `VendingMachine` class or adding complex conditional logic.
