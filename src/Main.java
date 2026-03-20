import domain.Product;

void main() {
    Product product = new Product("AHUSA8DDSD", "PLAY 5", new BigDecimal(3000));
    product.setPrice(new BigDecimal("1000"));
    product.setPrice(new BigDecimal("999"));

    System.out.println(product.toString());

}
