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

__all__ = ['SchemaArgs', 'Schema']

@pulumi.input_type
class SchemaArgs:
    def __init__(__self__, *,
                 policy_store_id: pulumi.Input[str],
                 definition: Optional[pulumi.Input['SchemaDefinitionArgs']] = None):
        """
        The set of arguments for constructing a Schema resource.
        :param pulumi.Input[str] policy_store_id: The ID of the Policy Store.
        :param pulumi.Input['SchemaDefinitionArgs'] definition: The definition of the schema.
        """
        pulumi.set(__self__, "policy_store_id", policy_store_id)
        if definition is not None:
            pulumi.set(__self__, "definition", definition)

    @property
    @pulumi.getter(name="policyStoreId")
    def policy_store_id(self) -> pulumi.Input[str]:
        """
        The ID of the Policy Store.
        """
        return pulumi.get(self, "policy_store_id")

    @policy_store_id.setter
    def policy_store_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_store_id", value)

    @property
    @pulumi.getter
    def definition(self) -> Optional[pulumi.Input['SchemaDefinitionArgs']]:
        """
        The definition of the schema.
        """
        return pulumi.get(self, "definition")

    @definition.setter
    def definition(self, value: Optional[pulumi.Input['SchemaDefinitionArgs']]):
        pulumi.set(self, "definition", value)


@pulumi.input_type
class _SchemaState:
    def __init__(__self__, *,
                 definition: Optional[pulumi.Input['SchemaDefinitionArgs']] = None,
                 namespaces: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 policy_store_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Schema resources.
        :param pulumi.Input['SchemaDefinitionArgs'] definition: The definition of the schema.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] namespaces: (Optional) Identifies the namespaces of the entities referenced by this schema.
        :param pulumi.Input[str] policy_store_id: The ID of the Policy Store.
        """
        if definition is not None:
            pulumi.set(__self__, "definition", definition)
        if namespaces is not None:
            pulumi.set(__self__, "namespaces", namespaces)
        if policy_store_id is not None:
            pulumi.set(__self__, "policy_store_id", policy_store_id)

    @property
    @pulumi.getter
    def definition(self) -> Optional[pulumi.Input['SchemaDefinitionArgs']]:
        """
        The definition of the schema.
        """
        return pulumi.get(self, "definition")

    @definition.setter
    def definition(self, value: Optional[pulumi.Input['SchemaDefinitionArgs']]):
        pulumi.set(self, "definition", value)

    @property
    @pulumi.getter
    def namespaces(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        (Optional) Identifies the namespaces of the entities referenced by this schema.
        """
        return pulumi.get(self, "namespaces")

    @namespaces.setter
    def namespaces(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "namespaces", value)

    @property
    @pulumi.getter(name="policyStoreId")
    def policy_store_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Policy Store.
        """
        return pulumi.get(self, "policy_store_id")

    @policy_store_id.setter
    def policy_store_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_store_id", value)


class Schema(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 definition: Optional[pulumi.Input[pulumi.InputType['SchemaDefinitionArgs']]] = None,
                 policy_store_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['SchemaDefinitionArgs']] definition: The definition of the schema.
        :param pulumi.Input[str] policy_store_id: The ID of the Policy Store.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SchemaArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        :param str resource_name: The name of the resource.
        :param SchemaArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SchemaArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 definition: Optional[pulumi.Input[pulumi.InputType['SchemaDefinitionArgs']]] = None,
                 policy_store_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SchemaArgs.__new__(SchemaArgs)

            __props__.__dict__["definition"] = definition
            if policy_store_id is None and not opts.urn:
                raise TypeError("Missing required property 'policy_store_id'")
            __props__.__dict__["policy_store_id"] = policy_store_id
            __props__.__dict__["namespaces"] = None
        super(Schema, __self__).__init__(
            'aws:verifiedpermissions/schema:Schema',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            definition: Optional[pulumi.Input[pulumi.InputType['SchemaDefinitionArgs']]] = None,
            namespaces: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            policy_store_id: Optional[pulumi.Input[str]] = None) -> 'Schema':
        """
        Get an existing Schema resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['SchemaDefinitionArgs']] definition: The definition of the schema.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] namespaces: (Optional) Identifies the namespaces of the entities referenced by this schema.
        :param pulumi.Input[str] policy_store_id: The ID of the Policy Store.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SchemaState.__new__(_SchemaState)

        __props__.__dict__["definition"] = definition
        __props__.__dict__["namespaces"] = namespaces
        __props__.__dict__["policy_store_id"] = policy_store_id
        return Schema(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def definition(self) -> pulumi.Output[Optional['outputs.SchemaDefinition']]:
        """
        The definition of the schema.
        """
        return pulumi.get(self, "definition")

    @property
    @pulumi.getter
    def namespaces(self) -> pulumi.Output[Sequence[str]]:
        """
        (Optional) Identifies the namespaces of the entities referenced by this schema.
        """
        return pulumi.get(self, "namespaces")

    @property
    @pulumi.getter(name="policyStoreId")
    def policy_store_id(self) -> pulumi.Output[str]:
        """
        The ID of the Policy Store.
        """
        return pulumi.get(self, "policy_store_id")

