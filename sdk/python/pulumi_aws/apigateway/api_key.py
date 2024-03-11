# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ApiKeyArgs', 'ApiKey']

@pulumi.input_type
class ApiKeyArgs:
    def __init__(__self__, *,
                 customer_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ApiKey resource.
        :param pulumi.Input[str] customer_id: An Amazon Web Services Marketplace customer identifier, when integrating with the Amazon Web Services SaaS Marketplace.
        :param pulumi.Input[str] description: API key description. Defaults to "Managed by Pulumi".
        :param pulumi.Input[bool] enabled: Whether the API key can be used by callers. Defaults to `true`.
        :param pulumi.Input[str] name: Name of the API key.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] value: Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
        """
        if customer_id is not None:
            pulumi.set(__self__, "customer_id", customer_id)
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter(name="customerId")
    def customer_id(self) -> Optional[pulumi.Input[str]]:
        """
        An Amazon Web Services Marketplace customer identifier, when integrating with the Amazon Web Services SaaS Marketplace.
        """
        return pulumi.get(self, "customer_id")

    @customer_id.setter
    def customer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "customer_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        API key description. Defaults to "Managed by Pulumi".
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the API key can be used by callers. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the API key.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class _ApiKeyState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 created_date: Optional[pulumi.Input[str]] = None,
                 customer_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 last_updated_date: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApiKey resources.
        :param pulumi.Input[str] arn: ARN
        :param pulumi.Input[str] created_date: Creation date of the API key
        :param pulumi.Input[str] customer_id: An Amazon Web Services Marketplace customer identifier, when integrating with the Amazon Web Services SaaS Marketplace.
        :param pulumi.Input[str] description: API key description. Defaults to "Managed by Pulumi".
        :param pulumi.Input[bool] enabled: Whether the API key can be used by callers. Defaults to `true`.
        :param pulumi.Input[str] last_updated_date: Last update date of the API key
        :param pulumi.Input[str] name: Name of the API key.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] value: Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if created_date is not None:
            pulumi.set(__self__, "created_date", created_date)
        if customer_id is not None:
            pulumi.set(__self__, "customer_id", customer_id)
        if description is None:
            description = 'Managed by Pulumi'
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if last_updated_date is not None:
            pulumi.set(__self__, "last_updated_date", last_updated_date)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> Optional[pulumi.Input[str]]:
        """
        Creation date of the API key
        """
        return pulumi.get(self, "created_date")

    @created_date.setter
    def created_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_date", value)

    @property
    @pulumi.getter(name="customerId")
    def customer_id(self) -> Optional[pulumi.Input[str]]:
        """
        An Amazon Web Services Marketplace customer identifier, when integrating with the Amazon Web Services SaaS Marketplace.
        """
        return pulumi.get(self, "customer_id")

    @customer_id.setter
    def customer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "customer_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        API key description. Defaults to "Managed by Pulumi".
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the API key can be used by callers. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> Optional[pulumi.Input[str]]:
        """
        Last update date of the API key
        """
        return pulumi.get(self, "last_updated_date")

    @last_updated_date.setter
    def last_updated_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_updated_date", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the API key.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


class ApiKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 customer_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an API Gateway API Key.

        > **NOTE:** Since the API Gateway usage plans feature was launched on August 11, 2016, usage plans are now **required** to associate an API key with an API stage.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apigateway.ApiKey("example", name="example")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import API Gateway Keys using the `id`. For example:

        ```sh
        $ pulumi import aws:apigateway/apiKey:ApiKey example 8bklk8bl1k3sB38D9B3l0enyWT8c09B30lkq0blk
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] customer_id: An Amazon Web Services Marketplace customer identifier, when integrating with the Amazon Web Services SaaS Marketplace.
        :param pulumi.Input[str] description: API key description. Defaults to "Managed by Pulumi".
        :param pulumi.Input[bool] enabled: Whether the API key can be used by callers. Defaults to `true`.
        :param pulumi.Input[str] name: Name of the API key.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] value: Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ApiKeyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an API Gateway API Key.

        > **NOTE:** Since the API Gateway usage plans feature was launched on August 11, 2016, usage plans are now **required** to associate an API key with an API stage.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apigateway.ApiKey("example", name="example")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import API Gateway Keys using the `id`. For example:

        ```sh
        $ pulumi import aws:apigateway/apiKey:ApiKey example 8bklk8bl1k3sB38D9B3l0enyWT8c09B30lkq0blk
        ```

        :param str resource_name: The name of the resource.
        :param ApiKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 customer_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiKeyArgs.__new__(ApiKeyArgs)

            __props__.__dict__["customer_id"] = customer_id
            if description is None:
                description = 'Managed by Pulumi'
            __props__.__dict__["description"] = description
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["value"] = None if value is None else pulumi.Output.secret(value)
            __props__.__dict__["arn"] = None
            __props__.__dict__["created_date"] = None
            __props__.__dict__["last_updated_date"] = None
            __props__.__dict__["tags_all"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["value"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ApiKey, __self__).__init__(
            'aws:apigateway/apiKey:ApiKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            created_date: Optional[pulumi.Input[str]] = None,
            customer_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            last_updated_date: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            value: Optional[pulumi.Input[str]] = None) -> 'ApiKey':
        """
        Get an existing ApiKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN
        :param pulumi.Input[str] created_date: Creation date of the API key
        :param pulumi.Input[str] customer_id: An Amazon Web Services Marketplace customer identifier, when integrating with the Amazon Web Services SaaS Marketplace.
        :param pulumi.Input[str] description: API key description. Defaults to "Managed by Pulumi".
        :param pulumi.Input[bool] enabled: Whether the API key can be used by callers. Defaults to `true`.
        :param pulumi.Input[str] last_updated_date: Last update date of the API key
        :param pulumi.Input[str] name: Name of the API key.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] value: Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiKeyState.__new__(_ApiKeyState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["created_date"] = created_date
        __props__.__dict__["customer_id"] = customer_id
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["last_updated_date"] = last_updated_date
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["value"] = value
        return ApiKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> pulumi.Output[str]:
        """
        Creation date of the API key
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter(name="customerId")
    def customer_id(self) -> pulumi.Output[Optional[str]]:
        """
        An Amazon Web Services Marketplace customer identifier, when integrating with the Amazon Web Services SaaS Marketplace.
        """
        return pulumi.get(self, "customer_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        API key description. Defaults to "Managed by Pulumi".
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the API key can be used by callers. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> pulumi.Output[str]:
        """
        Last update date of the API key
        """
        return pulumi.get(self, "last_updated_date")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the API key.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def value(self) -> pulumi.Output[str]:
        """
        Value of the API key. If specified, the value must be an alphanumeric string between 20 and 128 characters. If not specified, it will be automatically generated by AWS on creation.
        """
        return pulumi.get(self, "value")

