class Computer {
    private final String processor;
    private final String ram;
    private final String storage;

    private Computer(String processor, String ram, String storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }

    // Fluent Builder
    public static class Builder {
        private String processor;
        private String ram;
        private String storage;

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer assemble() {
            return new Computer(processor, ram, storage); // object built only here
        }
    }
}
