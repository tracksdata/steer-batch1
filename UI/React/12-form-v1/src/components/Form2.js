import { useState } from 'react';
import { useForm } from "react-hook-form";
const Form2 = () => {

    const { register, handleSubmit, formState: { errors } } = useForm();
    // const onSubmit = product => console.log(product);
    function onSubmit(product) {
        console.log(product);
        return product;
    }

    return (
        <div>

            <h1>Using UseForm Hook</h1> <hr />

            <form onSubmit={handleSubmit(onSubmit)}>
                <div>
                    <input {...register("name", { required: true })} placeholder="Product name" />
                    <span>
                        {errors.name && <span>Product Name is required</span>}
                    </span>
                </div>

                <div>
                    <input {...register("price", { required: true })} placeholder="Price" />
                    <span>
                        {errors.price && <span>Price is required</span>}
                    </span>
                </div>

                <br />

                <input type="submit" />
            </form>

        </div>
    );
};

export default Form2;