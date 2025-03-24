package com.example.testcases.business;

import com.example.testcases.model.Item;
import com.example.testcases.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {

    @InjectMocks
    private ItemBusinessService business;

    @Mock
    private ItemRepository itemRepository;

    @Test
    public void retrieveAllItems_basics(){
        when(itemRepository.findAll()).
                thenReturn(Arrays.asList(new Item(2, "Item2", 200,15),
                        new Item(3, "Item3", 150,25)));

        List<Item> items = business.retrieveAllItems();
        assertEquals(3000, items.get(0).getValue());
        assertEquals(3750, items.get(1).getValue());
    }

}
