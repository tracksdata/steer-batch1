import axios from 'axios';
const PRODUCT_BASE_URL = 'http://localhost:8081/api/products';

export default function productOperations() {

    function loadAllProducts() {
        return axios.get(PRODUCT_BASE_URL);
    }

    function findProductsById(id) {
        return axios.get(PRODUCT_BASE_URL + `/${id}`);
    }


    function findProductsByCategory(categoryId) {
        return axios.get(PRODUCT_BASE_URL + `/category/${categoryId}`);
    }

    function findProductsByName(brandName) {
        return axios.get(PRODUCT_BASE_URL + `/brands/${brandName}`);

    }

    function findAllBrandNames() {
        return axios.get(PRODUCT_BASE_URL + "/brands");
    }

    function loadProductsByPriceMinAndMax(minPrice, maxPrice) {
        return axios.get(PRODUCT_BASE_URL + `/${minPrice}/${maxPrice}`);

    }

    return {
        loadAllProducts,
        findProductsById,
        findProductsByCategory,
        findProductsByName,
        findAllBrandNames,
        loadProductsByPriceMinAndMax
    }
}




