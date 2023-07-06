package track11HashTable.pack2ChainMethod;

import track11HashTable.Person;

public class Link {

    private Link nextLink;
    private Person value;

    public Link(Person value) {
        this.value = value;
    }

    public void setNextLink(Link nextLink) {
        this.nextLink = nextLink;
    }

    public Link getNextLink() {
        return nextLink;
    }

    public Person getValue() {
        return value;
    }
}
