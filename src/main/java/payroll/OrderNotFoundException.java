package payroll;

class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("No encontrado " + id);
    }
}