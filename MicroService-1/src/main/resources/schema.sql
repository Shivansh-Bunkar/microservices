DROP TABLE IF EXISTS currency_conversion;

CREATE TABLE currency_conversion (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    from_currency VARCHAR(5),
    to_currency VARCHAR(5),
    quantity DOUBLE,
    conversion_rate DOUBLE,
    total_calculate_amount DOUBLE,
    local_date_time TIMESTAMP
);
