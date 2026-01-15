public class Items {
        private String id;
        private String name;
        private int quantity;
        private double price;

        public Items(String id, String name, int quantity, double price) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

    @Override
    public String toString() {
        return "Items{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public String getId()  {
            return id;
        }
        public String getName()  {
            return name;
        }
        public int getQuantity()  {
            return quantity;
        }
        public double getPrice()  {
            return price;
        }

        public String setId(String id)  {
            return this.id = id;
        }
        public String setName(String name)  {
            return this.name = name;
        }
        public int setQuantity(int qty)  {
            return this.quantity = qty;
        }
        public double getPrice(double p)  {
            return this.price = p;
        }

    }
