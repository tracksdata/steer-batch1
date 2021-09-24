import { useState } from 'react';
import { useForm } from "react-hook-form";
import productOperations from '../services/ProductHttpService';

const ProductForm = () => {

    const { register, handleSubmit, formState: { errors } } = useForm();
    // const onSubmit = product => console.log(product);
    let { saveProduct } = productOperations();
    function onSubmit(product) {

        console.log(product);
        saveProduct(product)
            .then(product => {
                console.log(">>>>>>>>>>>>>>>>");
                console.log(product);
                console.log("<<<<<<<<<<<<<<<<");
            })
        return product;
    }

    return (
        <div>

            <h2>Product Form</h2>
            <hr />
            <form onSubmit={handleSubmit(onSubmit)}>

                <div>
                    <select {...register("brand.brandId")}>
                        <option value="">Select...</option>
                        <option value="2">Samsung</option>
                        <option value="3">HP</option>
                        <option value="4">Apple</option>
                    </select>
                </div>

                <div>
                    <select {...register("category.categoryId")}>
                        <option value="">Select...</option>
                        <option value="12">Electronics</option>
                        <option value="2">Kitchen Items</option>
                    </select>
                </div>

                <div>
                    <input {...register("productId", { required: true })} placeholder="Product ID" />
                    <span className="text-danger">
                        {errors.productId && <span>Product ID is required</span>}
                    </span>
                </div>

                <div>
                    <input {...register("title", { required: true })} placeholder="Product name" />
                    <span className="text-danger">
                        {errors.title && <span>Product Name is required</span>}
                    </span>
                </div>

                <div>
                    <input {...register("price", { required: true })} placeholder="Price" />
                    <span className="text-danger">
                        {errors.price && <span>Price is required</span>}
                    </span>
                </div>

                <div>
                    <input {...register("description", { required: true })} placeholder="Description" />
                    <span className="text-danger">
                        {errors.description && <span>Description is required</span>}
                    </span>
                </div>

                <div>
                    <input {...register("qty", { required: true })} placeholder="Quantity" />
                    <span className="text-danger">
                        {errors.qty && <span>Quantity is required</span>}
                    </span>
                </div>

                <div>
                    <input {...register("imagePath", { required: true })} placeholder="Image Path" />
                    <span className="text-danger">
                        {errors.imagePath && <span>Image Path is required</span>}
                    </span>
                </div>

                <div>
                    <textarea  {...register("keywords", { required: true })} placeholder="keywords">
                    
                    </textarea>
                    <span className="text-danger">
                        {errors.keywords && <span>Keywords are required</span>}
                    </span>
                </div>

                <br />

                <input type="submit" />
            </form>

        </div>
    );
};

export default ProductForm;