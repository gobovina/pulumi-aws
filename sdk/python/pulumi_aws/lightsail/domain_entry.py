# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DomainEntryArgs', 'DomainEntry']

@pulumi.input_type
class DomainEntryArgs:
    def __init__(__self__, *,
                 domain_name: pulumi.Input[str],
                 target: pulumi.Input[str],
                 type: pulumi.Input[str],
                 is_alias: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DomainEntry resource.
        :param pulumi.Input[str] domain_name: The name of the Lightsail domain in which to create the entry
        :param pulumi.Input[str] target: Target of the domain entry
        :param pulumi.Input[str] type: Type of record
        :param pulumi.Input[bool] is_alias: If the entry should be an alias Defaults to `false`
        :param pulumi.Input[str] name: Name of the entry record
        """
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "target", target)
        pulumi.set(__self__, "type", type)
        if is_alias is not None:
            pulumi.set(__self__, "is_alias", is_alias)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        The name of the Lightsail domain in which to create the entry
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter
    def target(self) -> pulumi.Input[str]:
        """
        Target of the domain entry
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: pulumi.Input[str]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of record
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="isAlias")
    def is_alias(self) -> Optional[pulumi.Input[bool]]:
        """
        If the entry should be an alias Defaults to `false`
        """
        return pulumi.get(self, "is_alias")

    @is_alias.setter
    def is_alias(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_alias", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the entry record
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _DomainEntryState:
    def __init__(__self__, *,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 is_alias: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DomainEntry resources.
        :param pulumi.Input[str] domain_name: The name of the Lightsail domain in which to create the entry
        :param pulumi.Input[bool] is_alias: If the entry should be an alias Defaults to `false`
        :param pulumi.Input[str] name: Name of the entry record
        :param pulumi.Input[str] target: Target of the domain entry
        :param pulumi.Input[str] type: Type of record
        """
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if is_alias is not None:
            pulumi.set(__self__, "is_alias", is_alias)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if target is not None:
            pulumi.set(__self__, "target", target)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Lightsail domain in which to create the entry
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="isAlias")
    def is_alias(self) -> Optional[pulumi.Input[bool]]:
        """
        If the entry should be an alias Defaults to `false`
        """
        return pulumi.get(self, "is_alias")

    @is_alias.setter
    def is_alias(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_alias", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the entry record
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def target(self) -> Optional[pulumi.Input[str]]:
        """
        Target of the domain entry
        """
        return pulumi.get(self, "target")

    @target.setter
    def target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of record
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class DomainEntry(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 is_alias: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a domain entry resource

        > **NOTE on `id`:** In an effort to simplify imports, this resource `id` field has been updated to the standard resource id separator, a comma (`,`). For backward compatibility, the previous separator (underscore `_`) can still be used to read and import existing resources. When state is refreshed, the `id` will be updated to use the new standard separator. The previous separator will be deprecated in a future major release.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test_domain = aws.lightsail.Domain("testDomain", domain_name="mydomain.com")
        test_domain_entry = aws.lightsail.DomainEntry("testDomainEntry",
            domain_name=aws_lightsail_domain["domain_test"]["domain_name"],
            type="A",
            target="127.0.0.1")
        ```

        ## Import

        Using `pulumi import`, import `aws_lightsail_domain_entry` using the id attribute. For example:

        ```sh
         $ pulumi import aws:lightsail/domainEntry:DomainEntry example www,mydomain.com,A,127.0.0.1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_name: The name of the Lightsail domain in which to create the entry
        :param pulumi.Input[bool] is_alias: If the entry should be an alias Defaults to `false`
        :param pulumi.Input[str] name: Name of the entry record
        :param pulumi.Input[str] target: Target of the domain entry
        :param pulumi.Input[str] type: Type of record
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainEntryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a domain entry resource

        > **NOTE on `id`:** In an effort to simplify imports, this resource `id` field has been updated to the standard resource id separator, a comma (`,`). For backward compatibility, the previous separator (underscore `_`) can still be used to read and import existing resources. When state is refreshed, the `id` will be updated to use the new standard separator. The previous separator will be deprecated in a future major release.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        test_domain = aws.lightsail.Domain("testDomain", domain_name="mydomain.com")
        test_domain_entry = aws.lightsail.DomainEntry("testDomainEntry",
            domain_name=aws_lightsail_domain["domain_test"]["domain_name"],
            type="A",
            target="127.0.0.1")
        ```

        ## Import

        Using `pulumi import`, import `aws_lightsail_domain_entry` using the id attribute. For example:

        ```sh
         $ pulumi import aws:lightsail/domainEntry:DomainEntry example www,mydomain.com,A,127.0.0.1
        ```

        :param str resource_name: The name of the resource.
        :param DomainEntryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainEntryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 is_alias: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 target: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainEntryArgs.__new__(DomainEntryArgs)

            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            __props__.__dict__["is_alias"] = is_alias
            __props__.__dict__["name"] = name
            if target is None and not opts.urn:
                raise TypeError("Missing required property 'target'")
            __props__.__dict__["target"] = target
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(DomainEntry, __self__).__init__(
            'aws:lightsail/domainEntry:DomainEntry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            is_alias: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            target: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'DomainEntry':
        """
        Get an existing DomainEntry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_name: The name of the Lightsail domain in which to create the entry
        :param pulumi.Input[bool] is_alias: If the entry should be an alias Defaults to `false`
        :param pulumi.Input[str] name: Name of the entry record
        :param pulumi.Input[str] target: Target of the domain entry
        :param pulumi.Input[str] type: Type of record
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainEntryState.__new__(_DomainEntryState)

        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["is_alias"] = is_alias
        __props__.__dict__["name"] = name
        __props__.__dict__["target"] = target
        __props__.__dict__["type"] = type
        return DomainEntry(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        The name of the Lightsail domain in which to create the entry
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="isAlias")
    def is_alias(self) -> pulumi.Output[Optional[bool]]:
        """
        If the entry should be an alias Defaults to `false`
        """
        return pulumi.get(self, "is_alias")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the entry record
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def target(self) -> pulumi.Output[str]:
        """
        Target of the domain entry
        """
        return pulumi.get(self, "target")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of record
        """
        return pulumi.get(self, "type")

