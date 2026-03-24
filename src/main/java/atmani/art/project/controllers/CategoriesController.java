package atmani.art.project.controllers;

import atmani.art.project.v1.api.CategoriesApi;
import atmani.art.project.v1.model.CategoryDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CategoriesController implements CategoriesApi {
    @Override
    public ResponseEntity<List<CategoryDTO>> categoriesGet() {
        return null;
    }

    @Override
    public ResponseEntity<Void> categoriesIdDelete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<CategoryDTO> categoriesIdGet(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<CategoryDTO> categoriesIdPut(Long id, CategoryDTO category) {
        return null;
    }

    @Override
    public ResponseEntity<CategoryDTO> categoriesPost(CategoryDTO category) {
        return null;
    }
}
