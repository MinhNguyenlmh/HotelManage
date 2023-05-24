create database  if not exists ksan;
use ksan;

create table if not exists Rooms(
	RNumber int,
	Name varchar(50) primary Key,
	Type varchar(30), 
	Status varchar(20), 
	Price int(30)
 );
 
create table if not exists Customers(
	CNumber int primary Key,
	Name varchar(50),
	Phone varchar(50),
	Gender varchar(50),
	Address varchar(50),
	Birth varchar(50)
);
create table if not exists Employee(
	ENumber int primary Key,
	Name varchar(50),
	Phone varchar(50),
	Gender varchar(50),
	Address varchar(50),
	Birth varchar(50),
    Job varchar(50),
    Salary float
);

create table if not exists Booking(
	BNumber int primary key, 
	Room varchar(50),
	foreign key(Room) references Rooms(Name), 
	Customer int, 
	foreign key (Customer) references Customers(CNumber), 
	Date varchar(50), 
	Duration int, 
	Cost int
);