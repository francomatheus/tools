# Documentação com C4_PlantUML

- Documentação: 


- [C4 Model](https://c4model.com/)
- [Web Server](http://www.plantuml.com/plantuml/uml/SoWkIImgAStDuIekISd9JE9oICrB0N41)


## Diagramas

- Contexto:

```
!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Context.puml

Person(alias, label, ?descr, ?sprite, ?tags, $link)
Person_Ext
System(alias, label, ?descr, ?sprite, ?tags, $link)
SystemDb
SystemQueue
System_Ext
SystemDb_Ext
SystemQueue_Ext
Boundary(alias, label, ?type, ?tags, $link)
Enterprise_Boundary(alias, label, ?tags, $link)
System_Boundary

```

- Container:

```
!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Container.puml

Container(alias, label, *techn, ?descr, ?sprite, ?tags, $link)
ContainerDb
ContainerQueue
Container_Ext
ContainerDb_Ext
ContainerQueue_Ext
Container_Boundary(alias, label, ?tags, $link)

```

- Component:

```
!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Component.puml

Component(alias, label, *techn, ?descr, ?sprite, ?tags, $link)
ComponentDb
ComponentQueue
Component_Ext
ComponentDb_Ext
ComponentQueue_Ext

```

- Diagrama: 

```
!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Dynamic.puml

RelIndex(index, from, to, label, ?tags, $link)
(lowercase) increment($offset=1): increase current index (procedure which has no direct output)
(lowercase) setIndex($new_index): set the new index (procedure which has no direct output)
LastIndex(): return the last used index (function which can be used as argument)

Index($offset=1): returns current index and calculates next index (function which can be used as argument)
SetIndex($new_index): returns new set index and calculates next index (function which can be used as argument)
```

- Deployment

```
!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Deployment.puml

Deployment_Node(alias, label, ?type, ?descr, ?sprite, ?tags, $link)
Node(alias, label, ?type, ?descr, ?sprite, ?tags, $link): short name of Deployment_Node()
Node_L(alias, label, ?type, ?descr, ?sprite, ?tags, $link): left aligned Node()
Node_R(alias, label, ?type, ?descr, ?sprite, ?tags, $link): right aligned Node()

```

- Relações

```
Rel(from, to, label, ?techn, ?descr, ?sprite, ?tags, $link)
BiRel (bidirectional relationship)

Rel_U, Rel_Up
Rel_D, Rel_Down
Rel_L, Rel_Left
Rel_R, Rel_Right

Lay_U(from, to)
Lay_D(from, to)
Lay_L(from, to)
Lay_R(from, to)

Lay_Distance(from, to, ?distance): Sets the distance between from and to with down alignment (Lay_Distance(from,to,0) equals Lay_D(from, to)). The default alias of the floating legend is LEGEND().
```

- Incluir icone nos diagramas: 

```
!define DEVICONS https://raw.githubusercontent.com/tupadr3/plantuml-icon-font-sprites/master/devicons
!define FONTAWESOME https://raw.githubusercontent.com/tupadr3/plantuml-icon-font-sprites/master/font-awesome-5
!include DEVICONS/java.puml
!include DEVICONS/mongodb.puml
!include FONTAWESOME/server.puml
!include FONTAWESOME/database.puml
!include FONTAWESOME/react.puml



[Documentação com os icones disponiveis](https://github.com/tupadr3/plantuml-icon-font-sprites)
```

- Adicionar AWS no diagrama: 

```
https://plantuml.com/stdlib

!include <awslib/AWSCommon>
!include <awslib/Mobile/APIGateway>
!include <awslib/ApplicationIntegration/SNS>
!include <awslib/ApplicationIntegration/SQS>


APIGateway(partnerGateway, "Partner Gateway","cb-partner-gateway")
SNS(sns,"asd","")
SQS(sqs,"wasd","")
```
