# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ImageVersionArgs', 'ImageVersion']

@pulumi.input_type
class ImageVersionArgs:
    def __init__(__self__, *,
                 base_image: pulumi.Input[str],
                 image_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a ImageVersion resource.
        :param pulumi.Input[str] base_image: The registry path of the container image on which this image version is based.
        :param pulumi.Input[str] image_name: The name of the image. Must be unique to your account.
        """
        pulumi.set(__self__, "base_image", base_image)
        pulumi.set(__self__, "image_name", image_name)

    @property
    @pulumi.getter(name="baseImage")
    def base_image(self) -> pulumi.Input[str]:
        """
        The registry path of the container image on which this image version is based.
        """
        return pulumi.get(self, "base_image")

    @base_image.setter
    def base_image(self, value: pulumi.Input[str]):
        pulumi.set(self, "base_image", value)

    @property
    @pulumi.getter(name="imageName")
    def image_name(self) -> pulumi.Input[str]:
        """
        The name of the image. Must be unique to your account.
        """
        return pulumi.get(self, "image_name")

    @image_name.setter
    def image_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "image_name", value)


@pulumi.input_type
class _ImageVersionState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 base_image: Optional[pulumi.Input[str]] = None,
                 container_image: Optional[pulumi.Input[str]] = None,
                 image_arn: Optional[pulumi.Input[str]] = None,
                 image_name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering ImageVersion resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
        :param pulumi.Input[str] base_image: The registry path of the container image on which this image version is based.
        :param pulumi.Input[str] container_image: The registry path of the container image that contains this image version.
        :param pulumi.Input[str] image_arn: The Amazon Resource Name (ARN) of the image the version is based on.
        :param pulumi.Input[str] image_name: The name of the image. Must be unique to your account.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if base_image is not None:
            pulumi.set(__self__, "base_image", base_image)
        if container_image is not None:
            pulumi.set(__self__, "container_image", container_image)
        if image_arn is not None:
            pulumi.set(__self__, "image_arn", image_arn)
        if image_name is not None:
            pulumi.set(__self__, "image_name", image_name)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="baseImage")
    def base_image(self) -> Optional[pulumi.Input[str]]:
        """
        The registry path of the container image on which this image version is based.
        """
        return pulumi.get(self, "base_image")

    @base_image.setter
    def base_image(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "base_image", value)

    @property
    @pulumi.getter(name="containerImage")
    def container_image(self) -> Optional[pulumi.Input[str]]:
        """
        The registry path of the container image that contains this image version.
        """
        return pulumi.get(self, "container_image")

    @container_image.setter
    def container_image(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "container_image", value)

    @property
    @pulumi.getter(name="imageArn")
    def image_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the image the version is based on.
        """
        return pulumi.get(self, "image_arn")

    @image_arn.setter
    def image_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "image_arn", value)

    @property
    @pulumi.getter(name="imageName")
    def image_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the image. Must be unique to your account.
        """
        return pulumi.get(self, "image_name")

    @image_name.setter
    def image_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "image_name", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class ImageVersion(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base_image: Optional[pulumi.Input[str]] = None,
                 image_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a SageMaker Image Version resource.

        ## Example Usage
        ### Basic usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.sagemaker.ImageVersion("test",
            image_name=aws_sagemaker_image["test"]["id"],
            base_image="012345678912.dkr.ecr.us-west-2.amazonaws.com/image:latest")
        ```

        ## Import

        Using `pulumi import`, import SageMaker Image Versions using the `name`. For example:

        ```sh
         $ pulumi import aws:sagemaker/imageVersion:ImageVersion test_image my-code-repo
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] base_image: The registry path of the container image on which this image version is based.
        :param pulumi.Input[str] image_name: The name of the image. Must be unique to your account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ImageVersionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a SageMaker Image Version resource.

        ## Example Usage
        ### Basic usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.sagemaker.ImageVersion("test",
            image_name=aws_sagemaker_image["test"]["id"],
            base_image="012345678912.dkr.ecr.us-west-2.amazonaws.com/image:latest")
        ```

        ## Import

        Using `pulumi import`, import SageMaker Image Versions using the `name`. For example:

        ```sh
         $ pulumi import aws:sagemaker/imageVersion:ImageVersion test_image my-code-repo
        ```

        :param str resource_name: The name of the resource.
        :param ImageVersionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ImageVersionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base_image: Optional[pulumi.Input[str]] = None,
                 image_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ImageVersionArgs.__new__(ImageVersionArgs)

            if base_image is None and not opts.urn:
                raise TypeError("Missing required property 'base_image'")
            __props__.__dict__["base_image"] = base_image
            if image_name is None and not opts.urn:
                raise TypeError("Missing required property 'image_name'")
            __props__.__dict__["image_name"] = image_name
            __props__.__dict__["arn"] = None
            __props__.__dict__["container_image"] = None
            __props__.__dict__["image_arn"] = None
            __props__.__dict__["version"] = None
        super(ImageVersion, __self__).__init__(
            'aws:sagemaker/imageVersion:ImageVersion',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            base_image: Optional[pulumi.Input[str]] = None,
            container_image: Optional[pulumi.Input[str]] = None,
            image_arn: Optional[pulumi.Input[str]] = None,
            image_name: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'ImageVersion':
        """
        Get an existing ImageVersion resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
        :param pulumi.Input[str] base_image: The registry path of the container image on which this image version is based.
        :param pulumi.Input[str] container_image: The registry path of the container image that contains this image version.
        :param pulumi.Input[str] image_arn: The Amazon Resource Name (ARN) of the image the version is based on.
        :param pulumi.Input[str] image_name: The name of the image. Must be unique to your account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ImageVersionState.__new__(_ImageVersionState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["base_image"] = base_image
        __props__.__dict__["container_image"] = container_image
        __props__.__dict__["image_arn"] = image_arn
        __props__.__dict__["image_name"] = image_name
        __props__.__dict__["version"] = version
        return ImageVersion(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) assigned by AWS to this Image Version.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="baseImage")
    def base_image(self) -> pulumi.Output[str]:
        """
        The registry path of the container image on which this image version is based.
        """
        return pulumi.get(self, "base_image")

    @property
    @pulumi.getter(name="containerImage")
    def container_image(self) -> pulumi.Output[str]:
        """
        The registry path of the container image that contains this image version.
        """
        return pulumi.get(self, "container_image")

    @property
    @pulumi.getter(name="imageArn")
    def image_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the image the version is based on.
        """
        return pulumi.get(self, "image_arn")

    @property
    @pulumi.getter(name="imageName")
    def image_name(self) -> pulumi.Output[str]:
        """
        The name of the image. Must be unique to your account.
        """
        return pulumi.get(self, "image_name")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        return pulumi.get(self, "version")

