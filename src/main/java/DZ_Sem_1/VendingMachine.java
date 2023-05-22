package DZ_Sem_1;

import java.util.List;

public class VendingMachine extends Product{
    protected final List<Product> products;

    public VendingMachine (List<Product> products){
        this.products = products;
    }

    public Energy getEnergy(String name, String brand){
        for (Product product : products){
            if (product instanceof Energy){
                if (product.getName() == name && product.getBrand() == brand){
                    return (Energy) product;
                }
            }
        }
        return null;
    }

    public Water getWater(String name, String brand, double litr){
        for (Product product : products){
            if (product instanceof Water){
                if (product.getName() == name && product.getBrand() == brand
                && ((Water) product).getLitr() == litr){
                    return (Water) product;
                }
            }
        }
        return null;
    }

    public Milk getMilk(String name, String brand, double litr){
        for (Product product : products){
            if (product instanceof Milk){
                if (product.getName() == name && product.getBrand() == brand
                && (((Milk) product).getLitr()) == litr){
                    return (Milk) product;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, String brand){
        for (Product product : products){
            if (product instanceof Chocolate){
                if (product.getName() == name && product.getBrand() == brand){
                    return (Chocolate) product;
                }
            }
        }
        return null;
    }


}
