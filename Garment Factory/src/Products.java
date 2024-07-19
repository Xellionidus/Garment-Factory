// Abstract product interfaces for Tops, Pants, and Shoes
interface Top {
    void wear();
}

interface Pants {
    void wear();
}

interface Shoes {
    void wear();
}

// Concrete product classes for Professional variants
class ProfessionalTop implements Top {
    public void wear() {
        System.out.println("Wearing a professional top.");
    }
}

class ProfessionalPants implements Pants {
    public void wear() {
        System.out.println("Wearing professional pants.");
    }
}

class ProfessionalShoes implements Shoes {
    public void wear() {
        System.out.println("Wearing professional shoes.");
    }
}

// Concrete product classes for Casual varian
class CasualTop implements Top {
    public void wear() {
        System.out.println("Wearing a casual top.");
    }
}

class CasualPants implements Pants {
    public void wear() {
        System.out.println("Wearing casual pants.");
    }
}

class CasualShoes implements Shoes {
    public void wear() {
        System.out.println("Wearing casual shoes.");
    }
}

// concrete product classes for Party variant
class PartyTop implements Top {
    public void wear() {
        System.out.println("Wearing a party top.");
    }
}

class PartyPants implements Pants {
    public void wear() {
        System.out.println("Wearing party pants.");
    }
}

class PartyShoes implements Shoes {
    public void wear() {
        System.out.println("Wearing party shoes.");
    }
}

// Abstract factory interrface for creating related products
interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}

// Concrete factories for each variant on the GarmentFactory
class ProfessionalGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new ProfessionalTop();
    }
    public Pants createPants() {
        return new ProfessionalPants();
    }
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}

class CasualGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new CasualTop();
    }
    public Pants createPants() {
        return new CasualPants();
    }
    public Shoes createShoes() {
        return new CasualShoes();
    }
}

class PartyGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new PartyTop();
    }
    public Pants createPants() {
        return new PartyPants();
    }
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
