# JAXBListOfHashMapsMappingTest

This is an experiment of mapping a XML document with a list of parameters containing random tags in to a java object containing a list of hash maps.
XML Document:
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Doc><parameters><parameter><aaa>213</aaa><bbb>213</bbb></parameter><parameter><ccc>geaag</ccc><ddd>egaed</ddd></parameter></parameters></Doc>
```
Java Object: 
Doc [Parameters=[Parameter[{aaa=213, bbb=213}]Parameter[{ccc=geaag, ddd=egaed}]]]
