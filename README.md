# Santander 2024 Backend com Java
Jaba RESTful API criada para o Boot Camp Santander Backend

## Diagrama de Classes do projeto

```mermaid
classDiagram
    class BankUser {
        -String name
        +getAccount(): Account
        +getCard(): Card
        +getFeatures(): List~Feature~
        +getNews(): List~News~
    }

    class Account {
        -String number
        -String agency
        -float balance
        -float limit
        +deposit(amount: float)
        +withdraw(amount: float)
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -float limit
        +makePurchase(amount: float)
    }

    class News {
        -String icon
        -String description
    }

    BankUser  "1"* -- "1" Account 
    BankUser  "1" *-- "1" Card 
    BankUser  "1" *-- "N" Feature 
    BankUser  "1" *-- "N" News 


```
