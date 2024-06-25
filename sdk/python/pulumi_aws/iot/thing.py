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

__all__ = ['ThingArgs', 'Thing']

@pulumi.input_type
class ThingArgs:
    def __init__(__self__, *,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 thing_type_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Thing resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Map of attributes of the thing.
        :param pulumi.Input[str] name: The name of the thing.
        :param pulumi.Input[str] thing_type_name: The thing type name.
        """
        if attributes is not None:
            pulumi.set(__self__, "attributes", attributes)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if thing_type_name is not None:
            pulumi.set(__self__, "thing_type_name", thing_type_name)

    @property
    @pulumi.getter
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of attributes of the thing.
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the thing.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="thingTypeName")
    def thing_type_name(self) -> Optional[pulumi.Input[str]]:
        """
        The thing type name.
        """
        return pulumi.get(self, "thing_type_name")

    @thing_type_name.setter
    def thing_type_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "thing_type_name", value)


@pulumi.input_type
class _ThingState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 default_client_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 thing_type_name: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Thing resources.
        :param pulumi.Input[str] arn: The ARN of the thing.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Map of attributes of the thing.
        :param pulumi.Input[str] default_client_id: The default client ID.
        :param pulumi.Input[str] name: The name of the thing.
        :param pulumi.Input[str] thing_type_name: The thing type name.
        :param pulumi.Input[int] version: The current version of the thing record in the registry.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if attributes is not None:
            pulumi.set(__self__, "attributes", attributes)
        if default_client_id is not None:
            pulumi.set(__self__, "default_client_id", default_client_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if thing_type_name is not None:
            pulumi.set(__self__, "thing_type_name", thing_type_name)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the thing.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def attributes(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of attributes of the thing.
        """
        return pulumi.get(self, "attributes")

    @attributes.setter
    def attributes(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "attributes", value)

    @property
    @pulumi.getter(name="defaultClientId")
    def default_client_id(self) -> Optional[pulumi.Input[str]]:
        """
        The default client ID.
        """
        return pulumi.get(self, "default_client_id")

    @default_client_id.setter
    def default_client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_client_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the thing.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="thingTypeName")
    def thing_type_name(self) -> Optional[pulumi.Input[str]]:
        """
        The thing type name.
        """
        return pulumi.get(self, "thing_type_name")

    @thing_type_name.setter
    def thing_type_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "thing_type_name", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[int]]:
        """
        The current version of the thing record in the registry.
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "version", value)


class Thing(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 thing_type_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages an AWS IoT Thing.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.Thing("example",
            name="example",
            attributes={
                "First": "examplevalue",
            })
        ```

        ## Import

        Using `pulumi import`, import IOT Things using the name. For example:

        ```sh
        $ pulumi import aws:iot/thing:Thing example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Map of attributes of the thing.
        :param pulumi.Input[str] name: The name of the thing.
        :param pulumi.Input[str] thing_type_name: The thing type name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ThingArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages an AWS IoT Thing.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.Thing("example",
            name="example",
            attributes={
                "First": "examplevalue",
            })
        ```

        ## Import

        Using `pulumi import`, import IOT Things using the name. For example:

        ```sh
        $ pulumi import aws:iot/thing:Thing example example
        ```

        :param str resource_name: The name of the resource.
        :param ThingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ThingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 thing_type_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ThingArgs.__new__(ThingArgs)

            __props__.__dict__["attributes"] = attributes
            __props__.__dict__["name"] = name
            __props__.__dict__["thing_type_name"] = thing_type_name
            __props__.__dict__["arn"] = None
            __props__.__dict__["default_client_id"] = None
            __props__.__dict__["version"] = None
        super(Thing, __self__).__init__(
            'aws:iot/thing:Thing',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            default_client_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            thing_type_name: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[int]] = None) -> 'Thing':
        """
        Get an existing Thing resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the thing.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] attributes: Map of attributes of the thing.
        :param pulumi.Input[str] default_client_id: The default client ID.
        :param pulumi.Input[str] name: The name of the thing.
        :param pulumi.Input[str] thing_type_name: The thing type name.
        :param pulumi.Input[int] version: The current version of the thing record in the registry.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ThingState.__new__(_ThingState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["attributes"] = attributes
        __props__.__dict__["default_client_id"] = default_client_id
        __props__.__dict__["name"] = name
        __props__.__dict__["thing_type_name"] = thing_type_name
        __props__.__dict__["version"] = version
        return Thing(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the thing.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def attributes(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of attributes of the thing.
        """
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter(name="defaultClientId")
    def default_client_id(self) -> pulumi.Output[str]:
        """
        The default client ID.
        """
        return pulumi.get(self, "default_client_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the thing.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="thingTypeName")
    def thing_type_name(self) -> pulumi.Output[Optional[str]]:
        """
        The thing type name.
        """
        return pulumi.get(self, "thing_type_name")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[int]:
        """
        The current version of the thing record in the registry.
        """
        return pulumi.get(self, "version")

