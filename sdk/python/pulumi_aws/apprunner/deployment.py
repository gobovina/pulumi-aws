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

__all__ = ['DeploymentArgs', 'Deployment']

@pulumi.input_type
class DeploymentArgs:
    def __init__(__self__, *,
                 service_arn: pulumi.Input[str],
                 timeouts: Optional[pulumi.Input['DeploymentTimeoutsArgs']] = None):
        """
        The set of arguments for constructing a Deployment resource.
        :param pulumi.Input[str] service_arn: The Amazon Resource Name (ARN) of the App Runner service to start the deployment for.
        """
        pulumi.set(__self__, "service_arn", service_arn)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="serviceArn")
    def service_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the App Runner service to start the deployment for.
        """
        return pulumi.get(self, "service_arn")

    @service_arn.setter
    def service_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_arn", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['DeploymentTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['DeploymentTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.input_type
class _DeploymentState:
    def __init__(__self__, *,
                 operation_id: Optional[pulumi.Input[str]] = None,
                 service_arn: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input['DeploymentTimeoutsArgs']] = None):
        """
        Input properties used for looking up and filtering Deployment resources.
        :param pulumi.Input[str] operation_id: The unique ID of the operation associated with deployment.
        :param pulumi.Input[str] service_arn: The Amazon Resource Name (ARN) of the App Runner service to start the deployment for.
        :param pulumi.Input[str] status: The current status of the App Runner service deployment.
        """
        if operation_id is not None:
            pulumi.set(__self__, "operation_id", operation_id)
        if service_arn is not None:
            pulumi.set(__self__, "service_arn", service_arn)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="operationId")
    def operation_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ID of the operation associated with deployment.
        """
        return pulumi.get(self, "operation_id")

    @operation_id.setter
    def operation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operation_id", value)

    @property
    @pulumi.getter(name="serviceArn")
    def service_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the App Runner service to start the deployment for.
        """
        return pulumi.get(self, "service_arn")

    @service_arn.setter
    def service_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_arn", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The current status of the App Runner service deployment.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['DeploymentTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['DeploymentTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


class Deployment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 service_arn: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['DeploymentTimeoutsArgs']]] = None,
                 __props__=None):
        """
        Manages an App Runner Deployment Operation.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apprunner.Deployment("example", service_arn=example_aws_apprunner_service["arn"])
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] service_arn: The Amazon Resource Name (ARN) of the App Runner service to start the deployment for.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DeploymentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an App Runner Deployment Operation.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apprunner.Deployment("example", service_arn=example_aws_apprunner_service["arn"])
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param DeploymentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DeploymentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 service_arn: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['DeploymentTimeoutsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DeploymentArgs.__new__(DeploymentArgs)

            if service_arn is None and not opts.urn:
                raise TypeError("Missing required property 'service_arn'")
            __props__.__dict__["service_arn"] = service_arn
            __props__.__dict__["timeouts"] = timeouts
            __props__.__dict__["operation_id"] = None
            __props__.__dict__["status"] = None
        super(Deployment, __self__).__init__(
            'aws:apprunner/deployment:Deployment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            operation_id: Optional[pulumi.Input[str]] = None,
            service_arn: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            timeouts: Optional[pulumi.Input[pulumi.InputType['DeploymentTimeoutsArgs']]] = None) -> 'Deployment':
        """
        Get an existing Deployment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] operation_id: The unique ID of the operation associated with deployment.
        :param pulumi.Input[str] service_arn: The Amazon Resource Name (ARN) of the App Runner service to start the deployment for.
        :param pulumi.Input[str] status: The current status of the App Runner service deployment.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DeploymentState.__new__(_DeploymentState)

        __props__.__dict__["operation_id"] = operation_id
        __props__.__dict__["service_arn"] = service_arn
        __props__.__dict__["status"] = status
        __props__.__dict__["timeouts"] = timeouts
        return Deployment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="operationId")
    def operation_id(self) -> pulumi.Output[str]:
        """
        The unique ID of the operation associated with deployment.
        """
        return pulumi.get(self, "operation_id")

    @property
    @pulumi.getter(name="serviceArn")
    def service_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the App Runner service to start the deployment for.
        """
        return pulumi.get(self, "service_arn")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The current status of the App Runner service deployment.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.DeploymentTimeouts']]:
        return pulumi.get(self, "timeouts")

