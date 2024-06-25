# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['ProductPortfolioAssociationArgs', 'ProductPortfolioAssociation']

@pulumi.input_type
class ProductPortfolioAssociationArgs:
    def __init__(__self__, *,
                 portfolio_id: pulumi.Input[str],
                 product_id: pulumi.Input[str],
                 accept_language: Optional[pulumi.Input[str]] = None,
                 source_portfolio_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ProductPortfolioAssociation resource.
        :param pulumi.Input[str] portfolio_id: Portfolio identifier.
        :param pulumi.Input[str] product_id: Product identifier.
               
               The following arguments are optional:
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        :param pulumi.Input[str] source_portfolio_id: Identifier of the source portfolio.
        """
        pulumi.set(__self__, "portfolio_id", portfolio_id)
        pulumi.set(__self__, "product_id", product_id)
        if accept_language is not None:
            pulumi.set(__self__, "accept_language", accept_language)
        if source_portfolio_id is not None:
            pulumi.set(__self__, "source_portfolio_id", source_portfolio_id)

    @property
    @pulumi.getter(name="portfolioId")
    def portfolio_id(self) -> pulumi.Input[str]:
        """
        Portfolio identifier.
        """
        return pulumi.get(self, "portfolio_id")

    @portfolio_id.setter
    def portfolio_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "portfolio_id", value)

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> pulumi.Input[str]:
        """
        Product identifier.

        The following arguments are optional:
        """
        return pulumi.get(self, "product_id")

    @product_id.setter
    def product_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "product_id", value)

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
    @pulumi.getter(name="sourcePortfolioId")
    def source_portfolio_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the source portfolio.
        """
        return pulumi.get(self, "source_portfolio_id")

    @source_portfolio_id.setter
    def source_portfolio_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_portfolio_id", value)


@pulumi.input_type
class _ProductPortfolioAssociationState:
    def __init__(__self__, *,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 portfolio_id: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 source_portfolio_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ProductPortfolioAssociation resources.
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        :param pulumi.Input[str] portfolio_id: Portfolio identifier.
        :param pulumi.Input[str] product_id: Product identifier.
               
               The following arguments are optional:
        :param pulumi.Input[str] source_portfolio_id: Identifier of the source portfolio.
        """
        if accept_language is not None:
            pulumi.set(__self__, "accept_language", accept_language)
        if portfolio_id is not None:
            pulumi.set(__self__, "portfolio_id", portfolio_id)
        if product_id is not None:
            pulumi.set(__self__, "product_id", product_id)
        if source_portfolio_id is not None:
            pulumi.set(__self__, "source_portfolio_id", source_portfolio_id)

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
    @pulumi.getter(name="portfolioId")
    def portfolio_id(self) -> Optional[pulumi.Input[str]]:
        """
        Portfolio identifier.
        """
        return pulumi.get(self, "portfolio_id")

    @portfolio_id.setter
    def portfolio_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "portfolio_id", value)

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> Optional[pulumi.Input[str]]:
        """
        Product identifier.

        The following arguments are optional:
        """
        return pulumi.get(self, "product_id")

    @product_id.setter
    def product_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_id", value)

    @property
    @pulumi.getter(name="sourcePortfolioId")
    def source_portfolio_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the source portfolio.
        """
        return pulumi.get(self, "source_portfolio_id")

    @source_portfolio_id.setter
    def source_portfolio_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_portfolio_id", value)


class ProductPortfolioAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 portfolio_id: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 source_portfolio_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Service Catalog Product Portfolio Association.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicecatalog.ProductPortfolioAssociation("example",
            portfolio_id="port-68656c6c6f",
            product_id="prod-dnigbtea24ste")
        ```

        ## Import

        Using `pulumi import`, import `aws_servicecatalog_product_portfolio_association` using the accept language, portfolio ID, and product ID. For example:

        ```sh
        $ pulumi import aws:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation example en:port-68656c6c6f:prod-dnigbtea24ste
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        :param pulumi.Input[str] portfolio_id: Portfolio identifier.
        :param pulumi.Input[str] product_id: Product identifier.
               
               The following arguments are optional:
        :param pulumi.Input[str] source_portfolio_id: Identifier of the source portfolio.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProductPortfolioAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Service Catalog Product Portfolio Association.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicecatalog.ProductPortfolioAssociation("example",
            portfolio_id="port-68656c6c6f",
            product_id="prod-dnigbtea24ste")
        ```

        ## Import

        Using `pulumi import`, import `aws_servicecatalog_product_portfolio_association` using the accept language, portfolio ID, and product ID. For example:

        ```sh
        $ pulumi import aws:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation example en:port-68656c6c6f:prod-dnigbtea24ste
        ```

        :param str resource_name: The name of the resource.
        :param ProductPortfolioAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProductPortfolioAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 portfolio_id: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 source_portfolio_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProductPortfolioAssociationArgs.__new__(ProductPortfolioAssociationArgs)

            __props__.__dict__["accept_language"] = accept_language
            if portfolio_id is None and not opts.urn:
                raise TypeError("Missing required property 'portfolio_id'")
            __props__.__dict__["portfolio_id"] = portfolio_id
            if product_id is None and not opts.urn:
                raise TypeError("Missing required property 'product_id'")
            __props__.__dict__["product_id"] = product_id
            __props__.__dict__["source_portfolio_id"] = source_portfolio_id
        super(ProductPortfolioAssociation, __self__).__init__(
            'aws:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accept_language: Optional[pulumi.Input[str]] = None,
            portfolio_id: Optional[pulumi.Input[str]] = None,
            product_id: Optional[pulumi.Input[str]] = None,
            source_portfolio_id: Optional[pulumi.Input[str]] = None) -> 'ProductPortfolioAssociation':
        """
        Get an existing ProductPortfolioAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        :param pulumi.Input[str] portfolio_id: Portfolio identifier.
        :param pulumi.Input[str] product_id: Product identifier.
               
               The following arguments are optional:
        :param pulumi.Input[str] source_portfolio_id: Identifier of the source portfolio.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProductPortfolioAssociationState.__new__(_ProductPortfolioAssociationState)

        __props__.__dict__["accept_language"] = accept_language
        __props__.__dict__["portfolio_id"] = portfolio_id
        __props__.__dict__["product_id"] = product_id
        __props__.__dict__["source_portfolio_id"] = source_portfolio_id
        return ProductPortfolioAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="acceptLanguage")
    def accept_language(self) -> pulumi.Output[Optional[str]]:
        """
        Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
        """
        return pulumi.get(self, "accept_language")

    @property
    @pulumi.getter(name="portfolioId")
    def portfolio_id(self) -> pulumi.Output[str]:
        """
        Portfolio identifier.
        """
        return pulumi.get(self, "portfolio_id")

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> pulumi.Output[str]:
        """
        Product identifier.

        The following arguments are optional:
        """
        return pulumi.get(self, "product_id")

    @property
    @pulumi.getter(name="sourcePortfolioId")
    def source_portfolio_id(self) -> pulumi.Output[Optional[str]]:
        """
        Identifier of the source portfolio.
        """
        return pulumi.get(self, "source_portfolio_id")

