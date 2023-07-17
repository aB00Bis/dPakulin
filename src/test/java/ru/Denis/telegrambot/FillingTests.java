package ru.Denis.telegrambot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.Denis.telegrambot.entities.Category;
import ru.Denis.telegrambot.entities.Client;
import ru.Denis.telegrambot.entities.Product;
import ru.Denis.telegrambot.repositories.*;

@SpringBootTest
public class FillingTests
{
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientOrderRepository clientOrderRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private OrderProductRepository orderProductRepository;

    @Test
    void createClients() //Создание клиентов
    {
        Client client1 = new Client();
        client1.setAddress("address1");
        client1.setExternalId(1L);
        client1.setFullName("Egor");
        client1.setPhoneNumber("+7978748561");
        clientRepository.save(client1);

        Client client2 = new Client();
        client2.setAddress("address2");
        client2.setExternalId(2L);
        client2.setFullName("Igor");
        client2.setPhoneNumber("+7978561735");
        clientRepository.save(client2);

        Client client3 = new Client();
        client3.setAddress("address3");
        client3.setExternalId(3L);
        client3.setFullName("Andrey");
        client3.setPhoneNumber("+7978653742");
        clientRepository.save(client3);

        Client client4 = new Client();
        client4.setAddress("address4");
        client4.setExternalId(4L);
        client4.setFullName("Denis");
        client4.setPhoneNumber("+7978647261");
        clientRepository.save(client4);
    }
    @Test
    void createCategories()// Создание категорий
    {
        Category pizza = new Category();
        pizza.setName("Пицца");
        pizza.setParent(null);
        categoryRepository.save(pizza);

        Category rolls = new Category();
        rolls.setName("Роллы");
        rolls.setParent(null);
        categoryRepository.save(rolls);

        Category burgers = new Category();
        burgers.setName("Бургеры");
        burgers.setParent(null);
        categoryRepository.save(burgers);

        Category drinks = new Category();
        drinks.setName("Напитки");
        drinks.setParent(null);
        categoryRepository.save(drinks);

        // Создание подгатегорий
        Category classicRolls = new Category();
        classicRolls.setName("Классические роллы");
        classicRolls.setParent(rolls);
        categoryRepository.save(classicRolls);

        Category bakedRolls = new Category();
        bakedRolls.setName("Запеченные роллы");
        bakedRolls.setParent(rolls);
        categoryRepository.save(bakedRolls);

        Category sweetRolls = new Category();
        sweetRolls.setName("Сладкие роллы");
        sweetRolls.setParent(rolls);
        categoryRepository.save(sweetRolls);

        Category sets = new Category();
        sets.setName("Наборы");
        sets.setParent(rolls);
        categoryRepository.save(sets);

        Category classicBurgers = new Category();
        classicBurgers.setName("Классические бургеры");
        classicBurgers.setParent(burgers);
        categoryRepository.save(classicBurgers);

        Category spicyBurgers = new Category();
        spicyBurgers.setName("Острые бургеры");
        spicyBurgers.setParent(burgers);
        categoryRepository.save(spicyBurgers);

        Category sodas = new Category();
        sodas.setName("Газированные напитки");
        sodas.setParent(drinks);
        categoryRepository.save(sodas);

        Category energyDrinks = new Category();
        energyDrinks.setName("Энергетические напитки");
        energyDrinks.setParent(drinks);
        categoryRepository.save(energyDrinks);

        Category juices = new Category();
        juices.setName("Соки");
        juices.setParent(drinks);
        categoryRepository.save(juices);

        Category otherDrinks = new Category();
        otherDrinks.setName("Другие");
        otherDrinks.setParent(drinks);
        categoryRepository.save(otherDrinks);

        Product pizza1 = new Product();
        pizza1.setName("Пицца 1");
        pizza1.setDescription("Описание пиццы 1");
        pizza1.setPrice(10.0);
        pizza1.setCategory(pizza);
        productRepository.save(pizza1);

        Product pizza2 = new Product();
        pizza2.setName("Пицца 2");
        pizza2.setDescription("Описание пиццы 2");
        pizza2.setPrice(12.0);
        pizza2.setCategory(pizza);
        productRepository.save(pizza2);

        Product pizza3 = new Product();
        pizza3.setName("Пицца 3");
        pizza3.setDescription("Описание пиццы 3");
        pizza3.setPrice(15.0);
        pizza3.setCategory(pizza);
        productRepository.save(pizza3);

        Product classicRoll1 = new Product();
        classicRoll1.setName("Классический ролл 1");
        classicRoll1.setDescription("Описание ролла 1");
        classicRoll1.setPrice(5.0);
        classicRoll1.setCategory(classicRolls);
        productRepository.save(classicRoll1);

        Product classicRoll2 = new Product();
        classicRoll2.setName("Классический ролл 2");
        classicRoll2.setDescription("Описание ролла 2");
        classicRoll2.setPrice(6.0);
        classicRoll2.setCategory(classicRolls);
        productRepository.save(classicRoll2);

        Product classicRoll3 = new Product();
        classicRoll3.setName("Классический ролл 3");
        classicRoll3.setDescription("Описание ролла 3");
        classicRoll3.setPrice(7.0);
        classicRoll3.setCategory(classicRolls);
        productRepository.save(classicRoll3);

        Product bakedRoll1 = new Product();
        bakedRoll1.setName("Запеченный ролл 1");
        bakedRoll1.setDescription("Описание ролла 1");
        bakedRoll1.setPrice(6.0);
        bakedRoll1.setCategory(bakedRolls);
        productRepository.save(bakedRoll1);

        Product bakedRoll2 = new Product();
        bakedRoll2.setName("Запеченный ролл 2");
        bakedRoll2.setDescription("Описание ролла 2");
        bakedRoll2.setPrice(7.0);
        bakedRoll2.setCategory(bakedRolls);
        productRepository.save(bakedRoll2);

        Product bakedRoll3 = new Product();
        bakedRoll3.setName("Запеченный ролл 3");
        bakedRoll3.setDescription("Описание ролла 3");
        bakedRoll3.setPrice(8.0);
        bakedRoll3.setCategory(bakedRolls);
        productRepository.save(bakedRoll3);

        Product sweetRoll1 = new Product();
        sweetRoll1.setName("Сладкий ролл 1");
        sweetRoll1.setDescription("Описание ролла 1");
        sweetRoll1.setPrice(4.0);
        sweetRoll1.setCategory(sweetRolls);
        productRepository.save(sweetRoll1);

        Product sweetRoll2 = new Product();
        sweetRoll2.setName("Сладкий ролл 2");
        sweetRoll2.setDescription("Описание ролла 2");
        sweetRoll2.setPrice(5.0);
        sweetRoll2.setCategory(sweetRolls);
        productRepository.save(sweetRoll2);

        Product sweetRoll3 = new Product();
        sweetRoll3.setName("Сладкий ролл 3");
        sweetRoll3.setDescription("Описание ролла 3");
        sweetRoll3.setPrice(6.0);
        sweetRoll3.setCategory(sweetRolls);
        productRepository.save(sweetRoll3);

        Product set1 = new Product();
        set1.setName("Набор 1");
        set1.setDescription("Описание набора 1");
        set1.setPrice(20.0);
        set1.setCategory(sets);
        productRepository.save(set1);

        Product set2 = new Product();
        set2.setName("Набор 2");
        set2.setDescription("Описание набора 2");
        set2.setPrice(25.0);
        set2.setCategory(sets);
        productRepository.save(set2);

        Product set3 = new Product();
        set3.setName("Набор 3");
        set3.setDescription("Описание набора 3");
        set3.setPrice(30.0);
        set3.setCategory(sets);
        productRepository.save(set3);

        Product classicBurger1 = new Product();
        classicBurger1.setName("Классический бургер 1");
        classicBurger1.setDescription("Описание бургера 1");
        classicBurger1.setPrice(8.0);
        classicBurger1.setCategory(classicBurgers);
        productRepository.save(classicBurger1);

        Product classicBurger2 = new Product();
        classicBurger2.setName("Классический бургер 2");
        classicBurger2.setDescription("Описание бургера 2");
        classicBurger2.setPrice(9.0);
        classicBurger2.setCategory(classicBurgers);
        productRepository.save(classicBurger2);

        Product classicBurger3 = new Product();
        classicBurger3.setName("Классический бургер 3");
        classicBurger3.setDescription("Описание бургера 3");
        classicBurger3.setPrice(10.0);
        classicBurger3.setCategory(classicBurgers);
        productRepository.save(classicBurger3);

        Product spicyBurger1 = new Product();
        spicyBurger1.setName("Острый бургер 1");
        spicyBurger1.setDescription("Описание бургера 1");
        spicyBurger1.setPrice(9.0);
        spicyBurger1.setCategory(spicyBurgers);
        productRepository.save(spicyBurger1);

        Product spicyBurger2 = new Product();
        spicyBurger2.setName("Острый бургер 2");
        spicyBurger2.setDescription("Описание бургера 2");
        spicyBurger2.setPrice(10.0);
        spicyBurger2.setCategory(spicyBurgers);
        productRepository.save(spicyBurger2);

        Product spicyBurger3 = new Product();
        spicyBurger3.setName("Острый бургер 3");
        spicyBurger3.setDescription("Описание бургера 3");
        spicyBurger3.setPrice(11.0);
        spicyBurger3.setCategory(spicyBurgers);
        productRepository.save(spicyBurger3);

        Product soda1 = new Product();
        soda1.setName("Газировка 1");
        soda1.setDescription("Описание газировки 1");
        soda1.setPrice(2.0);
        soda1.setCategory(sodas);
        productRepository.save(soda1);

        Product soda2 = new Product();
        soda2.setName("Газировка 2");
        soda2.setDescription("Описание газировки 2");
        soda2.setPrice(2.5);
        soda2.setCategory(sodas);
        productRepository.save(soda2);

        Product soda3 = new Product();
        soda3.setName("Газировка 3");
        soda3.setDescription("Описание газировки 3");
        soda3.setPrice(3.0);
        soda3.setCategory(sodas);
        productRepository.save(soda3);

        Product energyDrink1 = new Product();
        energyDrink1.setName("Энергетик 1");
        energyDrink1.setDescription("Описание энергетика 1");
        energyDrink1.setPrice(3.0);
        energyDrink1.setCategory(energyDrinks);
        productRepository.save(energyDrink1);

        Product energyDrink2 = new Product();
        energyDrink2.setName("Энергетик 2");
        energyDrink2.setDescription("Описание энергетика 2");
        energyDrink2.setPrice(3.5);
        energyDrink2.setCategory(energyDrinks);
        productRepository.save(energyDrink2);

        Product energyDrink3 = new Product();
        energyDrink3.setName("Энергетик 3");
        energyDrink3.setDescription("Описание энергетика 3");
        energyDrink3.setPrice(4.0);
        energyDrink3.setCategory(energyDrinks);
        productRepository.save(energyDrink3);

        Product juice1 = new Product();
        juice1.setName("Сок 1");
        juice1.setDescription("Описание сока 1");
        juice1.setPrice(2.5);
        juice1.setCategory(juices);
        productRepository.save(juice1);

        Product juice2 = new Product();
        juice2.setName("Сок 2");
        juice2.setDescription("Описание сока 2");
        juice2.setPrice(3.0);
        juice2.setCategory(juices);
        productRepository.save(juice2);

        Product juice3 = new Product();
        juice3.setName("Сок 3");
        juice3.setDescription("Описание сока 3");
        juice3.setPrice(3.5);
        juice3.setCategory(juices);
        productRepository.save(juice3);

        Product otherDrink1 = new Product();
        otherDrink1.setName("Другой напиток 1");
        otherDrink1.setDescription("Описание другого напитка 1");
        otherDrink1.setPrice(2.0);
        otherDrink1.setCategory(otherDrinks);
        productRepository.save(otherDrink1);

        Product otherDrink2 = new Product();
        otherDrink2.setName("Другой напиток 2");
        otherDrink2.setDescription("Описание другого напитка 2");
        otherDrink2.setPrice(2.5);
        otherDrink2.setCategory(otherDrinks);
        productRepository.save(otherDrink2);

        Product otherDrink3 = new Product();
        otherDrink3.setName("Другой напиток 3");
        otherDrink3.setDescription("Описание другого напитка 3");
        otherDrink3.setPrice(3.0);
        otherDrink3.setCategory(otherDrinks);
        productRepository.save(otherDrink3);
    }
}
