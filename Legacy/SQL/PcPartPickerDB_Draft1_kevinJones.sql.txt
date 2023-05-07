CREATE TABLE CPU
(Name CHAR(150) NOT NULL,
Price NUMBER (7,2),
Manufacturer CHAR(20),
Cores CHAR(20),
AverageRatings NUMBER(4,2),
NumofRatings Number (8,2));

INSERT INTO CPU
Values ('Core i7-12700F 12th Generation - 12 Core', 289.99, 'Intel', '12-Core', 5.0, 9);

INSERT INTO CPU
Values ('Ryzen 7 5800X3D 3.4 GHz Eight-Core AM4 Processor', 349.99, 'AMD', '8-Core', 5.0, 54);

INSERT INTO CPU
Values ('Core i9-12900K Desktop Processor 16 (8P+8E)', 432.99, 'Intel', '16-Core', 4.9, 283);

INSERT INTO CPU
Values ('Core i5-13600K 13th Gen 14 cores 6 P-cores + 8 E-cores', 339.99, 'Intel', '14-Core', 4.9, 68);

INSERT INTO CPU
Values ('Ryzen 9 7950X 16-core - 32-Thread 4.5GHz', 599.99, 'AMD', '16-Core', 4.6, 30);

INSERT INTO CPU
Values ('Ryzen 5 4600G Processor - Black', 104.99, 'AMD', '6-Core', 4.8, 4);

INSERT INTO CPU
Values ('Pentium Gold G7400 12th Generation - 2 Core', 89.99, 'Intel', '2-Core', 4.4, 8);

INSERT INTO CPU
Values ('Ryzen 5 5600X 4th Gen 6-core', 169.99, 'AMD', '6-Core', 4.9, 1075);

INSERT INTO CPU
Values ('Core i5-12600K Desktop Processor 10', 233.99, 'Intel', '10-Core', 4.9, 177);

INSERT INTO CPU
Values ('Core i9-10900K 10th Generation 10-core', 343.99, 'Intel', '10-Core', 4.8, 345);

CREATE TABLE Coolers
(Name CHAR(180) NOT NULL,
Price NUMBER (7,2),
Manufacturer CHAR(20),
RPM CHAR(20),
AverageRatings NUMBER(4,2),
NumofRatings Number (7,2));

INSERT INTO Coolers
Values ('iCUE H100i ELITE LCD Display Liquid CPU Cooler', 253.99, 'CORSAIR', '200 RPM', 3.9, 54);

INSERT INTO Coolers
Values ('Hyper 212 RGB Black Edition 120mm CPU Cooling Fan', 52.99, 'Cooler Master', '200 RPM', 4.6, 96);

INSERT INTO Coolers
Values ('Kraken 120', 89.99, 'NZXT', '2500 RPM', 3.8, 29);

INSERT INTO Coolers
Values ('MAG CORELIQUID 240R V2 - AIO ARGB CPU Liquid Cooler', 109.99, 'MSI', '2000 RPM', 4.3, 92);

INSERT INTO Coolers
Values ('Air Series LED AF120 (2018) 120mm Case Cooling Fan Kit', 34.99, 'CORSAIR', '1400 RPM', 4.7, 611);

INSERT INTO Coolers
Values ('Water 3.0 120 120mm Processor Liquid Cooling System', 89.99, 'Thermaltake', '1500 RPM', 4.5, 114);

INSERT INTO Coolers
Values (' Kunai Chroma RGB 140MM LED PWM Performance Fans', 110.99, 'Razer', '2200 RPM', 5.0, 5);

INSERT INTO Coolers
Values ('QL Series 140mm Cooling Fan Kit with RGB Lighting', 119.99, 'CORSAIR', '1250 RPM', 4.9, 31);

INSERT INTO Coolers
Values ('Pure 20 200mm Quiet High Airflow Case Cooling Fan with Anti-Vibration Mounting System', 13.99, 'Thermaltake', '800 RPM', 5.0, 2);

INSERT INTO Coolers
Values ('Kraken X53 240mm Radiator RGB All-in-one CPU Liquid Cooling System', 164.99, 'NZXT', '1500 RPM', 4.9, 21);



CREATE TABLE MotherBoard
(Name CHAR(250) NOT NULL,
Price NUMBER (7,2),
Manufacturer CHAR(20),
FormFactor CHAR(20),
Memory CHAR(40),
Socket CHAR(30),
AverageRatings NUMBER(4,2),
NumofRatings Number (7,2));

INSERT INTO MotherBoard
Values ('B550 GAMING PLUS Socket AM4 USB-C Gen 2', 159.99, 'MSI', 'ATX', '288-pin DIMM', 'Socket AM4', 4.7, 862);

INSERT INTO MotherBoard
Values ('B550 TOMAHAWK MAX WIFI Socket AM4', 199.99, 'MSI', 'ATX', '288-pin DIMM', 'Socket AM4', 4.6, 85);

INSERT INTO MotherBoard
Values ('X670 AORUS ELITE AX Socket AM5', 279.99, 'GIGABYTE', 'ATX', '288-pin DIMM', 'Socket LGA 1718', 4.1, 11);

INSERT INTO MotherBoard
Values ('B650 AORUS ELITE AX Socket AM5', 219.99, 'GIGABYTE', 'ATX', '288-pin DIMM', 'Socket LGA 1718', 4.4, 14);

INSERT INTO MotherBoard
Values ('PRIME Z790-A WIFI Socket LGA 1700', 309.99, 'ASUS', 'ATX', '288-pin DIMM', 'Socket LGA 1700', 4.6, 15);

INSERT INTO MotherBoard
Values ('TUF GAMING X670E-PLUS WIFI Socket AM5', 329.99, 'ASUS', 'ATX', '288-pin DIMM', 'Socket AM5', 4.7, 12);

INSERT INTO MotherBoard
Values ('MPG X670E CARBON WIFI Socket LGA 1718', 479.99, 'MSI', 'ATX', '288-pin DIMM', 'Socket LGA 1718', 5.0, 1);

INSERT INTO MotherBoard
Values ('Z690 Socket LGA 1200', 239.99, 'NZXT', 'ATX', '288-pin DIMM', 'Socket LGA 1700', 4.0, 1);

INSERT INTO MotherBoard
Values ('Z690 AORUS ELITE AX DDR4 Socket 1700', 239.99, 'Gigabyte', 'ATX', '288-pin DIMM', 'Socket LGA 1700', 4.3, 20);

INSERT INTO MotherBoard
Values ('ROG CROSSHAIR X670E HERO USB-C Gen2', 699.99, 'ASUS', 'ATX', '288-pin DIMM', 'Socket AM4', 4.5, 6);

CREATE TABLE Memory
(Name CHAR(250) NOT NULL,
Price NUMBER (7,2),
Manufacturer CHAR(20),
Size Char(30),
Sticks Char(20),
AverageRatings NUMBER(4,2),
ofRatings Number (6,2));

INSERT INTO Memory
Values ('XLR8 Gaming 16GB 2x8GB 3200MHz DDR4 DRAM', 44.99, 'PNY', '16 GB', '2 Sticks', 4.6, 591);

INSERT INTO Memory
Values ('VENGEANCE PRO 32GB 2PK x 16GB 3600MHz DDR4', 92.99, 'CORSAIR', '32 GB', '2 Sticks', 4.8, 1030);

INSERT INTO Memory
Values ('XPG SPECTRIX AX4U360016G18I-DT50 RGB 32GB 3600MHz DDR4', 134.99, 'ADATA', '32 GB', '2 Sticks', 5.0, 1);

INSERT INTO Memory
Values ('VENGEANCE LPX 32GB (2PK x 16GB) 3600MHz DDR4 C18 DIMM', 79.99, 'CORSAIR', '32 GB', '2 Sticks', 4.8, 335);

INSERT INTO Memory
Values ('XLR8 Gaming EPIC-X MD16GK2D4360018XRGB RGB', 59.99, 'PNY', '16 GB', '2 Sticks', 4.8, 35);

INSERT INTO Memory
Values ('XPG Lancer AX5U5200C3816G-DCLABK 32GB', 112.99, 'ADATA', '16 GB', '2 Sticks', 4.1, 8);

INSERT INTO Memory
Values ('VENGEANCE RGB 32GB 2PK 16GB 5600MHz DDR5', 139.99, 'CORSAIR', '32 GB', '2 Sticks', 4.9, 40);

INSERT INTO Memory
Values ('Performance 8GB DDR4 DRAM 3200MHz CL22 SODIMM Notebook/Laptop', 29.99, 'PNY', '8 GB', '1 Sticks', 4.8, 120);

INSERT INTO Memory
Values ('XPG GAMMIX AX4U320016G16A-DCBK20 32GB', 114.99, 'ADATA', '32 GB', '2 Sticks', 5.0, 9);

INSERT INTO Memory
Values ('VENGEANCE 32GB 2PK x 16GB 5600MHz DDR5 C36 DIMM', 124.99, 'CORSAIR', '32 GB', '2 Sticks', 4.8, 61);

CREATE TABLE Storage
(Name CHAR(250) NOT NULL,
Price NUMBER (7,2),
Manufacturer CHAR(20),
Capacity Char(20),
AverageRatings NUMBER(4,2),
ofRatings Number (6,2));

INSERT INTO Storage
Values ('BLACK SN850X 2TB Internal SSD PCIe Gen 4 x4 NVMe', 159.99, 'WD', '2000 GB', 5.0, 53);

INSERT INTO Storage
Values ('easystore 8TB External USB 3.0 Hard Drive', 134.99, 'WD', '8000 GB', 4.7, 6710);

INSERT INTO Storage
Values ('BarraCuda 8TB Internal SATA Hard Drive for Desktops', 119.99, 'Seagate', '8000 GB', 4.6, 157);

INSERT INTO Storage
Values ('970 EVO Plus 2TB Internal SSD PCIe Gen 3 x4 NVMe', 219.99, 'Samsung', '2000 GB', 4.9, 785);

INSERT INTO Storage
Values ('870 EVO 1TB Internal SSD SATA', 64.99, 'Samsung', '1000 GB', 4.9, 1491);

INSERT INTO Storage
Values ('G-DRIVE 6TB External USB-C 3.2 Gen2 Hard Drive', 219.99, 'SanDisk', '6000 GB', 4.4, 11);

INSERT INTO Storage
Values ('T7 Shield 2TB External USB 3.2 Gen 2 Rugged SSD IP65 Water Resistant', 149.99, 'Samsung', '2000 GB', 4.8, 223);

INSERT INTO Storage
Values ('My Passport 4TB External USB 3.0 Portable Hard Drive', 99.99, 'WD', '4000 GB', 4.7, 1426);

INSERT INTO Storage
Values ('P3 4TB Internal SSD PCIe Gen 3 x4 NVMe', 219.99, 'Crucial', '4000 GB', 4.6, 11);

INSERT INTO Storage
Values ('870 QVO 2TB Internal SSD SATA', 149.99, 'Samsung', '2000 GB', 4.9, 779);

CREATE TABLE GPU
(Name CHAR(250) NOT NULL,
Price NUMBER (9,2),
Manufacturer CHAR(20),
Memory CHAR(20),
Length CHAR(20),
Chipset CHAR(120),
AverageRatings NUMBER(4,2),
ofRatings Number (7,2));

INSERT INTO GPU
Values ('NVIDIA GeForce RTX 4070 Ti 12GB GDDR6X PCI Express 4.0 Graphics Card', 819.99, 'PNY', '285 watts', 4.9, 13);

INSERT INTO GPU
Values ('SPEEDSTER SWFT210 AMD Radeon RX 6600 Core 8GB GDDR6 PCI Express 4.0 Gaming Graphics Card', 259.99, 'XFX', '300 watts', 4.6, 229);

INSERT INTO GPU
Values ('NVIDIA GeForce RTX 4070 Ti Gaming OC 12GB GDDR6X PCI Express 4.0 Graphics Card', 849.99, 'GIGABYTE', '285 watts', 3.8, 10);

INSERT INTO GPU
Values ('Speedster SWFT309 AMD Radeon RX 6700XT 12GB GDDR6 PCI Express 4.0 Gaming Graphics Card', 379.99, 'XFX', '300 watts', 4.6, 133);

INSERT INTO GPU
Values ('NVIDIA GeForce GT 1030 2GB PCI-E 3.0 Graphics Card', 121.99, 'PNY', '30 watts', 4.4, 598);

INSERT INTO GPU
Values ('Speedster MERC310 AMD Radeon RX 7900XT 20GB GDDR6 PCI Express 4.0 Gaming Graphics Card', 819.99, 'XFX', '290 watts', 4.3, 37);

INSERT INTO GPU
Values ('NVIDIA Geforce RTX 3050 Gaming X 8G - 8GB GDDR6 - PCI Express 4.0 - Graphics Card', 334.99, 'MSI', '130 watts', 4.8, 92);

INSERT INTO GPU
Values ('AMD Radeon RX 580 GTS XXX Edition 8GB GDDR5 PCI Express 3.0 Graphics Card', 149.99, 'XFX', '500 watts', 4.6, 140);

INSERT INTO GPU
Values ('NVIDIA GeForce RTX 3060 12GB GDDR6 PCI Express 4.0 Graphics Card', 389.99, 'GIGABYTE', '170 watts', 4.8, 201);

INSERT INTO GPU
Values ('NVIDIA GeForce RTX 4080 16GB VENTUS 3X OC 16GB DDR6X PCI Express 4.0 Graphics Card', 1249.99, 'MSI', '320 watts', 4.7, 36);



CREATE TABLE PSU
(PsuName CHAR(250) NOT NULL,
PsuPrice NUMBER (9,2),
PsuManufacturer CHAR(50),
PsuWatts CHAR(20),
PSUAverageRatings NUMBER(4,2),
PSU#ofRatings Number (7,2));

INSERT INTO PSU
Values ('RMe Series RM750e 80 PLUS Gold Fully Modular Low-Noise ATX Power Supply', 99.99, 'CORSAIR', '750 watts', 4.9, 29);

INSERT INTO PSU
Values ('SMART 700W ATX 80 Plus Power Supply', 54.99, 'Thermaltake', '700 watts', 4.6, 1288);

INSERT INTO PSU
Values ('SuperNOVA 1300W GT Power Supply', 269.99, 'EVGA', '1300 watts', 4.6, 70);

INSERT INTO PSU
Values ('CX-M Series CX750M Semi-Modular Low-Noise ATX Power Supply', 89.99, 'CORSAIR', '750 watts', 4.6, 70);

INSERT INTO PSU
Values ('HXi Series HX1500i 80 PLUS Platinum Fully Modular Ultra-Low Noise ATX Power Supply', 374.99, 'CORSAIR', '1500 watts', 4.7, 22);

INSERT INTO PSU
Values ('Toughpower GF3 1200W 80+ Gold PCIe Gen 5 ATX 3.0 Fully Modular Power Supply', 299.99, 'Thermaltake', '1200 watts', 4.6, 3299);

INSERT INTO PSU
Values ('MPG A1000G PCIE 5 1000 Watt ATX 90 Plus Gold PSU Power Supply', 199.99, 'MSI', '1000 watts', 4.2, 39);

INSERT INTO PSU
Values ('GT Series 850W Auto Eco Mode with FDB Fan 80 Plus Power Supply', 159.99, 'EVGA', '850 watts', 4.7, 101);

INSERT INTO PSU
Values ('C-850 ATX Gaming Power Supply', 139.99, 'NZXT', '850 watts', 5.0, 17);

INSERT INTO PSU
Values ('Toughpower GF3 1350W 80+ Gold PCIe Gen 5 ATX 3.0 Fully Modular Power Supply', 259.99, 'Thermaltake', '1350 watts', 4.6, 3296);


CREATE TABLE Case
(CaseName CHAR(250) NOT NULL,
CaseManufacturer CHAR(120),
CaseColor Char(30),
CasePrice NUMBER (7,2),
GPULimitIn CHAR (50),
MotherboardCompatability Char (50),
CaseAverageRatings NUMBER(4,2),
Case#ofRatings Number (7,2));

INSERT INTO Case
Values ('Carbide Series SPEC-DELTA RGB Tempered Glass Mid-Tower ATX Gaming Case', 'CORSAIR', 'Black', 84.99, '12.9 in', 'ATX', 4.3, 240);

INSERT INTO Case
Values ('H7 ATX Mid-Tower Case', 'NZXT', 'White', 129.99, '15.7 in', 'EATX', 4.7, 11);

INSERT INTO Case
Values ('MPG VELOX 100R ATX Mid-Tower Case', 'MSI', 'Black', 139.99, '15 in', 'ATX', 4.5, 42);

INSERT INTO Case
Values ('iCUE 220T RGB Airflow ATX Mid-Tower Smart Case', 'CORSAIR', 'Black', 109.99, '7.1 in', 'ATX', 4.6, 1174);

INSERT INTO Case
Values ('H1 SFF Mini ITX Mini Tower Case with PSU, AIO, Fan Controller and PCIE Extender', 'NZXT', 'White', 399.99, '12.1 in', 'Mini-ITX', 4.3, 30);

INSERT INTO Case
Values ('Y40 ATX Mid-Tower Case with PCIe 4.0 Riser Cable', 'HYTE', 'Black', 149.99, '16.6 in', 'ATX', 5.0, 9);

INSERT INTO Case
Values ('Versa Micro ATX Tower Case', 'Thermaltake', 'Black', 44.99, '13.7 in', 'microATX', 4.7, 7);

INSERT INTO Case
Values ('HYTE Y60 Computer Case', 'iBUYPOWER', 'Red', 199.99, '14.7 in', 'ATX', 5.0, 5);

INSERT INTO Case
Values ('H710 eATX Mid-Tower Case with Tempered Glass', 'NZXT', 'White', 118.99, '16.2 in', 'EATX', 4.8, 17);

INSERT INTO Case
Values ('iCUE 5000X ATX RGB Tempered Glass Mid-Tower', 'CORSAIR', 'White', 189.99, '15.7 in', 'ATX', 4.7, 222);










