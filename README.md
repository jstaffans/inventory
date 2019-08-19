Spoilage simulator
==================

A code review assignment in the form of a mock "inventory spoilage simulator".

Usage:

```
mvn package
java -cp target/inventory-project-1.0-SNAPSHOT.jar com.relex.inventory.Main
```

You can then enter *product batches* as `<amount>,<name>[,<amount>,<name>,...]`, e.g.

```
10,apples,20,apples,30,oranges
```

This would enter three batches into the system:

* One batch with ten apples
* One batch with 20 apples
* One batch with 30 oranges

After that, the spoilage simulation will run and produce some output.

