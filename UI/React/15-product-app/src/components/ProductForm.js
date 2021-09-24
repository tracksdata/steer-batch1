import { useState } from 'react';
import { useForm } from "react-hook-form";
const ProductForm = () => {

    const { register, handleSubmit, formState: { errors } } = useForm();
    // const onSubmit = product => console.log(product);
    function onSubmit(product) {
        console.log(product);
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
                        <option value="1">Electronics</option>
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

                <br />

                <input type="submit" />
            </form>

        </div>
    );
};

export default ProductForm;