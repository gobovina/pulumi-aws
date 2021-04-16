# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from ._enums import *

__all__ = [
    'AliasRoutingConfigArgs',
    'CodeSigningConfigAllowedPublishersArgs',
    'CodeSigningConfigPoliciesArgs',
    'EventSourceMappingDestinationConfigArgs',
    'EventSourceMappingDestinationConfigOnFailureArgs',
    'FunctionDeadLetterConfigArgs',
    'FunctionEnvironmentArgs',
    'FunctionEventInvokeConfigDestinationConfigArgs',
    'FunctionEventInvokeConfigDestinationConfigOnFailureArgs',
    'FunctionEventInvokeConfigDestinationConfigOnSuccessArgs',
    'FunctionFileSystemConfigArgs',
    'FunctionImageConfigArgs',
    'FunctionTracingConfigArgs',
    'FunctionVpcConfigArgs',
]

@pulumi.input_type
class AliasRoutingConfigArgs:
    def __init__(__self__, *,
                 additional_version_weights: Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]] = None):
        """
        :param pulumi.Input[Mapping[str, pulumi.Input[float]]] additional_version_weights: A map that defines the proportion of events that should be sent to different versions of a lambda function.
        """
        if additional_version_weights is not None:
            pulumi.set(__self__, "additional_version_weights", additional_version_weights)

    @property
    @pulumi.getter(name="additionalVersionWeights")
    def additional_version_weights(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]]:
        """
        A map that defines the proportion of events that should be sent to different versions of a lambda function.
        """
        return pulumi.get(self, "additional_version_weights")

    @additional_version_weights.setter
    def additional_version_weights(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[float]]]]):
        pulumi.set(self, "additional_version_weights", value)


@pulumi.input_type
class CodeSigningConfigAllowedPublishersArgs:
    def __init__(__self__, *,
                 signing_profile_version_arns: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] signing_profile_version_arns: The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can sign a code package.
        """
        pulumi.set(__self__, "signing_profile_version_arns", signing_profile_version_arns)

    @property
    @pulumi.getter(name="signingProfileVersionArns")
    def signing_profile_version_arns(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can sign a code package.
        """
        return pulumi.get(self, "signing_profile_version_arns")

    @signing_profile_version_arns.setter
    def signing_profile_version_arns(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "signing_profile_version_arns", value)


@pulumi.input_type
class CodeSigningConfigPoliciesArgs:
    def __init__(__self__, *,
                 untrusted_artifact_on_deployment: pulumi.Input[str]):
        """
        :param pulumi.Input[str] untrusted_artifact_on_deployment: Code signing configuration policy for deployment validation failure. If you set the policy to Enforce, Lambda blocks the deployment request if code-signing validation checks fail. If you set the policy to Warn, Lambda allows the deployment and creates a CloudWatch log. Valid values: `Warn`, `Enforce`. Default value: `Warn`.
        """
        pulumi.set(__self__, "untrusted_artifact_on_deployment", untrusted_artifact_on_deployment)

    @property
    @pulumi.getter(name="untrustedArtifactOnDeployment")
    def untrusted_artifact_on_deployment(self) -> pulumi.Input[str]:
        """
        Code signing configuration policy for deployment validation failure. If you set the policy to Enforce, Lambda blocks the deployment request if code-signing validation checks fail. If you set the policy to Warn, Lambda allows the deployment and creates a CloudWatch log. Valid values: `Warn`, `Enforce`. Default value: `Warn`.
        """
        return pulumi.get(self, "untrusted_artifact_on_deployment")

    @untrusted_artifact_on_deployment.setter
    def untrusted_artifact_on_deployment(self, value: pulumi.Input[str]):
        pulumi.set(self, "untrusted_artifact_on_deployment", value)


@pulumi.input_type
class EventSourceMappingDestinationConfigArgs:
    def __init__(__self__, *,
                 on_failure: Optional[pulumi.Input['EventSourceMappingDestinationConfigOnFailureArgs']] = None):
        """
        :param pulumi.Input['EventSourceMappingDestinationConfigOnFailureArgs'] on_failure: The destination configuration for failed invocations. Detailed below.
        """
        if on_failure is not None:
            pulumi.set(__self__, "on_failure", on_failure)

    @property
    @pulumi.getter(name="onFailure")
    def on_failure(self) -> Optional[pulumi.Input['EventSourceMappingDestinationConfigOnFailureArgs']]:
        """
        The destination configuration for failed invocations. Detailed below.
        """
        return pulumi.get(self, "on_failure")

    @on_failure.setter
    def on_failure(self, value: Optional[pulumi.Input['EventSourceMappingDestinationConfigOnFailureArgs']]):
        pulumi.set(self, "on_failure", value)


@pulumi.input_type
class EventSourceMappingDestinationConfigOnFailureArgs:
    def __init__(__self__, *,
                 destination_arn: pulumi.Input[str]):
        """
        :param pulumi.Input[str] destination_arn: The Amazon Resource Name (ARN) of the destination resource.
        """
        pulumi.set(__self__, "destination_arn", destination_arn)

    @property
    @pulumi.getter(name="destinationArn")
    def destination_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the destination resource.
        """
        return pulumi.get(self, "destination_arn")

    @destination_arn.setter
    def destination_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination_arn", value)


@pulumi.input_type
class FunctionDeadLetterConfigArgs:
    def __init__(__self__, *,
                 target_arn: pulumi.Input[str]):
        """
        :param pulumi.Input[str] target_arn: ARN of an SNS topic or SQS queue to notify when an invocation fails. If this option is used, the function's IAM role must be granted suitable access to write to the target object, which means allowing either the `sns:Publish` or `sqs:SendMessage` action on this ARN, depending on which service is targeted.
        """
        pulumi.set(__self__, "target_arn", target_arn)

    @property
    @pulumi.getter(name="targetArn")
    def target_arn(self) -> pulumi.Input[str]:
        """
        ARN of an SNS topic or SQS queue to notify when an invocation fails. If this option is used, the function's IAM role must be granted suitable access to write to the target object, which means allowing either the `sns:Publish` or `sqs:SendMessage` action on this ARN, depending on which service is targeted.
        """
        return pulumi.get(self, "target_arn")

    @target_arn.setter
    def target_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "target_arn", value)


@pulumi.input_type
class FunctionEnvironmentArgs:
    def __init__(__self__, *,
                 variables: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] variables: Map of environment variables that are accessible from the function code during execution.
        """
        if variables is not None:
            pulumi.set(__self__, "variables", variables)

    @property
    @pulumi.getter
    def variables(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of environment variables that are accessible from the function code during execution.
        """
        return pulumi.get(self, "variables")

    @variables.setter
    def variables(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "variables", value)


@pulumi.input_type
class FunctionEventInvokeConfigDestinationConfigArgs:
    def __init__(__self__, *,
                 on_failure: Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigOnFailureArgs']] = None,
                 on_success: Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigOnSuccessArgs']] = None):
        """
        :param pulumi.Input['FunctionEventInvokeConfigDestinationConfigOnFailureArgs'] on_failure: Configuration block with destination configuration for failed asynchronous invocations. See below for details.
        :param pulumi.Input['FunctionEventInvokeConfigDestinationConfigOnSuccessArgs'] on_success: Configuration block with destination configuration for successful asynchronous invocations. See below for details.
        """
        if on_failure is not None:
            pulumi.set(__self__, "on_failure", on_failure)
        if on_success is not None:
            pulumi.set(__self__, "on_success", on_success)

    @property
    @pulumi.getter(name="onFailure")
    def on_failure(self) -> Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigOnFailureArgs']]:
        """
        Configuration block with destination configuration for failed asynchronous invocations. See below for details.
        """
        return pulumi.get(self, "on_failure")

    @on_failure.setter
    def on_failure(self, value: Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigOnFailureArgs']]):
        pulumi.set(self, "on_failure", value)

    @property
    @pulumi.getter(name="onSuccess")
    def on_success(self) -> Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigOnSuccessArgs']]:
        """
        Configuration block with destination configuration for successful asynchronous invocations. See below for details.
        """
        return pulumi.get(self, "on_success")

    @on_success.setter
    def on_success(self, value: Optional[pulumi.Input['FunctionEventInvokeConfigDestinationConfigOnSuccessArgs']]):
        pulumi.set(self, "on_success", value)


@pulumi.input_type
class FunctionEventInvokeConfigDestinationConfigOnFailureArgs:
    def __init__(__self__, *,
                 destination: pulumi.Input[str]):
        """
        :param pulumi.Input[str] destination: Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
        """
        pulumi.set(__self__, "destination", destination)

    @property
    @pulumi.getter
    def destination(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
        """
        return pulumi.get(self, "destination")

    @destination.setter
    def destination(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination", value)


@pulumi.input_type
class FunctionEventInvokeConfigDestinationConfigOnSuccessArgs:
    def __init__(__self__, *,
                 destination: pulumi.Input[str]):
        """
        :param pulumi.Input[str] destination: Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
        """
        pulumi.set(__self__, "destination", destination)

    @property
    @pulumi.getter
    def destination(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
        """
        return pulumi.get(self, "destination")

    @destination.setter
    def destination(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination", value)


@pulumi.input_type
class FunctionFileSystemConfigArgs:
    def __init__(__self__, *,
                 arn: pulumi.Input[str],
                 local_mount_path: pulumi.Input[str]):
        """
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
        :param pulumi.Input[str] local_mount_path: Path where the function can access the file system, starting with /mnt/.
        """
        pulumi.set(__self__, "arn", arn)
        pulumi.set(__self__, "local_mount_path", local_mount_path)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="localMountPath")
    def local_mount_path(self) -> pulumi.Input[str]:
        """
        Path where the function can access the file system, starting with /mnt/.
        """
        return pulumi.get(self, "local_mount_path")

    @local_mount_path.setter
    def local_mount_path(self, value: pulumi.Input[str]):
        pulumi.set(self, "local_mount_path", value)


@pulumi.input_type
class FunctionImageConfigArgs:
    def __init__(__self__, *,
                 commands: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 entry_points: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 working_directory: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] commands: Parameters that you want to pass in with `entry_point`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] entry_points: Entry point to your application, which is typically the location of the runtime executable.
        :param pulumi.Input[str] working_directory: Working directory.
        """
        if commands is not None:
            pulumi.set(__self__, "commands", commands)
        if entry_points is not None:
            pulumi.set(__self__, "entry_points", entry_points)
        if working_directory is not None:
            pulumi.set(__self__, "working_directory", working_directory)

    @property
    @pulumi.getter
    def commands(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Parameters that you want to pass in with `entry_point`.
        """
        return pulumi.get(self, "commands")

    @commands.setter
    def commands(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "commands", value)

    @property
    @pulumi.getter(name="entryPoints")
    def entry_points(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Entry point to your application, which is typically the location of the runtime executable.
        """
        return pulumi.get(self, "entry_points")

    @entry_points.setter
    def entry_points(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "entry_points", value)

    @property
    @pulumi.getter(name="workingDirectory")
    def working_directory(self) -> Optional[pulumi.Input[str]]:
        """
        Working directory.
        """
        return pulumi.get(self, "working_directory")

    @working_directory.setter
    def working_directory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "working_directory", value)


@pulumi.input_type
class FunctionTracingConfigArgs:
    def __init__(__self__, *,
                 mode: pulumi.Input[str]):
        """
        :param pulumi.Input[str] mode: Whether to to sample and trace a subset of incoming requests with AWS X-Ray. Valid values are `PassThrough` and `Active`. If `PassThrough`, Lambda will only trace the request from an upstream service if it contains a tracing header with "sampled=1". If `Active`, Lambda will respect any tracing header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
        """
        pulumi.set(__self__, "mode", mode)

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Input[str]:
        """
        Whether to to sample and trace a subset of incoming requests with AWS X-Ray. Valid values are `PassThrough` and `Active`. If `PassThrough`, Lambda will only trace the request from an upstream service if it contains a tracing header with "sampled=1". If `Active`, Lambda will respect any tracing header it receives from an upstream service. If no tracing header is received, Lambda will call X-Ray for a tracing decision.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "mode", value)


@pulumi.input_type
class FunctionVpcConfigArgs:
    def __init__(__self__, *,
                 security_group_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 subnet_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: List of security group IDs associated with the Lambda function.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: List of subnet IDs associated with the Lambda function.
        """
        pulumi.set(__self__, "security_group_ids", security_group_ids)
        pulumi.set(__self__, "subnet_ids", subnet_ids)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of security group IDs associated with the Lambda function.
        """
        return pulumi.get(self, "security_group_ids")

    @security_group_ids.setter
    def security_group_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "security_group_ids", value)

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of subnet IDs associated with the Lambda function.
        """
        return pulumi.get(self, "subnet_ids")

    @subnet_ids.setter
    def subnet_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "subnet_ids", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


