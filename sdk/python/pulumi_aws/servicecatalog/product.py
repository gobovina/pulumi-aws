# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ProductArgs', 'Product']

@pulumi.input_type
class ProductArgs:
    def __init__(__self__, *,
                 owner: pulumi.Input[str],
                 provisioning_artifact_parameters: pulumi.Input['ProductProvisioningArtifactParametersArgs'],
                 type: pulumi.Input[str],
                 accept_language: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 distributor: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 support_description: Optional[pulumi.Input[str]] = None,
                 support_email: Optional[pulumi.Input[str]] = None,
                 support_url: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Product resource.
        :param pulumi.Input[str] owner: Owner of the product.
        :param pulumi.Input['ProductProvisioningArtifactParametersArgs'] provisioning_artifact_parameters: Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
        :param pulumi.Input[str] type: Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
               
               The following arguments are optional:
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        :param pulumi.Input[str] description: Description of the product.
        :param pulumi.Input[str] distributor: Distributor (i.e., vendor) of the product.
        :param pulumi.Input[str] name: Name of the product.
        :param pulumi.Input[str] support_description: Support information about the product.
        :param pulumi.Input[str] support_email: Contact email for product support.
        :param pulumi.Input[str] support_url: Contact URL for product support.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "owner", owner)
        pulumi.set(__self__, "provisioning_artifact_parameters", provisioning_artifact_parameters)
        pulumi.set(__self__, "type", type)
        if accept_language is not None:
            pulumi.set(__self__, "accept_language", accept_language)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if distributor is not None:
            pulumi.set(__self__, "distributor", distributor)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if support_description is not None:
            pulumi.set(__self__, "support_description", support_description)
        if support_email is not None:
            pulumi.set(__self__, "support_email", support_email)
        if support_url is not None:
            pulumi.set(__self__, "support_url", support_url)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Input[str]:
        """
        Owner of the product.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: pulumi.Input[str]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="provisioningArtifactParameters")
    def provisioning_artifact_parameters(self) -> pulumi.Input['ProductProvisioningArtifactParametersArgs']:
        """
        Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
        """
        return pulumi.get(self, "provisioning_artifact_parameters")

    @provisioning_artifact_parameters.setter
    def provisioning_artifact_parameters(self, value: pulumi.Input['ProductProvisioningArtifactParametersArgs']):
        pulumi.set(self, "provisioning_artifact_parameters", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.

        The following arguments are optional:
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="acceptLanguage")
    def accept_language(self) -> Optional[pulumi.Input[str]]:
        """
        Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        """
        return pulumi.get(self, "accept_language")

    @accept_language.setter
    def accept_language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accept_language", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the product.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def distributor(self) -> Optional[pulumi.Input[str]]:
        """
        Distributor (i.e., vendor) of the product.
        """
        return pulumi.get(self, "distributor")

    @distributor.setter
    def distributor(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "distributor", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the product.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="supportDescription")
    def support_description(self) -> Optional[pulumi.Input[str]]:
        """
        Support information about the product.
        """
        return pulumi.get(self, "support_description")

    @support_description.setter
    def support_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "support_description", value)

    @property
    @pulumi.getter(name="supportEmail")
    def support_email(self) -> Optional[pulumi.Input[str]]:
        """
        Contact email for product support.
        """
        return pulumi.get(self, "support_email")

    @support_email.setter
    def support_email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "support_email", value)

    @property
    @pulumi.getter(name="supportUrl")
    def support_url(self) -> Optional[pulumi.Input[str]]:
        """
        Contact URL for product support.
        """
        return pulumi.get(self, "support_url")

    @support_url.setter
    def support_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "support_url", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ProductState:
    def __init__(__self__, *,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 created_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 distributor: Optional[pulumi.Input[str]] = None,
                 has_default_path: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 provisioning_artifact_parameters: Optional[pulumi.Input['ProductProvisioningArtifactParametersArgs']] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 support_description: Optional[pulumi.Input[str]] = None,
                 support_email: Optional[pulumi.Input[str]] = None,
                 support_url: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Product resources.
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        :param pulumi.Input[str] arn: ARN of the product.
        :param pulumi.Input[str] created_time: Time when the product was created.
        :param pulumi.Input[str] description: Description of the product.
        :param pulumi.Input[str] distributor: Distributor (i.e., vendor) of the product.
        :param pulumi.Input[bool] has_default_path: Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
        :param pulumi.Input[str] name: Name of the product.
        :param pulumi.Input[str] owner: Owner of the product.
        :param pulumi.Input['ProductProvisioningArtifactParametersArgs'] provisioning_artifact_parameters: Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
        :param pulumi.Input[str] status: Status of the product.
        :param pulumi.Input[str] support_description: Support information about the product.
        :param pulumi.Input[str] support_email: Contact email for product support.
        :param pulumi.Input[str] support_url: Contact URL for product support.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
               
               The following arguments are optional:
        """
        if accept_language is not None:
            pulumi.set(__self__, "accept_language", accept_language)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if created_time is not None:
            pulumi.set(__self__, "created_time", created_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if distributor is not None:
            pulumi.set(__self__, "distributor", distributor)
        if has_default_path is not None:
            pulumi.set(__self__, "has_default_path", has_default_path)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if provisioning_artifact_parameters is not None:
            pulumi.set(__self__, "provisioning_artifact_parameters", provisioning_artifact_parameters)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if support_description is not None:
            pulumi.set(__self__, "support_description", support_description)
        if support_email is not None:
            pulumi.set(__self__, "support_email", support_email)
        if support_url is not None:
            pulumi.set(__self__, "support_url", support_url)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="acceptLanguage")
    def accept_language(self) -> Optional[pulumi.Input[str]]:
        """
        Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        """
        return pulumi.get(self, "accept_language")

    @accept_language.setter
    def accept_language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accept_language", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the product.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="createdTime")
    def created_time(self) -> Optional[pulumi.Input[str]]:
        """
        Time when the product was created.
        """
        return pulumi.get(self, "created_time")

    @created_time.setter
    def created_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the product.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def distributor(self) -> Optional[pulumi.Input[str]]:
        """
        Distributor (i.e., vendor) of the product.
        """
        return pulumi.get(self, "distributor")

    @distributor.setter
    def distributor(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "distributor", value)

    @property
    @pulumi.getter(name="hasDefaultPath")
    def has_default_path(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
        """
        return pulumi.get(self, "has_default_path")

    @has_default_path.setter
    def has_default_path(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "has_default_path", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the product.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Owner of the product.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="provisioningArtifactParameters")
    def provisioning_artifact_parameters(self) -> Optional[pulumi.Input['ProductProvisioningArtifactParametersArgs']]:
        """
        Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
        """
        return pulumi.get(self, "provisioning_artifact_parameters")

    @provisioning_artifact_parameters.setter
    def provisioning_artifact_parameters(self, value: Optional[pulumi.Input['ProductProvisioningArtifactParametersArgs']]):
        pulumi.set(self, "provisioning_artifact_parameters", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the product.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="supportDescription")
    def support_description(self) -> Optional[pulumi.Input[str]]:
        """
        Support information about the product.
        """
        return pulumi.get(self, "support_description")

    @support_description.setter
    def support_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "support_description", value)

    @property
    @pulumi.getter(name="supportEmail")
    def support_email(self) -> Optional[pulumi.Input[str]]:
        """
        Contact email for product support.
        """
        return pulumi.get(self, "support_email")

    @support_email.setter
    def support_email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "support_email", value)

    @property
    @pulumi.getter(name="supportUrl")
    def support_url(self) -> Optional[pulumi.Input[str]]:
        """
        Contact URL for product support.
        """
        return pulumi.get(self, "support_url")

    @support_url.setter
    def support_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "support_url", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.

        The following arguments are optional:
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class Product(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 distributor: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 provisioning_artifact_parameters: Optional[pulumi.Input[pulumi.InputType['ProductProvisioningArtifactParametersArgs']]] = None,
                 support_description: Optional[pulumi.Input[str]] = None,
                 support_email: Optional[pulumi.Input[str]] = None,
                 support_url: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Service Catalog Product.

        > **NOTE:** The user or role that uses this resources must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `template_physical_id` argument.

        > A "provisioning artifact" is also referred to as a "version." A "distributor" is also referred to as a "vendor."

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicecatalog.Product("example",
            owner="example-owner",
            provisioning_artifact_parameters=aws.servicecatalog.ProductProvisioningArtifactParametersArgs(
                template_url="https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/temp1.json",
            ),
            tags={
                "foo": "bar",
            },
            type="CLOUD_FORMATION_TEMPLATE")
        ```

        ## Import

        Using `pulumi import`, import `aws_servicecatalog_product` using the product ID. For example:

        ```sh
         $ pulumi import aws:servicecatalog/product:Product example prod-dnigbtea24ste
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        :param pulumi.Input[str] description: Description of the product.
        :param pulumi.Input[str] distributor: Distributor (i.e., vendor) of the product.
        :param pulumi.Input[str] name: Name of the product.
        :param pulumi.Input[str] owner: Owner of the product.
        :param pulumi.Input[pulumi.InputType['ProductProvisioningArtifactParametersArgs']] provisioning_artifact_parameters: Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
        :param pulumi.Input[str] support_description: Support information about the product.
        :param pulumi.Input[str] support_email: Contact email for product support.
        :param pulumi.Input[str] support_url: Contact URL for product support.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] type: Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProductArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Service Catalog Product.

        > **NOTE:** The user or role that uses this resources must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `template_physical_id` argument.

        > A "provisioning artifact" is also referred to as a "version." A "distributor" is also referred to as a "vendor."

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicecatalog.Product("example",
            owner="example-owner",
            provisioning_artifact_parameters=aws.servicecatalog.ProductProvisioningArtifactParametersArgs(
                template_url="https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/temp1.json",
            ),
            tags={
                "foo": "bar",
            },
            type="CLOUD_FORMATION_TEMPLATE")
        ```

        ## Import

        Using `pulumi import`, import `aws_servicecatalog_product` using the product ID. For example:

        ```sh
         $ pulumi import aws:servicecatalog/product:Product example prod-dnigbtea24ste
        ```

        :param str resource_name: The name of the resource.
        :param ProductArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProductArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 distributor: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 provisioning_artifact_parameters: Optional[pulumi.Input[pulumi.InputType['ProductProvisioningArtifactParametersArgs']]] = None,
                 support_description: Optional[pulumi.Input[str]] = None,
                 support_email: Optional[pulumi.Input[str]] = None,
                 support_url: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProductArgs.__new__(ProductArgs)

            __props__.__dict__["accept_language"] = accept_language
            __props__.__dict__["description"] = description
            __props__.__dict__["distributor"] = distributor
            __props__.__dict__["name"] = name
            if owner is None and not opts.urn:
                raise TypeError("Missing required property 'owner'")
            __props__.__dict__["owner"] = owner
            if provisioning_artifact_parameters is None and not opts.urn:
                raise TypeError("Missing required property 'provisioning_artifact_parameters'")
            __props__.__dict__["provisioning_artifact_parameters"] = provisioning_artifact_parameters
            __props__.__dict__["support_description"] = support_description
            __props__.__dict__["support_email"] = support_email
            __props__.__dict__["support_url"] = support_url
            __props__.__dict__["tags"] = tags
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["arn"] = None
            __props__.__dict__["created_time"] = None
            __props__.__dict__["has_default_path"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["tags_all"] = None
        super(Product, __self__).__init__(
            'aws:servicecatalog/product:Product',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accept_language: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            created_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            distributor: Optional[pulumi.Input[str]] = None,
            has_default_path: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            provisioning_artifact_parameters: Optional[pulumi.Input[pulumi.InputType['ProductProvisioningArtifactParametersArgs']]] = None,
            status: Optional[pulumi.Input[str]] = None,
            support_description: Optional[pulumi.Input[str]] = None,
            support_email: Optional[pulumi.Input[str]] = None,
            support_url: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'Product':
        """
        Get an existing Product resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        :param pulumi.Input[str] arn: ARN of the product.
        :param pulumi.Input[str] created_time: Time when the product was created.
        :param pulumi.Input[str] description: Description of the product.
        :param pulumi.Input[str] distributor: Distributor (i.e., vendor) of the product.
        :param pulumi.Input[bool] has_default_path: Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
        :param pulumi.Input[str] name: Name of the product.
        :param pulumi.Input[str] owner: Owner of the product.
        :param pulumi.Input[pulumi.InputType['ProductProvisioningArtifactParametersArgs']] provisioning_artifact_parameters: Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
        :param pulumi.Input[str] status: Status of the product.
        :param pulumi.Input[str] support_description: Support information about the product.
        :param pulumi.Input[str] support_email: Contact email for product support.
        :param pulumi.Input[str] support_url: Contact URL for product support.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
               
               The following arguments are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProductState.__new__(_ProductState)

        __props__.__dict__["accept_language"] = accept_language
        __props__.__dict__["arn"] = arn
        __props__.__dict__["created_time"] = created_time
        __props__.__dict__["description"] = description
        __props__.__dict__["distributor"] = distributor
        __props__.__dict__["has_default_path"] = has_default_path
        __props__.__dict__["name"] = name
        __props__.__dict__["owner"] = owner
        __props__.__dict__["provisioning_artifact_parameters"] = provisioning_artifact_parameters
        __props__.__dict__["status"] = status
        __props__.__dict__["support_description"] = support_description
        __props__.__dict__["support_email"] = support_email
        __props__.__dict__["support_url"] = support_url
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["type"] = type
        return Product(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="acceptLanguage")
    def accept_language(self) -> pulumi.Output[Optional[str]]:
        """
        Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        """
        return pulumi.get(self, "accept_language")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the product.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="createdTime")
    def created_time(self) -> pulumi.Output[str]:
        """
        Time when the product was created.
        """
        return pulumi.get(self, "created_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the product.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def distributor(self) -> pulumi.Output[str]:
        """
        Distributor (i.e., vendor) of the product.
        """
        return pulumi.get(self, "distributor")

    @property
    @pulumi.getter(name="hasDefaultPath")
    def has_default_path(self) -> pulumi.Output[bool]:
        """
        Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
        """
        return pulumi.get(self, "has_default_path")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the product.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        Owner of the product.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="provisioningArtifactParameters")
    def provisioning_artifact_parameters(self) -> pulumi.Output['outputs.ProductProvisioningArtifactParameters']:
        """
        Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
        """
        return pulumi.get(self, "provisioning_artifact_parameters")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the product.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="supportDescription")
    def support_description(self) -> pulumi.Output[str]:
        """
        Support information about the product.
        """
        return pulumi.get(self, "support_description")

    @property
    @pulumi.getter(name="supportEmail")
    def support_email(self) -> pulumi.Output[str]:
        """
        Contact email for product support.
        """
        return pulumi.get(self, "support_email")

    @property
    @pulumi.getter(name="supportUrl")
    def support_url(self) -> pulumi.Output[str]:
        """
        Contact URL for product support.
        """
        return pulumi.get(self, "support_url")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.

        The following arguments are optional:
        """
        return pulumi.get(self, "type")

