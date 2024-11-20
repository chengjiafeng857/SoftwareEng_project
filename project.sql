CREATE TABLE Portfolio (
    PortfolioId int(10) NOT NULL AUTO_INCREMENT, TotalInvestment double NOT NULL, 
    TotalEarning double NOT NULL, 
    PRIMARY KEY (PortfolioId));
CREATE TABLE `User` (
    UserId int(10) NOT NULL AUTO_INCREMENT,
    Name varchar(255), BirthDate date, 
    Risklevel int(10) NOT NULL, 
    PortfolioId int(10) NOT NULL, 
    PRIMARY KEY (UserId));
CREATE TABLE Card (
    CardNum varchar(255) NOT NULL, 
    BankName varchar(255), UserId int(10), 
    PRIMARY KEY (CardNum));
CREATE TABLE `Order` (OrderId varchar(255) NOT NULL, 
    OderDate date, Amount double NOT NULL, ProductId varchar(255), 
    OrderState int(10) NOT NULL, UserId int(10), 
    RedeemCardNum varchar(255), 
    PaymentCardNum varchar(255), 
    Discriminator varchar(255) NOT NULL, 
    PRIMARY KEY (OrderId));
CREATE TABLE Product (
    ProductId varchar(255) NOT NULL, 
    ExchangeId varchar(255), 
    ProductName varchar(255), 
    InterestRate double NOT NULL, 
    RiskLevel int(10) NOT NULL, 
    PRIMARY KEY (ProductId));
CREATE TABLE Exchange (
    ExchangeId varchar(255) NOT NULL, 
    ExchangeName varchar(255), 
    PRIMARY KEY (ExchangeId));

ALTER TABLE Card 
ADD CONSTRAINT FKCard379458 
FOREIGN KEY (UserId) REFERENCES `User` (UserId);
ALTER TABLE `User` 
ADD CONSTRAINT FKUser177279 
FOREIGN KEY (PortfolioId) REFERENCES Portfolio (PortfolioId);
ALTER TABLE `Order` 
ADD CONSTRAINT FKOrder740362 
FOREIGN KEY (UserId) REFERENCES `User` (UserId);
ALTER TABLE `Order` 
ADD CONSTRAINT FKOrder60782 
FOREIGN KEY (ProductId) REFERENCES Product (ProductId);
ALTER TABLE Product 
ADD CONSTRAINT FKProduct30407 
FOREIGN KEY (ExchangeId) REFERENCES Exchange (ExchangeId);
