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

__all__ = ['EnvironmentBlueprintConfigurationArgs', 'EnvironmentBlueprintConfiguration']

@pulumi.input_type
class EnvironmentBlueprintConfigurationArgs:
    def __init__(__self__, *,
                 domain_id: pulumi.Input[str],
                 enabled_regions: pulumi.Input[Sequence[pulumi.Input[str]]],
                 environment_blueprint_id: pulumi.Input[str],
                 manage_access_role_arn: Optional[pulumi.Input[str]] = None,
                 provisioning_role_arn: Optional[pulumi.Input[str]] = None,
                 regional_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]]] = None):
        """
        The set of arguments for constructing a EnvironmentBlueprintConfiguration resource.
        :param pulumi.Input[str] domain_id: ID of the Domain.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] enabled_regions: Regions in which the blueprint is enabled
               
               The following arguments are optional:
        :param pulumi.Input[str] environment_blueprint_id: ID of the Environment Blueprint
        :param pulumi.Input[str] manage_access_role_arn: ARN of the manage access role with which this blueprint is created.
        :param pulumi.Input[str] provisioning_role_arn: ARN of the provisioning role with which this blueprint is created.
        :param pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]] regional_parameters: Parameters for each region in which the blueprint is enabled
        """
        pulumi.set(__self__, "domain_id", domain_id)
        pulumi.set(__self__, "enabled_regions", enabled_regions)
        pulumi.set(__self__, "environment_blueprint_id", environment_blueprint_id)
        if manage_access_role_arn is not None:
            pulumi.set(__self__, "manage_access_role_arn", manage_access_role_arn)
        if provisioning_role_arn is not None:
            pulumi.set(__self__, "provisioning_role_arn", provisioning_role_arn)
        if regional_parameters is not None:
            pulumi.set(__self__, "regional_parameters", regional_parameters)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Input[str]:
        """
        ID of the Domain.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter(name="enabledRegions")
    def enabled_regions(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Regions in which the blueprint is enabled

        The following arguments are optional:
        """
        return pulumi.get(self, "enabled_regions")

    @enabled_regions.setter
    def enabled_regions(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "enabled_regions", value)

    @property
    @pulumi.getter(name="environmentBlueprintId")
    def environment_blueprint_id(self) -> pulumi.Input[str]:
        """
        ID of the Environment Blueprint
        """
        return pulumi.get(self, "environment_blueprint_id")

    @environment_blueprint_id.setter
    def environment_blueprint_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment_blueprint_id", value)

    @property
    @pulumi.getter(name="manageAccessRoleArn")
    def manage_access_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the manage access role with which this blueprint is created.
        """
        return pulumi.get(self, "manage_access_role_arn")

    @manage_access_role_arn.setter
    def manage_access_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "manage_access_role_arn", value)

    @property
    @pulumi.getter(name="provisioningRoleArn")
    def provisioning_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the provisioning role with which this blueprint is created.
        """
        return pulumi.get(self, "provisioning_role_arn")

    @provisioning_role_arn.setter
    def provisioning_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provisioning_role_arn", value)

    @property
    @pulumi.getter(name="regionalParameters")
    def regional_parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]]]:
        """
        Parameters for each region in which the blueprint is enabled
        """
        return pulumi.get(self, "regional_parameters")

    @regional_parameters.setter
    def regional_parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]]]):
        pulumi.set(self, "regional_parameters", value)


@pulumi.input_type
class _EnvironmentBlueprintConfigurationState:
    def __init__(__self__, *,
                 domain_id: Optional[pulumi.Input[str]] = None,
                 enabled_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 environment_blueprint_id: Optional[pulumi.Input[str]] = None,
                 manage_access_role_arn: Optional[pulumi.Input[str]] = None,
                 provisioning_role_arn: Optional[pulumi.Input[str]] = None,
                 regional_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]]] = None):
        """
        Input properties used for looking up and filtering EnvironmentBlueprintConfiguration resources.
        :param pulumi.Input[str] domain_id: ID of the Domain.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] enabled_regions: Regions in which the blueprint is enabled
               
               The following arguments are optional:
        :param pulumi.Input[str] environment_blueprint_id: ID of the Environment Blueprint
        :param pulumi.Input[str] manage_access_role_arn: ARN of the manage access role with which this blueprint is created.
        :param pulumi.Input[str] provisioning_role_arn: ARN of the provisioning role with which this blueprint is created.
        :param pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]] regional_parameters: Parameters for each region in which the blueprint is enabled
        """
        if domain_id is not None:
            pulumi.set(__self__, "domain_id", domain_id)
        if enabled_regions is not None:
            pulumi.set(__self__, "enabled_regions", enabled_regions)
        if environment_blueprint_id is not None:
            pulumi.set(__self__, "environment_blueprint_id", environment_blueprint_id)
        if manage_access_role_arn is not None:
            pulumi.set(__self__, "manage_access_role_arn", manage_access_role_arn)
        if provisioning_role_arn is not None:
            pulumi.set(__self__, "provisioning_role_arn", provisioning_role_arn)
        if regional_parameters is not None:
            pulumi.set(__self__, "regional_parameters", regional_parameters)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the Domain.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter(name="enabledRegions")
    def enabled_regions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Regions in which the blueprint is enabled

        The following arguments are optional:
        """
        return pulumi.get(self, "enabled_regions")

    @enabled_regions.setter
    def enabled_regions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "enabled_regions", value)

    @property
    @pulumi.getter(name="environmentBlueprintId")
    def environment_blueprint_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the Environment Blueprint
        """
        return pulumi.get(self, "environment_blueprint_id")

    @environment_blueprint_id.setter
    def environment_blueprint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_blueprint_id", value)

    @property
    @pulumi.getter(name="manageAccessRoleArn")
    def manage_access_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the manage access role with which this blueprint is created.
        """
        return pulumi.get(self, "manage_access_role_arn")

    @manage_access_role_arn.setter
    def manage_access_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "manage_access_role_arn", value)

    @property
    @pulumi.getter(name="provisioningRoleArn")
    def provisioning_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the provisioning role with which this blueprint is created.
        """
        return pulumi.get(self, "provisioning_role_arn")

    @provisioning_role_arn.setter
    def provisioning_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provisioning_role_arn", value)

    @property
    @pulumi.getter(name="regionalParameters")
    def regional_parameters(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]]]:
        """
        Parameters for each region in which the blueprint is enabled
        """
        return pulumi.get(self, "regional_parameters")

    @regional_parameters.setter
    def regional_parameters(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]]]):
        pulumi.set(self, "regional_parameters", value)


class EnvironmentBlueprintConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_id: Optional[pulumi.Input[str]] = None,
                 enabled_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 environment_blueprint_id: Optional[pulumi.Input[str]] = None,
                 manage_access_role_arn: Optional[pulumi.Input[str]] = None,
                 provisioning_role_arn: Optional[pulumi.Input[str]] = None,
                 regional_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS DataZone Environment Blueprint Configuration.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.datazone.Domain("example",
            name="example_domain",
            domain_execution_role=domain_execution_role["arn"])
        default_data_lake = aws.datazone.get_environment_blueprint_output(domain_id=example.id,
            name="DefaultDataLake",
            managed=True)
        example_environment_blueprint_configuration = aws.datazone.EnvironmentBlueprintConfiguration("example",
            domain_id=example.id,
            environment_blueprint_id=default_data_lake.id,
            enabled_regions=["us-east-1"],
            regional_parameters={
                "us-east-1": {
                    "s3Location": "s3://my-amazon-datazone-bucket",
                },
            })
        ```

        ## Import

        Using `pulumi import`, import DataZone Environment Blueprint Configuration using the `domain_id` and `environment_blueprint_id`, separated by a `/`. For example:

        ```sh
        $ pulumi import aws:datazone/environmentBlueprintConfiguration:EnvironmentBlueprintConfiguration example domain-id-12345/environment-blueprint-id-54321
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_id: ID of the Domain.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] enabled_regions: Regions in which the blueprint is enabled
               
               The following arguments are optional:
        :param pulumi.Input[str] environment_blueprint_id: ID of the Environment Blueprint
        :param pulumi.Input[str] manage_access_role_arn: ARN of the manage access role with which this blueprint is created.
        :param pulumi.Input[str] provisioning_role_arn: ARN of the provisioning role with which this blueprint is created.
        :param pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]] regional_parameters: Parameters for each region in which the blueprint is enabled
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EnvironmentBlueprintConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS DataZone Environment Blueprint Configuration.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.datazone.Domain("example",
            name="example_domain",
            domain_execution_role=domain_execution_role["arn"])
        default_data_lake = aws.datazone.get_environment_blueprint_output(domain_id=example.id,
            name="DefaultDataLake",
            managed=True)
        example_environment_blueprint_configuration = aws.datazone.EnvironmentBlueprintConfiguration("example",
            domain_id=example.id,
            environment_blueprint_id=default_data_lake.id,
            enabled_regions=["us-east-1"],
            regional_parameters={
                "us-east-1": {
                    "s3Location": "s3://my-amazon-datazone-bucket",
                },
            })
        ```

        ## Import

        Using `pulumi import`, import DataZone Environment Blueprint Configuration using the `domain_id` and `environment_blueprint_id`, separated by a `/`. For example:

        ```sh
        $ pulumi import aws:datazone/environmentBlueprintConfiguration:EnvironmentBlueprintConfiguration example domain-id-12345/environment-blueprint-id-54321
        ```

        :param str resource_name: The name of the resource.
        :param EnvironmentBlueprintConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EnvironmentBlueprintConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_id: Optional[pulumi.Input[str]] = None,
                 enabled_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 environment_blueprint_id: Optional[pulumi.Input[str]] = None,
                 manage_access_role_arn: Optional[pulumi.Input[str]] = None,
                 provisioning_role_arn: Optional[pulumi.Input[str]] = None,
                 regional_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EnvironmentBlueprintConfigurationArgs.__new__(EnvironmentBlueprintConfigurationArgs)

            if domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'domain_id'")
            __props__.__dict__["domain_id"] = domain_id
            if enabled_regions is None and not opts.urn:
                raise TypeError("Missing required property 'enabled_regions'")
            __props__.__dict__["enabled_regions"] = enabled_regions
            if environment_blueprint_id is None and not opts.urn:
                raise TypeError("Missing required property 'environment_blueprint_id'")
            __props__.__dict__["environment_blueprint_id"] = environment_blueprint_id
            __props__.__dict__["manage_access_role_arn"] = manage_access_role_arn
            __props__.__dict__["provisioning_role_arn"] = provisioning_role_arn
            __props__.__dict__["regional_parameters"] = regional_parameters
        super(EnvironmentBlueprintConfiguration, __self__).__init__(
            'aws:datazone/environmentBlueprintConfiguration:EnvironmentBlueprintConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain_id: Optional[pulumi.Input[str]] = None,
            enabled_regions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            environment_blueprint_id: Optional[pulumi.Input[str]] = None,
            manage_access_role_arn: Optional[pulumi.Input[str]] = None,
            provisioning_role_arn: Optional[pulumi.Input[str]] = None,
            regional_parameters: Optional[pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]]] = None) -> 'EnvironmentBlueprintConfiguration':
        """
        Get an existing EnvironmentBlueprintConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_id: ID of the Domain.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] enabled_regions: Regions in which the blueprint is enabled
               
               The following arguments are optional:
        :param pulumi.Input[str] environment_blueprint_id: ID of the Environment Blueprint
        :param pulumi.Input[str] manage_access_role_arn: ARN of the manage access role with which this blueprint is created.
        :param pulumi.Input[str] provisioning_role_arn: ARN of the provisioning role with which this blueprint is created.
        :param pulumi.Input[Mapping[str, pulumi.Input[Mapping[str, pulumi.Input[str]]]]] regional_parameters: Parameters for each region in which the blueprint is enabled
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EnvironmentBlueprintConfigurationState.__new__(_EnvironmentBlueprintConfigurationState)

        __props__.__dict__["domain_id"] = domain_id
        __props__.__dict__["enabled_regions"] = enabled_regions
        __props__.__dict__["environment_blueprint_id"] = environment_blueprint_id
        __props__.__dict__["manage_access_role_arn"] = manage_access_role_arn
        __props__.__dict__["provisioning_role_arn"] = provisioning_role_arn
        __props__.__dict__["regional_parameters"] = regional_parameters
        return EnvironmentBlueprintConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Output[str]:
        """
        ID of the Domain.
        """
        return pulumi.get(self, "domain_id")

    @property
    @pulumi.getter(name="enabledRegions")
    def enabled_regions(self) -> pulumi.Output[Sequence[str]]:
        """
        Regions in which the blueprint is enabled

        The following arguments are optional:
        """
        return pulumi.get(self, "enabled_regions")

    @property
    @pulumi.getter(name="environmentBlueprintId")
    def environment_blueprint_id(self) -> pulumi.Output[str]:
        """
        ID of the Environment Blueprint
        """
        return pulumi.get(self, "environment_blueprint_id")

    @property
    @pulumi.getter(name="manageAccessRoleArn")
    def manage_access_role_arn(self) -> pulumi.Output[Optional[str]]:
        """
        ARN of the manage access role with which this blueprint is created.
        """
        return pulumi.get(self, "manage_access_role_arn")

    @property
    @pulumi.getter(name="provisioningRoleArn")
    def provisioning_role_arn(self) -> pulumi.Output[Optional[str]]:
        """
        ARN of the provisioning role with which this blueprint is created.
        """
        return pulumi.get(self, "provisioning_role_arn")

    @property
    @pulumi.getter(name="regionalParameters")
    def regional_parameters(self) -> pulumi.Output[Optional[Mapping[str, Mapping[str, str]]]]:
        """
        Parameters for each region in which the blueprint is enabled
        """
        return pulumi.get(self, "regional_parameters")

