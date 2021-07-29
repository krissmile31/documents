-- MySQL dump 10.16  Distrib 10.1.26-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: db
-- ------------------------------------------------------
-- Server version	10.1.26-MariaDB-0+deb9u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_attribute`
--

DROP TABLE IF EXISTS `t_attribute`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_attribute` (
  `Object_ID` tinyint(4) DEFAULT NULL,
  `Name` varchar(17) DEFAULT NULL,
  `Scope` varchar(7) DEFAULT NULL,
  `Stereotype` varchar(0) DEFAULT NULL,
  `Containment` varchar(13) DEFAULT NULL,
  `IsStatic` tinyint(4) DEFAULT NULL,
  `IsCollection` tinyint(4) DEFAULT NULL,
  `IsOrdered` tinyint(4) DEFAULT NULL,
  `AllowDuplicates` tinyint(4) DEFAULT NULL,
  `LowerBound` tinyint(4) DEFAULT NULL,
  `UpperBound` tinyint(4) DEFAULT NULL,
  `Container` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Derived` varchar(0) DEFAULT NULL,
  `ID` tinyint(4) DEFAULT NULL,
  `Pos` tinyint(4) DEFAULT NULL,
  `GenOption` varchar(0) DEFAULT NULL,
  `Length` varchar(0) DEFAULT NULL,
  `Precision` varchar(0) DEFAULT NULL,
  `Scale` varchar(0) DEFAULT NULL,
  `Const` varchar(0) DEFAULT NULL,
  `Style` varchar(0) DEFAULT NULL,
  `Classifier` varchar(1) DEFAULT NULL,
  `Default` varchar(0) DEFAULT NULL,
  `Type` varchar(7) DEFAULT NULL,
  `ea_guid` varchar(38) DEFAULT NULL,
  `StyleEx` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_attribute`
--

LOCK TABLES `t_attribute` WRITE;
/*!40000 ALTER TABLE `t_attribute` DISABLE KEYS */;
INSERT INTO `t_attribute` VALUES (4,'name','Private','','Not Specified',0,0,0,0,1,1,'','','',1,0,'','','','','','','0','','string','{C51DFF1B-CFE3-48fb-8AC9-032E43A8F431}','volatile=0;'),(4,'price','Private','','Not Specified',0,0,0,0,1,1,'','','',2,1,'','','','','','','','','int','{A4A54798-A1AA-49a5-BC4B-61CB45C9B2F8}','volatile=0;'),(5,'username','Private','','Not Specified',0,0,0,0,1,1,'','','',3,0,'','','','','','','0','','string','{EA8EFD67-EDBC-4f93-AC0E-38909AD524D4}','volatile=0;'),(5,'password','Private','','Not Specified',0,0,0,0,1,1,'','','',4,1,'','','','','','','0','','string','{F647BFE4-5230-41dc-B03F-9E2D3CC627AA}','volatile=0;'),(5,'isAdmin','Private','','Not Specified',0,0,0,0,1,1,'','','',5,2,'','','','','','','0','','bool','{8381718D-5A24-4df6-A8E6-0DC5ACDAA29C}','volatile=0;'),(6,'name','Private','','Not Specified',0,0,0,0,1,1,'','','',6,0,'','','','','','','0','','string','{9CE21AC3-B67B-42eb-A774-255757EB77E3}','volatile=0;'),(6,'accountID','Private','','Not Specified',0,0,0,0,1,1,'','','',7,1,'','','','','','','0','','int','{91325641-A4AA-43e0-A9DF-4EA42DCD017A}','volatile=0;'),(7,'productIDList','Private','','Not Specified',0,0,0,0,1,1,'','','',9,0,'','','','','','','0','','string','{F3557060-6180-455c-8ADC-3ED363058FC5}','volatile=0;'),(7,'time','Private','','Not Specified',0,0,0,0,1,1,'','','',10,1,'','','','','','','0','','Time','{D57D52F9-18A6-4fc0-B118-8A72991C8185}','volatile=0;'),(7,'date','Private','','Not Specified',0,0,0,0,1,1,'','','',11,2,'','','','','','','0','','Date','{17AF2510-EBCB-4dd9-B1DE-BEE93AB5FEB2}','volatile=0;'),(6,'address','Private','','Not Specified',0,0,0,0,1,1,'','','',25,2,'','','','','','','0','','string','{713FB36B-BFF5-4ad1-9E2D-97E9A2510F2E}','volatile=0;'),(7,'productAmountList','Private','','Not Specified',0,0,0,0,1,1,'','','',26,5,'','','','','','','0','','string','{BEF55F67-A907-4c10-B779-CB95CCC223ED}','volatile=0;'),(5,'id','Private','','Not Specified',0,0,0,0,1,1,'','','',13,3,'','','','','','','','','int','{E6556A3B-2357-4741-A72B-DF860083413F}','volatile=0;'),(7,'userName','Private','','Not Specified',0,0,0,0,1,1,'','','',14,4,'','','','','','','0','','string','{B528DF02-96EF-4c36-95B2-F68192E24F2B}','volatile=0;'),(7,'status','Private','','Not Specified',0,0,0,0,1,1,'','','',15,5,'','','','','','','0','','string','{CAA1CDF0-C5E1-4338-80B0-0EEB43F2F001}','volatile=0;'),(4,'id','Private','','Not Specified',0,0,0,0,1,1,'','','',16,2,'','','','','','','','','int','{0EE7283C-832E-4a7e-AD7F-FA8A01F5FEE5}','volatile=0;'),(15,'account','Private','','Not Specified',0,0,0,0,1,1,'','','',23,0,'','','','','','','0','','Account','{3A58BE84-D6D1-496d-A6F0-A5EBDB25A416}','volatile=0;'),(15,'name','Private','','Not Specified',0,0,0,0,1,1,'','','',24,1,'','','','','','','0','','string','{ED5C9353-851B-462a-B569-168170A83A62}','volatile=0;'),(7,'totalPrice','Private','','Not Specified',0,0,0,0,1,1,'','','',27,6,'','','','','','','','','int','{7D2D2CE9-03F2-4452-8D01-B53E0047EDAE}','volatile=0;');
/*!40000 ALTER TABLE `t_attribute` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_attributeconstraints`
--

DROP TABLE IF EXISTS `t_attributeconstraints`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_attributeconstraints` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `Constraint` varchar(0) DEFAULT NULL,
  `AttName` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `ID` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_attributeconstraints`
--

LOCK TABLES `t_attributeconstraints` WRITE;
/*!40000 ALTER TABLE `t_attributeconstraints` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_attributeconstraints` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_attributetag`
--

DROP TABLE IF EXISTS `t_attributetag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_attributetag` (
  `PropertyID` varchar(0) DEFAULT NULL,
  `ElementID` varchar(0) DEFAULT NULL,
  `Property` varchar(0) DEFAULT NULL,
  `VALUE` varchar(0) DEFAULT NULL,
  `NOTES` varchar(0) DEFAULT NULL,
  `ea_guid` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_attributetag`
--

LOCK TABLES `t_attributetag` WRITE;
/*!40000 ALTER TABLE `t_attributetag` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_attributetag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_authors`
--

DROP TABLE IF EXISTS `t_authors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_authors` (
  `AuthorName` varchar(0) DEFAULT NULL,
  `Roles` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_authors`
--

LOCK TABLES `t_authors` WRITE;
/*!40000 ALTER TABLE `t_authors` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_authors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_cardinality`
--

DROP TABLE IF EXISTS `t_cardinality`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_cardinality` (
  `Cardinality` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_cardinality`
--

LOCK TABLES `t_cardinality` WRITE;
/*!40000 ALTER TABLE `t_cardinality` DISABLE KEYS */;
INSERT INTO `t_cardinality` VALUES ('*'),('0'),('0..*'),('0..1'),('1'),('1..'),('1..*');
/*!40000 ALTER TABLE `t_cardinality` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_category`
--

DROP TABLE IF EXISTS `t_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_category` (
  `CategoryID` varchar(0) DEFAULT NULL,
  `Name` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL,
  `NOTES` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_category`
--

LOCK TABLES `t_category` WRITE;
/*!40000 ALTER TABLE `t_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_clients`
--

DROP TABLE IF EXISTS `t_clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_clients` (
  `Name` varchar(0) DEFAULT NULL,
  `Organisation` varchar(0) DEFAULT NULL,
  `Phone1` varchar(0) DEFAULT NULL,
  `Phone2` varchar(0) DEFAULT NULL,
  `Mobile` varchar(0) DEFAULT NULL,
  `Fax` varchar(0) DEFAULT NULL,
  `Email` varchar(0) DEFAULT NULL,
  `Roles` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_clients`
--

LOCK TABLES `t_clients` WRITE;
/*!40000 ALTER TABLE `t_clients` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_complexitytypes`
--

DROP TABLE IF EXISTS `t_complexitytypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_complexitytypes` (
  `Complexity` varchar(7) DEFAULT NULL,
  `NumericWeight` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_complexitytypes`
--

LOCK TABLES `t_complexitytypes` WRITE;
/*!40000 ALTER TABLE `t_complexitytypes` DISABLE KEYS */;
INSERT INTO `t_complexitytypes` VALUES ('Extreme',6),('High',4),('Low',2),('Medium',3),('V.High',5),('V.Low',1);
/*!40000 ALTER TABLE `t_complexitytypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_connector`
--

DROP TABLE IF EXISTS `t_connector`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_connector` (
  `Connector_ID` varchar(0) DEFAULT NULL,
  `Name` varchar(0) DEFAULT NULL,
  `Direction` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Connector_Type` varchar(0) DEFAULT NULL,
  `SubType` varchar(0) DEFAULT NULL,
  `SourceCard` varchar(0) DEFAULT NULL,
  `SourceAccess` varchar(0) DEFAULT NULL,
  `SourceElement` varchar(0) DEFAULT NULL,
  `DestCard` varchar(0) DEFAULT NULL,
  `DestAccess` varchar(0) DEFAULT NULL,
  `DestElement` varchar(0) DEFAULT NULL,
  `SourceRole` varchar(0) DEFAULT NULL,
  `SourceRoleType` varchar(0) DEFAULT NULL,
  `SourceRoleNote` varchar(0) DEFAULT NULL,
  `SourceContainment` varchar(0) DEFAULT NULL,
  `SourceIsAggregate` varchar(0) DEFAULT NULL,
  `SourceIsOrdered` varchar(0) DEFAULT NULL,
  `SourceQualifier` varchar(0) DEFAULT NULL,
  `DestRole` varchar(0) DEFAULT NULL,
  `DestRoleType` varchar(0) DEFAULT NULL,
  `DestRoleNote` varchar(0) DEFAULT NULL,
  `DestContainment` varchar(0) DEFAULT NULL,
  `DestIsAggregate` varchar(0) DEFAULT NULL,
  `DestIsOrdered` varchar(0) DEFAULT NULL,
  `DestQualifier` varchar(0) DEFAULT NULL,
  `Start_Object_ID` varchar(0) DEFAULT NULL,
  `End_Object_ID` varchar(0) DEFAULT NULL,
  `Top_Start_Label` varchar(0) DEFAULT NULL,
  `Top_Mid_Label` varchar(0) DEFAULT NULL,
  `Top_End_Label` varchar(0) DEFAULT NULL,
  `Btm_Start_Label` varchar(0) DEFAULT NULL,
  `Btm_Mid_Label` varchar(0) DEFAULT NULL,
  `Btm_End_Label` varchar(0) DEFAULT NULL,
  `Start_Edge` varchar(0) DEFAULT NULL,
  `End_Edge` varchar(0) DEFAULT NULL,
  `PtStartX` varchar(0) DEFAULT NULL,
  `PtStartY` varchar(0) DEFAULT NULL,
  `PtEndX` varchar(0) DEFAULT NULL,
  `PtEndY` varchar(0) DEFAULT NULL,
  `SeqNo` varchar(0) DEFAULT NULL,
  `HeadStyle` varchar(0) DEFAULT NULL,
  `LineStyle` varchar(0) DEFAULT NULL,
  `RouteStyle` varchar(0) DEFAULT NULL,
  `IsBold` varchar(0) DEFAULT NULL,
  `LineColor` varchar(0) DEFAULT NULL,
  `Stereotype` varchar(0) DEFAULT NULL,
  `VirtualInheritance` varchar(0) DEFAULT NULL,
  `LinkAccess` varchar(0) DEFAULT NULL,
  `PDATA1` varchar(0) DEFAULT NULL,
  `PDATA2` varchar(0) DEFAULT NULL,
  `PDATA3` varchar(0) DEFAULT NULL,
  `PDATA4` varchar(0) DEFAULT NULL,
  `PDATA5` varchar(0) DEFAULT NULL,
  `DiagramID` varchar(0) DEFAULT NULL,
  `ea_guid` varchar(0) DEFAULT NULL,
  `SourceConstraint` varchar(0) DEFAULT NULL,
  `DestConstraint` varchar(0) DEFAULT NULL,
  `SourceIsNavigable` varchar(0) DEFAULT NULL,
  `DestIsNavigable` varchar(0) DEFAULT NULL,
  `IsRoot` varchar(0) DEFAULT NULL,
  `IsLeaf` varchar(0) DEFAULT NULL,
  `IsSpec` varchar(0) DEFAULT NULL,
  `SourceChangeable` varchar(0) DEFAULT NULL,
  `DestChangeable` varchar(0) DEFAULT NULL,
  `SourceTS` varchar(0) DEFAULT NULL,
  `DestTS` varchar(0) DEFAULT NULL,
  `StateFlags` varchar(0) DEFAULT NULL,
  `ActionFlags` varchar(0) DEFAULT NULL,
  `IsSignal` varchar(0) DEFAULT NULL,
  `IsStimulus` varchar(0) DEFAULT NULL,
  `DispatchAction` varchar(0) DEFAULT NULL,
  `Target2` varchar(0) DEFAULT NULL,
  `StyleEx` varchar(0) DEFAULT NULL,
  `SourceStereotype` varchar(0) DEFAULT NULL,
  `DestStereotype` varchar(0) DEFAULT NULL,
  `SourceStyle` varchar(0) DEFAULT NULL,
  `DestStyle` varchar(0) DEFAULT NULL,
  `EventFlags` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_connector`
--

LOCK TABLES `t_connector` WRITE;
/*!40000 ALTER TABLE `t_connector` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_connector` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_connectorconstraint`
--

DROP TABLE IF EXISTS `t_connectorconstraint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_connectorconstraint` (
  `ConnectorID` varchar(0) DEFAULT NULL,
  `Constraint` varchar(0) DEFAULT NULL,
  `ConstraintType` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_connectorconstraint`
--

LOCK TABLES `t_connectorconstraint` WRITE;
/*!40000 ALTER TABLE `t_connectorconstraint` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_connectorconstraint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_connectortag`
--

DROP TABLE IF EXISTS `t_connectortag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_connectortag` (
  `PropertyID` varchar(0) DEFAULT NULL,
  `ElementID` varchar(0) DEFAULT NULL,
  `Property` varchar(0) DEFAULT NULL,
  `VALUE` varchar(0) DEFAULT NULL,
  `NOTES` varchar(0) DEFAULT NULL,
  `ea_guid` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_connectortag`
--

LOCK TABLES `t_connectortag` WRITE;
/*!40000 ALTER TABLE `t_connectortag` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_connectortag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_connectortypes`
--

DROP TABLE IF EXISTS `t_connectortypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_connectortypes` (
  `Connector_Type` varchar(19) DEFAULT NULL,
  `Description` varchar(19) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_connectortypes`
--

LOCK TABLES `t_connectortypes` WRITE;
/*!40000 ALTER TABLE `t_connectortypes` DISABLE KEYS */;
INSERT INTO `t_connectortypes` VALUES ('Abstraction','Abstraction'),('Aggregation','Aggregation'),('Assembly','Assembly'),('Association','Association'),('Collaboration','Collaboration'),('CommunicationPath','CommunicationPath'),('Connector','Composite Connector'),('ControlFlow','ControlFlow'),('Delegate','Delegate'),('Dependency','Dependency'),('Deployment','Deployment'),('ERLink','ERLink'),('Extension','Extension'),('Generalization','Generalization'),('InformationFlow','InformationFlow'),('Instantiation','Instantiation'),('InterruptFlow','InterruptFlow'),('Manifest','Manifest'),('Nesting','Nesting'),('NoteLink','NoteLink'),('ObjectFlow','ObjectFlow'),('Package','Package'),('ProtocolConformance','ProtocolConformance'),('ProtocolTransition','ProtocolTransition'),('Realisation','Realisation'),('Sequence','Sequence'),('StateFlow','StateFlow'),('Substitution','Substitution'),('Usage','Usage'),('UseCase','UseCase');
/*!40000 ALTER TABLE `t_connectortypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_constants`
--

DROP TABLE IF EXISTS `t_constants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_constants` (
  `ConstantName` varchar(11) DEFAULT NULL,
  `ConstantValue` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_constants`
--

LOCK TABLES `t_constants` WRITE;
/*!40000 ALTER TABLE `t_constants` DISABLE KEYS */;
INSERT INTO `t_constants` VALUES ('CompanyName','Sparx Systems'),('ECF_EC','1.4'),('ECF_EWF','-0.03'),('HoursPerUCP','20'),('ProjectName','DOJ'),('TCF_TC','0.6'),('TCF_TWF','0.01');
/*!40000 ALTER TABLE `t_constants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_constrainttypes`
--

DROP TABLE IF EXISTS `t_constrainttypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_constrainttypes` (
  `Constraint` varchar(14) DEFAULT NULL,
  `Description` varchar(36) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_constrainttypes`
--

LOCK TABLES `t_constrainttypes` WRITE;
/*!40000 ALTER TABLE `t_constrainttypes` DISABLE KEYS */;
INSERT INTO `t_constrainttypes` VALUES ('Invariant','A state the object must always be in',''),('Post-condition','An ending state that must be met',''),('Pre-condition','A starting state that must be met',''),('Process','A process that must occur','');
/*!40000 ALTER TABLE `t_constrainttypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_datatypes`
--

DROP TABLE IF EXISTS `t_datatypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_datatypes` (
  `Type` varchar(4) DEFAULT NULL,
  `ProductName` varchar(15) DEFAULT NULL,
  `DataType` varchar(30) DEFAULT NULL,
  `Size` tinyint(4) DEFAULT NULL,
  `MaxLen` varchar(10) DEFAULT NULL,
  `MaxPrec` varchar(4) DEFAULT NULL,
  `MaxScale` smallint(6) DEFAULT NULL,
  `DefaultLen` varchar(7) DEFAULT NULL,
  `DefaultPrec` varchar(2) DEFAULT NULL,
  `DefaultScale` varchar(1) DEFAULT NULL,
  `User` tinyint(4) DEFAULT NULL,
  `PDATA1` varchar(0) DEFAULT NULL,
  `PDATA2` varchar(0) DEFAULT NULL,
  `PDATA3` varchar(0) DEFAULT NULL,
  `PDATA4` varchar(0) DEFAULT NULL,
  `HasLength` varchar(0) DEFAULT NULL,
  `GenericType` varchar(30) DEFAULT NULL,
  `DatatypeID` smallint(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_datatypes`
--

LOCK TABLES `t_datatypes` WRITE;
/*!40000 ALTER TABLE `t_datatypes` DISABLE KEYS */;
INSERT INTO `t_datatypes` VALUES ('DDL','Oracle','CHAR',1,'2000','0',0,'1','0','0',0,'','','','','','char',1),('DDL','Oracle','VARCHAR2',1,'4000','0',0,'50','0','0',0,'','','','','','varchar',2),('DDL','Oracle','VARCHAR',1,'4000','0',0,'50','0','0',0,'','','','','','varchar',3),('DDL','Oracle','NCHAR',1,'2000','0',0,'50','0','0',0,'','','','','','nchar',4),('DDL','Oracle','NVARCHAR',1,'4000','0',0,'50','0','0',0,'','','','','','nvarchar',5),('DDL','Oracle','FLOAT',1,'126','0',0,'126','0','0',0,'','','','','','float',6),('DDL','Oracle','NUMBER',2,'0','38',0,'0','8','2',0,'','','','','','number',7),('DDL','Oracle','DATE',0,'0','0',0,'0','0','0',0,'','','','','','datetime',8),('DDL','Oracle','ROWID',0,'0','0',0,'0','0','0',0,'','','','','','uniqueidentifier',9),('DDL','Oracle','RAW',1,'2000','0',0,'2000','0','0',0,'','','','','','binary',10),('DDL','Oracle','LONG RAW',0,'0','0',0,'0','0','0',0,'','','','','','binary',11),('DDL','Oracle','CLOB',0,'0','0',0,'0','0','0',0,'','','','','','text',12),('DDL','Oracle','LONG',0,'0','0',0,'0','0','0',0,'','','','','','long',13),('DDL','Oracle','NCLOB',0,'0','0',0,'0','0','0',0,'','','','','','ntext',15),('DDL','Oracle','BLOB',0,'0','0',0,'0','0','0',0,'','','','','','blob',16),('DDL','Oracle','BFILE',0,'0','0',0,'0','0','0',0,'','','','','','blob',17),('DDL','SQLServer7','binary',1,'8000','0',0,'10','0','0',0,'','','','','','binary',18),('DDL','SQLServer7','bit',0,'0','0',0,'0','0','0',0,'','','','','','boolean',19),('DDL','SQLServer7','char',1,'8000','0',0,'1','0','0',0,'','','','','','char',20),('DDL','SQLServer7','datetime',0,'0','0',0,'0','0','0',0,'','','','','','DateTime',21),('DDL','SQLServer7','decimal',2,'0','38',0,'0','18','0',0,'','','','','','decimal',22),('DDL','SQLServer7','float',1,'53','0',0,'53','0','0',0,'','','','','','float',23),('DDL','SQLServer7','image',0,'0','0',0,'0','0','0',0,'','','','','','binary',24),('DDL','SQLServer7','int',0,'0','0',0,'0','0','0',0,'','','','','','integer',25),('DDL','SQLServer7','money',0,'0','0',0,'0','0','0',0,'','','','','','currency',26),('DDL','SQLServer7','nchar',1,'4000','0',0,'10','0','0',0,'','','','','','nchar',27),('DDL','SQLServer7','ntext',0,'0','0',0,'0','0','0',0,'','','','','','ntext',28),('DDL','SQLServer7','nvarchar',1,'4000','0',0,'50','0','0',0,'','','','','','nvarchar',29),('DDL','SQLServer7','numeric',2,'0','38',0,'0','18','0',0,'','','','','','numeric',30),('DDL','SQLServer7','real',0,'0','0',0,'0','0','0',0,'','','','','','real',31),('DDL','SQLServer7','smalldatetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',32),('DDL','SQLServer7','smallint',0,'0','0',0,'0','0','0',0,'','','','','','smallint',33),('DDL','SQLServer7','smallmoney',0,'0','0',0,'0','0','0',0,'','','','','','money',34),('DDL','SQLServer7','text',0,'0','0',0,'0','0','0',0,'','','','','','text',35),('DDL','SQLServer7','timestamp',0,'0','0',0,'0','0','0',0,'','','','','','timestamp',36),('DDL','SQLServer7','tinyint',0,'0','0',0,'0','0','0',0,'','','','','','tinyint',37),('DDL','SQLServer7','varchar',1,'8000','0',0,'50','0','0',0,'','','','','','varchar',38),('DDL','SQLServer7','varbinary',1,'8000','0',0,'50','0','0',0,'','','','','','varbinary',39),('DDL','SQLServer7','uniqueidentifier',0,'0','0',0,'0','0','0',0,'','','','','','uniqueidentifier',40),('DDL','MSAccess','Text',1,'255','0',0,'50','0','0',0,'','','','','','char',41),('DDL','MSAccess','Memo',0,'65535','0',0,'0','0','0',0,'','','','','','text',42),('DDL','MSAccess','DateTime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',43),('DDL','MSAccess','Integer',0,'0','0',0,'0','0','0',0,'','','','','','integer',45),('DDL','MSAccess','Long',0,'0','0',0,'0','0','0',0,'','','','','','long',46),('DDL','MSAccess','Single',0,'0','7',0,'0','0','7',0,'','','','','','float',47),('DDL','MSAccess','Double',0,'0','0',0,'0','0','0',0,'','','','','','double',48),('DDL','MSAccess','Counter',0,'0','0',0,'0','0','0',0,'','','','','','counter',49),('DDL','MSAccess','YesNo',0,'0','0',0,'0','0','0',0,'','','','','','boolean',50),('Code','Visual Basic','Boolean',0,'0','0',0,'0','0','0',0,'','','','','','Boolean',51),('Code','Visual Basic','Byte',0,'0','0',0,'0','0','0',0,'','','','','','Byte',52),('Code','Visual Basic','Currency',0,'0','0',0,'0','0','0',0,'','','','','','Currency',53),('DDL','MSAccess','Currency',0,'0','0',0,'0','0','0',0,'','','','','','currency',954),('Code','Visual Basic','Date',0,'0','0',0,'0','0','0',0,'','','','','','DateTime',54),('Code','Visual Basic','Double',0,'0','0',0,'0','0','0',0,'','','','','','Double',55),('Code','Visual Basic','Integer',0,'0','0',0,'0','0','0',0,'','','','','','Integer',56),('Code','Visual Basic','Long',0,'0','0',0,'0','0','0',0,'','','','','','Long',57),('Code','Visual Basic','Object',0,'0','0',0,'0','0','0',0,'','','','','','',58),('Code','Visual Basic','Single',0,'0','0',0,'0','0','0',0,'','','','','','',59),('Code','Visual Basic','String',0,'0','0',0,'0','0','0',0,'','','','','','String',60),('Code','Visual Basic','Variant',0,'0','0',0,'0','0','0',0,'','','','','','Variant',61),('Code','C++','char',0,'0','0',0,'0','0','0',0,'','','','','','Char',62),('Code','C++','int',0,'0','0',0,'0','0','0',0,'','','','','','Integer',63),('Code','C++','short',0,'0','0',0,'0','0','0',0,'','','','','','Short',64),('Code','C++','long',0,'0','0',0,'0','0','0',0,'','','','','','Long',65),('Code','C++','float',0,'0','0',0,'0','0','0',0,'','','','','','Float',66),('Code','C++','double',0,'0','0',0,'0','0','0',0,'','','','','','Double',67),('Code','C++','void',0,'0','0',0,'0','0','0',0,'','','','','','',68),('Code','C++','unsigned char',0,'0','0',0,'0','0','0',0,'','','','','','',69),('Code','C++','unsigned int',0,'0','0',0,'0','0','0',0,'','','','','','Uint',70),('Code','C++','unsigned short',0,'0','0',0,'0','0','0',0,'','','','','','',71),('Code','C++','unsigned long',0,'0','0',0,'0','0','0',0,'','','','','','Ulong',72),('Code','Java','byte',0,'0','0',0,'0','0','0',0,'','','','','','Byte',73),('Code','Java','char',0,'0','0',0,'0','0','0',0,'','','','','','Char',74),('Code','Java','int',0,'0','0',0,'0','0','0',0,'','','','','','Integer',75),('Code','Java','short',0,'0','0',0,'0','0','0',0,'','','','','','Short',76),('Code','Java','boolean',0,'0','0',0,'0','0','0',0,'','','','','','Boolean',77),('Code','Java','long',0,'0','0',0,'0','0','0',0,'','','','','','Long',78),('Code','Java','float',0,'0','0',0,'0','0','0',0,'','','','','','Float',79),('Code','Java','double',0,'0','0',0,'0','0','0',0,'','','','','','Double',80),('Code','Delphi','Boolean',0,'0','0',0,'0','0','0',0,'','','','','','Boolean',81),('Code','Delphi','Byte',0,'0','0',0,'0','0','0',0,'','','','','','Byte',82),('Code','Delphi','Cardinal',0,'0','0',0,'0','0','0',0,'','','','','','',83),('Code','Delphi','Char',0,'0','0',0,'0','0','0',0,'','','','','','Char',84),('Code','Delphi','Currency',0,'0','0',0,'0','0','0',0,'','','','','','Currency',85),('Code','Delphi','Double',0,'0','0',0,'0','0','0',0,'','','','','','Double',86),('Code','Delphi','Extended',0,'0','0',0,'0','0','0',0,'','','','','','',87),('Code','Delphi','Integer',0,'0','0',0,'0','0','0',0,'','','','','','Integer',88),('Code','Delphi','LongInt',0,'0','0',0,'0','0','0',0,'','','','','','',89),('Code','Delphi','LongWord',0,'0','0',0,'0','0','0',0,'','','','','','Ulong',90),('Code','Delphi','Single',0,'0','0',0,'0','0','0',0,'','','','','','',91),('Code','Delphi','ShortInt',0,'0','0',0,'0','0','0',0,'','','','','','',92),('Code','Delphi','SmallInt',0,'0','0',0,'0','0','0',0,'','','','','','',93),('Code','Delphi','String',0,'0','0',0,'0','0','0',0,'','','','','','String',94),('Code','Delphi','Real',0,'0','0',0,'0','0','0',0,'','','','','','',95),('Code','Delphi','Variant',0,'0','0',0,'0','0','0',0,'','','','','','Variant',96),('Code','Delphi','Word',0,'0','0',0,'0','0','0',0,'','','','','','Word',98),('Code','C#','void',0,'0','0',0,'0','0','0',0,'','','','','','',99),('Code','C#','sbyte',0,'0','0',0,'0','0','0',0,'','','','','','',100),('Code','C#','byte',0,'0','0',0,'0','0','0',0,'','','','','','Byte',101),('Code','C#','short',0,'0','0',0,'0','0','0',0,'','','','','','Short',102),('Code','C#','ushort',0,'0','0',0,'0','0','0',0,'','','','','','Ushort',103),('Code','C#','int',0,'0','0',0,'0','0','0',0,'','','','','','Integer',104),('Code','C#','uint',0,'0','0',0,'0','0','0',0,'','','','','','Uint',105),('Code','C#','long',0,'0','0',0,'0','0','0',0,'','','','','','Long',106),('Code','C#','ulong',0,'0','0',0,'0','0','0',0,'','','','','','Ulong',107),('Code','C#','char',0,'0','0',0,'0','0','0',0,'','','','','','Char',108),('Code','C#','float',0,'0','0',0,'0','0','0',0,'','','','','','Float',109),('Code','C#','double',0,'0','0',0,'0','0','0',0,'','','','','','Double',110),('Code','C#','bool',0,'0','0',0,'0','0','0',0,'','','','','','Boolean',111),('Code','C#','decimal',0,'0','0',0,'0','0','0',0,'','','','','','Float',112),('Code','VBNet','Integer',0,'0','0',0,'0','0','0',0,'','','','','','Integer',113),('Code','VBNet','String',0,'0','0',0,'0','0','0',0,'','','','','','String',114),('Code','VBNet','Short',0,'0','0',0,'0','0','0',0,'','','','','','Short',115),('Code','VBNet','Long',0,'0','0',0,'0','0','0',0,'','','','','','Long',116),('Code','VBNet','Char',0,'0','0',0,'0','0','0',0,'','','','','','Char',117),('Code','VBNet','Byte',0,'0','0',0,'0','0','0',0,'','','','','','Byte',118),('Code','VBNet','Boolean',0,'0','0',0,'0','0','0',0,'','','','','','Boolean',119),('Code','VBNet','Double',0,'0','0',0,'0','0','0',0,'','','','','','Double',120),('Code','VBNet','Date',0,'0','0',0,'0','0','0',0,'','','','','','Date',121),('Code','VBNet','Object',0,'0','0',0,'0','0','0',0,'','','','','','',122),('Code','VBNet','Single',0,'0','0',0,'0','0','0',0,'','','','','','Single',123),('Code','VBNet','Datetime',0,'0','0',0,'0','0','0',0,'','','','','','DateTime',124),('Code','VBNet','Decimal',0,'0','0',0,'0','0','0',0,'','','','','','',125),('DDL','DB2','BIGINT',0,'0','0',0,'0','0','0',0,'','','','','','bigint',126),('DDL','DB2','CHARACTER',1,'254','0',0,'10','0','0',0,'','','','','','char',128),('DDL','DB2','DATE',0,'0','0',0,'0','0','0',0,'','','','','','date',130),('DDL','DB2','DECIMAL',2,'31','31',0,'0','5','0',0,'','','','','','decimal',131),('DDL','DB2','DOUBLE',0,'0','0',0,'0','0','0',0,'','','','','','double',132),('DDL','DB2','INTEGER',0,'0','0',0,'0','0','0',0,'','','','','','integer',133),('DDL','DB2','LONG VARCHAR',0,'0','0',0,'0','0','0',0,'','','','','','text',134),('DDL','DB2','REAL',0,'0','0',0,'0','0','0',0,'','','','','','real',135),('DDL','DB2','TIME',0,'0','0',0,'0','0','0',0,'','','','','','time',137),('DDL','DB2','TIMESTAMP',0,'0','0',0,'0','0','0',0,'','','','','','timestamp',138),('DDL','DB2','BLOB',1,'2147483647','0',0,'1048576','0','0',0,'','','','','','blob',934),('DDL','DB2','CLOB',1,'2147483647','0',0,'1048576','0','0',0,'','','','','','clob',935),('DDL','MySql','BIT',1,'64','0',0,'1','0','0',0,'','','','','','bit',140),('DDL','MySql','BOOL',0,'0','0',0,'0','0','0',0,'','','','','','boolean',141),('DDL','MySql','TINYINT',0,'0','0',0,'0','0','0',0,'','','','','','tinyint',142),('DDL','MySql','SMALLINT',0,'0','0',0,'0','0','0',0,'','','','','','smallint',143),('DDL','MySql','INTEGER',0,'0','0',0,'0','0','0',0,'','','','','','integer',144),('DDL','MySql','MEDIUMINT',0,'0','0',0,'0','0','0',0,'','','','','','mediumint',145),('DDL','MySql','BIGINT',0,'0','0',0,'0','0','0',0,'','','','','','bigint',146),('DDL','MySql','FLOAT',2,'0','24',0,'0','0','0',0,'','','','','','float',147),('DDL','MySql','DOUBLE',2,'0','53',30,'0','10','2',0,'','','','','','double',148),('DDL','MySql','DOUBLE PRECISION',2,'0','53',30,'0','10','2',0,'','','','','','double',149),('DDL','MySql','REAL',2,'0','53',30,'0','10','2',0,'','','','','','real',150),('DDL','MySql','NUMERIC',2,'0','65',30,'0','10','2',0,'','','','','','numeric',151),('DDL','MySql','DECIMAL',2,'0','65',30,'0','10','2',0,'','','','','','decimal',152),('DDL','MySql','DATE',0,'0','0',0,'0','0','0',0,'','','','','','date',153),('DDL','MySql','DATETIME',1,'6','0',0,'0','0','0',0,'','','','','','datetime',154),('DDL','MySql','TIME',1,'6','0',0,'0','0','0',0,'','','','','','time',155),('DDL','MySql','TIMESTAMP',1,'6','0',0,'0','0','0',0,'','','','','','timestamp',156),('DDL','MySql','CHAR',1,'255','0',0,'10','0','0',0,'','','','','','char',157),('DDL','MySql','VARCHAR',1,'65535','0',0,'50','0','0',0,'','','','','','varchar',158),('DDL','MySql','BLOB',0,'0','0',0,'0','0','0',0,'','','','','','blob',159),('DDL','MySql','TEXT',0,'0','0',0,'0','0','0',0,'','','','','','text',160),('DDL','SQL Server 2000','decimal',2,'38','38',38,'0','10','2',0,'','','','','','decimal',161),('DDL','SQL Server 2000','sql_variant',0,'0','0',0,'0','0','0',0,'','','','','','sqlvariant',162),('DDL','SQL Server 2000','numeric',2,'38','38',38,'0','10','2',0,'','','','','','numeric',163),('DDL','SQL Server 2000','varbinary',1,'8000','0',0,'50','0','0',0,'','','','','','varbinary',164),('DDL','SQL Server 2000','bit',0,'0','0',0,'0','0','0',0,'','','','','','boolean',165),('DDL','InterBase','integer',0,'0','0',0,'10','0','0',0,'','','','','','integer',167),('DDL','InterBase','smallint',0,'0','0',0,'10','0','0',0,'','','','','','smallint',168),('DDL','MySql','NCHAR',1,'255','0',0,'10','0','0',0,'','','','','','nchar',169),('DDL','InterBase','timestamp',0,'0','0',0,'0','0','0',0,'','','','','','datetime',170),('DDL','PostgreSQL','real',1,'53','0',0,'53','0','0',0,'','','','','','real',171),('DDL','SQL Server 2000','char',1,'8000','0',0,'10','0','0',0,'','','','','','char',174),('DDL','SQL Server 2000','timestamp',0,'0','0',0,'0','0','0',0,'','','','','','timestamp',175),('DDL','InterBase','double precision',0,'0','0',0,'0','0','0',0,'','','','','','double',178),('DDL','SQL Server 2000','binary',1,'8000','0',0,'10','0','0',0,'','','','','','Binary',179),('DDL','SQL Server 2000','image',0,'0','0',0,'0','0','0',0,'','','','','','blob',180),('DDL','SQL Server 2000','nvarchar',1,'4000','0',0,'50','0','0',0,'','','','','','nvarchar',181),('DDL','SQL Server 2000','smalldatetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',182),('DDL','PostgreSQL','numeric',2,'0','1000',1000,'0','0','0',0,'','','','','','numeric',183),('DDL','DB2','FLOAT',0,'0','0',0,'0','0','0',0,'','','','','','float',184),('DDL','PostgreSQL','integer',0,'0','0',0,'0','0','0',0,'','','','','','integer',185),('DDL','PostgreSQL','varchar',1,'1048576','0',0,'50','0','0',0,'','','','','','varchar',186),('DDL','InterBase','blob sub_type 0',0,'0','0',0,'0','0','0',0,'','','','','','blob',188),('DDL','SQL Server 2000','money',0,'0','0',0,'0','19','4',0,'','','','','','currency',190),('DDL','SQL Server 2000','ntext',0,'0','0',0,'0','0','0',0,'','','','','','ntext',191),('DDL','SQL Server 2000','uniqueidentifier',0,'0','0',0,'0','0','0',0,'','','','','','guid',192),('DDL','PostgreSQL','bigint',0,'0','0',0,'0','0','0',0,'','','','','','bigint',195),('DDL','DB2','SMALLINT',0,'0','0',0,'0','0','0',0,'','','','','','smallint',196),('DDL','MSAccess','OLEObject',0,'0','0',0,'0','0','0',0,'','','','','','blob',199),('DDL','DB2','DBCLOB',1,'1073741823','0',0,'1','0','0',0,'','','','','','dbclob',936),('DDL','SQL Server 2000','int',0,'0','0',0,'0','0','0',0,'','','','','','integer',201),('DDL','SQL Server 2000','datetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',203),('DDL','SQL Server 2000','float',0,'53','0',0,'53','0','0',0,'','','','','','float',204),('DDL','SQL Server 2000','nchar',1,'4000','0',0,'10','0','0',0,'','','','','','nchar',205),('DDL','Oracle','NVARCHAR2',1,'4000','0',0,'50','0','0',0,'','','','','','nvarchar',206),('DDL','InterBase','varchar',1,'32767','0',0,'50','0','0',0,'','','','','','varchar',209),('DDL','MSAccess','Byte',0,'0','0',0,'0','0','0',0,'','','','','','tinyint',210),('DDL','SQL Server 2000','real',0,'53','0',0,'53','0','0',0,'','','','','','double',211),('DDL','SQL Server 2000','text',0,'0','0',0,'0','0','0',0,'','','','','','text',212),('DDL','SQL Server 2000','tinyint',0,'0','0',0,'0','0','0',0,'','','','','','tinyint',213),('DDL','PostgreSQL','smallint',0,'0','0',0,'0','0','0',0,'','','','','','smallint',214),('DDL','SQL Server 2000','smallint',0,'0','0',0,'0','0','0',0,'','','','','','smallint',216),('DDL','SQL Server 2000','varchar',1,'8000','0',0,'50','0','0',0,'','','','','','varchar',217),('DDL','DB2','CHAR',1,'254','0',0,'10','0','0',0,'','','','','','char',218),('DDL','PostgreSQL','char',1,'1048576','0',0,'1','0','0',0,'','','','','','char',219),('DDL','PostgreSQL','decimal',2,'0','1000',1000,'0','0','0',0,'','','','','','decimal',220),('DDL','PostgreSQL','text',0,'0','0',0,'0','0','0',0,'','','','','','text',221),('DDL','SQL Server 2000','bigint',0,'0','0',0,'0','0','0',0,'','','','','','bigint',222),('DDL','SQL Server 2000','smallmoney',0,'0','0',0,'0','0','0',0,'','','','','','money',226),('DDL','InterBase','blob sub_type 1',0,'0','0',0,'0','0','0',0,'','','','','','text',227),('DDL','InterBase','char',1,'32767','0',0,'10','0','0',0,'','','','','','char',228),('DDL','PostgreSQL','boolean',0,'0','0',0,'0','0','0',0,'','','','','','boolean',230),('DDL','PostgreSQL','timestamp',1,'6','0',0,'0','0','0',0,'','','','','','datetime',231),('DDL','MySql','NVARCHAR',1,'65535','0',0,'50','0','0',0,'','','','','','nvarchar',232),('DDL','PostgreSQL','bytea',0,'0','0',0,'0','0','0',0,'','','','','','blob',233),('DDL','InterBase','decimal',2,'0','64',64,'0','10','2',0,'','','','','','decimal',235),('Code','PHP','var',0,'','',0,'','','',1,'','','','','','var',236),('Code','C#','string',0,'','',0,'','','',1,'','','','','','String',237),('Code','C++','wchar_t',0,'','',0,'','','',1,'','','','','','Char',238),('Code','C++','bool',0,'','',0,'','','',1,'','','','','','Boolean',239),('DDL','Sybase ASE','tinyint',0,'0','0',0,'0','0','0',0,'','','','','','tinyint',240),('DDL','Sybase ASE','smallint',0,'0','0',0,'0','0','0',0,'','','','','','smallint',241),('DDL','Sybase ASE','int',0,'0','0',0,'0','0','0',0,'','','','','','integer',242),('DDL','Sybase ASE','numeric',2,'0','38',38,'0','18','0',0,'','','','','','numeric',243),('DDL','Sybase ASE','decimal',2,'0','38',38,'0','18','0',0,'','','','','','decimal',244),('DDL','Sybase ASE','float',0,'0','0',0,'0','0','0',0,'','','','','','float',245),('DDL','Sybase ASE','double precision',0,'0','0',0,'0','0','0',0,'','','','','','double',246),('DDL','Sybase ASE','real',0,'0','0',0,'0','0','0',0,'','','','','','real',247),('DDL','Sybase ASE','smallmoney',0,'0','0',0,'0','0','0',0,'','','','','','money',248),('DDL','Sybase ASE','money',0,'0','0',0,'0','0','0',0,'','','','','','money',249),('DDL','Sybase ASE','smalldatetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',250),('DDL','Sybase ASE','datetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',251),('DDL','Sybase ASE','char',1,'16384','0',0,'50','0','0',0,'','','','','','char',252),('DDL','Sybase ASE','varchar',1,'16384','0',0,'100','0','0',0,'','','','','','varchar',253),('DDL','Sybase ASE','unichar',1,'0','0',0,'50','0','0',0,'','','','','','char',254),('DDL','Sybase ASE','univarchar',1,'0','0',0,'50','0','0',0,'','','','','','varchar',255),('DDL','Sybase ASE','nchar',1,'16384','0',0,'50','0','0',0,'','','','','','nchar',256),('DDL','Sybase ASE','nvarchar',1,'16384','0',0,'50','0','0',0,'','','','','','nvarchar',257),('DDL','Sybase ASE','text',0,'0','0',0,'50','0','0',0,'','','','','','text',258),('DDL','Sybase ASE','binary',1,'255','0',0,'1','0','0',0,'','','','','','binary',259),('DDL','Sybase ASE','image',0,'0','0',0,'0','0','0',0,'','','','','','blob',261),('DDL','Sybase ASE','bit',0,'0','0',0,'0','0','0',0,'','','','','','boolean',262),('DDL','Informix','INTEGER',0,'0','0',0,'0','0','0',0,'','','','','','integer',263),('DDL','Informix','INT',0,'0','0',0,'0','0','0',0,'','','','','','integer',264),('DDL','Informix','SMALLINT',0,'0','0',0,'0','0','0',0,'','','','','','smallint',265),('DDL','Informix','INT8',0,'0','0',0,'0','0','0',0,'','','','','','bigint',266),('DDL','Informix','SERIAL',0,'0','0',0,'0','0','0',0,'','','','','','integer',267),('DDL','Informix','SERIAL8',0,'0','0',0,'0','0','0',0,'','','','','','integer',268),('DDL','Informix','FLOAT',0,'0','0',0,'0','0','0',0,'','','','','','float',269),('DDL','Informix','SMALLFLOAT',0,'4','0',0,'4','0','0',0,'','','','','','float',270),('DDL','Informix','DECIMAL',2,'0','32',32,'0','8','3',0,'','','','','','decimal',271),('DDL','Informix','DEC',2,'0','32',32,'0','8','3',0,'','','','','','decimal',272),('DDL','Informix','MONEY',2,'0','32',3,'0','8','3',0,'','','','','','money',273),('DDL','Informix','DATE',0,'0','0',0,'0','0','0',0,'','','','','','date',274),('DDL','Informix','DATETIME HOUR TO MINUTE',0,'0','0',0,'0','0','0',0,'','','','','','datetime',275),('DDL','Informix','DATETIME YEAR TO YEAR',0,'0','0',0,'0','0','0',0,'','','','','','datetime',276),('DDL','Informix','DATETIME YEAR TO MONTH',0,'0','0',0,'0','0','0',0,'','','','','','datetime',277),('DDL','Informix','DATETIME YEAR TO DAY',0,'0','0',0,'0','0','0',0,'','','','','','datetime',278),('DDL','Informix','DATETIME YEAR TO HOUR',0,'0','0',0,'0','0','0',0,'','','','','','datetime',279),('DDL','Informix','DATETIME YEAR TO MINUTE',0,'0','0',0,'0','0','0',0,'','','','','','datetime',280),('DDL','Informix','DATETIME YEAR TO SECOND',0,'0','0',0,'0','0','0',0,'','','','','','datetime',281),('DDL','Informix','DATETIME YEAR TO FRACTION',1,'5','0',0,'3','0','0',0,'','','','','','datetime',282),('DDL','Informix','DATETIME MONTH TO MONTH',0,'0','0',0,'0','0','0',0,'','','','','','datetime',283),('DDL','DB2','GRAPHIC',1,'127','0',0,'1','0','0',0,'','','','','','graphic',937),('DDL','Informix','DATETIME MONTH TO DAY',0,'0','0',0,'0','0','0',0,'','','','','','datetime',284),('DDL','Informix','DATETIME MONTH TO HOUR',0,'0','0',0,'0','0','0',0,'','','','','','datetime',285),('DDL','Informix','DATETIME MONTH TO MINUTE',0,'0','0',0,'0','0','0',0,'','','','','','datetime',286),('DDL','Informix','DATETIME MONTH TO SECOND',0,'0','0',0,'0','0','0',0,'','','','','','datetime',287),('DDL','Informix','DATETIME MONTH TO FRACTION',1,'5','0',0,'3','0','0',0,'','','','','','datetime',288),('DDL','Informix','DATETIME DAY TO DAY',0,'0','0',0,'0','0','0',0,'','','','','','datetime',289),('DDL','Informix','DATETIME DAY TO HOUR',0,'0','0',0,'0','0','0',0,'','','','','','datetime',290),('DDL','Informix','DATETIME DAY TO MINUTE',0,'0','0',0,'0','0','0',0,'','','','','','datetime',291),('DDL','Informix','DATETIME DAY TO SECOND',0,'0','0',0,'0','0','0',0,'','','','','','datetime',292),('DDL','Informix','DATETIME DAY TO FRACTION',1,'5','0',0,'3','0','0',0,'','','','','','datetime',293),('DDL','Informix','DATETIME HOUR TO HOUR',0,'0','0',0,'0','0','0',0,'','','','','','datetime',294),('DDL','Informix','DATETIME HOUR TO FRACTION',1,'5','0',0,'3','0','0',0,'','','','','','datetime',295),('DDL','Informix','DATETIME HOUR TO SECOND',0,'0','0',0,'0','0','0',0,'','','','','','datetime',296),('DDL','Informix','DATETIME MINUTE TO MINUTE',0,'0','0',0,'0','0','0',0,'','','','','','datetime',297),('DDL','Informix','DATETIME MINUTE TO SECOND',0,'0','0',0,'0','0','0',0,'','','','','','datetime',298),('DDL','Informix','DATETIME MINUTE TO FRACTION',1,'5','0',0,'3','0','0',0,'','','','','','datetime',299),('DDL','Informix','DATETIME SECOND TO SECOND',0,'0','0',0,'0','0','0',0,'','','','','','datetime',300),('DDL','Informix','DATETIME SECOND TO FRACTION',1,'5','0',0,'3','0','0',0,'','','','','','datetime',301),('DDL','Informix','DATETIME FRACTION TO FRACTION',1,'5','0',0,'3','0','0',0,'','','','','','datetime',302),('DDL','Informix','BOOLEAN',0,'0','0',0,'0','0','0',0,'','','','','','boolean',303),('DDL','Informix','CHAR',1,'32767','0',0,'10','0','0',0,'','','','','','char',304),('DDL','Informix','CHARACTER',1,'32767','0',0,'10','0','0',0,'','','','','','char',305),('DDL','Informix','NCHAR',1,'32767','0',0,'50','0','0',0,'','','','','','nchar',306),('DDL','Informix','CHARACTER VARYING',1,'255','0',0,'0','0','0',0,'','','','','','char',307),('DDL','Informix','VARCHAR',1,'255','0',0,'10','0','0',0,'','','','','','varchar',308),('DDL','Informix','NVARCHAR',1,'255','0',0,'50','0','0',0,'','','','','','nvarchar',309),('DDL','Informix','LVARCHAR',1,'32767','0',0,'2048','0','0',0,'','','','','','char',310),('DDL','Informix','TEXT',0,'0','0',0,'0','0','0',0,'','','','','','text',311),('DDL','Informix','BYTE',0,'0','0',0,'0','0','0',0,'','','','','','Binary',312),('DDL','Informix','BLOB',0,'0','0',0,'0','0','0',0,'','','','','','blob',313),('DDL','Informix','CLOB',0,'0','0',0,'0','0','0',0,'','','','','','ntext',314),('DDL','Ingres','ansidate',0,'0','0',0,'0','0','0',0,'','','','','','ansidate',315),('DDL','Ingres','bigint',0,'0','0',0,'0','0','0',0,'','','','','','bigint',316),('DDL','Ingres','byte',1,'32000','0',0,'0','0','0',0,'','','','','','Binary',317),('DDL','Ingres','byte var',1,'32000','0',0,'0','0','0',0,'','','','','','Binary',318),('DDL','Ingres','c',1,'32000','0',0,'0','0','0',0,'','','','','','char',319),('DDL','Ingres','char',1,'32000','0',0,'0','0','0',0,'','','','','','char',320),('DDL','Ingres','date',0,'0','0',0,'0','0','0',0,'','','','','','date',321),('DDL','Ingres','decimal',2,'0','31',10,'0','5','0',0,'','','','','','decimal',322),('DDL','Ingres','float',1,'53','0',0,'8','0','0',0,'','','','','','float',323),('DDL','Ingres','float4',0,'0','0',0,'0','0','0',0,'','','','','','real',324),('DDL','Ingres','float8',0,'0','0',0,'0','0','0',0,'','','','','','float',325),('DDL','Ingres','ingresdate',0,'0','0',0,'0','0','0',0,'','','','','','date',326),('DDL','Ingres','int1',0,'0','0',0,'0','0','0',0,'','','','','','integer1',327),('DDL','Ingres','int2',0,'0','0',0,'0','0','0',0,'','','','','','smallint',328),('DDL','Ingres','int4',0,'0','0',0,'0','0','0',0,'','','','','','int',329),('DDL','Ingres','int8',0,'0','0',0,'0','0','0',0,'','','','','','bigint',330),('DDL','Ingres','integer',0,'0','0',0,'0','0','0',0,'','','','','','integer',331),('DDL','Ingres','interval day to second',0,'0','0',0,'0','0','0',0,'','','','','','interval day to second',332),('DDL','Ingres','interval year to month',0,'0','0',0,'0','0','0',0,'','','','','','interval year to month',333),('DDL','Ingres','long byte',0,'0','0',0,'0','0','0',0,'','','','','','long byte',334),('DDL','Ingres','long nvarchar',0,'0','0',0,'0','0','0',0,'','','','','','long nvarchar',335),('DDL','Ingres','long varchar',0,'0','0',0,'0','0','0',0,'','','','','','long varchar',336),('DDL','Ingres','money',0,'0','0',0,'0','0','0',0,'','','','','','money',337),('DDL','Ingres','nchar',1,'16000','0',0,'0','0','0',0,'','','','','','nchar',338),('DDL','Ingres','nvarchar',1,'16000','0',0,'0','0','0',0,'','','','','','nvarchar',339),('DDL','Ingres','Object Key',0,'0','0',0,'0','0','0',0,'','','','','','OBJECT_KEY',340),('DDL','Ingres','Table Key',0,'0','0',0,'0','0','0',0,'','','','','','TABLE_KEY',341),('DDL','Ingres','text',1,'32000','0',0,'0','0','0',0,'','','','','','text',342),('DDL','Ingres','time with local time zone',0,'0','0',0,'0','0','0',0,'','','','','','time',343),('DDL','Ingres','time with time zone',0,'0','0',0,'0','0','0',0,'','','','','','time',344),('DDL','Ingres','time without time zone',0,'0','0',0,'0','0','0',0,'','','','','','TABLE_KEY',345),('DDL','Ingres','timestamp with local time zone',0,'0','0',0,'0','0','0',0,'','','','','','timestampt',346),('DDL','Ingres','timestamp with time zone',0,'0','0',0,'0','0','0',0,'','','','','','timestampt',347),('DDL','Ingres','timestamp without time zone',0,'0','0',0,'0','0','0',0,'','','','','','timestampt',348),('DDL','Ingres','varchar',1,'32000','0',0,'0','0','0',0,'','','','','','varchar',349),('DDL','SQL Server 2005','bigint',0,'0','0',0,'0','0','0',0,'','','','','','bigint',350),('DDL','SQL Server 2005','int',0,'0','0',0,'0','0','0',0,'','','','','','integer',351),('DDL','SQL Server 2005','smallint',0,'0','0',0,'0','0','0',0,'','','','','','smallint',352),('DDL','SQL Server 2005','tinyint',0,'0','0',0,'0','0','0',0,'','','','','','tinyint',353),('DDL','SQL Server 2005','bit',0,'0','0',0,'0','0','0',0,'','','','','','boolean',354),('DDL','SQL Server 2005','decimal',2,'38','38',38,'0','10','2',0,'','','','','','decimal',355),('DDL','SQL Server 2005','numeric',2,'38','38',38,'0','10','2',0,'','','','','','numeric',356),('DDL','SQL Server 2005','money',0,'0','0',0,'0','19','4',0,'','','','','','currency',357),('DDL','SQL Server 2005','smallmoney',0,'0','0',0,'0','0','0',0,'','','','','','money',358),('DDL','SQL Server 2005','float',0,'53','0',0,'53','0','0',0,'','','','','','float',359),('DDL','SQL Server 2005','real',0,'53','0',0,'53','0','0',0,'','','','','','double',360),('DDL','SQL Server 2005','datetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',361),('DDL','SQL Server 2005','smalldatetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',362),('DDL','SQL Server 2005','char',1,'8000','0',0,'10','0','0',0,'','','','','','char',363),('DDL','SQL Server 2005','varchar',1,'8000','0',0,'50','0','0',0,'','','','','','varchar',364),('DDL','SQL Server 2005','text',0,'0','0',0,'0','0','0',0,'','','','','','text',365),('DDL','SQL Server 2005','nchar',1,'4000','0',0,'10','0','0',0,'','','','','','nchar',366),('DDL','SQL Server 2005','nvarchar',1,'4000','0',0,'50','0','0',0,'','','','','','nvarchar',367),('DDL','SQL Server 2005','ntext',0,'0','0',0,'0','0','0',0,'','','','','','ntext',368),('DDL','SQL Server 2005','binary',1,'8000','0',0,'10','0','0',0,'','','','','','Binary',369),('DDL','SQL Server 2005','varbinary',1,'8000','0',0,'50','0','0',0,'','','','','','varbinary',370),('DDL','SQL Server 2005','image',0,'0','0',0,'0','0','0',0,'','','','','','blob',371),('DDL','SQL Server 2005','sql_variant',0,'0','0',0,'0','0','0',0,'','','','','','sqlvariant',372),('DDL','SQL Server 2005','timestamp',0,'0','0',0,'0','0','0',0,'','','','','','timestamp',373),('DDL','SQL Server 2005','uniqueidentifier',0,'0','0',0,'0','0','0',0,'','','','','','guid',374),('DDL','SQL Server 2005','xml',0,'0','0',0,'0','0','0',0,'','','','','','text',375),('DDL','Informix','INTERVAL YEAR TO YEAR',0,'9','0',0,'0','0','0',0,'','','','','','interval',376),('DDL','Informix','INTERVAL YEAR TO MONTH',0,'9','0',0,'0','0','0',0,'','','','','','interval',377),('DDL','Informix','INTERVAL MONTH TO MONTH',0,'9','0',0,'0','0','0',0,'','','','','','interval',378),('DDL','Informix','INTERVAL DAY TO DAY',0,'9','0',0,'0','0','0',0,'','','','','','interval',379),('DDL','Informix','INTERVAL DAY TO HOUR',0,'9','0',0,'0','0','0',0,'','','','','','interval',380),('DDL','Informix','INTERVAL DAY TO MINUTE',0,'9','0',0,'0','0','0',0,'','','','','','interval',381),('DDL','Informix','INTERVAL DAY TO SECOND',0,'9','0',0,'0','0','0',0,'','','','','','interval',382),('DDL','Informix','INTERVAL DAY TO FRACTION',1,'5','0',0,'0','0','0',0,'','','','','','interval',383),('DDL','Informix','INTERVAL HOUR TO HOUR',0,'9','0',0,'0','0','0',0,'','','','','','interval',384),('DDL','Informix','INTERVAL HOUR TO MINUTE',0,'9','0',0,'0','0','0',0,'','','','','','interval',385),('DDL','Informix','INTERVAL HOUR TO SECOND',0,'9','0',0,'0','0','0',0,'','','','','','interval',386),('DDL','Informix','INTERVAL HOUR TO FRACTION',1,'5','0',0,'0','0','0',0,'','','','','','interval',387),('DDL','Informix','INTERVAL MINUTE TO MINUTE',0,'9','0',0,'0','0','0',0,'','','','','','interval',388),('DDL','Informix','INTERVAL MINUTE TO SECOND',0,'9','0',0,'0','0','0',0,'','','','','','interval',389),('DDL','Informix','INTERVAL MINUTE TO FRACTION',1,'5','0',0,'0','0','0',0,'','','','','','interval',390),('DDL','Informix','INTERVAL SECOND TO SECOND',0,'9','0',0,'0','0','0',0,'','','','','','interval',391),('DDL','Informix','INTERVAL SECOND TO FRACTION',1,'5','0',0,'0','0','0',0,'','','','','','interval',392),('DDL','Informix','INTERVAL FRACTION TO FRACTION',1,'5','0',0,'0','0','0',0,'','','','','','interval',393),('DDL','SQL Server 2005','varchar(max)',0,'0','0',0,'0','0','0',0,'','','','','','varchar',394),('DDL','SQL Server 2005','varbinary(max)',0,'0','0',0,'0','0','0',0,'','','','','','varbinary',395),('DDL','SQL Server 2008','bigint',0,'0','0',0,'0','0','0',0,'','','','','','bigint',396),('DDL','SQL Server 2008','bit',0,'0','0',0,'0','0','0',0,'','','','','','boolean',397),('DDL','SQL Server 2008','decimal',2,'38','38',38,'0','10','2',0,'','','','','','decimal',398),('DDL','SQL Server 2008','int',0,'0','0',0,'0','0','0',0,'','','','','','integer',399),('DDL','SQL Server 2008','money',0,'0','0',0,'0','19','4',0,'','','','','','currency',400),('DDL','SQL Server 2008','numeric',2,'38','38',38,'0','10','2',0,'','','','','','numeric',401),('DDL','SQL Server 2008','smallint',0,'0','0',0,'0','0','0',0,'','','','','','smallint',402),('DDL','SQL Server 2008','smallmoney',0,'0','0',0,'0','0','0',0,'','','','','','money',403),('DDL','SQL Server 2008','tinyint',0,'0','0',0,'0','0','0',0,'','','','','','tinyint',404),('DDL','SQL Server 2008','float',0,'53','0',0,'53','0','0',0,'','','','','','float',405),('DDL','SQL Server 2008','real',0,'53','0',0,'53','0','0',0,'','','','','','double',406),('DDL','SQL Server 2008','date',0,'0','0',0,'0','0','0',0,'','','','','','date',407),('DDL','SQL Server 2008','datetime2',1,'7','0',0,'7','0','0',0,'','','','','','datetime',408),('DDL','SQL Server 2008','datetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',409),('DDL','SQL Server 2008','datetimeoffset',1,'7','0',0,'7','0','0',0,'','','','','','datetime',410),('DDL','SQL Server 2008','smalldatetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',411),('DDL','SQL Server 2008','time',1,'7','0',0,'7','0','0',0,'','','','','','time',412),('DDL','SQL Server 2008','char',1,'8000','0',0,'10','0','0',0,'','','','','','char',413),('DDL','SQL Server 2008','varchar',1,'8000','0',0,'50','0','0',0,'','','','','','varchar',414),('DDL','SQL Server 2008','varchar(max)',0,'0','0',0,'0','0','0',0,'','','','','','varchar',415),('DDL','SQL Server 2008','text',0,'0','0',0,'0','0','0',0,'','','','','','text',416),('DDL','SQL Server 2008','nchar',1,'4000','0',0,'10','0','0',0,'','','','','','nchar',417),('DDL','SQL Server 2008','nvarchar',1,'4000','0',0,'50','0','0',0,'','','','','','nvarchar',418),('DDL','SQL Server 2008','nvarchar(max)',0,'0','0',0,'0','0','0',0,'','','','','','varchar',419),('DDL','SQL Server 2008','ntext',0,'0','0',0,'0','0','0',0,'','','','','','ntext',420),('DDL','SQL Server 2008','binary',1,'8000','0',0,'10','0','0',0,'','','','','','Binary',421),('DDL','SQL Server 2008','varbinary',1,'8000','0',0,'50','0','0',0,'','','','','','varbinary',422),('DDL','SQL Server 2008','varbinary(max)',0,'0','0',0,'0','0','0',0,'','','','','','varbinary',423),('DDL','SQL Server 2008','image',0,'0','0',0,'0','0','0',0,'','','','','','blob',424),('DDL','SQL Server 2008','timestamp',0,'0','0',0,'0','0','0',0,'','','','','','timestamp',425),('DDL','SQL Server 2008','uniqueidentifier',0,'0','0',0,'0','0','0',0,'','','','','','guid',426),('DDL','SQL Server 2008','sql_variant',0,'0','0',0,'0','0','0',0,'','','','','','sqlvariant',427),('DDL','SQL Server 2008','xml',0,'0','0',0,'0','0','0',0,'','','','','','text',428),('DDL','SQL Server 2008','hierarchyid',0,'0','0',0,'0','0','0',0,'','','','','','text',429),('DDL','SQL Server 2008','geometry',0,'0','0',0,'0','0','0',0,'','','','','','text',430),('DDL','SQL Server 2008','geography',0,'0','0',0,'0','0','0',0,'','','','','','text',431),('DDL','MSAccess 2007','Text',1,'255','0',0,'50','0','0',0,'','','','','','char',432),('DDL','MSAccess 2007','Memo',0,'0','0',0,'0','0','0',0,'','','','','','text',433),('DDL','MSAccess 2007','DateTime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',434),('DDL','MSAccess 2007','Currency',0,'0','0',0,'0','0','0',0,'','','','','','currency',435),('DDL','MSAccess 2007','Integer',0,'0','0',0,'0','0','0',0,'','','','','','integer',436),('DDL','MSAccess 2007','Long',0,'0','0',0,'0','0','0',0,'','','','','','long',437),('DDL','MSAccess 2007','Single',0,'0','0',0,'0','0','0',0,'','','','','','float',438),('DDL','MSAccess 2007','Double',0,'0','0',0,'0','0','0',0,'','','','','','double',439),('DDL','MSAccess 2007','Counter',0,'0','0',0,'0','0','0',0,'','','','','','counter',440),('DDL','MSAccess 2007','YesNo',0,'0','0',0,'0','0','0',0,'','','','','','boolean',441),('DDL','MSAccess 2007','OLEObject',0,'0','0',0,'0','0','0',0,'','','','','','blob',442),('DDL','MSAccess 2007','Byte',0,'0','0',0,'0','0','0',0,'','','','','','tinyint',443),('DDL','MSAccess 2007','Decimal',0,'0','0',0,'0','0','0',0,'','','','','','decimal',445),('DDL','SQLite','INTEGER',0,'0','0',0,'0','0','0',0,'','','','','','integer',447),('DDL','SQLite','NUMERIC',0,'0','0',0,'0','0','0',0,'','','','','','numeric',448),('DDL','SQLite','TEXT',0,'0','0',0,'0','0','0',0,'','','','','','text',449),('DDL','SQLite','NONE',0,'0','0',0,'0','0','0',0,'','','','','','blob',450),('DDL','SQLite','REAL',0,'0','0',0,'0','0','0',0,'','','','','','real',451),('DDL','InterBase','numeric',2,'0','64',64,'0','10','2',0,'','','','','','numeric',452),('DDL','InterBase','float',0,'0','0',0,'0','0','0',0,'','','','','','float',453),('DDL','Oracle','BINARY_FLOAT',0,'0','0',0,'0','0','0',0,'','','','','','float',454),('DDL','Oracle','BINARY_DOUBLE',0,'0','0',0,'0','0','0',0,'','','','','','double',455),('DDL','Oracle','TIMESTAMP',1,'9','0',0,'6','0','0',0,'','','','','','timestamp',456),('DDL','Oracle','TIMESTAMP WITH TIME ZONE',1,'9','0',0,'6','0','0',0,'','','','','','timestamp with time zone',457),('DDL','Oracle','TIMESTAMP WITH LOCAL TIME ZONE',1,'9','0',0,'6','0','0',0,'','','','','','timestamp with local time zone',458),('DDL','Oracle','INTERVAL YEAR TO MONTH',1,'9','0',0,'2','0','0',0,'','','','','','interval year to month',459),('DDL','Oracle','INTERVAL DAY TO SECOND',2,'0','9',9,'0','2','6',0,'','','','','','interval day to second',460),('DDL','Oracle','ANYDATA',0,'0','0',0,'0','0','0',0,'','','','','','text',461),('DDL','Oracle','ANYTYPE',0,'0','0',0,'0','0','0',0,'','','','','','text',462),('DDL','Oracle','ANYDATASET',0,'0','0',0,'0','0','0',0,'','','','','','text',463),('DDL','Oracle','URITYPE',0,'0','0',0,'0','0','0',0,'','','','','','uri',464),('DDL','Oracle','DBURITYPE',0,'0','0',0,'0','0','0',0,'','','','','','uri',465),('DDL','Oracle','XDBURITYPE',0,'0','0',0,'0','0','0',0,'','','','','','uri',466),('DDL','Oracle','HTTPURITYPE',0,'0','0',0,'0','0','0',0,'','','','','','uri',467),('DDL','Oracle','XMLTYPE',0,'0','0',0,'0','0','0',0,'','','','','','xml',468),('DDL','Oracle','SDO_GEOMETRY',0,'0','0',0,'0','0','0',0,'','','','','','spatial',469),('DDL','Oracle','SDO_TOPO_GEOMETRY',0,'0','0',0,'0','0','0',0,'','','','','','spatial',470),('DDL','Oracle','SDO_GEORASTER',0,'0','0',0,'0','0','0',0,'','','','','','spatial',471),('DDL','Oracle','ORDAUDIO',0,'0','0',0,'0','0','0',0,'','','','','','media',472),('DDL','Oracle','ORDIMAGE',0,'0','0',0,'0','0','0',0,'','','','','','media',473),('DDL','Oracle','ORDVIDEO',0,'0','0',0,'0','0','0',0,'','','','','','media',474),('DDL','Oracle','ORDDOC',0,'0','0',0,'0','0','0',0,'','','','','','media',475),('DDL','Oracle','ORDDICOM',0,'0','0',0,'0','0','0',0,'','','','','','media',476),('DDL','Oracle','SI_STILLIMAGE',0,'0','0',0,'0','0','0',0,'','','','','','image',477),('DDL','Oracle','SI_COLOR',0,'0','0',0,'0','0','0',0,'','','','','','image',478),('DDL','Oracle','SI_AVERAGECOLOR',0,'0','0',0,'0','0','0',0,'','','','','','image',479),('DDL','Oracle','SI_COLORHISTOGRAM',0,'0','0',0,'0','0','0',0,'','','','','','image',480),('DDL','Oracle','SI_POSITIONALCOLOR',0,'0','0',0,'0','0','0',0,'','','','','','image',481),('DDL','Oracle','SI_TEXTURE',0,'0','0',0,'0','0','0',0,'','','','','','image',482),('DDL','Oracle','SI_FEATURELIST',0,'0','0',0,'0','0','0',0,'','','','','','image',483),('DDL','MySql','BINARY',1,'255','0',0,'50','0','0',0,'','','','','','binary',484),('DDL','MySql','ENUM',0,'0','0',0,'0','0','0',0,'','','','','','enum',485),('DDL','MySql','GEOMETRY',0,'0','0',0,'0','0','0',0,'','','','','','geometry',486),('DDL','MySql','GEOMETRYCOLLECTION',0,'0','0',0,'0','0','0',0,'','','','','','geometrycollection',487),('DDL','MySql','INT',0,'0','0',0,'0','0','0',0,'','','','','','integer',488),('DDL','MySql','LINESTRING',0,'0','0',0,'0','0','0',0,'','','','','','linestring',489),('DDL','MySql','LONGBLOB',0,'0','0',0,'0','0','0',0,'','','','','','longblob',490),('DDL','MySql','LONGTEXT',0,'0','0',0,'0','0','0',0,'','','','','','longtext',491),('DDL','MySql','MEDIUMBLOB',0,'0','0',0,'0','0','0',0,'','','','','','mediumblob',492),('DDL','MySql','MEDIUMTEXT',0,'0','0',0,'0','0','0',0,'','','','','','mediumtext',493),('DDL','MySql','MULTILINESTRING',0,'0','0',0,'0','0','0',0,'','','','','','multilinestring',494),('DDL','MySql','MULTIPOINT',0,'0','0',0,'0','0','0',0,'','','','','','multipoint',495),('DDL','MySql','MULTIPOLYGON',0,'0','0',0,'0','0','0',0,'','','','','','multipolygon',496),('DDL','MySql','POINT',0,'0','0',0,'0','0','0',0,'','','','','','point',497),('DDL','MySql','POLYGON',0,'0','0',0,'0','0','0',0,'','','','','','polygon',498),('DDL','MySql','SET',0,'0','0',0,'0','0','0',0,'','','','','','set',499),('DDL','MySql','TINYBLOB',0,'0','0',0,'0','0','0',0,'','','','','','tinyblob',500),('DDL','MySql','TINYTEXT',0,'0','0',0,'0','0','0',0,'','','','','','tinytext',501),('DDL','MySql','VARBINARY',1,'65535','0',0,'50','0','0',0,'','','','','','varbinary',502),('DDL','MySql','YEAR',1,'4','0',0,'4','0','0',0,'','','','','','date',503),('DDL','PostgreSQL','xml',0,'0','0',0,'0','0','0',0,'','','','','','xml',504),('DDL','PostgreSQL','uuid',0,'0','0',0,'0','0','0',0,'','','','','','guid',505),('DDL','PostgreSQL','date',0,'0','0',0,'0','0','0',0,'','','','','','date',506),('DDL','PostgreSQL','interval',1,'6','0',0,'0','0','0',0,'','','','','','interval',507),('DDL','PostgreSQL','time',1,'6','0',0,'0','0','0',0,'','','','','','time',508),('DDL','PostgreSQL','time with time zone',1,'6','0',0,'0','0','0',0,'','','','','','time',509),('DDL','PostgreSQL','time without time zone',1,'6','0',0,'0','0','0',0,'','','','','','time',510),('DDL','PostgreSQL','timestamp with time zone',1,'6','0',0,'0','0','0',0,'','','','','','datetime',511),('DDL','PostgreSQL','timestamp without time zone',1,'6','0',0,'0','0','0',0,'','','','','','datetime',512),('DDL','PostgreSQL','inet',0,'0','0',0,'0','0','0',0,'','','','','','inet',513),('DDL','PostgreSQL','cidr',0,'0','0',0,'0','0','0',0,'','','','','','cidr',514),('DDL','PostgreSQL','macaddr',0,'0','0',0,'0','0','0',0,'','','','','','macaddr',515),('DDL','PostgreSQL','money',0,'0','0',0,'0','0','0',0,'','','','','','currency',516),('DDL','PostgreSQL','bit',1,'83886080','0',0,'1','0','0',0,'','','','','','bit',517),('DDL','PostgreSQL','bit varying',1,'83886080','0',0,'0','0','0',0,'','','','','','varbit',518),('DDL','PostgreSQL','double precision',0,'0','0',0,'0','0','0',0,'','','','','','double',519),('DDL','PostgreSQL','serial',0,'0','0',0,'0','0','0',0,'','','','','','serial',520),('DDL','PostgreSQL','bigserial',0,'0','0',0,'0','0','0',0,'','','','','','serial',521),('DDL','PostgreSQL','smallserial',0,'0','0',0,'0','0','0',0,'','','','','','smallserial',522),('DDL','PostgreSQL','point',0,'0','0',0,'0','0','0',0,'','','','','','point',523),('DDL','PostgreSQL','line',0,'0','0',0,'0','0','0',0,'','','','','','line',524),('DDL','PostgreSQL','lseg',0,'0','0',0,'0','0','0',0,'','','','','','lseg',525),('DDL','PostgreSQL','box',0,'0','0',0,'0','0','0',0,'','','','','','box',526),('DDL','PostgreSQL','path',0,'0','0',0,'0','0','0',0,'','','','','','path',527),('DDL','PostgreSQL','polygon',0,'0','0',0,'0','0','0',0,'','','','','','polygon',528),('DDL','PostgreSQL','circle',0,'0','0',0,'0','0','0',0,'','','','','','circle',529),('DDL','SQL Server 2012','bigint',0,'0','0',0,'0','0','0',0,'','','','','','bigint',549),('DDL','SQL Server 2012','binary',1,'8000','0',0,'10','0','0',0,'','','','','','binary',550),('DDL','SQL Server 2012','bit',0,'0','0',0,'0','0','0',0,'','','','','','boolean',551),('DDL','SQL Server 2012','char',1,'8000','0',0,'10','0','0',0,'','','','','','char',552),('DDL','SQL Server 2012','date',0,'0','0',0,'0','0','0',0,'','','','','','date',553),('DDL','SQL Server 2012','datetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',554),('DDL','SQL Server 2012','datetime2',1,'7','0',0,'7','0','0',0,'','','','','','datetime',555),('DDL','SQL Server 2012','datetimeoffset',1,'7','0',0,'7','0','0',0,'','','','','','datetime',556),('DDL','SQL Server 2012','decimal',2,'38','38',38,'0','18','0',0,'','','','','','decimal',557),('DDL','SQL Server 2012','float',0,'53','0',0,'53','0','0',0,'','','','','','float',558),('DDL','SQL Server 2012','geography',0,'0','0',0,'0','0','0',0,'','','','','','text',559),('DDL','SQL Server 2012','geometry',0,'0','0',0,'0','0','0',0,'','','','','','text',560),('DDL','SQL Server 2012','hierarchyid',0,'0','0',0,'0','0','0',0,'','','','','','text',561),('DDL','SQL Server 2012','image',0,'0','0',0,'0','0','0',0,'','','','','','blob',562),('DDL','SQL Server 2012','int',0,'0','0',0,'0','0','0',0,'','','','','','integer',563),('DDL','SQL Server 2012','money',0,'0','0',0,'0','19','4',0,'','','','','','currency',564),('DDL','SQL Server 2012','nchar',1,'4000','0',0,'10','0','0',0,'','','','','','nchar',565),('DDL','SQL Server 2012','ntext',0,'0','0',0,'0','0','0',0,'','','','','','ntext',566),('DDL','SQL Server 2012','numeric',2,'38','38',38,'0','18','0',0,'','','','','','numeric',567),('DDL','SQL Server 2012','nvarchar',1,'4000','0',0,'50','0','0',0,'','','','','','nvarchar',568),('DDL','SQL Server 2012','nvarchar(max)',0,'0','0',0,'0','0','0',0,'','','','','','varchar',569),('DDL','SQL Server 2012','real',0,'53','0',0,'53','0','0',0,'','','','','','double',570),('DDL','SQL Server 2012','smalldatetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime',571),('DDL','SQL Server 2012','smallint',0,'0','0',0,'0','0','0',0,'','','','','','smallint',572),('DDL','SQL Server 2012','smallmoney',0,'0','0',0,'0','0','0',0,'','','','','','money',573),('DDL','SQL Server 2012','sql_variant',0,'0','0',0,'0','0','0',0,'','','','','','sqlvariant',574),('DDL','SQL Server 2012','text',0,'0','0',0,'0','0','0',0,'','','','','','text',575),('DDL','SQL Server 2012','time',1,'7','0',0,'7','0','0',0,'','','','','','time',576),('DDL','SQL Server 2012','timestamp',0,'0','0',0,'0','0','0',0,'','','','','','timestamp',577),('DDL','SQL Server 2012','tinyint',0,'0','0',0,'0','0','0',0,'','','','','','tinyint',578),('DDL','SQL Server 2012','uniqueidentifier',0,'0','0',0,'0','0','0',0,'','','','','','guid',579),('DDL','SQL Server 2012','varbinary',1,'8000','0',0,'50','0','0',0,'','','','','','varbinary',580),('DDL','SQL Server 2012','varbinary(max)',0,'0','0',0,'0','0','0',0,'','','','','','varbinary',581),('DDL','SQL Server 2012','varchar',1,'8000','0',0,'50','0','0',0,'','','','','','varchar',582),('DDL','SQL Server 2012','varchar(max)',0,'0','0',0,'0','0','0',0,'','','','','','varchar',583),('DDL','SQL Server 2012','xml',0,'0','0',0,'0','0','0',0,'','','','','','text',584),('DDL','Sybase','bigint',0,'0','0',0,'0','0','0',0,'','','','','','int8',827),('DDL','Sybase','binary',1,'32767','0',0,'50','0','0',0,'','','','','','binary',828),('DDL','Sybase','bit',0,'0','0',0,'0','0','0',0,'','','','','','bit',829),('DDL','Sybase','char',1,'32767','0',0,'10','0','0',0,'','','','','','char',830),('DDL','Sybase','date',0,'0','0',0,'0','0','0',0,'','','','','','date4',831),('DDL','Sybase','datetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime8',832),('DDL','Sybase','datetimeoffset',0,'0','0',0,'0','0','0',0,'','','','','','datetimeoffset',833),('DDL','Oracle','MDSYS.ST_GEOMETRY',0,'0','0',0,'0','0','0',0,'','','','','','geometry',793),('DDL','Oracle','MDSYS.ST_GEOMCOLLECTION',0,'0','0',0,'0','0','0',0,'','','','','','geometrycollection',794),('DDL','Oracle','MDSYS.ST_POINT',0,'0','0',0,'0','0','0',0,'','','','','','point',795),('DDL','Oracle','MDSYS.ST_POLYGON',0,'0','0',0,'0','0','0',0,'','','','','','polygon',796),('DDL','Sybase','decimal',2,'0','127',127,'0','30','6',0,'','','','','','decimal',834),('DDL','Sybase','double',0,'0','0',0,'0','0','0',0,'','','','','','double',835),('DDL','Sybase','float',0,'0','0',0,'4','0','0',0,'','','','','','float',836),('DDL','Sybase','integer',0,'0','0',0,'0','0','0',0,'','','','','','int4',837),('DDL','Sybase','image',0,'0','0',0,'0','0','0',0,'','','','','','long binary',838),('DDL','Sybase','long binary',0,'0','0',0,'0','0','0',0,'','','','','','long binary',839),('DDL','Sybase','long nvarchar',0,'0','0',0,'0','0','0',0,'','','','','','longnvarchar',840),('DDL','Sybase','long varbit',0,'0','0',0,'0','0','0',0,'','','','','','varbit',841),('DDL','Sybase','long varchar',0,'0','0',0,'0','0','0',0,'','','','','','longvarchar',842),('DDL','Sybase','money',0,'0','0',0,'0','0','0',0,'','','','','','money',843),('DDL','Sybase','nchar',1,'32767','0',0,'10','0','0',0,'','','','','','nchar',844),('DDL','Sybase','ntext',0,'0','0',0,'0','0','0',0,'','','','','','ntext',845),('DDL','Oracle','MDSYS.ST_LINESTRING',0,'0','0',0,'0','0','0',0,'','','','','','linestring',797),('DDL','Oracle','MDSYS.ST_MULTILINESTRING',0,'0','0',0,'0','0','0',0,'','','','','','multilinestring',798),('DDL','Oracle','MDSYS.ST_MULTIPOINT',0,'0','0',0,'0','0','0',0,'','','','','','multipoint',799),('DDL','Oracle','MDSYS.ST_MULTIPOLYGON',0,'0','0',0,'0','0','0',0,'','','','','','multipolygon',800),('DDL','PostgreSQL','box2d',0,'0','0',0,'0','0','0',0,'','','','','','box',801),('DDL','PostgreSQL','box3d',0,'0','0',0,'0','0','0',0,'','','','','','box3d',802),('DDL','PostgreSQL','geometry',0,'0','0',0,'0','0','0',0,'','','','','','geometry',803),('DDL','PostgreSQL','geometry(point)',0,'0','0',0,'0','0','0',0,'','','','','','point',804),('DDL','PostgreSQL','geometry(polygon)',0,'0','0',0,'0','0','0',0,'','','','','','polygon',805),('DDL','PostgreSQL','geometry(linestring)',0,'0','0',0,'0','0','0',0,'','','','','','linestring',806),('DDL','PostgreSQL','geometry(geometrycollection)',0,'0','0',0,'0','0','0',0,'','','','','','geometrycollection',807),('DDL','PostgreSQL','geometry(multipoint)',0,'0','0',0,'0','0','0',0,'','','','','','multipoint',808),('DDL','PostgreSQL','geometry(multipolygon)',0,'0','0',0,'0','0','0',0,'','','','','','multipolygon',809),('DDL','PostgreSQL','geometry(multilinestring)',0,'0','0',0,'0','0','0',0,'','','','','','multilinestring',810),('DDL','PostgreSQL','geometry_dump',0,'0','0',0,'0','0','0',0,'','','','','','geometry_dump',811),('DDL','PostgreSQL','geography',0,'0','0',0,'0','0','0',0,'','','','','','geography',812),('DDL','PostgreSQL','geography(point)',0,'0','0',0,'0','0','0',0,'','','','','','point2',813),('DDL','PostgreSQL','geography(polygon)',0,'0','0',0,'0','0','0',0,'','','','','','polygon2',814),('DDL','PostgreSQL','geography(linestring)',0,'0','0',0,'0','0','0',0,'','','','','','linestring2',815),('DDL','PostgreSQL','geography(geometrycollection)',0,'0','0',0,'0','0','0',0,'','','','','','geometrycollection2',816),('DDL','PostgreSQL','geography(multipoint)',0,'0','0',0,'0','0','0',0,'','','','','','multipoint2',817),('DDL','PostgreSQL','geography(multipolygon)',0,'0','0',0,'0','0','0',0,'','','','','','multipolygon2',818),('DDL','PostgreSQL','geography(multilinestring)',0,'0','0',0,'0','0','0',0,'','','','','','multilinestring2',819),('DDL','MSAccess','GUID',0,'0','0',0,'0','0','0',0,'','','','','','guid',820),('DDL','MSAccess 2007','GUID',0,'0','0',0,'0','0','0',0,'','','','','','guid',821),('DDL','Sybase ASE','varbinary',1,'255','0',0,'1','0','0',0,'','','','','','varbinary',826),('DDL','Sybase','numeric',2,'0','127',127,'0','30','6',0,'','','','','','numeric',846),('DDL','Sybase','nvarchar',1,'32767','0',0,'50','0','0',0,'','','','','','nvarchar',847),('DDL','Sybase','real',0,'0','0',0,'4','0','0',0,'','','','','','float',848),('DDL','Sybase','smalldatetime',0,'0','0',0,'0','0','0',0,'','','','','','datetime4',849),('DDL','Sybase','smallint',0,'0','0',0,'0','0','0',0,'','','','','','int2',850),('DDL','Sybase','smallmoney',0,'0','0',0,'0','0','0',0,'','','','','','smallmoney',851),('DDL','Sybase','ST_Geometry',0,'0','0',0,'0','0','0',0,'','','','','','geometry',852),('DDL','Sybase','ST_GeomCollection',0,'0','0',0,'0','0','0',0,'','','','','','geometrycollection',853),('DDL','Sybase','ST_Point',0,'0','0',0,'0','0','0',0,'','','','','','point',854),('DDL','Sybase','ST_Polygon',0,'0','0',0,'0','0','0',0,'','','','','','polygon',855),('DDL','Sybase','ST_LineString',0,'0','0',0,'0','0','0',0,'','','','','','linestring',856),('DDL','Sybase','ST_MultiLineString',0,'0','0',0,'0','0','0',0,'','','','','','multilinestring',857),('DDL','Sybase','ST_MultiPoint',0,'0','0',0,'0','0','0',0,'','','','','','multipoint',858),('DDL','Sybase','ST_MultiPolygon',0,'0','0',0,'0','0','0',0,'','','','','','multipolygon',859),('DDL','Sybase','text',0,'0','0',0,'0','0','0',0,'','','','','','text',860),('DDL','Sybase','tinyint',0,'0','0',0,'0','0','0',0,'','','','','','int1',861),('DDL','Sybase','time',0,'0','0',0,'0','0','0',0,'','','','','','time',862),('DDL','DB2','LONG VARGRAPHIC',0,'0','0',0,'0','0','0',0,'','','','','','longvargraphic',938),('DDL','DB2','VARGRAPHIC',1,'16336','0',0,'1','0','0',0,'','','','','','vargraphic',939),('DDL','Sybase','timestamp',0,'0','0',0,'0','0','0',0,'','','','','','timestamp8',863),('DDL','Sybase','timestamp with time zone',0,'0','0',0,'0','0','0',0,'','','','','','timestamptz',864),('DDL','Sybase','uniqueidentifier',0,'0','0',0,'0','0','0',0,'','','','','','uniqueidentifier',865),('DDL','Sybase','uniqueidentifierstr',0,'0','0',0,'0','0','0',0,'','','','','','uniqueidentifier',866),('DDL','Sybase','varbinary',1,'32767','0',0,'1','0','0',0,'','','','','','varbinary',867),('DDL','Sybase','varbit',1,'32767','0',0,'1','0','0',0,'','','','','','varbit',868),('DDL','Sybase','varchar',1,'32767','0',0,'50','0','0',0,'','','','','','varchar',869),('DDL','Sybase','xml',0,'0','0',0,'0','0','0',0,'','','','','','xml',870),('DDL','Firebird','smallint',0,'0','0',0,'0','0','0',0,'','','','','','smallint',871),('DDL','Firebird','integer',0,'0','0',0,'0','0','0',0,'','','','','','integer',872),('DDL','Firebird','bigint',0,'0','0',0,'0','0','0',0,'','','','','','bigint',873),('DDL','Firebird','date',0,'0','0',0,'0','0','0',0,'','','','','','date',874),('DDL','Firebird','time',0,'0','0',0,'0','0','0',0,'','','','','','time',875),('DDL','Firebird','timestamp',0,'0','0',0,'0','0','0',0,'','','','','','datetime',876),('DDL','Firebird','double precision',0,'0','0',0,'0','0','0',0,'','','','','','double',877),('DDL','Firebird','blob sub_type 0',0,'0','0',0,'0','0','0',0,'','','','','','blob',878),('DDL','Firebird','blob sub_type 1',0,'0','0',0,'0','0','0',0,'','','','','','text',879),('DDL','Firebird','varchar',1,'32767','0',0,'50','0','0',0,'','','','','','varchar',880),('DDL','Firebird','char',1,'32767','0',0,'50','0','0',0,'','','','','','char',881),('DDL','Firebird','decimal',2,'0','64',64,'0','10','2',0,'','','','','','decimal',882),('DDL','Firebird','numeric',2,'0','64',64,'0','10','2',0,'','','','','','numeric',883),('DDL','Firebird','float',0,'0','0',0,'0','0','0',0,'','','','','','float',884),('DDL','DB2','VARCHAR',1,'32672','0',0,'10','0','0',0,'','','','','','varchar',940),('DDL','DB2','XML',0,'0','0',0,'0','0','0',0,'','','','','','xml',941),('DDL','DB2','ST_CURVE',0,'0','0',0,'0','0','0',0,'','','','','','curve',942),('DDL','DB2','ST_MULTISURFACE',0,'0','0',0,'0','0','0',0,'','','','','','multisurface',912),('DDL','DB2','ST_MULTISURFACE',0,'0','0',0,'0','0','0',0,'','','','','','multisurface',932),('DDL','DB2','ST_GEOMCOLLECTION',0,'0','0',0,'0','0','0',0,'','','','','','geometrycollection',943),('DDL','DB2','ST_GEOMETRY',0,'0','0',0,'0','0','0',0,'','','','','','geometry',944),('DDL','DB2','ST_LINESTRING',0,'0','0',0,'0','0','0',0,'','','','','','linestring',945),('DDL','DB2','ST_POINT',0,'0','0',0,'0','0','0',0,'','','','','','point',946),('DDL','DB2','ST_POLYGON',0,'0','0',0,'0','0','0',0,'','','','','','polygon',947),('DDL','DB2','ST_SURFACE',0,'0','0',0,'0','0','0',0,'','','','','','surface',948),('DDL','DB2','ST_MULTICURVE',0,'0','0',0,'0','0','0',0,'','','','','','multicurve',949),('DDL','DB2','ST_MULTILINESTRING',0,'0','0',0,'0','0','0',0,'','','','','','multilinestring',950),('DDL','DB2','ST_MULTIPOINT',0,'0','0',0,'0','0','0',0,'','','','','','multipoint',951),('DDL','DB2','ST_MULTIPOLYGON',0,'0','0',0,'0','0','0',0,'','','','','','multipolygon',952),('DDL','DB2','ST_MULTISURFACE',0,'0','0',0,'0','0','0',0,'','','','','','multisurface',953);
/*!40000 ALTER TABLE `t_datatypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_diagram`
--

DROP TABLE IF EXISTS `t_diagram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_diagram` (
  `Diagram_ID` tinyint(4) DEFAULT NULL,
  `Package_ID` tinyint(4) DEFAULT NULL,
  `ParentID` tinyint(4) DEFAULT NULL,
  `Diagram_Type` varchar(7) DEFAULT NULL,
  `Name` varchar(21) DEFAULT NULL,
  `Version` decimal(2,1) DEFAULT NULL,
  `Author` varchar(4) DEFAULT NULL,
  `ShowDetails` tinyint(4) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Stereotype` varchar(0) DEFAULT NULL,
  `AttPub` varchar(4) DEFAULT NULL,
  `AttPri` varchar(4) DEFAULT NULL,
  `AttPro` varchar(4) DEFAULT NULL,
  `Orientation` varchar(1) DEFAULT NULL,
  `cx` smallint(6) DEFAULT NULL,
  `cy` smallint(6) DEFAULT NULL,
  `Scale` smallint(6) DEFAULT NULL,
  `CreatedDate` varchar(19) DEFAULT NULL,
  `ModifiedDate` varchar(19) DEFAULT NULL,
  `HTMLPath` varchar(0) DEFAULT NULL,
  `ShowForeign` varchar(4) DEFAULT NULL,
  `ShowBorder` varchar(4) DEFAULT NULL,
  `ShowPackageContents` varchar(4) DEFAULT NULL,
  `PDATA` varchar(249) DEFAULT NULL,
  `Locked` varchar(5) DEFAULT NULL,
  `ea_guid` varchar(38) DEFAULT NULL,
  `TPos` varchar(0) DEFAULT NULL,
  `Swimlanes` varchar(145) DEFAULT NULL,
  `StyleEx` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_diagram`
--

LOCK TABLES `t_diagram` WRITE;
/*!40000 ALTER TABLE `t_diagram` DISABLE KEYS */;
INSERT INTO `t_diagram` VALUES (1,2,0,'Logical','Starter Class Diagram',1.0,'Long',0,'','','True','True','True','P',826,1169,100,'2018-10-29 11:34:17','2018-11-26 18:25:08','','True','True','True','HideRel=0;ShowTags=0;ShowReqs=0;ShowCons=0;OpParams=1;ShowSN=0;ScalePI=0;PPgs.cx=1;PPgs.cy=1;PSize=9;ShowIcons=1;SuppCN=0;HideProps=0;HideParents=0;UseAlias=0;HideAtts=0;HideOps=0;HideStereo=0;HideEStereo=0;ShowRec=1;ShowRes=0;ShowShape=1;FormName=;','False','{77C9F9A2-4996-4dc5-B1E5-0C96A5C30701}','','locked=false;orientation=0;width=0;inbar=false;names=false;color=-1;bold=false;fcol=0;tcol=-1;ofCol=-1;ufCol=-1;hl=0;ufh=0;hh=0;cls=0;bw=0;hli=0;','ExcludeRTF=0;DocAll=0;HideQuals=0;AttPkg=1;ShowTests=0;ShowMaint=0;SuppressFOC=1;MatrixActive=0;SwimlanesActive=1;KanbanActive=0;MatrixLineWidth=1;MatrixLineClr=0;MatrixLocked=0;TConnectorNotation=UML 2.1;TExplicitNavigability=0;AdvancedElementProps=1;AdvancedFeatureProps=1;AdvancedConnectorProps=1;m_bElementClassifier=1;SPT=1;MDGDgm=;STBLDgm=;ShowNotes=0;VisibleAttributeDetail=0;ShowOpRetType=1;SuppressBrackets=0;SuppConnectorLabels=0;PrintPageHeadFoot=0;ShowAsList=0;SuppressedCompartments=;Theme=:119;SaveTag=B173CBBE;');
/*!40000 ALTER TABLE `t_diagram` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_diagramlinks`
--

DROP TABLE IF EXISTS `t_diagramlinks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_diagramlinks` (
  `DiagramID` varchar(0) DEFAULT NULL,
  `ConnectorID` varchar(0) DEFAULT NULL,
  `Geometry` varchar(0) DEFAULT NULL,
  `Style` varchar(0) DEFAULT NULL,
  `Hidden` varchar(0) DEFAULT NULL,
  `Path` varchar(0) DEFAULT NULL,
  `Instance_ID` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_diagramlinks`
--

LOCK TABLES `t_diagramlinks` WRITE;
/*!40000 ALTER TABLE `t_diagramlinks` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_diagramlinks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_diagramobjects`
--

DROP TABLE IF EXISTS `t_diagramobjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_diagramobjects` (
  `Diagram_ID` tinyint(4) DEFAULT NULL,
  `Object_ID` tinyint(4) DEFAULT NULL,
  `RectTop` smallint(6) DEFAULT NULL,
  `RectLeft` smallint(6) DEFAULT NULL,
  `RectRight` smallint(6) DEFAULT NULL,
  `RectBottom` smallint(6) DEFAULT NULL,
  `Sequence` tinyint(4) DEFAULT NULL,
  `ObjectStyle` varchar(14) DEFAULT NULL,
  `Instance_ID` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_diagramobjects`
--

LOCK TABLES `t_diagramobjects` WRITE;
/*!40000 ALTER TABLE `t_diagramobjects` DISABLE KEYS */;
INSERT INTO `t_diagramobjects` VALUES (1,4,-300,227,355,-513,4,'DUID=820075D5;',3),(1,5,-351,414,560,-511,3,'DUID=56E88496;',4),(1,7,-527,214,364,-727,1,'DUID=03385F64;',6),(1,6,-541,406,546,-689,2,'DUID=EDBE12CB;',20);
/*!40000 ALTER TABLE `t_diagramobjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_diagramtypes`
--

DROP TABLE IF EXISTS `t_diagramtypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_diagramtypes` (
  `Diagram_Type` varchar(19) DEFAULT NULL,
  `Name` varchar(19) DEFAULT NULL,
  `Package_ID` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_diagramtypes`
--

LOCK TABLES `t_diagramtypes` WRITE;
/*!40000 ALTER TABLE `t_diagramtypes` DISABLE KEYS */;
INSERT INTO `t_diagramtypes` VALUES ('Activity','Activity',1),('Analysis','Analysis',1),('Collaboration','Collaboration',1),('Component','Component',1),('CompositeStructure','CompositeStructure',1),('Custom','Custom',1),('Deployment','Deployment',1),('InteractionOverview','InteractionOverview',1),('Logical','Logical View',1),('Object','Object',1),('Package','Package',1),('Sequence','Sequence',1),('Statechart','Statechart',1),('Timing','Timing',1),('Use Case','Use Case View',1);
/*!40000 ALTER TABLE `t_diagramtypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_document`
--

DROP TABLE IF EXISTS `t_document`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_document` (
  `DocID` varchar(0) DEFAULT NULL,
  `DocName` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Style` varchar(0) DEFAULT NULL,
  `ElementID` varchar(0) DEFAULT NULL,
  `ElementType` varchar(0) DEFAULT NULL,
  `StrContent` varchar(0) DEFAULT NULL,
  `BinContent` varchar(0) DEFAULT NULL,
  `DocType` varchar(0) DEFAULT NULL,
  `Author` varchar(0) DEFAULT NULL,
  `Version` varchar(0) DEFAULT NULL,
  `IsActive` varchar(0) DEFAULT NULL,
  `Sequence` varchar(0) DEFAULT NULL,
  `DocDate` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_document`
--

LOCK TABLES `t_document` WRITE;
/*!40000 ALTER TABLE `t_document` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_document` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_ecf`
--

DROP TABLE IF EXISTS `t_ecf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_ecf` (
  `ECFID` varchar(5) DEFAULT NULL,
  `Description` varchar(38) DEFAULT NULL,
  `Weight` decimal(2,1) DEFAULT NULL,
  `Value` tinyint(4) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_ecf`
--

LOCK TABLES `t_ecf` WRITE;
/*!40000 ALTER TABLE `t_ecf` DISABLE KEYS */;
INSERT INTO `t_ecf` VALUES ('ECF01','Familiar with Rational Unified Process',1.5,4,''),('ECF02','Application experience',0.5,3,''),('ECF03','Object-oriented experience',1.0,4,''),('ECF04','Lead analyst capability',0.5,4,''),('ECF05','Motivation',1.0,3,''),('ECF06','Stable requirements',2.0,4,''),('ECF07','Part-time workers',-1.0,0,''),('ECF08','Difficult programming language',-1.0,3,'');
/*!40000 ALTER TABLE `t_ecf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_efforttypes`
--

DROP TABLE IF EXISTS `t_efforttypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_efforttypes` (
  `EffortType` varchar(12) DEFAULT NULL,
  `Description` varchar(36) DEFAULT NULL,
  `NumericWeight` tinyint(4) DEFAULT NULL,
  `Notes` varchar(158) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_efforttypes`
--

LOCK TABLES `t_efforttypes` WRITE;
/*!40000 ALTER TABLE `t_efforttypes` DISABLE KEYS */;
INSERT INTO `t_efforttypes` VALUES ('Analysis','Analyzing System',1,'Analysis'),('Coding','Developing code',1,'Code writing'),('Construction','Design and build system components',1,'The construction phase is concerned with designing and building the components necessary to implement the system as specified.'),('Design','Designing specifications',1,'Process of developing system design'),('Elaboration','Refine specification. Set up project',1,'The elaboration phase is concerned with refining the system specification, setting up project infrastructure and agreeing on the body of work to be completed.'),('Transition','Implementation, acceptance testing',1,'The Transition phase revolves around the implementation of the project and the acceptance testing carried out by the end user');
/*!40000 ALTER TABLE `t_efforttypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_files`
--

DROP TABLE IF EXISTS `t_files`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_files` (
  `FileID` varchar(0) DEFAULT NULL,
  `AppliesTo` varchar(0) DEFAULT NULL,
  `Category` varchar(0) DEFAULT NULL,
  `Name` varchar(0) DEFAULT NULL,
  `File` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `FileDate` varchar(0) DEFAULT NULL,
  `FileSize` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_files`
--

LOCK TABLES `t_files` WRITE;
/*!40000 ALTER TABLE `t_files` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_files` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_genopt`
--

DROP TABLE IF EXISTS `t_genopt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_genopt` (
  `AppliesTo` varchar(8) DEFAULT NULL,
  `Option` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_genopt`
--

LOCK TABLES `t_genopt` WRITE;
/*!40000 ALTER TABLE `t_genopt` DISABLE KEYS */;
INSERT INTO `t_genopt` VALUES ('CMACRO','_AFX_NO_DEBUG_CRT;_AFX_NO_OCC_SUPPORT;_AFX_OLD_EXCEPTIONS;_AFX_PACKING;_AFXDLL;_DEBUG;_MSC_VER;_UNICODE;AFX_CDECL;AFX_COMDAT;AFX_DATA;AFX_DATADEF;AFX_NOVTABLE;AFXAPI;APICALL;BEGIN_INTERFACE_PART ^ END_INTERFACE_PART;BEGIN_PARAM_MAP ^ END_PARAM_MAP;CONTROLLER_API;DECLARE_DYNAMIC();DECLARE_DYNCREATE();DECLARE_INTERFACE_MAP();DECLARE_MESSAGE_MAP();defined();PASCAL;SWLAPI;WINAPI;'),('Status',''),('class','nKill=0;nLang=1;sLang=Java;bConstructor=1;bConInline=0;sConScope=Public;bCpyConstructor=0;bCpyConInline=0;sCpyConScope=Public;bDestructor=1;bDesVirtual=1;bDesInline=0;sDesScope=Public;CHeader=.h;CBody=.cpp;JBody=.java;VBody=.cls;VBNetBody=.vb;WFSBody=.vbs;JavaScriptBody=.js;ModelicaBody=.mo;MDGBPSimExecutionEngineExtensionBody=;sAssocName=m_$LinkClass;bGetSet=1;bGenInterfaces=1;JCol=Vector;CCol=[];VCol=Collection;bVMultiuse=1;bVPersist=0;bVDatabind=0;bVDatasource=0;bVGlobal=0;bVCreatable=1;bVExposed=0;sMTS=0;sCRefType=*;sCGetPrefix=Get;sCSetPrefix=Set;sJGetPrefix=get;sJSetPrefix=set;sCSGetPrefix=Get;sCSSetPrefix=Set;sVVersion=6.0;CSBody=.cs;DBody=.pas;bJInnerClasses=1;sJCollection=;sCodePage=;sPHPBody=.php;sPHPVersion=;sPHPGetPrefix=get;sPHPSetPrefix=set;ASBody=.as;PyBody=.py;CPPVersion=;ASVersion=2.0;ANSICHeader=.h;ANSICBody=.c;ANSIC_OOSupport=0;ANSIC_NSDLMT=_;ANSIC_RefParam=1;ANSIC_RefStyle=*;ANSIC_RefName=this;ANSIC_ConstructorName=new;ANSIC_DestructorName=delete;CPPCollections=CArray<#TYPE#>CMap<CString,LPCTSTR,#TYPE#*,#TYPE#*>;CSCollections=List<#TYPE#>Stack<#TYPE#>Queue<#TYPE#>;JCollections=HashSet<#TYPE#>Map<String,#TYPE#>List<#TYPE#>;CPPWrappers=unique_ptr<#TYPE#>shared_ptr<#TYPE#>weak_ptr<#TYPE#>;'),('scenario','usesManagedList=0;');
/*!40000 ALTER TABLE `t_genopt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_glossary`
--

DROP TABLE IF EXISTS `t_glossary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_glossary` (
  `Term` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL,
  `Meaning` varchar(0) DEFAULT NULL,
  `GlossaryID` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_glossary`
--

LOCK TABLES `t_glossary` WRITE;
/*!40000 ALTER TABLE `t_glossary` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_glossary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_html`
--

DROP TABLE IF EXISTS `t_html`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_html` (
  `Type` varchar(0) DEFAULT NULL,
  `Template` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_html`
--

LOCK TABLES `t_html` WRITE;
/*!40000 ALTER TABLE `t_html` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_html` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_image`
--

DROP TABLE IF EXISTS `t_image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_image` (
  `ImageID` varchar(0) DEFAULT NULL,
  `Name` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL,
  `Image` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_image`
--

LOCK TABLES `t_image` WRITE;
/*!40000 ALTER TABLE `t_image` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_implement`
--

DROP TABLE IF EXISTS `t_implement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_implement` (
  `Type` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_implement`
--

LOCK TABLES `t_implement` WRITE;
/*!40000 ALTER TABLE `t_implement` DISABLE KEYS */;
INSERT INTO `t_implement` VALUES ('Requirement'),('UseCase'),('Component');
/*!40000 ALTER TABLE `t_implement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_issues`
--

DROP TABLE IF EXISTS `t_issues`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_issues` (
  `Issue` varchar(0) DEFAULT NULL,
  `IssueDate` varchar(0) DEFAULT NULL,
  `Owner` varchar(0) DEFAULT NULL,
  `Status` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Resolver` varchar(0) DEFAULT NULL,
  `DateResolved` varchar(0) DEFAULT NULL,
  `Resolution` varchar(0) DEFAULT NULL,
  `IssueID` varchar(0) DEFAULT NULL,
  `Category` varchar(0) DEFAULT NULL,
  `Priority` varchar(0) DEFAULT NULL,
  `Severity` varchar(0) DEFAULT NULL,
  `IssueType` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_issues`
--

LOCK TABLES `t_issues` WRITE;
/*!40000 ALTER TABLE `t_issues` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_issues` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_lists`
--

DROP TABLE IF EXISTS `t_lists`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_lists` (
  `ListID` varchar(38) DEFAULT NULL,
  `Category` varchar(15) DEFAULT NULL,
  `Name` varchar(11) DEFAULT NULL,
  `NVal` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_lists`
--

LOCK TABLES `t_lists` WRITE;
/*!40000 ALTER TABLE `t_lists` DISABLE KEYS */;
INSERT INTO `t_lists` VALUES ('{1E9843C4-0788-4948-8FCA-EF9E0D9B9369}','ConstStatusType','Build','',''),('{4C61C3E6-B721-41a7-BFB3-699DF50BC4D9}','ConstStatusType','Validated','',''),('{5A276B14-D271-431f-A63C-D76B5572F829}','ConstStatusType','Proposed','',''),('{AC15A9A3-8278-4e4e-AA88-23DF5EA35B43}','ConstStatusType','Approved','',''),('{CD22EDBC-4F15-4b1c-A8D9-EAC780A2CE98}','ConstStatusType','Mandatory','',''),('{FDF9A368-23F8-4730-9637-D43E35628A12}','ConstStatusType','Implemented','','');
/*!40000 ALTER TABLE `t_lists` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_mainttypes`
--

DROP TABLE IF EXISTS `t_mainttypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_mainttypes` (
  `MaintType` varchar(0) DEFAULT NULL,
  `Description` varchar(0) DEFAULT NULL,
  `NumericWeight` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_mainttypes`
--

LOCK TABLES `t_mainttypes` WRITE;
/*!40000 ALTER TABLE `t_mainttypes` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_mainttypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_method`
--

DROP TABLE IF EXISTS `t_method`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_method` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `Name` varchar(0) DEFAULT NULL,
  `Scope` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_method`
--

LOCK TABLES `t_method` WRITE;
/*!40000 ALTER TABLE `t_method` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_method` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_metrictypes`
--

DROP TABLE IF EXISTS `t_metrictypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_metrictypes` (
  `Metric` varchar(8) DEFAULT NULL,
  `Description` varchar(35) DEFAULT NULL,
  `NumericWeight` tinyint(4) DEFAULT NULL,
  `Notes` varchar(62) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_metrictypes`
--

LOCK TABLES `t_metrictypes` WRITE;
/*!40000 ALTER TABLE `t_metrictypes` DISABLE KEYS */;
INSERT INTO `t_metrictypes` VALUES ('Breakage','Convergence, rework, software scrap',1,'Reworked SLOC per change. '),('Change','Change control, stability',1,'Change requests, '),('Cost','Budget, cost, expenditure',1,'Cost per day, percentage expended.'),('Progress','Iteration, planning, actuals',1,'Measures such as function points, SLOC, scenarios, test cases.'),('Team','Staffing, team dynamics',1,'Resource turnover');
/*!40000 ALTER TABLE `t_metrictypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_object`
--

DROP TABLE IF EXISTS `t_object`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_object` (
  `Object_ID` tinyint(4) DEFAULT NULL,
  `Object_Type` varchar(7) DEFAULT NULL,
  `Diagram_ID` tinyint(4) DEFAULT NULL,
  `Name` varchar(13) DEFAULT NULL,
  `Alias` varchar(0) DEFAULT NULL,
  `Author` varchar(4) DEFAULT NULL,
  `Version` decimal(2,1) DEFAULT NULL,
  `Note` varchar(0) DEFAULT NULL,
  `Package_ID` tinyint(4) DEFAULT NULL,
  `Stereotype` varchar(0) DEFAULT NULL,
  `NType` tinyint(4) DEFAULT NULL,
  `Complexity` tinyint(4) DEFAULT NULL,
  `Effort` tinyint(4) DEFAULT NULL,
  `Style` varchar(0) DEFAULT NULL,
  `Backcolor` tinyint(4) DEFAULT NULL,
  `BorderStyle` tinyint(4) DEFAULT NULL,
  `BorderWidth` tinyint(4) DEFAULT NULL,
  `Fontcolor` tinyint(4) DEFAULT NULL,
  `Bordercolor` tinyint(4) DEFAULT NULL,
  `CreatedDate` varchar(19) DEFAULT NULL,
  `ModifiedDate` varchar(19) DEFAULT NULL,
  `Status` varchar(8) DEFAULT NULL,
  `Abstract` tinyint(4) DEFAULT NULL,
  `Tagged` tinyint(4) DEFAULT NULL,
  `PDATA1` varchar(1) DEFAULT NULL,
  `PDATA2` varchar(4) DEFAULT NULL,
  `PDATA3` varchar(0) DEFAULT NULL,
  `PDATA4` varchar(1) DEFAULT NULL,
  `PDATA5` varchar(0) DEFAULT NULL,
  `Concurrency` varchar(0) DEFAULT NULL,
  `Visibility` varchar(0) DEFAULT NULL,
  `Persistence` varchar(0) DEFAULT NULL,
  `Cardinality` varchar(0) DEFAULT NULL,
  `GenType` varchar(6) DEFAULT NULL,
  `GenFile` varchar(0) DEFAULT NULL,
  `Header1` varchar(0) DEFAULT NULL,
  `Header2` varchar(0) DEFAULT NULL,
  `Phase` decimal(2,1) DEFAULT NULL,
  `Scope` varchar(6) DEFAULT NULL,
  `GenOption` varchar(0) DEFAULT NULL,
  `GenLinks` varchar(0) DEFAULT NULL,
  `Classifier` tinyint(4) DEFAULT NULL,
  `ea_guid` varchar(38) DEFAULT NULL,
  `ParentID` tinyint(4) DEFAULT NULL,
  `RunState` varchar(0) DEFAULT NULL,
  `Classifier_guid` varchar(0) DEFAULT NULL,
  `TPos` varchar(1) DEFAULT NULL,
  `IsRoot` varchar(5) DEFAULT NULL,
  `IsLeaf` varchar(5) DEFAULT NULL,
  `IsSpec` varchar(5) DEFAULT NULL,
  `IsActive` varchar(5) DEFAULT NULL,
  `StateFlags` varchar(0) DEFAULT NULL,
  `PackageFlags` varchar(0) DEFAULT NULL,
  `Multiplicity` varchar(0) DEFAULT NULL,
  `StyleEx` varchar(0) DEFAULT NULL,
  `ActionFlags` varchar(0) DEFAULT NULL,
  `EventFlags` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_object`
--

LOCK TABLES `t_object` WRITE;
/*!40000 ALTER TABLE `t_object` DISABLE KEYS */;
INSERT INTO `t_object` VALUES (1,'Package',0,'Class Diagram','','Long',1.0,'',1,'',0,1,0,'',-1,0,-1,-1,-1,'2018-10-29 11:34:17','2018-10-29 11:34:26','Proposed',0,0,'2','','','','','','','','','<none>','','','',1.0,'Public','','',0,'{8C7719A1-89A3-4076-8258-7BF191DE824F}',0,'','','1','False','False','False','False','','','','','',''),(4,'Class',0,'Product','','Long',1.0,'',2,'',0,1,0,'',-1,0,-1,-1,-1,'2018-10-29 11:36:19','2018-10-29 11:36:25','Proposed',0,0,'','','','0','','','','','','Java','','','',1.0,'Public','','',0,'{41BB48A0-C0B3-491b-A4EE-18471A7D1C62}',0,'','','','False','False','False','False','','','','','',''),(5,'Class',0,'Account','','Long',1.0,'',2,'',0,1,0,'',-1,0,-1,-1,-1,'2018-10-29 11:38:03','2018-10-29 11:38:07','Proposed',0,0,'','','','0','','','','','','Java','','','',1.0,'Public','','',0,'{CD2910BB-C136-497f-9F90-AFB8E08C8CDD}',0,'','','','False','False','False','False','','','','','',''),(6,'Class',0,'User','','Long',1.0,'',2,'',0,1,0,'',-1,0,-1,-1,-1,'2018-10-29 11:56:43','2018-10-29 11:56:52','Proposed',0,0,'','Java','','0','','','','','','Java','','','',1.0,'Public','','',0,'{A01F4F49-67F1-42e5-8D20-624574AB0FB9}',0,'','','','False','False','False','False','','','','','',''),(7,'Class',0,'Order','','Long',1.0,'',2,'',0,1,0,'',-1,0,-1,-1,-1,'2018-10-29 11:57:42','2018-10-29 11:57:46','Proposed',0,0,'','','','0','','','','','','Java','','','',1.0,'Public','','',0,'{139236AD-67A5-432d-A007-F697D87033D1}',0,'','','','False','False','False','False','','','','','',''),(15,'Class',0,'Admin','','Long',1.0,'',2,'',0,1,0,'',-1,0,-1,-1,-1,'2018-10-29 13:01:46','2018-10-29 13:02:46','Proposed',0,0,'','Java','','0','','','','','','Java','','','',1.0,'Public','','',0,'{C5C22E17-8A12-4b3e-AD45-5252DEF0F82D}',0,'','','','False','False','False','False','','','','','','');
/*!40000 ALTER TABLE `t_object` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objectconstraint`
--

DROP TABLE IF EXISTS `t_objectconstraint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objectconstraint` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `Constraint` varchar(0) DEFAULT NULL,
  `ConstraintType` varchar(0) DEFAULT NULL,
  `Weight` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Status` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objectconstraint`
--

LOCK TABLES `t_objectconstraint` WRITE;
/*!40000 ALTER TABLE `t_objectconstraint` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objectconstraint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objecteffort`
--

DROP TABLE IF EXISTS `t_objecteffort`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objecteffort` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `Effort` varchar(0) DEFAULT NULL,
  `EffortType` varchar(0) DEFAULT NULL,
  `EValue` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objecteffort`
--

LOCK TABLES `t_objecteffort` WRITE;
/*!40000 ALTER TABLE `t_objecteffort` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objecteffort` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objectfiles`
--

DROP TABLE IF EXISTS `t_objectfiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objectfiles` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `FileName` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL,
  `Note` varchar(0) DEFAULT NULL,
  `FileSize` varchar(0) DEFAULT NULL,
  `FileDate` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objectfiles`
--

LOCK TABLES `t_objectfiles` WRITE;
/*!40000 ALTER TABLE `t_objectfiles` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objectfiles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objectmetrics`
--

DROP TABLE IF EXISTS `t_objectmetrics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objectmetrics` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `Metric` varchar(0) DEFAULT NULL,
  `MetricType` varchar(0) DEFAULT NULL,
  `EValue` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objectmetrics`
--

LOCK TABLES `t_objectmetrics` WRITE;
/*!40000 ALTER TABLE `t_objectmetrics` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objectmetrics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objectproblems`
--

DROP TABLE IF EXISTS `t_objectproblems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objectproblems` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `Problem` varchar(0) DEFAULT NULL,
  `ProblemType` varchar(0) DEFAULT NULL,
  `DateReported` varchar(0) DEFAULT NULL,
  `Status` varchar(0) DEFAULT NULL,
  `ProblemNotes` varchar(0) DEFAULT NULL,
  `ReportedBy` varchar(0) DEFAULT NULL,
  `ResolvedBy` varchar(0) DEFAULT NULL,
  `DateResolved` varchar(0) DEFAULT NULL,
  `Version` varchar(0) DEFAULT NULL,
  `ResolverNotes` varchar(0) DEFAULT NULL,
  `Priority` varchar(0) DEFAULT NULL,
  `Severity` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objectproblems`
--

LOCK TABLES `t_objectproblems` WRITE;
/*!40000 ALTER TABLE `t_objectproblems` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objectproblems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objectproperties`
--

DROP TABLE IF EXISTS `t_objectproperties`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objectproperties` (
  `PropertyID` varchar(0) DEFAULT NULL,
  `Object_ID` varchar(0) DEFAULT NULL,
  `Property` varchar(0) DEFAULT NULL,
  `Value` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `ea_guid` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objectproperties`
--

LOCK TABLES `t_objectproperties` WRITE;
/*!40000 ALTER TABLE `t_objectproperties` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objectproperties` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objectrequires`
--

DROP TABLE IF EXISTS `t_objectrequires`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objectrequires` (
  `ReqID` varchar(0) DEFAULT NULL,
  `Object_ID` varchar(0) DEFAULT NULL,
  `Requirement` varchar(0) DEFAULT NULL,
  `ReqType` varchar(0) DEFAULT NULL,
  `Status` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Stability` varchar(0) DEFAULT NULL,
  `Difficulty` varchar(0) DEFAULT NULL,
  `Priority` varchar(0) DEFAULT NULL,
  `LastUpdate` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objectrequires`
--

LOCK TABLES `t_objectrequires` WRITE;
/*!40000 ALTER TABLE `t_objectrequires` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objectrequires` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objectresource`
--

DROP TABLE IF EXISTS `t_objectresource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objectresource` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `Resource` varchar(0) DEFAULT NULL,
  `Role` varchar(0) DEFAULT NULL,
  `Time` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `PercentComplete` varchar(0) DEFAULT NULL,
  `DateStart` varchar(0) DEFAULT NULL,
  `DateEnd` varchar(0) DEFAULT NULL,
  `History` varchar(0) DEFAULT NULL,
  `ExpectedHours` varchar(0) DEFAULT NULL,
  `ActualHours` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objectresource`
--

LOCK TABLES `t_objectresource` WRITE;
/*!40000 ALTER TABLE `t_objectresource` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objectresource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objectrisks`
--

DROP TABLE IF EXISTS `t_objectrisks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objectrisks` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `Risk` varchar(0) DEFAULT NULL,
  `RiskType` varchar(0) DEFAULT NULL,
  `EValue` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objectrisks`
--

LOCK TABLES `t_objectrisks` WRITE;
/*!40000 ALTER TABLE `t_objectrisks` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objectrisks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objectscenarios`
--

DROP TABLE IF EXISTS `t_objectscenarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objectscenarios` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `Scenario` varchar(0) DEFAULT NULL,
  `ScenarioType` varchar(0) DEFAULT NULL,
  `EValue` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `XMLContent` varchar(0) DEFAULT NULL,
  `ea_guid` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objectscenarios`
--

LOCK TABLES `t_objectscenarios` WRITE;
/*!40000 ALTER TABLE `t_objectscenarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objectscenarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objecttests`
--

DROP TABLE IF EXISTS `t_objecttests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objecttests` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `Test` varchar(0) DEFAULT NULL,
  `TestClass` varchar(0) DEFAULT NULL,
  `TestType` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `InputData` varchar(0) DEFAULT NULL,
  `AcceptanceCriteria` varchar(0) DEFAULT NULL,
  `Status` varchar(0) DEFAULT NULL,
  `DateRun` varchar(0) DEFAULT NULL,
  `Results` varchar(0) DEFAULT NULL,
  `RunBy` varchar(0) DEFAULT NULL,
  `CheckBy` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objecttests`
--

LOCK TABLES `t_objecttests` WRITE;
/*!40000 ALTER TABLE `t_objecttests` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objecttests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objecttrx`
--

DROP TABLE IF EXISTS `t_objecttrx`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objecttrx` (
  `Object_ID` varchar(0) DEFAULT NULL,
  `TRX` varchar(0) DEFAULT NULL,
  `TRXType` varchar(0) DEFAULT NULL,
  `Weight` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objecttrx`
--

LOCK TABLES `t_objecttrx` WRITE;
/*!40000 ALTER TABLE `t_objecttrx` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_objecttrx` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_objecttypes`
--

DROP TABLE IF EXISTS `t_objecttypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_objecttypes` (
  `Object_Type` varchar(27) DEFAULT NULL,
  `Description` varchar(27) DEFAULT NULL,
  `DesignObject` varchar(5) DEFAULT NULL,
  `ImageID` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_objecttypes`
--

LOCK TABLES `t_objecttypes` WRITE;
/*!40000 ALTER TABLE `t_objecttypes` DISABLE KEYS */;
INSERT INTO `t_objecttypes` VALUES ('Action','Action','True',8),('ActionPin','ActionPin','True',8),('Activity','Activity','False',21),('ActivityParameter','ActivityParameter','True',8),('ActivityPartition','ActivityPartition','True',8),('ActivityRegion','ActivityRegion','True',8),('Actor','Actor','False',6),('Artifact','UML Artifact','True',8),('Association','Association','False',0),('Boundary','Boundary','False',0),('CentralBufferNode','CentralBufferNode','True',8),('Change','Change','True',19),('Class','Class','True',5),('Collaboration','Collaboration','False',7),('CollaborationOccurrence','CollaborationOccurrence','True',8),('Comment','Comment','True',8),('Component','Component','True',10),('ConditionalNode','ConditionalNode','True',8),('Constraint','Constraint','True',8),('DataStore','DataStore','True',8),('DataType','DataType','True',8),('Decision','Decision','False',0),('DeploymentSpecification','DeploymentSpecification','True',8),('Device','Device','True',8),('DiagramFrame','DiagramFrame','True',8),('Entity','Entity','False',5),('EntryPoint','UML Entry Point','True',8),('Enumeration','Enumeration','True',8),('Event','Event','False',0),('ExceptionHandler','ExceptionHandler','True',8),('ExecutionEnvironment','ExecutionEnvironment','True',8),('ExitPoint','UML Exit Point','True',8),('ExpansionNode','UML Expansion Node','True',8),('ExpansionRegion','ExpansionRegion','True',8),('Feature','Feature','True',8),('GUIElement','User interface object','True',16),('InformationItem','InformationItem','True',8),('Interaction','Interaction','True',8),('InteractionFragment','InteractionFragment','True',8),('InteractionOccurrence','InteractionOccurrence','True',8),('InteractionState','InteractionState','True',8),('Interface','Interface','False',8),('InterruptibleActivityRegion','InterruptibleActivityRegion','True',8),('Issue','Issue','True',19),('Label','Label','False',0),('LoopNode','LoopNode','True',8),('MergeNode','MergeNode','True',8),('MessageEndpoint','MessageEndpoint','True',8),('Node','Node','True',9),('Note','Note','False',0),('Object','Object','False',5),('ObjectNode','ObjectNode','True',8),('Package','Package','True',4),('Parameter','UML Activity Parameter','True',8),('Part','Part','True',8),('Port','UML Port','True',8),('PrimitiveType','PrimitiveType','True',8),('ProtocolStateMachine','ProtocolStateMachine','True',8),('ProvidedInterface','ProvidedInterface','True',8),('Region','Region','True',8),('Report','System report','True',17),('RequiredInterface','RequiredInterface','True',8),('Requirement','Requirement','True',19),('Risk','Risk','True',8),('Screen','Interface Screen','True',11),('Sequence','Sequence','False',0),('Signal','Signal','True',8),('State','State Chart Object','True',20),('StateMachine','StateMachine','True',8),('StateNode','Start End State','False',59),('Synchronization','Synchronization','False',0),('Task','Task','True',8),('Text','Text','False',0),('TimeLine','TimeLine','True',8),('Trigger','Trigger','True',8),('UMLDiagram','UML Diagram','True',8),('UseCase','UseCase','False',7),('User','User','False',0),('Defect','Defect','True',8),('Test','Test','True',8);
/*!40000 ALTER TABLE `t_objecttypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_ocf`
--

DROP TABLE IF EXISTS `t_ocf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_ocf` (
  `ObjectType` varchar(7) DEFAULT NULL,
  `ComplexityWeight` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_ocf`
--

LOCK TABLES `t_ocf` WRITE;
/*!40000 ALTER TABLE `t_ocf` DISABLE KEYS */;
INSERT INTO `t_ocf` VALUES ('Actor',1),('UseCase',5);
/*!40000 ALTER TABLE `t_ocf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_operation`
--

DROP TABLE IF EXISTS `t_operation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_operation` (
  `OperationID` tinyint(4) DEFAULT NULL,
  `Object_ID` tinyint(4) DEFAULT NULL,
  `Name` varchar(14) DEFAULT NULL,
  `Scope` varchar(6) DEFAULT NULL,
  `Type` varchar(7) DEFAULT NULL,
  `ReturnArray` varchar(0) DEFAULT NULL,
  `Stereotype` varchar(0) DEFAULT NULL,
  `IsStatic` varchar(0) DEFAULT NULL,
  `Concurrency` varchar(10) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Behaviour` varchar(0) DEFAULT NULL,
  `Abstract` varchar(0) DEFAULT NULL,
  `GenOption` varchar(0) DEFAULT NULL,
  `Synchronized` varchar(0) DEFAULT NULL,
  `Pos` tinyint(4) DEFAULT NULL,
  `Const` varchar(0) DEFAULT NULL,
  `Style` varchar(0) DEFAULT NULL,
  `Pure` varchar(5) DEFAULT NULL,
  `Throws` varchar(0) DEFAULT NULL,
  `Classifier` varchar(1) DEFAULT NULL,
  `Code` varchar(0) DEFAULT NULL,
  `IsRoot` varchar(5) DEFAULT NULL,
  `IsLeaf` varchar(5) DEFAULT NULL,
  `IsQuery` varchar(5) DEFAULT NULL,
  `StateFlags` varchar(0) DEFAULT NULL,
  `ea_guid` varchar(38) DEFAULT NULL,
  `StyleEx` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_operation`
--

LOCK TABLES `t_operation` WRITE;
/*!40000 ALTER TABLE `t_operation` DISABLE KEYS */;
INSERT INTO `t_operation` VALUES (28,6,'getOrderList','Public','Order[]','','','','Sequential','','','','','',2,'','','False','','0','','False','False','False','','{B25E02F7-DE72-41a6-8DD9-4FE0170A600A}',''),(29,7,'add','Public','void','','','','Sequential','','','','','',2,'','','False','','','','False','False','False','','{7C89E79C-1784-41ad-A1A1-473CFE07CE3B}',''),(30,7,'edit','Public','void','','','','Sequential','','','','','',3,'','','False','','','','False','False','False','','{6E13AC67-70A5-4778-9C0C-E97010B0521B}',''),(31,7,'getList','Public','Order[]','','','','Sequential','','','','','',4,'','','False','','0','','False','False','False','','{77483B3C-196D-4a2a-A9F7-92CFF1E177A2}',''),(32,4,'getList','Public','void','','','','Sequential','','','','','',5,'','','False','','','','False','False','False','','{115C992B-F72E-4bf6-9F56-E3CE15E765CD}',''),(33,4,'add','Public','void','','','','Sequential','','','','','',6,'','','False','','','','False','False','False','','{0070255D-AFF1-4304-AEC8-0B6882FB83EB}',''),(34,4,'delete','Public','void','','','','Sequential','','','','','',7,'','','False','','','','False','False','False','','{541EA2E1-09E1-4159-950C-6724E6D1A612}',''),(35,4,'edit','Public','void','','','','Sequential','','','','','',8,'','','False','','','','False','False','False','','{792CCAC2-280C-4934-90F8-62179F8B0B8A}',''),(36,4,'detail','Public','void','','','','Sequential','','','','','',9,'','','False','','','','False','False','False','','{9E6FDF28-D646-4f9e-85BE-5BC7822368BB}',''),(37,6,'addProduct','Public','void','','','','Sequential','','','','','',3,'','','False','','','','False','False','False','','{14D8A2A7-51C5-4257-892F-D685F70661D8}',''),(39,6,'deleteProduct','Public','void','','','','Sequential','','','','','',4,'','','False','','','','False','False','False','','{ECB7D6AA-2007-43f1-9344-39120F95C48D}',''),(1,4,'getName','Public','string','','','','Sequential','','','','','',0,'','','False','','0','','False','False','False','','{E0A6B694-23AD-479a-B4F4-A46B811755D9}',''),(2,4,'getPrice','Public','int','','','','Sequential','','','','','',1,'','','False','','0','','False','False','False','','{A499490C-3555-41cf-973D-E1C32BF4945D}',''),(3,5,'getUsername','Public','string','','','','Sequential','','','','','',0,'','','False','','0','','False','False','False','','{52597EF9-C502-48d2-A32E-162A04F58FDD}',''),(4,5,'getPassword','Public','string','','','','Sequential','','','','','',1,'','','False','','0','','False','False','False','','{93012881-5D72-496d-940A-E48FE00267FE}',''),(5,5,'isAdmin','Public','bool','','','','Sequential','','','','','',2,'','','False','','0','','False','False','False','','{5250D615-3D7C-4d93-8FA2-02962DFD063F}',''),(6,4,'setName','Public','void','','','','Sequential','','','','','',2,'','','False','','','','False','False','False','','{814469F7-9966-449f-86BC-60638C6F316A}',''),(7,4,'setPrice','Public','void','','','','Sequential','','','','','',3,'','','False','','','','False','False','False','','{7A682946-087F-4fe0-852B-5F564DFA45FA}',''),(8,5,'setPassword','Public','void','','','','Sequential','','','','','',3,'','','False','','','','False','False','False','','{66411729-CE82-4a7d-A3CA-3842FF3C8AAE}',''),(9,5,'getID','Public','int','','','','Sequential','','','','','',4,'','','False','','0','','False','False','False','','{018F53C4-54BD-48d9-8A67-1A5E7EA72710}',''),(10,7,'getInformation','Public','Object','','','','Sequential','','','','','',0,'','','False','','0','','False','False','False','','{CEB29333-C248-47c8-A8EC-9F35DEA13C6F}',''),(11,7,'nextStatus','Public','void','','','','Sequential','','','','','',2,'','','False','','','','False','False','False','','{75AC3E9C-B2A4-4745-B350-71EB227596CA}',''),(12,4,'getID','Public','int','','','','Sequential','','','','','',4,'','','False','','0','','False','False','False','','{A50F5F40-E250-4b0e-8103-CBAC5EC27DDE}',''),(13,6,'addOrder','Public','void','','','','Sequential','','','','','',0,'','','False','','','','False','False','False','','{024D73DD-9634-4727-BB83-6A74441C330C}',''),(14,6,'cancelOrder','Public','void','','','','Sequential','','','','','',1,'','','False','','','','False','False','False','','{A0F29349-6882-42bb-BC1D-35A9C174E00F}',''),(21,15,'addProduct','Public','void','','','','Sequential','','','','','',0,'','','False','','','','False','False','False','','{9FA4E79A-E47C-4950-A1D0-DEA435F1E484}',''),(22,15,'removeProduct','Public','void','','','','Sequential','','','','','',1,'','','False','','','','False','False','False','','{23A045A1-5123-41f8-8744-087492D471B7}',''),(23,15,'getOrderList','Public','Order[]','','','','Sequential','','','','','',2,'','','False','','0','','False','False','False','','{52E193DD-83FB-4b1d-B581-45FFED788DDB}',''),(24,15,'setOrderStatus','Public','void','','','','Sequential','','','','','',3,'','','False','','','','False','False','False','','{1F1E9852-A439-4693-87DE-E8EC7C8908F1}','');
/*!40000 ALTER TABLE `t_operation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_operationparams`
--

DROP TABLE IF EXISTS `t_operationparams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_operationparams` (
  `OperationID` tinyint(4) DEFAULT NULL,
  `Name` varchar(8) DEFAULT NULL,
  `Type` varchar(7) DEFAULT NULL,
  `Default` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Pos` tinyint(4) DEFAULT NULL,
  `Const` varchar(5) DEFAULT NULL,
  `Style` varchar(0) DEFAULT NULL,
  `Kind` varchar(2) DEFAULT NULL,
  `Classifier` tinyint(4) DEFAULT NULL,
  `ea_guid` varchar(38) DEFAULT NULL,
  `StyleEx` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_operationparams`
--

LOCK TABLES `t_operationparams` WRITE;
/*!40000 ALTER TABLE `t_operationparams` DISABLE KEYS */;
INSERT INTO `t_operationparams` VALUES (6,'name','string','','',0,'False','','in',0,'{6C431032-980A-4d0d-BAF3-A09BD1B24109}',''),(7,'price','int','','',0,'False','','in',0,'{C7C69A77-C624-45a5-84E0-CAB417E8A75E}',''),(8,'password','string','','',0,'False','','in',0,'{50399DEC-CA46-4ee7-82BA-D121010973A6}',''),(13,'order','Order','','',0,'False','','in',0,'{65C9D56F-B2C5-4f51-86E5-2F15010832D6}',''),(14,'order','Order','','',0,'False','','in',0,'{19DD07B0-5294-46de-840D-65FB140255AA}',''),(21,'product','Product','','',0,'False','','in',0,'{FC24AF09-8ABE-4163-8AF7-79F0F005D72E}',''),(22,'product','Product','','',0,'False','','in',0,'{37857486-A2E1-4f5f-9ACF-011A7F81B409}',''),(24,'order','Order','','',0,'False','','in',0,'{2BF175F5-8DF4-4f73-9EC0-6CC25384A46C}',''),(24,'status','string','','',1,'False','','in',0,'{743BDF85-83FA-4994-96A5-23CB3804288C}','');
/*!40000 ALTER TABLE `t_operationparams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_operationposts`
--

DROP TABLE IF EXISTS `t_operationposts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_operationposts` (
  `OperationID` varchar(0) DEFAULT NULL,
  `PostCondition` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_operationposts`
--

LOCK TABLES `t_operationposts` WRITE;
/*!40000 ALTER TABLE `t_operationposts` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_operationposts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_operationpres`
--

DROP TABLE IF EXISTS `t_operationpres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_operationpres` (
  `OperationID` varchar(0) DEFAULT NULL,
  `PreCondition` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_operationpres`
--

LOCK TABLES `t_operationpres` WRITE;
/*!40000 ALTER TABLE `t_operationpres` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_operationpres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_operationtag`
--

DROP TABLE IF EXISTS `t_operationtag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_operationtag` (
  `PropertyID` varchar(0) DEFAULT NULL,
  `ElementID` varchar(0) DEFAULT NULL,
  `Property` varchar(0) DEFAULT NULL,
  `VALUE` varchar(0) DEFAULT NULL,
  `NOTES` varchar(0) DEFAULT NULL,
  `ea_guid` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_operationtag`
--

LOCK TABLES `t_operationtag` WRITE;
/*!40000 ALTER TABLE `t_operationtag` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_operationtag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_package`
--

DROP TABLE IF EXISTS `t_package`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_package` (
  `Package_ID` tinyint(4) DEFAULT NULL,
  `Name` varchar(13) DEFAULT NULL,
  `Parent_ID` tinyint(4) DEFAULT NULL,
  `CreatedDate` varchar(19) DEFAULT NULL,
  `ModifiedDate` varchar(19) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `ea_guid` varchar(38) DEFAULT NULL,
  `XMLPath` varchar(0) DEFAULT NULL,
  `IsControlled` varchar(5) DEFAULT NULL,
  `LastLoadDate` varchar(19) DEFAULT NULL,
  `LastSaveDate` varchar(19) DEFAULT NULL,
  `Version` varchar(3) DEFAULT NULL,
  `Protected` varchar(5) DEFAULT NULL,
  `PkgOwner` varchar(0) DEFAULT NULL,
  `UMLVersion` varchar(0) DEFAULT NULL,
  `UseDTD` varchar(5) DEFAULT NULL,
  `LogXML` varchar(5) DEFAULT NULL,
  `CodePath` varchar(0) DEFAULT NULL,
  `Namespace` varchar(0) DEFAULT NULL,
  `TPos` varchar(1) DEFAULT NULL,
  `PackageFlags` varchar(6) DEFAULT NULL,
  `BatchSave` varchar(1) DEFAULT NULL,
  `BatchLoad` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_package`
--

LOCK TABLES `t_package` WRITE;
/*!40000 ALTER TABLE `t_package` DISABLE KEYS */;
INSERT INTO `t_package` VALUES (1,'Model',0,'2012-04-17 00:00:00','2012-04-17 00:00:00','','{190CD5C3-FDCC-4066-ADA0-48197C110278}','','False','2018-10-29 11:34:17','','','False','','','False','False','','','','','',''),(2,'Class Diagram',1,'2018-10-29 11:34:17','2018-10-29 11:34:26','','{8C7719A1-89A3-4076-8258-7BF191DE824F}','','False','2018-10-29 11:34:17','2018-10-29 11:34:17','1.0','False','','','False','False','','','1','CRC=0;','0','0');
/*!40000 ALTER TABLE `t_package` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_palette`
--

DROP TABLE IF EXISTS `t_palette`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_palette` (
  `PaletteID` varchar(0) DEFAULT NULL,
  `Name` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_palette`
--

LOCK TABLES `t_palette` WRITE;
/*!40000 ALTER TABLE `t_palette` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_palette` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_paletteitem`
--

DROP TABLE IF EXISTS `t_paletteitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_paletteitem` (
  `PaletteID` varchar(0) DEFAULT NULL,
  `ItemID` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_paletteitem`
--

LOCK TABLES `t_paletteitem` WRITE;
/*!40000 ALTER TABLE `t_paletteitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_paletteitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_phase`
--

DROP TABLE IF EXISTS `t_phase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_phase` (
  `PhaseID` varchar(0) DEFAULT NULL,
  `PhaseName` varchar(0) DEFAULT NULL,
  `PhaseNotes` varchar(0) DEFAULT NULL,
  `PhaseStyle` varchar(0) DEFAULT NULL,
  `StartDate` varchar(0) DEFAULT NULL,
  `EndDate` varchar(0) DEFAULT NULL,
  `PhaseContent` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_phase`
--

LOCK TABLES `t_phase` WRITE;
/*!40000 ALTER TABLE `t_phase` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_phase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_primitives`
--

DROP TABLE IF EXISTS `t_primitives`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_primitives` (
  `Datatype` varchar(7) DEFAULT NULL,
  `Description` varchar(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_primitives`
--

LOCK TABLES `t_primitives` WRITE;
/*!40000 ALTER TABLE `t_primitives` DISABLE KEYS */;
INSERT INTO `t_primitives` VALUES ('boolean','true/false'),('char','character'),('double','double'),('int','integer'),('long','long number'),('string','character string'),('xml','XML Data');
/*!40000 ALTER TABLE `t_primitives` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_problemtypes`
--

DROP TABLE IF EXISTS `t_problemtypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_problemtypes` (
  `ProblemType` varchar(7) DEFAULT NULL,
  `Description` varchar(19) DEFAULT NULL,
  `NumericWeight` decimal(2,1) DEFAULT NULL,
  `Notes` varchar(28) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_problemtypes`
--

LOCK TABLES `t_problemtypes` WRITE;
/*!40000 ALTER TABLE `t_problemtypes` DISABLE KEYS */;
INSERT INTO `t_problemtypes` VALUES ('HW','Hardware related',1.0,''),('Network','Network problems',1.0,'Network issues'),('Perform','Performance',1.5,'Performance related problems'),('SW','Software',2.0,'Software related issues'),('User','User caused problem',1.0,'Problems caused by user');
/*!40000 ALTER TABLE `t_problemtypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_projectroles`
--

DROP TABLE IF EXISTS `t_projectroles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_projectroles` (
  `Role` varchar(19) DEFAULT NULL,
  `Description` varchar(42) DEFAULT NULL,
  `Notes` varchar(47) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_projectroles`
--

LOCK TABLES `t_projectroles` WRITE;
/*!40000 ALTER TABLE `t_projectroles` DISABLE KEYS */;
INSERT INTO `t_projectroles` VALUES ('Application Analyst','Define and model the application structure',''),('Business Analyst','Model business processes',''),('C++ Programmer','Programming in Visual C++',''),('Developer','Application development',''),('Java Programmer','Java programming',''),('Project Manager','Manage schedule','Manage the project schedule '),('Solution Architect','Lead Technical and Project Architect','Define and communicate application architecture'),('Use Case Modeller','Use Case modelling ',''),('VB Programmer','Visual Basic Programming','');
/*!40000 ALTER TABLE `t_projectroles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_propertytypes`
--

DROP TABLE IF EXISTS `t_propertytypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_propertytypes` (
  `Property` varchar(0) DEFAULT NULL,
  `Description` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_propertytypes`
--

LOCK TABLES `t_propertytypes` WRITE;
/*!40000 ALTER TABLE `t_propertytypes` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_propertytypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_requiretypes`
--

DROP TABLE IF EXISTS `t_requiretypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_requiretypes` (
  `Requirement` varchar(11) DEFAULT NULL,
  `Description` varchar(41) DEFAULT NULL,
  `NumericWeight` decimal(2,1) DEFAULT NULL,
  `Notes` varchar(95) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_requiretypes`
--

LOCK TABLES `t_requiretypes` WRITE;
/*!40000 ALTER TABLE `t_requiretypes` DISABLE KEYS */;
INSERT INTO `t_requiretypes` VALUES ('Display','System will display in a specified format',1.0,'Information will be displayed in a particular way'),('Functional','Functional Requirement',1.0,'Comments here'),('Performance','Performance based requirement',1.0,'The system must meet some performance criteria'),('Printing','System printing requirement',1.0,'The system will allow the user(s) to print out some artifact as required by the specification. '),('Report','The system will roduce a report',1.0,'The system will have the facility to produce a report as required'),('Testing','Testing requirement',1.6,'Testing requirement'),('Validate','Validate a particular rule',1.0,'The system will validate a specific rule as supplied in the business requirements');
/*!40000 ALTER TABLE `t_requiretypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_resources`
--

DROP TABLE IF EXISTS `t_resources`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_resources` (
  `Name` varchar(0) DEFAULT NULL,
  `Organisation` varchar(0) DEFAULT NULL,
  `Phone1` varchar(0) DEFAULT NULL,
  `Phone2` varchar(0) DEFAULT NULL,
  `Mobile` varchar(0) DEFAULT NULL,
  `Fax` varchar(0) DEFAULT NULL,
  `Email` varchar(0) DEFAULT NULL,
  `Roles` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_resources`
--

LOCK TABLES `t_resources` WRITE;
/*!40000 ALTER TABLE `t_resources` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_resources` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_risktypes`
--

DROP TABLE IF EXISTS `t_risktypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_risktypes` (
  `Risk` varchar(0) DEFAULT NULL,
  `Description` varchar(0) DEFAULT NULL,
  `NumericWeight` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_risktypes`
--

LOCK TABLES `t_risktypes` WRITE;
/*!40000 ALTER TABLE `t_risktypes` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_risktypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_roleconstraint`
--

DROP TABLE IF EXISTS `t_roleconstraint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_roleconstraint` (
  `ConnectorID` varchar(0) DEFAULT NULL,
  `Constraint` varchar(0) DEFAULT NULL,
  `ConnectorEnd` varchar(0) DEFAULT NULL,
  `ConstraintType` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_roleconstraint`
--

LOCK TABLES `t_roleconstraint` WRITE;
/*!40000 ALTER TABLE `t_roleconstraint` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_roleconstraint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_rtf`
--

DROP TABLE IF EXISTS `t_rtf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_rtf` (
  `Type` varchar(0) DEFAULT NULL,
  `Template` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_rtf`
--

LOCK TABLES `t_rtf` WRITE;
/*!40000 ALTER TABLE `t_rtf` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_rtf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_rtfreport`
--

DROP TABLE IF EXISTS `t_rtfreport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_rtfreport` (
  `TemplateID` varchar(0) DEFAULT NULL,
  `RootPackage` varchar(0) DEFAULT NULL,
  `Filename` varchar(0) DEFAULT NULL,
  `Details` varchar(0) DEFAULT NULL,
  `ProcessChildren` varchar(0) DEFAULT NULL,
  `ShowDiagrams` varchar(0) DEFAULT NULL,
  `Heading` varchar(0) DEFAULT NULL,
  `Requirements` varchar(0) DEFAULT NULL,
  `Associations` varchar(0) DEFAULT NULL,
  `Scenarios` varchar(0) DEFAULT NULL,
  `ChildDiagrams` varchar(0) DEFAULT NULL,
  `Attributes` varchar(0) DEFAULT NULL,
  `Methods` varchar(0) DEFAULT NULL,
  `ImageType` varchar(0) DEFAULT NULL,
  `Paging` varchar(0) DEFAULT NULL,
  `Intro` varchar(0) DEFAULT NULL,
  `Resources` varchar(0) DEFAULT NULL,
  `Constraints` varchar(0) DEFAULT NULL,
  `Tagged` varchar(0) DEFAULT NULL,
  `ShowTag` varchar(0) DEFAULT NULL,
  `ShowAlias` varchar(0) DEFAULT NULL,
  `PDATA1` varchar(0) DEFAULT NULL,
  `PDATA2` varchar(0) DEFAULT NULL,
  `PDATA3` varchar(0) DEFAULT NULL,
  `PDATA4` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_rtfreport`
--

LOCK TABLES `t_rtfreport` WRITE;
/*!40000 ALTER TABLE `t_rtfreport` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_rtfreport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_rules`
--

DROP TABLE IF EXISTS `t_rules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_rules` (
  `RuleID` varchar(0) DEFAULT NULL,
  `RuleName` varchar(0) DEFAULT NULL,
  `RuleType` varchar(0) DEFAULT NULL,
  `RuleActive` varchar(0) DEFAULT NULL,
  `ErrorMsg` varchar(0) DEFAULT NULL,
  `Flags` varchar(0) DEFAULT NULL,
  `RuleOCL` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `RuleXML` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_rules`
--

LOCK TABLES `t_rules` WRITE;
/*!40000 ALTER TABLE `t_rules` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_rules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_scenariotypes`
--

DROP TABLE IF EXISTS `t_scenariotypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_scenariotypes` (
  `ScenarioType` varchar(10) DEFAULT NULL,
  `Description` varchar(20) DEFAULT NULL,
  `NumericWeight` tinyint(4) DEFAULT NULL,
  `Notes` varchar(55) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_scenariotypes`
--

LOCK TABLES `t_scenariotypes` WRITE;
/*!40000 ALTER TABLE `t_scenariotypes` DISABLE KEYS */;
INSERT INTO `t_scenariotypes` VALUES ('Alternate','Alternate pathway',1,'Path of execution that includes exceptional conditions.'),('Basic Path','Basic execution path',1,'The standard execution path with no exceptions'),('Simple','Standard scenario',1,'Used to describe ordinary usage');
/*!40000 ALTER TABLE `t_scenariotypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_script`
--

DROP TABLE IF EXISTS `t_script`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_script` (
  `ScriptID` varchar(0) DEFAULT NULL,
  `ScriptCategory` varchar(0) DEFAULT NULL,
  `ScriptName` varchar(0) DEFAULT NULL,
  `ScriptAuthor` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Script` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_script`
--

LOCK TABLES `t_script` WRITE;
/*!40000 ALTER TABLE `t_script` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_script` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_secgroup`
--

DROP TABLE IF EXISTS `t_secgroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_secgroup` (
  `GroupID` varchar(0) DEFAULT NULL,
  `GroupName` varchar(0) DEFAULT NULL,
  `Description` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_secgroup`
--

LOCK TABLES `t_secgroup` WRITE;
/*!40000 ALTER TABLE `t_secgroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_secgroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_secgrouppermission`
--

DROP TABLE IF EXISTS `t_secgrouppermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_secgrouppermission` (
  `GroupID` varchar(0) DEFAULT NULL,
  `PermissionID` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_secgrouppermission`
--

LOCK TABLES `t_secgrouppermission` WRITE;
/*!40000 ALTER TABLE `t_secgrouppermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_secgrouppermission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_seclocks`
--

DROP TABLE IF EXISTS `t_seclocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_seclocks` (
  `UserID` varchar(0) DEFAULT NULL,
  `GroupID` varchar(0) DEFAULT NULL,
  `EntityType` varchar(0) DEFAULT NULL,
  `EntityID` varchar(0) DEFAULT NULL,
  `Timestamp` varchar(0) DEFAULT NULL,
  `LockType` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_seclocks`
--

LOCK TABLES `t_seclocks` WRITE;
/*!40000 ALTER TABLE `t_seclocks` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_seclocks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_secpermission`
--

DROP TABLE IF EXISTS `t_secpermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_secpermission` (
  `PermissionID` varchar(0) DEFAULT NULL,
  `PermissionName` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_secpermission`
--

LOCK TABLES `t_secpermission` WRITE;
/*!40000 ALTER TABLE `t_secpermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_secpermission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_secpolicies`
--

DROP TABLE IF EXISTS `t_secpolicies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_secpolicies` (
  `Property` varchar(0) DEFAULT NULL,
  `Value` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_secpolicies`
--

LOCK TABLES `t_secpolicies` WRITE;
/*!40000 ALTER TABLE `t_secpolicies` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_secpolicies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_secuser`
--

DROP TABLE IF EXISTS `t_secuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_secuser` (
  `UserID` varchar(0) DEFAULT NULL,
  `UserLogin` varchar(0) DEFAULT NULL,
  `FirstName` varchar(0) DEFAULT NULL,
  `Surname` varchar(0) DEFAULT NULL,
  `Department` varchar(0) DEFAULT NULL,
  `Password` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_secuser`
--

LOCK TABLES `t_secuser` WRITE;
/*!40000 ALTER TABLE `t_secuser` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_secuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_secusergroup`
--

DROP TABLE IF EXISTS `t_secusergroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_secusergroup` (
  `UserID` varchar(0) DEFAULT NULL,
  `GroupID` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_secusergroup`
--

LOCK TABLES `t_secusergroup` WRITE;
/*!40000 ALTER TABLE `t_secusergroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_secusergroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_secuserpermission`
--

DROP TABLE IF EXISTS `t_secuserpermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_secuserpermission` (
  `UserID` varchar(0) DEFAULT NULL,
  `PermissionID` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_secuserpermission`
--

LOCK TABLES `t_secuserpermission` WRITE;
/*!40000 ALTER TABLE `t_secuserpermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_secuserpermission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_snapshot`
--

DROP TABLE IF EXISTS `t_snapshot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_snapshot` (
  `SnapshotID` varchar(0) DEFAULT NULL,
  `SeriesID` varchar(0) DEFAULT NULL,
  `Position` varchar(0) DEFAULT NULL,
  `SnapshotName` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Style` varchar(0) DEFAULT NULL,
  `ElementID` varchar(0) DEFAULT NULL,
  `ElementType` varchar(0) DEFAULT NULL,
  `StrContent` varchar(0) DEFAULT NULL,
  `BinContent1` varchar(0) DEFAULT NULL,
  `BinContent2` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_snapshot`
--

LOCK TABLES `t_snapshot` WRITE;
/*!40000 ALTER TABLE `t_snapshot` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_snapshot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_statustypes`
--

DROP TABLE IF EXISTS `t_statustypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_statustypes` (
  `Status` varchar(11) DEFAULT NULL,
  `Description` varchar(22) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_statustypes`
--

LOCK TABLES `t_statustypes` WRITE;
/*!40000 ALTER TABLE `t_statustypes` DISABLE KEYS */;
INSERT INTO `t_statustypes` VALUES ('Approved','Item is approved'),('Implemented','Finished'),('Mandatory','Required'),('Proposed','Item has been proposed'),('Validated','Approved and Checked');
/*!40000 ALTER TABLE `t_statustypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_stereotypes`
--

DROP TABLE IF EXISTS `t_stereotypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_stereotypes` (
  `Stereotype` varchar(21) DEFAULT NULL,
  `AppliesTo` varchar(14) DEFAULT NULL,
  `Description` varchar(102) DEFAULT NULL,
  `MFEnabled` varchar(5) DEFAULT NULL,
  `MFPath` varchar(0) DEFAULT NULL,
  `Metafile` varchar(0) DEFAULT NULL,
  `Style` varchar(26) DEFAULT NULL,
  `ea_guid` varchar(38) DEFAULT NULL,
  `VisualType` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_stereotypes`
--

LOCK TABLES `t_stereotypes` WRITE;
/*!40000 ALTER TABLE `t_stereotypes` DISABLE KEYS */;
INSERT INTO `t_stereotypes` VALUES ('process','activity','A classifier whose instances represent a flow','False','','','','{C75C6D61-258B-46ef-BC80-5896DA43743B}',''),('subscribe','association','Source class will be notified when an event occurs in target','False','','','','{E32E6BEA-4D24-45d4-8E68-1D8450C78AAD}',''),('column','AttribTable','A column attribute for a table','False','','','','{2683AD9E-E577-423f-924F-3382E8793E35}',''),('case worker','business class','A worker who directly interacts with actors outside the system','False','','','','{85C28118-D1E1-4853-B7CD-9A9E7FC918BF}',''),('entity','business class','Passive class accessed and manipulated by workers','False','','','','{2D3EFD9C-8CE1-4ad3-9D81-0A7B8F355E17}',''),('internal worker','business class','A worker that interacts with other workers and entities inside the system.','False','','','','{0E9E305D-1A42-47ff-814E-4437472B38A1}',''),('worker','business class','An abstraction of a human that works within the system.','False','','','','{E9F468FE-F442-47e2-8615-266202406148}',''),('object system','business model','Contains business process objects, work units, organization units and relationships','False','','','','{3C43CAF6-0EB1-481a-9C9A-E1FB6663B82A}',''),('organization unit','business model','Subsystem corresponding to an organizational unit of the actual business','False','','','','{7E31A3B7-6C99-4b5f-ADD5-156F4D169CF2}',''),('work unit','business model','Subsystem with one or more entities','False','','','','{DEE48CED-7BCF-4ac5-9004-91469456B38C}',''),('asp page','class','A Microsoft active server page','False','','','','{7892F1D7-A6EC-415d-BE92-32CB88C1669F}',''),('boundary','class','Specifies an element that is at the system boundary (e.g.. User Interface)','False','','','','{71B94D7B-0969-49df-96C9-039E26620C3A}',''),('client page','class','A class that represents a client based web page','False','','','','{7DEE6C61-E195-4483-A425-1CD5424AD560}',''),('clientscript','class','A collection of client-side scripts','False','','','','{8A554824-4285-41c4-A08B-20A165E67C5E}',''),('control','class','Specifies an element that controls the work and lifetimes of other objects','False','','','','{F0690ECB-F7F8-4ad0-BE19-50B243BD2B99}',''),('entity','class','Specifies a persistent element mainly concerned with managing its own state','False','','','','{F53FFC8F-C7D8-4e88-B3F1-B55C2FB22B4F}',''),('enumeration','class','Specifies an enumerated type','False','','','','{0EB69ADF-C34C-444c-A954-5A569DDB9B39}',''),('exception','class','An event may be thrown or caught by operation','False','','','','{77760BB6-0005-4477-A6ED-8640B01D8F68}',''),('form','class','A class that represents a html form','False','','','','{465BAE3D-D3AF-4987-A01F-9E521C750C68}',''),('frameset','class','A class that represents a html frame set','False','','','','{F35DD424-4B47-419c-BD1A-B4C95D5F8D16}',''),('implementationClass','class','Implementation of a class in some programming language','False','','','','{464316DD-C7C0-4780-AA77-BBF5546AF334}',''),('interface','class','A collection of operations that specify a service of a class or component','False','','','','{A610D54B-A150-4d6e-8D57-E631327A05D9}',''),('jsp page','class','A java server page','False','','','','{C6A28048-ED66-4809-AF81-7D7750E1B8ED}',''),('model document','class','Set a class as an RTF \"Model Document\"','False','','','Fill=-1;Border=-1;Font=-1;','{ED0AD988-1B03-414d-9501-AF25A33E85D4}',''),('powertype','class','A classifier whose objects are all children of a given parent','False','','','','{0853E2DA-A0D1-4e5d-B4AD-48238A6DAD5F}',''),('process','class','A classifier whose instances represent a flow','False','','','','{1F765160-5ACA-4ea6-AC60-D3E6C0C7E7DF}',''),('script library','class','A library of subroutines/functions for web pages','False','','','','{4D121B5D-2C67-4d12-B410-978F48036D47}',''),('server page','class','A class that represents a server based web page','False','','','','{73FD61CE-041F-42de-989F-C45A05AE019E}',''),('servlet','class','A java servlet component','False','','','','{D0F652AD-A44A-4925-8887-564E81FC2591}',''),('signal','class','Specifies an asynchronous stimulus communicated amongst instances','False','','','','{7ABFA47F-A73D-44e4-8F7E-C2A36300ADC1}',''),('stereotype','class','The classifier is a stereotype that may be applied to other elements','False','','','','{51398DE7-78E7-47a9-8F74-B286E10A85E2}',''),('table','class','A class that represents a database table','False','','','','{2C1BFBC0-CE14-49d9-849E-65B0091876C1}',''),('target','class','A class that represents a target','False','','','','{6000BFD3-AA80-499a-9D87-809DA676F0E6}',''),('thread','class','A classifier whose instances represent a lightweight flow of control','False','','','','{158B7D42-5763-4852-9BD0-43342F3C6C17}',''),('type','class','An abstract class specifying the structure but not implementation of a set of objects','False','','','','{82ABFB7F-71FD-46c7-A65E-6F2BB4631F6D}',''),('utility','class','A class whose attributes and operations are all class-scoped','False','','','','{27AC73E9-D0B4-4741-8B5E-036033EC291A}',''),('web page','class','A html web page','False','','','','{5CF15050-ED27-467d-9539-AFCAA54113E6}',''),('metaclass','classifier','A classifier whose objects are all classes','False','','','','{33AB6D12-4D21-4572-808B-D696EA62004F}',''),('requirement','comment','Specifies a desired feature, property or behavior of system','False','','','','{9DFC1B43-AC92-4e0f-9AE8-CCBC1426840E}',''),('responsibility','comment','Specifies a contract by or an obligation of a class','False','','','','{E272174E-7C0E-4e86-A3D7-5C7B4BB53597}',''),('document','component','The component represents a document','False','','','','{B8D5DB1E-C721-4a8b-BD0D-AB6BC2B1800C}',''),('executable','component','A component may be executed on a node','False','','','','{DEB9B29D-3843-493e-A5D2-FE2A680746C8}',''),('file','component','Component represents a document containing source code','False','','','','{0203C9A8-A884-4f18-B668-1C65C4FE988E}',''),('library','component','Static or dynamic object library','False','','','','{53B563A1-4549-4692-B73F-2BE672DB72AE}',''),('table','component','A component that represents a database table','False','','','','{E0021E51-6ED8-4ca2-A05C-F24DAF4D1264}',''),('invariant','constraint','Constrain must always hold for associated element','False','','','','{B10A57CE-BC39-4790-8183-E05221352B6D}',''),('postcondition','constraint','A constraint must hold after the invocation of an element','False','','','','{F1C9F529-8615-450b-B70E-A5D02E9F6FF6}',''),('precondition','constraint','A constraint that must hold before an element is invoked','False','','','','{B99072CA-38AE-4289-9833-0574B58534D3}',''),('access','dependency','Public contents of target are accessible to namespace of source','False','','','','{5A49DB6C-306C-40f4-B8ED-5B1D1888B798}',''),('bind','dependency','Source instantiates target template using given parameters','False','','','','{AB4352AA-D5EA-4f39-B914-B990188D2470}',''),('call','dependency','Source invokes the target','False','','','','{407B309C-78EE-4e8b-A470-2C600D139121}',''),('derive','dependency','Source may be computed from target','False','','','','{A50531C4-52AD-46ec-9377-59A38258E305}',''),('friend','dependency','Source is given special visibility of target','False','','','','{ADDA6A3E-F464-41e3-B8C8-C8DA16076E2C}',''),('import','dependency','Public contents of target are imported into source namespace','False','','','','{4CC5AFDE-2E50-49dc-BEFD-574991AE4EF6}',''),('instanceOf','dependency','The source object is an instance of the target','False','','','','{5ED14108-E8DD-4da2-BCDC-054C242F55A4}',''),('instantiate','dependency','Operations on the source class create instances of the target class','False','','','','{AFF409CB-7657-4eff-B736-27752B236F2F}',''),('powertype','dependency','A classifier whose objects are all children of a given parent','False','','','','{04E6B210-556D-4570-AEBC-773A0437ECE7}',''),('refine','dependency','Source is at a finer degree of abstraction than source','False','','','','{F373C3B2-4A59-43fd-B0E0-8D35AAF82420}',''),('send','dependency','The source sends the target an event','False','','','','{A33945BC-8393-41fa-8C46-AE6A69413A7F}',''),('trace','dependency','The target is an historical ancestor of source','False','','','','{68442F36-6216-403c-99D1-91FF4472B270}',''),('use','dependency','The semantics of the source depend on the public part of the target','False','','','','{117E4DAD-2F1C-4dc6-AE05-B0D90E99A323}',''),('implementation','generalization','Child inherits implementation of parent but does not support its interfaces','False','','','','{395E1EFA-7D1C-4feb-A428-29D19D12C3A5}',''),('button','GUIElement','A button GUI element','False','','','','{53B88701-3ECF-46ca-A163-6F6322E01FE6}',''),('checkbox','GUIElement','A checkbox GUI element','False','','','','{EBA342F1-36A9-49ba-8E69-8350871B9286}',''),('combobox','GUIElement','A combo box GUI element','False','','','','{427ADE54-C2E3-458a-9220-663889E2CDF0}',''),('date','GUIElement','A GUI element for date entry','False','','','','{C2849CEA-F660-429a-A603-64898F9344A7}',''),('dialog','GUIElement','A GUI screen','False','','','','{B36B927A-8643-41ba-A906-9A42913C49FB}',''),('dropdown','GUIElement','A GUI element that forces user selection','False','','','','{409DCFE5-A3A9-4f2c-BE5B-CC75203C5CD5}',''),('form','GUIElement','A GUI screen','False','','','','{C86ECA41-9EED-4271-B907-1D7624764E08}',''),('hline','GUIElement','','False','','','Fill=-1;Border=-1;Font=-1;','{513D4408-439F-46bb-9262-38FA8456ED1A}',''),('list','GUIElement','A List of Information','False','','','','{DB44CC8D-10B2-4992-9A94-0DBBA4A182A4}',''),('listview','GUIElement','A stand list view control','False','','','','{BDA83396-D0D7-46b4-A2BF-7D84F37758AE}',''),('panel','GUIElement','A GUI element for grouping other controls','False','','','','{DDC4167F-9BBA-4f4d-9B14-62BB46B20E34}',''),('radio','GUIElement','A radio button GUI element','False','','','','{46F04550-CB8D-4a6e-924C-4295633D94BB}',''),('report','GUIElement','A List of Information with an expandable text field','False','','','','{AFC054E9-843F-42dd-8EF0-1EE30775AF52}',''),('tab','GUIElement','A tab control GUI element','False','','','','{AD279078-D6E0-4558-8AF4-23D24610A981}',''),('textbox','GUIElement','A GUI element for user text entry','False','','','','{AF194AD2-3E1B-47e9-A0C2-D9AAFD390311}',''),('time','GUIElement','A GUI element for time entry','False','','','','{A5D69790-1E35-4a38-B9A5-0685A470E72C}',''),('treelist','GUIElement','A List of Information with a tree structure','False','','','','{744AB7A9-99D6-4da3-AC1A-664FB74B6BC0}',''),('vline','GUIElement','','False','','','Fill=-1;Border=-1;Font=-1;','{774AD1B6-0E98-4203-BBCD-F17503EA71B0}',''),('global','link end','Corresponding object is visible because of enclosing scope','False','','','','{64AFCF25-84C5-4685-BCB0-17B9A32D3578}',''),('local','link end','The corresponding object is visible in local scope','False','','','','{082DC6E0-5E1C-4c47-AC2A-1EEC57DB4C5E}',''),('parameter','link end','The corresponding element is visible because it is a parameter','False','','','','{7C1BAE2A-8038-4f2c-AEC0-631255D8CE2D}',''),('self','link end','The corresponding object is visible because it is the dispatcher','False','','','','{0F733F9F-1849-4706-B12A-BCE4A28A3D7F}',''),('become','message','Target is same as source but later in time','False','','','','{8B9671C4-6198-49d3-AD98-D0DE750D58B6}',''),('copy','message','Target is exact but independent copy of source','False','','','','{AF93EF53-B4D3-4403-98C3-31529CBA0008}',''),('create','message','Target is created by event or message','False','','','','{9232EAF3-D5D6-4f61-9B24-98B0EE160CCD}',''),('destroy','message','Target is destroyed by event or message','False','','','','{371D3100-BE63-4501-8E4D-0985F9813DB7}',''),('analysis system','model','Contains analysis classes - entities, boundaries and control elements','False','','','','{FFC56B39-FA5D-4f93-A40D-B49F3910ABD4}',''),('design system','model','Contains design elements','False','','','','{D277FCAC-0F11-4b0f-BB17-5617D9DBEAE9}',''),('implementation system','model','Contains implementation subsystems and/or components and relationships','False','','','','{8814C8C9-B7A6-4ec8-98D2-87BFFE420AF1}',''),('use case system','model','Specifies the services offered to the users','False','','','','{3FBFA219-24EE-4f7a-9824-7633271D100E}',''),('cd-rom','node','A class that represents a CDRom drive','False','','','','{1FD8EB21-6FB9-496c-AAF2-DBDE731E5202}',''),('cdrom','node','A class that represents a CDRom drive','False','','','','{6FAF16E5-ABF0-4a20-9F1B-671FFC360675}',''),('computer','node','A class that represents a computer','False','','','','{4A01EABD-CC2B-4b27-AB37-4CF3C22F2065}',''),('disk array','node','A class that represents a disk array','False','','','','{B67D5092-3FE9-4171-AC9E-44801A0FDF45}',''),('pc','node','A class that represents a personal computer','False','','','','{6F170342-3E57-48bc-97D7-03F1D5BF298C}',''),('pc client','node','A class that represents a clients PC','False','','','','{C6640183-986A-44c4-9568-833330E908BD}',''),('pc server','node','A class that represents a PC server','False','','','','{3D546DFA-89A9-4a3a-9B6C-8BA07FE4D14E}',''),('secure','node','A class that represents aet','False','','','','{3D80970A-1B2C-4ae4-A8E3-1955E759E447}',''),('server','node','A class that represents a server','False','','','','{C14A10A3-01C6-4698-AC41-1D599470AC86}',''),('storage','node','A class that represents a storage device','False','','','','{458C927D-61BF-437b-AEA6-ABDF7CF53DBA}',''),('unix server','node','A class that represents a Unix server','False','','','','{685B0380-8243-4e2c-91A6-A3A9A35E711D}',''),('user pc','node','A class that represents a users PC','False','','','','{202496DA-CF6A-48b1-830D-6085A2B65ED6}',''),('check','OpTable','A Check constraint to enforce domain integrity','False','','','','{D51A655C-19D7-4078-B21A-4F5EDE4027B9}',''),('FK','OpTable','A Foreign Key','False','','','','{2AA67742-7EEF-41db-AEF7-AC14E88DCDA0}',''),('index','OpTable','An index of one or more columns','False','','','','{E0B1E9C2-A385-4123-93AA-D3B3A687B603}',''),('PK','OpTable','A Primary Key','False','','','','{A2EB0765-199F-4ae5-8C37-0565F5A711AF}',''),('proc','OpTable','A stored procedure','False','','','','{11EFC0E9-2F65-442b-89E3-170CE089F923}',''),('trigger','OpTable','A trigger which executes automatically when an UPDATE, INSERT, or DELETE statement is issued','False','','','','{0260907D-5328-43f0-9ED1-B1FB66DD9690}',''),('unique','OpTable','A Unique constraint to enforce the integrity of a database automatically','False','','','','{5256CFEF-DA9F-4a9b-8891-EAB8CFE58FC2}',''),('facade','package','Package is a view of another concrete package','False','','','','{41314EA7-346F-4af8-B5A4-41ECD4D29CFD}',''),('framework','package','Package consists mainly of patterns','False','','','','{D3CC4FAD-20B3-4e2e-8AD2-327A235C24FE}',''),('model','package','A semantically closed abstraction of a system','False','','','','{5D3C671E-82D3-41b7-BD3A-81C10399AEC3}',''),('stub','package','A package serves as a proxy for the public contents of another package','False','','','','{DCC39F3D-857A-4bf5-9DDB-8F3B640403F3}',''),('subsystem','package','A grouping of elements that constitute a specification of behavior offered by other contained elements','False','','','','{B555F021-8BD3-4f66-B711-DD8ECB8256D6}',''),('system','package','A package representing the entire system being modeled','False','','','','{3CD388EC-AE2A-48fc-A04D-CA1623AF8FAF}',''),('communicate','uses','Communication between actor and use case','False','','','','{F2354ED7-1386-4cc7-9FA2-8BE6B47D7FAF}',''),('extend','uses','Target use case extends the source at a given extension point','False','','','','{880210F0-6E46-4308-98DD-3DFAD5BC6F5F}',''),('include','uses','Source use case explicitly includes the behavior of target','False','','','','{E7A404CE-2517-4667-8536-653B7E67092E}',''),('get','Operation','get','False','','','','{EDF0CDF3-E261-4a02-93F8-086C81D780B5}','');
/*!40000 ALTER TABLE `t_stereotypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_taggedvalue`
--

DROP TABLE IF EXISTS `t_taggedvalue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_taggedvalue` (
  `PropertyID` varchar(38) DEFAULT NULL,
  `ElementID` varchar(38) DEFAULT NULL,
  `BaseClass` varchar(7) DEFAULT NULL,
  `TagValue` varchar(18) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_taggedvalue`
--

LOCK TABLES `t_taggedvalue` WRITE;
/*!40000 ALTER TABLE `t_taggedvalue` DISABLE KEYS */;
INSERT INTO `t_taggedvalue` VALUES ('{17C8F762-C9C6-4bb6-84A6-E077345A3CCD}','{190CD5C3-FDCC-4066-ADA0-48197C110278}','PACKAGE','LastImportFileDate','');
/*!40000 ALTER TABLE `t_taggedvalue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_tasks`
--

DROP TABLE IF EXISTS `t_tasks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_tasks` (
  `TaskID` varchar(0) DEFAULT NULL,
  `Name` varchar(0) DEFAULT NULL,
  `TaskType` varchar(0) DEFAULT NULL,
  `NOTES` varchar(0) DEFAULT NULL,
  `Priority` varchar(0) DEFAULT NULL,
  `Status` varchar(0) DEFAULT NULL,
  `Owner` varchar(0) DEFAULT NULL,
  `StartDate` varchar(0) DEFAULT NULL,
  `EndDate` varchar(0) DEFAULT NULL,
  `Phase` varchar(0) DEFAULT NULL,
  `History` varchar(0) DEFAULT NULL,
  `Percent` varchar(0) DEFAULT NULL,
  `TotalTime` varchar(0) DEFAULT NULL,
  `ActualTime` varchar(0) DEFAULT NULL,
  `AssignedTo` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_tasks`
--

LOCK TABLES `t_tasks` WRITE;
/*!40000 ALTER TABLE `t_tasks` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_tasks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_tcf`
--

DROP TABLE IF EXISTS `t_tcf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_tcf` (
  `TCFID` varchar(5) DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  `Weight` decimal(2,1) DEFAULT NULL,
  `Value` tinyint(4) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_tcf`
--

LOCK TABLES `t_tcf` WRITE;
/*!40000 ALTER TABLE `t_tcf` DISABLE KEYS */;
INSERT INTO `t_tcf` VALUES ('TCF01','Distributed System',2.0,5,''),('TCF02','Response or throughput performance objectives',1.0,4,''),('TCF03','End user efficiency (online)',1.0,2,''),('TCF04','Complex internal processing',1.0,4,''),('TCF05','Code must be re-usable',1.0,2,''),('TCF06','Easy to install',0.5,5,''),('TCF07','Easy to use',0.5,3,''),('TCF08','Portable',2.0,3,''),('TCF09','Easy to change',1.0,3,''),('TCF10','Concurrent',1.0,2,''),('TCF11','Includ special security features',1.0,2,''),('TCF12','Provide direct access for third parties',1.0,5,''),('TCF13','Special user training faciities are required',1.0,3,'');
/*!40000 ALTER TABLE `t_tcf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_template`
--

DROP TABLE IF EXISTS `t_template`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_template` (
  `TemplateID` varchar(0) DEFAULT NULL,
  `TemplateType` varchar(0) DEFAULT NULL,
  `TemplateName` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Style` varchar(0) DEFAULT NULL,
  `Template` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_template`
--

LOCK TABLES `t_template` WRITE;
/*!40000 ALTER TABLE `t_template` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_template` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_testclass`
--

DROP TABLE IF EXISTS `t_testclass`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_testclass` (
  `TestClass` varchar(0) DEFAULT NULL,
  `Description` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_testclass`
--

LOCK TABLES `t_testclass` WRITE;
/*!40000 ALTER TABLE `t_testclass` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_testclass` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_testplans`
--

DROP TABLE IF EXISTS `t_testplans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_testplans` (
  `PlanID` varchar(0) DEFAULT NULL,
  `Category` varchar(0) DEFAULT NULL,
  `Name` varchar(0) DEFAULT NULL,
  `Author` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `TestPlan` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_testplans`
--

LOCK TABLES `t_testplans` WRITE;
/*!40000 ALTER TABLE `t_testplans` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_testplans` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_testtypes`
--

DROP TABLE IF EXISTS `t_testtypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_testtypes` (
  `TestType` varchar(10) DEFAULT NULL,
  `Description` varchar(22) DEFAULT NULL,
  `NumericWeight` tinyint(4) DEFAULT NULL,
  `Notes` varchar(23) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_testtypes`
--

LOCK TABLES `t_testtypes` WRITE;
/*!40000 ALTER TABLE `t_testtypes` DISABLE KEYS */;
INSERT INTO `t_testtypes` VALUES ('Load','Performance under load',1,'Stress testing'),('Regression','Regression Testing',1,'Regression'),('Standard','Simple Test procedure',1,'Used to test basic path');
/*!40000 ALTER TABLE `t_testtypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_trxtypes`
--

DROP TABLE IF EXISTS `t_trxtypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_trxtypes` (
  `Description` varchar(0) DEFAULT NULL,
  `NumericWeight` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `TRX` varchar(0) DEFAULT NULL,
  `TRX_ID` varchar(0) DEFAULT NULL,
  `Style` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_trxtypes`
--

LOCK TABLES `t_trxtypes` WRITE;
/*!40000 ALTER TABLE `t_trxtypes` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_trxtypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_umlpattern`
--

DROP TABLE IF EXISTS `t_umlpattern`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_umlpattern` (
  `PatternID` varchar(0) DEFAULT NULL,
  `PatternCategory` varchar(0) DEFAULT NULL,
  `PatternName` varchar(0) DEFAULT NULL,
  `Style` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `PatternXML` varchar(0) DEFAULT NULL,
  `Version` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_umlpattern`
--

LOCK TABLES `t_umlpattern` WRITE;
/*!40000 ALTER TABLE `t_umlpattern` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_umlpattern` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_version`
--

DROP TABLE IF EXISTS `t_version`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_version` (
  `ElementID` varchar(0) DEFAULT NULL,
  `VersionID` varchar(0) DEFAULT NULL,
  `ElementType` varchar(0) DEFAULT NULL,
  `Flags` varchar(0) DEFAULT NULL,
  `ExternalFile` varchar(0) DEFAULT NULL,
  `Notes` varchar(0) DEFAULT NULL,
  `Owner` varchar(0) DEFAULT NULL,
  `VersionDate` varchar(0) DEFAULT NULL,
  `Branch` varchar(0) DEFAULT NULL,
  `ElementXML` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_version`
--

LOCK TABLES `t_version` WRITE;
/*!40000 ALTER TABLE `t_version` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_version` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_xref`
--

DROP TABLE IF EXISTS `t_xref`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_xref` (
  `XrefID` varchar(0) DEFAULT NULL,
  `Name` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL,
  `Visibility` varchar(0) DEFAULT NULL,
  `Namespace` varchar(0) DEFAULT NULL,
  `Requirement` varchar(0) DEFAULT NULL,
  `Constraint` varchar(0) DEFAULT NULL,
  `Behavior` varchar(0) DEFAULT NULL,
  `Partition` varchar(0) DEFAULT NULL,
  `Description` varchar(0) DEFAULT NULL,
  `Client` varchar(0) DEFAULT NULL,
  `Supplier` varchar(0) DEFAULT NULL,
  `Link` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_xref`
--

LOCK TABLES `t_xref` WRITE;
/*!40000 ALTER TABLE `t_xref` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_xref` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_xrefsystem`
--

DROP TABLE IF EXISTS `t_xrefsystem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_xrefsystem` (
  `XrefID` varchar(38) DEFAULT NULL,
  `ToolID` varchar(0) DEFAULT NULL,
  `Name` varchar(11) DEFAULT NULL,
  `Type` varchar(5) DEFAULT NULL,
  `Visibility` varchar(0) DEFAULT NULL,
  `Namespace` tinyint(4) DEFAULT NULL,
  `Requirement` varchar(0) DEFAULT NULL,
  `Constraint` varchar(0) DEFAULT NULL,
  `Behavior` varchar(0) DEFAULT NULL,
  `Partition` varchar(0) DEFAULT NULL,
  `Description` varchar(0) DEFAULT NULL,
  `Client` tinyint(4) DEFAULT NULL,
  `Supplier` varchar(9) DEFAULT NULL,
  `Link` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_xrefsystem`
--

LOCK TABLES `t_xrefsystem` WRITE;
/*!40000 ALTER TABLE `t_xrefsystem` DISABLE KEYS */;
INSERT INTO `t_xrefsystem` VALUES ('{6E5FED3A-DF6C-40db-BEEC-4528AB8C8A2E}','','Model Views','PView','',8,'','','','','',0,'ModelRoot','NULL');
/*!40000 ALTER TABLE `t_xrefsystem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_xrefuser`
--

DROP TABLE IF EXISTS `t_xrefuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_xrefuser` (
  `XrefID` varchar(0) DEFAULT NULL,
  `ToolID` varchar(0) DEFAULT NULL,
  `Name` varchar(0) DEFAULT NULL,
  `Type` varchar(0) DEFAULT NULL,
  `Visibility` varchar(0) DEFAULT NULL,
  `Namespace` varchar(0) DEFAULT NULL,
  `Requirement` varchar(0) DEFAULT NULL,
  `Constraint` varchar(0) DEFAULT NULL,
  `Behavior` varchar(0) DEFAULT NULL,
  `Partition` varchar(0) DEFAULT NULL,
  `Description` varchar(0) DEFAULT NULL,
  `Client` varchar(0) DEFAULT NULL,
  `Supplier` varchar(0) DEFAULT NULL,
  `Link` varchar(0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_xrefuser`
--

LOCK TABLES `t_xrefuser` WRITE;
/*!40000 ALTER TABLE `t_xrefuser` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_xrefuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usysOldTables`
--

DROP TABLE IF EXISTS `usysOldTables`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usysOldTables` (
  `TableName` varchar(22) DEFAULT NULL,
  `NewName` varchar(22) DEFAULT NULL,
  `RelOrder` varchar(2) DEFAULT NULL,
  `FixCode` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usysOldTables`
--

LOCK TABLES `usysOldTables` WRITE;
/*!40000 ALTER TABLE `usysOldTables` DISABLE KEYS */;
INSERT INTO `usysOldTables` VALUES ('TRXTypes','t_trxtypes','1','True'),('TestTypes','t_testtypes','1','True'),('TestClass','t_testclass','1','True'),('TCF','t_tcf','1','True'),('Stereotypes','t_stereotypes','1','True'),('StatusTypes','t_statustypes','1','True'),('ScenarioTypes','t_scenariotypes','1','True'),('RTFReport','t_rtfreport','1','True'),('RTF','t_rtf','1','True'),('RoleConstraint','t_roleconstraint','','True'),('RiskTypes','t_risktypes','1','True'),('Resources','t_resources','1','True'),('RequireTypes','t_requiretypes','1','True'),('PropertyTypes','t_propertytypes','1','True'),('ProjectRoles','t_projectroles','1','True'),('ProblemTypes','t_problemtypes','1','True'),('Primitives','t_primitives','1','True'),('Package','t_package','1','False'),('OperationPres','t_operationpres','6','True'),('OperationPosts','t_operationposts','6','True'),('OperationParams','t_operationparams','6','True'),('Operation','t_operation','5','False'),('OCF','t_ocf','1','True'),('ObjectTRX','t_objecttrx','5','True'),('ObjectTests','t_objecttests','5','True'),('ObjectScenarios','t_objectscenarios','5','True'),('ObjectRisks','t_objectrisks','5','True'),('ObjectResource','t_objectresource','5','True'),('ObjectRequires','t_objectrequires','5','True'),('ObjectProperties','t_objectproperties','5','True'),('ObjectProblems','t_objectproblems','5','True'),('ObjectMetrics','t_objectmetrics','5','True'),('ObjectFiles','t_objectfiles','5','True'),('ObjectEffort','t_objecteffort','5','True'),('ObjectConstraint','t_objectconstraint','5','True'),('Object_Types','t_objecttypes','5','True'),('Object','t_object','3','True'),('MetricTypes','t_metrictypes','1','True'),('Method','t_method','5','True'),('MaintTypes','t_mainttypes','1','True'),('Implement','t_implement','2','True'),('HTML','t_html','1','True'),('Glossary','t_glossary','2','True'),('EffortTypes','t_efforttypes','1','True'),('ECF','t_ecf','1','True'),('DiagramTypes','t_diagramtypes','1','True'),('DiagramObjects','t_diagramobjects','6','True'),('Diagram','t_diagram','5','True'),('ConstraintTypes','t_constrainttypes','1','True'),('Constants','t_constants','1','True'),('ConnectorConstraint','t_connectorconstraint','7','True'),('Connector_Types','t_connectortypes','1','True'),('Connector','t_connector','6','True'),('ComplexityTypes','t_complexitytypes','1','True'),('Clients','t_clients','1','True'),('Cardinality','t_cardinality','1','True'),('Authors','t_authors','1','True'),('AttributeConstraints','t_attributeconstraints','7','True'),('Attribute','t_attribute','6','True'),('','t_issues','6','True'),('UpdateFlag_Indexes1220','UpdateFlag_Indexes1220','10','True');
/*!40000 ALTER TABLE `usysOldTables` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usysQueries`
--

DROP TABLE IF EXISTS `usysQueries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usysQueries` (
  `QueryName` varchar(15) DEFAULT NULL,
  `NewName` varchar(16) DEFAULT NULL,
  `FixCode` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usysQueries`
--

LOCK TABLES `usysQueries` WRITE;
/*!40000 ALTER TABLE `usysQueries` DISABLE KEYS */;
INSERT INTO `usysQueries` VALUES ('qAttribute','q_attribute','True'),('qConnections','q_connections','True'),('qConnections2','q_connections2','True'),('qConnections3','q_connections3','True'),('qConnector','q_connector','True'),('qDatatypes','q_datatypes','True'),('qECF','q_ecf','True'),('qImplements','q_implements','True'),('qImplements2','q_implements2','True'),('qMethod','q_method','True'),('qObject','q_object','True'),('qObjectRealizes','q_objectrealizes','True'),('qObjectTests','q_objecttests','True'),('qOrphans','q_orphans','True'),('qPackages','q_packages','True'),('qRealizes1','q_realizes1','True'),('qRealizes2','q_realizes2','True'),('qResource','q_resource','True'),('qSumECF','q_sumecf','True'),('qSumTCF','q_sumtcf','True'),('qTCF','q_tcf','True'),('qUCMetrics','q_ucmetrics','True'),('qVisibleObject','q_visibleobject','True');
/*!40000 ALTER TABLE `usysQueries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usysTables`
--

DROP TABLE IF EXISTS `usysTables`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usysTables` (
  `TableName` varchar(22) DEFAULT NULL,
  `RelOrder` tinyint(4) DEFAULT NULL,
  `DisplayName` varchar(25) DEFAULT NULL,
  `FromVer` varchar(5) DEFAULT NULL,
  `ToVer` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usysTables`
--

LOCK TABLES `usysTables` WRITE;
/*!40000 ALTER TABLE `usysTables` DISABLE KEYS */;
INSERT INTO `usysTables` VALUES ('t_attribute',6,'Object Attributes','1.1.0','9.9.9'),('t_attributeconstraints',7,'Attribute Constraints','1.1.0','9.9.9'),('t_attributetag',7,'Attribute Tag','3.0.0','9.9.9'),('t_authors',1,'Project Authors','1.1.0','9.9.9'),('t_cardinality',1,'Object Cardinality','1.1.0','9.9.9'),('t_category',1,'Category','3.5.0','9.9.9'),('t_clients',1,'Project Clients','1.1.0','9.9.9'),('t_complexitytypes',1,'Complexity Types','1.1.0','9.9.9'),('t_connector',6,'Connectors','1.1.0','9.9.9'),('t_connectorconstraint',7,'Connector Constraints','1.1.0','9.9.9'),('t_connectortag',7,'Connector Tag','3.0.0','9.9.9'),('t_connectortypes',1,'Connector Types','3.5.0','9.9.9'),('t_constants',1,'Constants','1.1.0','9.9.9'),('t_constrainttypes',1,'Constraint Types','1.1.0','9.9.9'),('t_datatypes',1,'Data Types','1.1.0','9.9.9'),('t_diagram',5,'Diagrams','1.1.0','9.9.9'),('t_diagramlinks',6,'Diagram Links','1.1.0','9.9.9'),('t_diagramobjects',6,'Diagram Objects','1.1.0','9.9.9'),('t_diagramtypes',2,'Diagram Types','1.1.0','9.9.9'),('t_document',7,'Document','3.5.0','9.9.9'),('t_ecf',1,'ECF Values','1.1.0','9.9.9'),('t_efforttypes',1,'Effort Types','1.1.0','9.9.9'),('t_files',7,'Files','3.5.0','9.9.9'),('t_genopt',1,'Generation Options','1.1.0','9.9.9'),('t_glossary',2,'Glossary','1.1.0','9.9.9'),('t_html',7,'HTML','3.5.0','9.9.9'),('t_image',7,'Images','3.1.0','9.9.9'),('t_implement',2,'Implementation Details','1.1.0','9.9.9'),('t_issues',6,'Issue Details','1.1.0','9.9.9'),('t_lists',1,'Lists','3.5.0','9.9.9'),('t_mainttypes',1,'Maintenance Types','1.1.0','9.9.9'),('t_method',5,'Methods','1.1.0','9.9.9'),('t_metrictypes',1,'Metric Types','1.1.0','9.9.9'),('t_object',3,'Object Details','1.1.0','9.9.9'),('t_objectconstraint',5,'Object Constraints','1.1.0','9.9.9'),('t_objecteffort',5,'Object Effort','1.1.0','9.9.9'),('t_objectfiles',5,'Object Files','1.1.0','9.9.9'),('t_objectmetrics',5,'Object Metrics','1.1.0','9.9.9'),('t_objectproblems',5,'Object Problems','1.1.0','9.9.9'),('t_objectproperties',5,'Object Properties','1.1.0','9.9.9'),('t_objectrequires',5,'Object Requires','1.1.0','9.9.9'),('t_objectresource',5,'Object Resources','1.1.0','9.9.9'),('t_objectrisks',5,'Object Risks','1.1.0','9.9.9'),('t_objectscenarios',5,'Object Scenarios','1.1.0','9.9.9'),('t_objecttests',5,'Object Tests','1.1.0','9.9.9'),('t_objecttrx',5,'Object TRX','1.1.0','9.9.9'),('t_objecttypes',1,'Object Types','3.5.0','9.9.9'),('t_ocf',1,'OCF Values','1.1.0','9.9.9'),('t_operation',5,'Operations','1.1.0','9.9.9'),('t_operationparams',6,'Operation Parameters','1.1.0','9.9.9'),('t_operationposts',6,'Operation Post Conditions','1.1.0','9.9.9'),('t_operationpres',6,'Operation Pre Conditions','1.1.0','9.9.9'),('t_operationtag',7,'Operation Tag','3.0.0','9.9.9'),('t_package',1,'Packages','1.1.0','9.9.9'),('t_palette',5,'Palettes','3.1.0','9.9.9'),('t_paletteitem',7,'Palette Items','3.1.0','9.9.9'),('t_phase',7,'Phases','3.5.0','9.9.9'),('t_problemtypes',1,'Problem Types','1.1.0','9.9.9'),('t_projectroles',1,'Project Roles','1.1.0','9.9.9'),('t_propertytypes',1,'Property Types','1.1.0','9.9.9'),('t_requiretypes',1,'Require Types','1.1.0','9.9.9'),('t_resources',1,'Resources','1.1.0','9.9.9'),('t_risktypes',1,'Risk Types','1.1.0','9.9.9'),('t_roleconstraint',0,'Role Constraints','1.1.0','9.9.9'),('t_rtf',7,'RTF','3.5.0','9.9.9'),('t_rtfreport',1,'RTF Reports','1.1.0','9.9.9'),('t_rules',7,'Rules','3.5.0','9.9.9'),('t_scenariotypes',1,'Scenario Types','1.1.0','9.9.9'),('t_script',7,'Scripts','3.5.0','9.9.9'),('t_secgroup',3,'Security Groups','3.5.0','9.9.9'),('t_secgrouppermission',7,'Group Permissions','3.5.0','9.9.9'),('t_seclocks',7,'Security Locks','3.5.0','9.9.9'),('t_secpermission',3,'Permissions','3.5.0','9.9.9'),('t_secpolicies',1,'Security Policies','3.5.0','9.9.9'),('t_secuser',3,'Security User','3.5.0','9.9.9'),('t_secusergroup',7,'User Group','3.5.0','9.9.9'),('t_secuserpermission',7,'User Permissions','3.5.0','9.9.9'),('t_snapshot',7,'Snapshots','3.5.0','9.9.9'),('t_statustypes',1,'Status Types','1.1.0','9.9.9'),('t_stereotypes',1,'Stereotypes','1.1.0','9.9.9'),('t_taggedvalue',7,'Model Tagged Values','3.5.0','9.9.9'),('t_tasks',7,'To Do List','3.1.0','9.9.9'),('t_tcf',1,'TCF Values','1.1.0','9.9.9'),('t_template',7,'Templates','3.5.0','9.9.9'),('t_testclass',1,'Test Classes','1.1.0','9.9.9'),('t_testplans',7,'Test Plans','3.5.0','9.9.9'),('t_testtypes',1,'Test Types','1.1.0','9.9.9'),('t_trxtypes',1,'TRX Types','1.1.0','9.9.9'),('t_umlpattern',7,'UML Patterns','3.5.0','9.9.9'),('t_version',7,'Files','3.5.0','9.9.9'),('t_xref',7,'XRef','3.1.0','9.9.9'),('t_xrefsystem',7,'System XRef','3.5.0','9.9.9'),('t_xrefuser',7,'User XRef','3.5.0','9.9.9'),('usys_system',7,'System Settings','3.1.0','9.9.9');
/*!40000 ALTER TABLE `usysTables` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usys_system`
--

DROP TABLE IF EXISTS `usys_system`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usys_system` (
  `Property` varchar(22) DEFAULT NULL,
  `Value` varchar(38) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usys_system`
--

LOCK TABLES `usys_system` WRITE;
/*!40000 ALTER TABLE `usys_system` DISABLE KEYS */;
INSERT INTO `usys_system` VALUES ('310_Category','1'),('310_Columns','1'),('310_FileTable','1'),('310_Generalization','1'),('310_Images','1'),('310_Metafile','2'),('310_Palette','1'),('310_QObject','1'),('310_TableList','1'),('310_TableList2','1'),('310_Tasks','1'),('310_XREF','1'),('350_AttGUID','1'),('350_DataTypes','1'),('350_DiagramConnectorID','1'),('350_DiagramObjectID','1'),('350_DocumentEX','1'),('350_FeaturePos','1'),('350_Flags','1'),('350_IssueEx','1'),('350_OpGUID','1'),('350_Package','1'),('350_ParamGUID','1'),('350_Phases','1'),('350_ResourceHours','1'),('350_ResourceTables','1'),('350_RoleExtra','1'),('350_Scenario','1'),('350_Snapshot','1'),('350_Stereotype','1'),('350_Styles','1'),('350_SystemTaggedValues','1'),('350_TableList','1'),('350_TableListEx','1'),('350_Tables','1'),('350_TestTables','1'),('350_TRXTypes','1'),('350_UserSecurity','1'),('Association','1'),('AttID','1'),('CheckObjectTypes','1'),('Classifier','1'),('ClassifierGUID','1'),('CodeGen','1'),('Const','1'),('DDL','1'),('DiagramLink','1'),('DiagramObjectStyle','1'),('EA1000Updates','1'),('EA300Classifier','1'),('EA300MSAccessDT','1'),('EA300VBDT','1'),('EA3FieldSizes','3'),('EA3TableNames','1'),('EA600Updates','1'),('EA610Updates','1'),('EA650Updates','1'),('EA800Updates','1'),('EA900Updates','1'),('EAGUID','1'),('Elem300','1'),('FileDir','$EAPDIR'),('Gen25Fixes','1'),('GenericDataType','1'),('GUID','2'),('IsNavigable','1'),('LangDT25','1'),('LastUpdate','6042B4630553:FF7B3230882F'),('Namespace','1'),('NodeStereo','1'),('ObjectParent','1'),('ObjectScope','1'),('OperationCode','1'),('OpPos','1'),('OpsClean','1'),('Orphans30','1'),('PackageControl','3'),('Packages','1'),('ParamIDX','1'),('QDF_25','1'),('QueryDefs_116','1'),('RoleConstraints','1'),('RTFFIELDS','1'),('RunState','1'),('Seq_Gap','35'),('Stereotypes','1'),('Styles','1'),('TaggedVals','1'),('TPos','2'),('Version','4.01'),('VersionDate','Jan-31-2004'),('WebStereo','1'),('ProjectGUID','{785666FF-692D-4edf-9BE5-19EDC75E6D4D}'),('EA1310Updates','1');
/*!40000 ALTER TABLE `usys_system` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-22 15:26:43
