# Setter for entity?
In Hexagonal Architecture, the primary focus is on keeping the domain entities and business logic separate from the infrastructure and presentation layers. The entities in the domain should be treated as immutable objects, meaning they should not be modified after they are created.

Therefore, it is generally not recommended to allow changing the ID of an entity by generating a setter in Java. Instead, you should create a new entity with the updated ID if needed. This helps to ensure that the domain entities remain in a consistent state and that any changes to the entities are tracked and auditable.

---

