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

__all__ = ['JobTemplateArgs', 'JobTemplate']

@pulumi.input_type
class JobTemplateArgs:
    def __init__(__self__, *,
                 job_template_data: pulumi.Input['JobTemplateJobTemplateDataArgs'],
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a JobTemplate resource.
        :param pulumi.Input['JobTemplateJobTemplateDataArgs'] job_template_data: The job template data which holds values of StartJobRun API request.
        :param pulumi.Input[str] kms_key_arn: The KMS key ARN used to encrypt the job template.
        :param pulumi.Input[str] name: The specified name of the job template.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "job_template_data", job_template_data)
        if kms_key_arn is not None:
            pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="jobTemplateData")
    def job_template_data(self) -> pulumi.Input['JobTemplateJobTemplateDataArgs']:
        """
        The job template data which holds values of StartJobRun API request.
        """
        return pulumi.get(self, "job_template_data")

    @job_template_data.setter
    def job_template_data(self, value: pulumi.Input['JobTemplateJobTemplateDataArgs']):
        pulumi.set(self, "job_template_data", value)

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The KMS key ARN used to encrypt the job template.
        """
        return pulumi.get(self, "kms_key_arn")

    @kms_key_arn.setter
    def kms_key_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The specified name of the job template.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _JobTemplateState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 job_template_data: Optional[pulumi.Input['JobTemplateJobTemplateDataArgs']] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering JobTemplate resources.
        :param pulumi.Input[str] arn: ARN of the job template.
        :param pulumi.Input['JobTemplateJobTemplateDataArgs'] job_template_data: The job template data which holds values of StartJobRun API request.
        :param pulumi.Input[str] kms_key_arn: The KMS key ARN used to encrypt the job template.
        :param pulumi.Input[str] name: The specified name of the job template.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if job_template_data is not None:
            pulumi.set(__self__, "job_template_data", job_template_data)
        if kms_key_arn is not None:
            pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the job template.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="jobTemplateData")
    def job_template_data(self) -> Optional[pulumi.Input['JobTemplateJobTemplateDataArgs']]:
        """
        The job template data which holds values of StartJobRun API request.
        """
        return pulumi.get(self, "job_template_data")

    @job_template_data.setter
    def job_template_data(self, value: Optional[pulumi.Input['JobTemplateJobTemplateDataArgs']]):
        pulumi.set(self, "job_template_data", value)

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The KMS key ARN used to encrypt the job template.
        """
        return pulumi.get(self, "kms_key_arn")

    @kms_key_arn.setter
    def kms_key_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The specified name of the job template.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class JobTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 job_template_data: Optional[pulumi.Input[pulumi.InputType['JobTemplateJobTemplateDataArgs']]] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manages an EMR Containers (EMR on EKS) Job Template.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.emrcontainers.JobTemplate("example", job_template_data=aws.emrcontainers.JobTemplateJobTemplateDataArgs(
            execution_role_arn=aws_iam_role["example"]["arn"],
            release_label="emr-6.10.0-latest",
            job_driver=aws.emrcontainers.JobTemplateJobTemplateDataJobDriverArgs(
                spark_sql_job_driver=aws.emrcontainers.JobTemplateJobTemplateDataJobDriverSparkSqlJobDriverArgs(
                    entry_point="default",
                ),
            ),
        ))
        ```

        ## Import

        In TODO v1.5.0 and later, use an `import` block to import EKS job templates using the `id`. For exampleterraform import {

         to = aws_emrcontainers_job_template.example

         id = "a1b2c3d4e5f6g7h8i9j10k11l" } Using `TODO import`, import EKS job templates using the `id`. For exampleconsole % TODO import aws_emrcontainers_job_template.example a1b2c3d4e5f6g7h8i9j10k11l

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['JobTemplateJobTemplateDataArgs']] job_template_data: The job template data which holds values of StartJobRun API request.
        :param pulumi.Input[str] kms_key_arn: The KMS key ARN used to encrypt the job template.
        :param pulumi.Input[str] name: The specified name of the job template.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: JobTemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an EMR Containers (EMR on EKS) Job Template.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.emrcontainers.JobTemplate("example", job_template_data=aws.emrcontainers.JobTemplateJobTemplateDataArgs(
            execution_role_arn=aws_iam_role["example"]["arn"],
            release_label="emr-6.10.0-latest",
            job_driver=aws.emrcontainers.JobTemplateJobTemplateDataJobDriverArgs(
                spark_sql_job_driver=aws.emrcontainers.JobTemplateJobTemplateDataJobDriverSparkSqlJobDriverArgs(
                    entry_point="default",
                ),
            ),
        ))
        ```

        ## Import

        In TODO v1.5.0 and later, use an `import` block to import EKS job templates using the `id`. For exampleterraform import {

         to = aws_emrcontainers_job_template.example

         id = "a1b2c3d4e5f6g7h8i9j10k11l" } Using `TODO import`, import EKS job templates using the `id`. For exampleconsole % TODO import aws_emrcontainers_job_template.example a1b2c3d4e5f6g7h8i9j10k11l

        :param str resource_name: The name of the resource.
        :param JobTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(JobTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 job_template_data: Optional[pulumi.Input[pulumi.InputType['JobTemplateJobTemplateDataArgs']]] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = JobTemplateArgs.__new__(JobTemplateArgs)

            if job_template_data is None and not opts.urn:
                raise TypeError("Missing required property 'job_template_data'")
            __props__.__dict__["job_template_data"] = job_template_data
            __props__.__dict__["kms_key_arn"] = kms_key_arn
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(JobTemplate, __self__).__init__(
            'aws:emrcontainers/jobTemplate:JobTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            job_template_data: Optional[pulumi.Input[pulumi.InputType['JobTemplateJobTemplateDataArgs']]] = None,
            kms_key_arn: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'JobTemplate':
        """
        Get an existing JobTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the job template.
        :param pulumi.Input[pulumi.InputType['JobTemplateJobTemplateDataArgs']] job_template_data: The job template data which holds values of StartJobRun API request.
        :param pulumi.Input[str] kms_key_arn: The KMS key ARN used to encrypt the job template.
        :param pulumi.Input[str] name: The specified name of the job template.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _JobTemplateState.__new__(_JobTemplateState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["job_template_data"] = job_template_data
        __props__.__dict__["kms_key_arn"] = kms_key_arn
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return JobTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the job template.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="jobTemplateData")
    def job_template_data(self) -> pulumi.Output['outputs.JobTemplateJobTemplateData']:
        """
        The job template data which holds values of StartJobRun API request.
        """
        return pulumi.get(self, "job_template_data")

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The KMS key ARN used to encrypt the job template.
        """
        return pulumi.get(self, "kms_key_arn")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The specified name of the job template.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

